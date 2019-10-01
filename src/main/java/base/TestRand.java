package base;

import org.junit.Test;

import java.util.Random;

public class TestRand {
    static Random rand = new Random();

    static int random (int n) {
        return Math.abs(rand.nextInt()) % n;
    }
    @Test
    public void test(){
        for (int i = 0; i <10 ; i++) {
            System.out.println(rand.nextInt());
        }
    }
    @Test
    public void  badRand(){
        int n = 2 * (Integer.MAX_VALUE  / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++)
            if (random(n) < n/2 ) {
                low++;
            }
        System.out.println(low);
    }
}
