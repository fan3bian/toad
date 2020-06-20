package algorithm.leetcode.array;

import java.util.Arrays;

public class Test1470 {
    public static int[] shuffle(int[] nums, int n) {
        int subLength = nums.length / 2;
        int result[] = new int[nums.length];
        for (int i = 0; i < subLength; i++) {
            result[i * 2] = nums[i];
        }
        for (int i = subLength; i < nums.length; i++) {
            result[2 * (i + 1 - subLength) - 1] = nums[i];
        }
        return result;
    }
    public int[] shuffle2(int[] nums, int n) {
        int index = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[n+i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] shuffle = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 2);
        System.out.println(Arrays.toString(shuffle));

    }
}
