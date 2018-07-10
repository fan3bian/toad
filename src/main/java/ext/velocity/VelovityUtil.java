package ext.velocity;


import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.app.event.implement.EscapeJavaScriptReference;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.codehaus.jackson.type.TypeReference;
import util.JsonUtil;

import java.io.File;
import java.io.StringWriter;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: mafayun
 * Date: 2017/11/30
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */
public class VelovityUtil {

    public static void main(String[] args) throws Exception {

        String str = "{\n" +
                "\"boxNo\":\"MZ03021F168220\",\n" +
                "\"warehouseNo \":\"78\",\n" +
                "\"warehouseName \":\"上海生鲜仓1号库\",\n" +
                "\"operator\":\"贾迎会\",\n" +
                "\"operateTime \":\"2018-06-07 11:32:52\"\n" +
                "}";
        Map<String, Object> map = JsonUtil.fromJson(str, new TypeReference<Map>() {
        });
        StringBuffer buffer = new StringBuffer();

        createJson(map,buffer,"vmParam");
        //createXml(map,"receipt",buffer,null);
        System.out.println(buffer.toString());
       /* System.out.println(buffer.toString());

        Map<String, Object> map=new HashedMap();

        map.put("a","a\\nb\\nc");
       // map.put("VmStringUtil",new VmStringUtil());

        buildVm("test.vm",map);*/
    }

    public static void createJson(Map<String, Object> map,StringBuffer buffer,String prefix) {
        int i = 0;
        int j =  map.keySet().size();
        buffer.append("{");
        for (String key : map.keySet()) {
            Object value = map.get(key);
            System.out.println("key= " + key + " and value= " + value);

            if (value instanceof List) {
                Object o = ((List) value).get(0);
                if(o instanceof Map ){
                Map<String, Object> temp = ((List<Map<String, Object>>) value).get(0);
                buffer.append("\"").append(key).append("\":").append("[");

                buffer.append("#set($flag = \"\")");

                String foreachTemp=key+"Temp";
                String prefixTemp=prefix==null?key:(prefix+"."+key);

                buffer.append("#foreach ($"+foreachTemp+" in $"+prefixTemp+")");

                //String foreachPrefix=prefix==null?foreachTemp:(prefix+"."+foreachTemp);
                buffer.append("$!flag");
                createJson(temp,buffer,foreachTemp);
                buffer.append("#set($flag = \",\")");

                buffer.append("#end");
                buffer.append("]");
                }else if(o instanceof String){

                }
            } else if (value instanceof Map) {
                Map<String, Object> temp = (Map<String, Object>) value;
                buffer.append("\"").append(key).append("\":");

                String prefixTemp=prefix==null?key:(prefix+"."+key);

                createJson(temp,buffer,prefixTemp);

            } else{
                String prefixTemp=prefix==null?key:(prefix+"."+key);
                if(value instanceof Integer|| value instanceof Double || value instanceof Float || value instanceof Long ){
                    buffer.append("\"").append(key).append("\":").append("#if(!$"+prefixTemp+"&&$!"+prefixTemp+"!=0) null #else ${"+prefixTemp+"} #end");
                }else{
                    buffer.append("\"").append(key).append("\":").append("\"$!{"+prefixTemp+"}\"");
                }

            }
            i++;
            if(i!=j){
                buffer.append(",");
            }
        }
        buffer.append("}");
    }

    public static void createXml(Map<String, Object> map,String headKey,StringBuffer buffer,String prefix) {

        xmlUtil(buffer,headKey,true);

        for (String key : map.keySet()) {
            System.out.println("key= " + key + " and value= " + map.get(key));
            if(key.startsWith("@")) continue;
            if (map.get(key) instanceof List) {
                Map<String, Object> temp = ((List<Map<String, Object>>) ((List) map.get(key))).get(0);

                xmlUtil(buffer,key,true);

                String foreachTemp=key+"Temp";
                String prefixTemp=prefix==null?key:(prefix+"."+key);

                buffer.append("#foreach ($"+foreachTemp+" in $"+prefixTemp+")");
                createXml(temp, key, buffer, prefixTemp);
                buffer.append("#end");

                xmlUtil(buffer,key,false);

            }else if (map.get(key) instanceof Map) {
                Map<String, Object> temp = (Map<String, Object>)map.get(key);
                String prefixTemp=prefix==null?key:(prefix+"."+key);
                createXml(temp, key, buffer, prefixTemp);
            }else {
                String prefixTemp=prefix==null?key:(prefix+"."+key);
                xmlUtil(buffer,key,true);
                buffer.append("$!{"+prefixTemp+"}");
                xmlUtil(buffer,key,false);
            }

        }

        xmlUtil(buffer,headKey,false);
    }


    public static void xmlUtil(StringBuffer buffer,String key,boolean isHead ) {
      if(isHead){
          buffer.append("<").append(key).append(">");
      }else {
          buffer.append("</").append(key).append(">");
      }
    }



    public  static void buildVm(String fileName,Map<String,Object> data){
        VelocityEngine ve=new VelocityEngine();
        ve.setProperty(RuntimeConstants.RESOURCE_LOADER,"classpath");
        ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
       // ve.setProperty("eventhandler.referenceinsertion.class", org.apache.velocity.app.event.implement.EscapeHtmlReference.class.getName());
        ve.setProperty("eventhandler.referenceinsertion.class",EscapeJavaScriptReference.class.getName() );

        //ve.setProperty("userdirective","com.jd.clps.tool.util.VmStringUtil");
        ve.setProperty(RuntimeConstants.PARSER_POOL_SIZE,20);
        ve.init();
        //模板文件所在的classpath的路径
        Template t = ve.getTemplate("template" + File.separator + fileName, "UTF-8");


        //填充数据

        VelocityContext velocityContext=new VelocityContext(data);

        Long start=System.currentTimeMillis();
        //输出流对象
        StringWriter sw=new StringWriter();
        t.merge(velocityContext,sw);

        System.out.println(sw.toString());

        System.out.println(System.currentTimeMillis()-start);
    }

}
