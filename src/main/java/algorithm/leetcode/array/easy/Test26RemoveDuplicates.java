package algorithm.leetcode.array.easy;

public class Test26RemoveDuplicates {
    /*
     * 有序的数组，重复元素一定相邻
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                if (j > i ){
                    nums[i] = nums[j];
                }
            }
        }
        return i + 1;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int p = 0, q = 1;
        while (q < nums.length) {
            if (nums[p] != nums[q]) {
                p++;
                if( q >p){
                    nums[p] = nums[q];
                }
            }
            q++;
        }
        return p + 1;
    }
}
