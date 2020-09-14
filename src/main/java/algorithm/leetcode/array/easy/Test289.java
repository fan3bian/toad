package algorithm.leetcode.array.easy;

public class Test289 {

    public static void moveZeroes(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }
        }
        for (int j = i; j < nums.length; j++) {
            nums[j] = 0;
        }


    }

    public static void main(String[] args) {
//        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{2, 1});
    }

}
