package algorithm.leetcode.linkedList;

import algorithm.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class TestM0201removeDuplicateNodes {
    //不要想着移除当前节点
    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode tempNode = head;//前驱
        while (tempNode.next != null) {
            ListNode cur = tempNode.next;
            if (set.add(cur.val)) {
                tempNode = tempNode.next;
            } else {
                tempNode.next = tempNode.next.next;
            }
        }
        tempNode.next = null;
        return  head;
    }
}

