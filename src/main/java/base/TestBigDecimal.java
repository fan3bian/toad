package base;

import org.junit.Test;

import java.math.BigDecimal;

public class TestBigDecimal {
    @Test
    public void test(){
        System.out.println("adsfasdf111".toString().hashCode());


        BigDecimal zero = BigDecimal.ZERO;
        BigDecimal bigDecimal= new BigDecimal("-9.0");
        BigDecimal bigDecimal1= new BigDecimal(-Integer.MAX_VALUE);
        BigDecimal bigDecimal2= new BigDecimal(100009000);

        System.out.println(bigDecimal1.scale());

        System.out.println(bigDecimal2.scale());
    }

    /**
     * 测试精度
     */
    @Test
    public void tes2t(){

        BigDecimal bigDecimal1= new BigDecimal("2.00000");
        BigDecimal bigDecimal2= new BigDecimal("2.0");
        BigDecimal bigDecimal3= new BigDecimal("2");
        System.out.println(bigDecimal1.equals(bigDecimal2));
        System.out.println(bigDecimal1.scale());
        System.out.println(bigDecimal2.scale());
        System.out.println(bigDecimal3.scale());
        System.out.println(bigDecimal1.stripTrailingZeros().scale());
    }

    /**
     * 测试精度
     */
    @Test
    public void test3(){

        BigDecimal bigDecimal1= new BigDecimal("2.00000");
        BigDecimal bigDecimal2= new BigDecimal("2.0");
        BigDecimal bigDecimal3= new BigDecimal("2");
        BigDecimal bigDecimal4= new BigDecimal("-0.00000");

        System.out.println(bigDecimal1.toPlainString());
        System.out.println(bigDecimal2.toPlainString());
        System.out.println(bigDecimal3.toPlainString());
        System.out.println(bigDecimal4.toPlainString());

        System.out.println(bigDecimal1.toString());
        System.out.println(bigDecimal2.toString());
        System.out.println(bigDecimal3.toString());
        System.out.println(bigDecimal4.toString());

    }

}
