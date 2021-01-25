package algorithm.sword;

import algorithm.leetcode.ListNode;

import java.util.Deque;
import java.util.LinkedList;

public class Test06 {
    public int[] reversePrint(ListNode head) {
        // int[] arr = new int[];
        ListNode cur = head;
        Deque<Integer> list = new LinkedList();
        while (cur != null) {
            list.addFirst(cur.val);
            cur = cur.next;
        }
        int length = list.size();
        int[] arr = new int[list.size()];
        //栈遍历
        for (int i = 0; i < length; i++) {
            arr[i] = list.peek();
        }
        return arr;
    }
}
