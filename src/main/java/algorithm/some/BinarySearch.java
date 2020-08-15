package algorithm.some;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (1 + r) / 2;
            if (arr[m] == target) {
                return m;
            }
            if (arr[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7,8}, 3);
    }
}
//1 ,2 ,3 ,4 ,5 ,6 ,7