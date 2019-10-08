package base;


import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.Locale;

/**
 * Created by zhangshuyi1 on 2018/2/12.
 */
public class TestString {
    //String is a final class, instance of which is immutable. Once created, never changed ,it is a constant.
    @Test
    public void test(){
        String emptyStr = "";
        String a = "a";
        String a1 = new String("a");//don't do this


    }
	public static void main(String[] args) {
//		String goodNo = "CMG4398046511733 ";
//		String goodNo = " CMG4398046511733";//return origin object 
//		String goodNo = " ";
		String goodNo = null;
		String goodsNoTrim = goodNo.trim();
		System.out.println(goodNo+"]"+goodNo.hashCode());
		System.out.println(goodsNoTrim+"]"+goodsNoTrim.hashCode());
	
	}
	@Test
	public void testXMLEscape(){
	String name ="hahha&quot;";
	System.out.println(name);
	name = name.replaceAll("&quot;", "\"");
	System.out.println(name);
//		String escapeJavaStr ="'\'\"";
//		System.out.println(escapeJavaStr);
//		System.out.println("转义XML："+StringEscapeUtils.escapeXml11("<name>陈磊兴</name>"));   //转义xml  
//	    System.out.println("反转义XML："+StringEscapeUtils.unescapeXml("<name>陈磊兴</name>"));    //转义xml  
//		StringEscapeUtils.escapeJson("<>&'\'");
		
	}
	@Test
	public void testToArray(){
		char[] charArray = String.format("%0200d", new Object[]{Integer.valueOf(0)}).toCharArray();
		System.out.println(charArray.length);
		
		
	}
	@Test
	public void testBigDecimal(){
		BigDecimal bd =new BigDecimal(0);
		BigDecimal bd2 =new BigDecimal(0.0);
		System.out.println(bd);
		System.out.println(bd2);
	}
	@Test
	public void testH(){
		String shopNo = "^CY[Y|S][0-9]{9,13}";
		
	}
	@Test
	public void testString() throws UnsupportedEncodingException {
		String s = "什么";
		s.substring(1);
//		s= "张";
		int length = s.getBytes("GBK").length;

//		String[] arr = s.split(",");
		System.out.println(length);

	}
	@Test
	public void testAdd(){
    	String a = "1";
    	String b = null;
		System.out.println(a+b);
	}

	@Test
	public void testToLowerCase(){
		System.out.println("WwWwTt".toLowerCase(Locale.ENGLISH));
		System.out.println("WwWwTt".toLowerCase(Locale.US));
	}
}
