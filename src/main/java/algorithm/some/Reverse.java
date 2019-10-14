package algorithm.some;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Reverse {

    static void reverseArray(int arr[]) {
        System.out.println(Arrays.toString(arr));
        //midpoint
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        int arr[] = {0,1,2,3,4,5,6,7,8,9};
//        reverseArray(arr);
        Map<String,String > map = new HashMap<>();
        map = new ConcurrentHashMap<>();
    }
}
