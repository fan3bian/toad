package algorithm.leetcode.array.medium;

public class Test33Search {
    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = ( l+ r) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int search = search(new int[]{1, 3, 5, 6}, 7);
    }
}
