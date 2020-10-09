package algorithm.some;

import algorithm.leetcode.ListNode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

    //翻转数组
    static void reverse(int arr[]) {
        //找到数组的中位，左右两端根据中位进行互换
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //翻转数组
    static void reverse2(int arr[]) {
        //双指针，前后对称互换
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

    //2^32
    static int reverse(int num) {
        //整数翻转，注意越界
        int rev = 0;
        while (num != 0) {
            int pop = num % 10;
            num /= 10;
            if (rev > Integer.MAX_VALUE / 10 || rev == Integer.MAX_VALUE / 10 && pop > 7) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public void reverse(List<Integer> list) {
        Collections.reverse(list);
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public ListNode reverse(ListNode listNode) {
        ListNode head = null;
        //当前节点持有对下个节点的引用
        ListNode cur = listNode;
        while (cur != null) {
            ListNode tempNode = cur.next;
            cur.next = head;
            head = cur;
            cur = tempNode;
        }
        return head;
    }
    public ListNode reverse2(ListNode listNode) {
        if (listNode == null || listNode.next == null) {
            return listNode;
        }
        ListNode node = reverse2(listNode.next);
        listNode.next.next = listNode;
        listNode.next = null;
        return node;
    }

    public static void main(String[] args) {
        reverse(new int[]{1, 2, 3, 4});
        reverse2(new int[]{1, 2, 3, 4});
    }
}
