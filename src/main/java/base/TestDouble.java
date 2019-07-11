package base;

import org.junit.Test;

import domain.BdFinanceDTO;
import util.JsonUtil;

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
		BdFinanceDTO b =new BdFinanceDTO();
		b.setCarrierId(1L);
		b.setDeliveryTime("setDeliveryTime");
		b.setSortBatchNo("sdf");
		b.setSoNo("soNo");
		System.out.println(JsonUtil.toJson(b));
	}
	@Test
	public void testBigDecimal(){
		Integer a = null;
		BigDecimal bigDecimal = new BigDecimal(a);
		System.out.println(bigDecimal);
	}
}
	