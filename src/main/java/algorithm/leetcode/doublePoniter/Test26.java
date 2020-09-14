package algorithm.leetcode.doublePoniter;

public class Test26 {

    /**
     * 排序数组移除重复元素
     * 1.有序，重复元素相邻
     * <p>
     * 思路：1.以替换的方式移除元素
     * 快慢指针遍历数组
     * <p>
     * 我的思路是移除相等的元素，但是貌似没办法移除元素，所以是错误的
     * 答案:将不重复的元素移到数组的左侧
     * j快指针遍历数组，i慢指针标记不重复元素
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        //j从1开始，但是有长度的判断，不会越界
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;

    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;

    }

    public static void main(String[] args) {
        int nums[] = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        removeDuplicates(nums);

    }
}
