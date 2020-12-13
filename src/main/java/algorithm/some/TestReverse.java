package algorithm.some;

import java.util.Arrays;

public class TestReverse {
    //数组反转
    void reverse(int arr[]) {
        int len = arr.length;
        int mid = len >> 1;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //双指针
    private void reverseString(char[] s) {
        for (int l = 0, r = s.length - 1; l < r; l++, r--) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        TestReverse testReverse = new TestReverse();
//        testReverse.reverse(new int[]{1,2,3,4,5,6,7,8,9});
//        testReverse.reverseString("123456789".toCharArray());
        testReverse.reverseStr("abcdefg",2);

    }

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        int i =0;
        for (;i < arr.length; i= i + 2*k ){
            if(i* 2* k + 2 * k<arr.length){
                revserseSub(arr,i *2*k,i *2*k+2*k-1 );
            }
        }
        if (i < arr.length){
            int end = 0;
            if (i + k > arr.length){
                end = i +k -1;
            }else{
                end = arr.length -1;
            }
            revserseSub(arr,i *2*k,end );

        }
        for (char c : arr) {
            sb.append(c);
        }
        return sb.toString();
    }
    private void  revserseSub(char[] arr, int start, int end){
        for (int i = start, r = end ; i < r ; ++i ,-- r) {
            char temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;
        }
    }
}
