package algorithm.leetcode.array.easy;

import java.util.Arrays;

public class Test581FindUnsortedSubarray {
    /**
     * 获取子数组的左右边界
     * 双指针
     *
     * @param nums
     * @return
     */

    //逆序
    public static int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        int left = 0, right = -1;
        int max = nums[0], min = nums[length - 1];
        for (int i = 0; i < length; i++) {
            if (nums[i] < max) right = i;
            else max = nums[i];
            if (nums[length - i - 1] > min) left = length - i - 1;
            else min = nums[length - i - 1];
        }
        return right - left + 1;
    }

    //题目要求是无序数组变成有序数组，排序后。有序数组和原始数组比较，得到目标数组的左右边界
    public static int findUnsortedSubarray2(int[] nums) {

        int[] clone = nums.clone();
        Arrays.sort(clone);
        int l = clone.length, r = 0;
        for (int i = 0; i < clone.length; i++) {
            if (clone[i] != nums[i]) {
                l = Math.min(l, i);
                r = Math.max(r, i);
            }
        }
        return r > l ? r - l + 1 : 0;
    }


    public static void main(String[] args) {
//       int[] a = new int[] {2, 6, 4, 8, 10, 9, 15};
        //
//        int[] a = new int[] {2, 1};
//        int[] a = new int[]{1, 3, 2, 2, 2};
        //  1 2 2 2 3
//        int[] a = new int[]{1, 2, 4, 5, 3};
        int[] a = new int[]{1, 2, 3, 4};
        System.out.println(findUnsortedSubarray(a));
    }
}
