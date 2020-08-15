package algorithm.leetcode.array.easy;

public class Test35searchInsert {
    //1.有序数组找目标值
    //2.有序数组插入
    public static int searchInsert(int[] nums, int target) {
        //不知升序还是降序，先当升序来做
        int l = 0, r = nums.length - 1;
        int index = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            //asc
            if (nums[l] <= nums[r]) {
                if (target > nums[mid]) {// r
                    if (target < nums[r]) {
                        r--;
                    } else {
                        index = r;
                        break;
                    }
                } else {
                    if (target > nums[l]) {
                        l++;
                    } else {
                        index = l;
                        break;
                    }
                }
            }
        }
        if (nums[index] == target) {
            return index;
        }

        return 0;
    }
}
