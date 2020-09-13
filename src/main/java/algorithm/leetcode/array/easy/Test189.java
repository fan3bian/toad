package algorithm.leetcode.array.easy;

public class Test189 {
    /**
     * 思路，用一个变量存放被交换的元素
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;//k > nums.length 会产生无效的流程
        int count = 0;
        for (int start =0; count <nums.length; start++){
            int current = start;
            int prev = nums[start];
            do {
                int next = (current +k) % nums.length;//next position
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }

    public static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
