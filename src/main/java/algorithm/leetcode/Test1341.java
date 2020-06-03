package algorithm.leetcode;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Test1341 {
    public static class Test1443 {
        public static int numOfSubarrays(int[] arr, int k, int threshold) {
            int result = 0;
            IntStream stream = Arrays.stream(arr);
            OptionalDouble average = stream.average();
            System.out.println(average);
            return result;
        }

        public static void main(String[] args) {
            numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 1, 1);
        }
    }
}
