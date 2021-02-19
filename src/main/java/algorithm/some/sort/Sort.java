package algorithm.some.sort;

import java.util.Arrays;

public class Sort {
    private void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    //比较相邻的元素。如果第一个比第二个大，就交换他们两个。
    //不断的把最大的元素挪到最后位置上
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//倒数第二位
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//相邻元素比较
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public void bubbleSortAdavnced(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//倒数第二位
            boolean swaped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {//相邻元素比较
                    swap(arr, j, j + 1);
                    swaped = true;
                }
            }
            if (!swaped) {
                break; //若未发生交换，证明结果已经有序，可直接结束。
            }
        }
    }

    //选择排序
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[j] < arr[min]) {
                    min = j;//寻找最小元素下标
                }
            }
            if (i != min) {
                swap(arr, i, min);
            }
        }
    }

    //插入排序
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; //待插入的数据
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if (j != i) {
                arr[j] = temp;
            }
        }
    }

    //希尔排序 增量递减排序算法
    public void shellSort(int[] arr) {
        int len = arr.length;
        int temp;
        for (int step = len / 2; step >= 1; step /= 2) {
            for (int i = step; i < len; i++) {
                int j = i - step;
                temp = arr[i];
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }
    }

    //快速排序
    public void quickSort(int[] arr, int l, int r) {
        int base = arr[l];

        //通过交换元素构建分界点P
        int p = partition(arr, l, r);

        quickSort(arr, l, p - 1);
        quickSort(arr, p + 1, r);
    }

    private int partition(int[] arr, int l, int r) {
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < arr[l]) {
                swap(arr, i, l + 1);
            }
        }
        return 0;
    }

    public void mergeSort(int[] arr, int l, int r) {
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr,l,mid,r);
    }

    void merge(int[] arr, int l, int mid, int r) {

    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] ints = {3, 2, 1};
        sort.bubbleSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}
