package algorithm.leetcode.array;

import java.util.Arrays;

public class Test1295 {
    /**
     *
     * @param nums
     * @return
     */
    public static int findNumbers(int[] nums) {

        long count = Arrays.stream(nums).filter(x -> {
            int length = String.valueOf(x).length();
            return (length & 1) ==0;
        }).count();
        return (int)count;
    }

    public static void main(String[] args) {
        System.out.println( 1 & 1);
        System.out.println( 0 |1 & 1);
        System.out.println( 0 & 0);
        System.out.println( 2 & 1);
    }
}
