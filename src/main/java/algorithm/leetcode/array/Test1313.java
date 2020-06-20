package algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Test1313 {
    public static int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i=i+2) {
            int times = nums[i];
            int val = nums[i+1];
            for (int j = 0; j < times; j++) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
