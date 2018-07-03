package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.sun.org.apache.xpath.internal.SourceTree;

import domain.Student;

public class Test {
	public static void main(String[] args) throws ParseException {
		System.out.println(Byte.valueOf("4")==4);
		System.out.println(Byte.valueOf("4")==(byte)4);
//		System.out.println("0".equals('0'));
		char a = '0';
		char b = "0".charAt(0);
		System.out.println(a==b);
//		System.out.println(BigDecimal.valueOf("0.00"));
//		String deliveryTime =DateUtil.getSystem_Date();
		String deliveryTime ="2018-03-25 14:59:03";
		SimpleDateFormat df1 =new SimpleDateFormat(DateUtil.DATETIME_FORMAT);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String day = dateFormat.format(df1.parse(deliveryTime));
		System.out.println(day);
		
	}
	@org.junit.Test
	public void test(){
		String packNos = null;
//		String packNos = "CPU0000000000055,";
		packNos += "CPU0000000000055";
		String arr[] = packNos.split(",");
		System.out.println(Arrays.toString(arr));
	}
	@org.junit.Test
	public void test2(){
		Student s = new Student();
		s.setId(1L);
		s.setAge(2);
		s.setName("zhang");
		s.setDate(new Date());
		System.out.println(JsonUtil.toJson(s));
	}
	@org.junit.Test
	public void test4(){
		int a = 1;
		switch (a){
			case 1:
				System.out.println(a+1);
			case 2:
			case 3:
				System.out.println(a);
			case 4:
				System.out.println(a);
				
		}
	}
}
