package algorithm.leetcode.linkedList;

public class Test209 {
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;//滑动窗口之和
        int start = 0;//左窗口
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= s) {
                result = Math.min(result, j - start + 1);
                sum -= nums[start++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
