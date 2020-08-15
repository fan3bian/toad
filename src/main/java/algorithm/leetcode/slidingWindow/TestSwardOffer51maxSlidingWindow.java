package algorithm.leetcode.slidingWindow;

import java.util.Arrays;

public class TestSwardOffer51maxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length ==0) {
            return nums;
        }
        int reuslt[] =new int[nums.length -k +1];
        for (int i = 0; i < nums.length - k+1 ; i++) {
            int[] ints = Arrays.copyOfRange(nums, i, k+i);
            int max = max(ints);
            reuslt[i] = max;
        }
        return reuslt;
    }

    private static int max(int... arr){
        int max =Integer.MIN_VALUE;
        for (Integer integer : arr) {
            max = Math.max(max,integer);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        System.out.println(Arrays.toString(ints));
    }
}
