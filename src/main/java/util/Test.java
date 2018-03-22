package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws ParseException {
//		System.out.println("0".equals('0'));
		char a = '0';
		char b = "0".charAt(0);
		System.out.println(a==b);
//		System.out.println(BigDecimal.valueOf("0.00"));
		String deliveryTime =DateUtil.getSystem_Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		String t =	dateFormat.format(dateFormat.parse(deliveryTime));
		System.out.println(t);
	}

}
