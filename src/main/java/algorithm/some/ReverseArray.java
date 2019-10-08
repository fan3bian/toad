package algorithm.some;

import org.junit.Test;

import java.util.Arrays;

public class ReverseArray {
    @Test
    public void test(){
        int temp[] = {1,2,3,4,5,6,7};
//        reverse(temp);
        reverse2(temp);
    }
    static void reverse(int[] arr){
        //新建一个数组，逆序填充
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int[] b = new int[n];
        for (int i = 0; i < arr.length; i++) {
            b[n-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(b));
    }
    static void reverse2(int arr[]){
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }


}
