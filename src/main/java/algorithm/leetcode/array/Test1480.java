package algorithm.leetcode.array;

import java.util.Arrays;

public class Test1480 {
    public static int[] runningSum(int[] nums) {
        if (nums ==null || nums.length==0) {
            return nums;
        }
//        int[] result = nums;
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
    }
}
