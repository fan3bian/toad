package algorithm.leetcode.array.easy;

public class Test66 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] != 10) {
                return digits;
            }
            digits[i] %= 10;
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
