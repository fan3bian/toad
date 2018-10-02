package base;

import org.junit.Test;

import java.text.NumberFormat;
import java.util.Random;

public class testBoxType {
    Random rand = new Random();
    private int randow(int n){
        return Math.abs(rand.nextInt())% n;
    }
    @Test
    public void test(){
        long sum = 0L;
        long startTime = System.currentTimeMillis();
        for (int i = 0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        long endTime = System.currentTimeMillis();

        
        System.out.println(endTime-startTime);
    }
    @Test
    public void test2(){
        int gt =0, lt =0;
        int  n = 2 * (Integer.MAX_VALUE / 3);
        for(int i =0;i<Integer.MAX_VALUE;i++){
//            if(rand.nextInt(n)< n/2){
            if(randow(n)< n/2){
                lt ++;
            }else {
                gt ++;
            }
        }
        testPrecent(lt-gt,Integer.MAX_VALUE);
    }

    public void testPrecent(int a,int b){
        // 创建一个数值格式化对象
        NumberFormat numberFormat = NumberFormat.getInstance();
        // 设置精确到小数点后2位
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float)a/(float)b*100);
        System.out.println("百分比为:" + result + "%");
    }
}
