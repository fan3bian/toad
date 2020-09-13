package algorithm.leetcode;

import javax.validation.constraints.Max;

public class Test53 {
    /**
     * 连续子数组最大和
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    /**
     * 求连续子数组最大和 => 求以每个位置结尾的最大连续子数组之和f(i)
     * 动态规划方程
     * f(i)=max{f(i-1)+ai,ai}
     *
     * @param nums
     * @return
     */
    public int maxSubArraySelf(int[] nums) {
        return 0;
    }

}
