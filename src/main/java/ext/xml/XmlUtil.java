package ext.xml;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import domain.Student;
import io.serial.Person;

/**
 * Desc: Xml转换工具类，针对下划线'_'处理
 * User: gongtilei
 * Date: 17-1-10
 * Time: 上午10:56
 */
public class XmlUtil {

    public static XStream xstream = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));

    static {
        xstream.autodetectAnnotations(true);
    }
    public static <T> String generateXmlTaskContent(T bean) {
        String msg = xstream.toXML(bean);
        return msg;
    }

    public static Object fromXml(String xml, Class a) {
        xstream.ignoreUnknownElements();
        xstream.processAnnotations(a);
        xstream.autodetectAnnotations(true);
        return xstream.fromXML(xml);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(2);
        System.out.println(generateXmlTaskContent(student));
    }
}
