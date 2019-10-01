package base;

import org.junit.Test;

public class TestByte {
	public static void main(String[] args) {
		
		Byte a = 1;
		Byte b = '1';
		System.out.println(a.hashCode()+ "|"+b.hashCode());
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a==1);
		System.out.println(5%2);
		System.out.println(2%5);
		System.out.println(2%4);
		System.out.println(4%2);
	}
	@Test
	public void test1(){
		String sendPay = "60000000200000002005000002001200034100100000000001600000000001030000000000000000000010000000000000000000000000000000000000000000000000000300000000000000000000000000000000002000000000000106020000000010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
		char c = sendPay.charAt(0);
		System.out.println(c);
		System.out.println('6'==c);
	}

	@Test
	public void test2(){
		Byte a = 1;
		System.out.println(a==1);//true
		System.out.println(a.equals(1));//false
	}

}
