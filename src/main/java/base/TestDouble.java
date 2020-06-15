package base;

import org.junit.Test;



import java.math.BigDecimal;

public class TestDouble {
	public static void main(String[] args) {
		Double a = 1.2;
		calculate(a);
		System.out.println(a);
	}
	static Double calculate(Double d){
		d= 1.3;
		return 1.0;
	}
	@Test
	public void test(){

	}
	@Test
	public void testBigDecimal(){
		Integer a = null;
		BigDecimal bigDecimal = new BigDecimal(a);
		System.out.println(bigDecimal);
	}
}
	