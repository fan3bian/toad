package algorithm.leetcode;

import java.util.*;

public class Test1 {
    static class TwoSum {

        //1.Two Sum
    /*
     Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     You may assume that each input would have exactly one solution, and you may not use the same element twice.
     Example:
     Given nums = [2, 7, 11, 15], target = 9,
     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     https://leetcode.com/articles/two-sum/
     */
        public static int[] twoSum(int[] sums, int target) {
            int i, j;
            int[] retArr = new int[2];
            for (i = 0; i < sums.length; i++) {
                for (j = 0; j < sums.length; j++) {
                    if (sums[i] + sums[j] == target) {
                        retArr[0] = i;
                        retArr[1] = j;
                    }
                }
            }
            return retArr;
        }

        /*

         */
        public static int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{map.get(complement), i};
                }
                map.put(nums[i], i);
            }
            throw new IllegalArgumentException("No two sum solution");
        }
    }

    //未完成
    static class AddTwoNumbers {
        /*
        You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
         */

        public static class ListNode {
            int num;
            ListNode next;

            ListNode(int x) {
                num = x;
            }
        }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            if (l1 == null || l2 == null) {
                throw new IllegalArgumentException("L1 L2 is null");
            }
            List<Integer> list1 = convetrToList(l1);
            List<Integer> list2 = convetrToList(l1);
            int sum = 0;
            for (int i = list1.size() - 1; i >= 0; i--) {
                sum += list1.get(i);
            }
            for (int i = list2.size() - 2; i >= 0; i--) {
                sum += list2.get(i);
            }
            ListNode listNode;
            List<Integer> list = new ArrayList<>();
            do {
                list.add(sum %= 10);
            }

            while (sum != 0);
            for (int i = list.size() - 1; i >= 0; i--) {
                listNode = new ListNode(list.get(i));
            }
//            ListNode rln = new  ListNode();
            return null;
        }

        private static List<Integer> convetrToList(ListNode ln) {
            List<Integer> list = new ArrayList();
            do
                list.add(ln.num);
            while (ln.next != null);
            return list;
        }
    }
    public static class LongestSubstringWithoutRepeatingCharacters{
        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }
        public static int lengthOfLongestSubstring2(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            return ans;
        }
        public static int lengthOfLongestSubstring3(String s) {
            int n = s.length(), ans = 0;
            int[] index = new int[128]; // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                i = Math.max(index[s.charAt(j)], i);
                ans = Math.max(ans, j - i + 1);
                index[s.charAt(j)] = j + 1;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
//        int[] paramArr = new int[]{2, 7, 11, 15};
//        System.out.println(Arrays.toString(TwoSum.twoSum(paramArr, 9)));
        LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring2("sequence");
    }
}
