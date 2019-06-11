package algorithm.leetcode;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {
    public static void main(String[] args){
        BigDecimal b =new BigDecimal(1000);
        BigDecimal bigDecimal = b.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);

    }
}
