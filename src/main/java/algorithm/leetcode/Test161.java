package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test161 {
    static class Test169 {
        public static int majorityElement(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                if (map.containsKey(num)) {
                    map.put(num, map.get(num) + 1);
                } else {
                    map.put(num, 1);
                }
            }
            int k = 0;
            int v = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > v) {
                    v = entry.getValue();
                    k = entry.getKey();
                }
            }
            return k;
        }

        public static void main(String[] args) {
            System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        }
    }
}
