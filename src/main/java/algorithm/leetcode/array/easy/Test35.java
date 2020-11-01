package algorithm.leetcode.array.easy;

import domain.test.Test;

public class Test35 {

    class Solution {
        public int searchInsert(int[] nums, int target) {
            //有序数组 检索 二分
            int left = 0;
            int right = nums.length-1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return mid;
                }
                if (nums[mid] > target) {
                    right = mid - 1;
                }
                if (nums [mid] < target) {
                    left = mid + 1;
                }
            }
            return right + 1;
        }
    }

    public static void main(String[] args) {

       Test35.Solution s =  new Test35().new Solution();
       s.searchInsert(new int[]{1,3,5,6}, 5);

    }
}