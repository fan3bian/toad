package algorithm.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * threeSum不重复，3重循环后需要去重，会占用更多空间和复杂度
 * 模式识别：重复答案 => 排序避免重复答案
 * 有序 双指针 趋向结果为0
 */
public class Test15ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {//i去重
                continue;
            }
            int l = i+1, r = nums.length - 1;//l:left pointer r:right pointer
            while (l < r) {
                if (nums[i] + nums[l] == 0 - nums[r]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    lists.add(list);
                    l++;r--;
                    while (l < nums.length && nums[l] == nums[l - 1]) l++;//去重l
                    while (r > l && nums[r] == nums[r + 1]) r--;//去重r
                } else if (nums[i] + nums[l] > 0 - nums[r]) {
                    r--;
                } else  {
                    l++;
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }

}
