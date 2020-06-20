package algorithm.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test18FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int k = i + 1; k < nums.length - 2; k++) {
                if (k > 1 + i && nums[k] == nums[k - 1]) {
                    continue;
                }
                int l = k + 1, r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[k] + nums[l] + nums[r];
                    if (sum == target) {
                        lists.add(Arrays.asList(nums[i], nums[k], nums[l], nums[r]));
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
//        List<List<Integer>> lists = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        List<List<Integer>> lists = fourSum(new int[]{-1, 0, 1, 2, -1, -4}, -1);
        int a[] = new int[]{-2, -1, 0, 0, 1, 2};
        System.out.println(lists);
    }
}
