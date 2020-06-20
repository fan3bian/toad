package algorithm.leetcode.array.medium;

import java.util.Arrays;

public class Test16ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int x = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[l] + nums[r] + nums[i];
                if (Math.abs(sum - target) < Math.abs(x - target)) {
                    x = sum;
                }
                if (sum >= target && l < r) {
                    r--;
                    while (l <r && nums[r]==nums [r +1]) r--;
                } else if (sum < target && l < r) {
                    l++;
                    while (l <r && nums[l]==nums [l -1]) l++;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int i = threeSumClosest(new int[]{0, 0, 0}, 1);
        System.out.println(i);
    }
}
