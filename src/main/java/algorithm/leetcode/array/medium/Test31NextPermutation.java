package algorithm.leetcode.array.medium;

public class Test31NextPermutation {

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        //从后往前，找到非升序连续两个元素
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        //如果存在，把 i 放入降序队列的位置合适上去
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
