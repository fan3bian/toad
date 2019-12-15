package domain;

public class ListNode {
    int num;
    ListNode next;

    ListNode(int x) {
        num = x;
    }

    /**
     * 链表的遍历
     *
     * @param args
     */
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = listNode;
        ListNode listNode3 = new ListNode(3);
        listNode3.next = listNode2;
        //for循环：一定需要三个语句，第一个赋值，第三个判断，第三个移位
        for (ListNode next = listNode3; next != null; next = next.next) {
            System.out.println(next.num);//执行语句
        }
        //while循环
//        ListNode next = listNode3;//赋值
//        while (next != null) {//判断
//            System.out.println(next.num);
//            next = next.next;//
//        }
        //do while
        ListNode next = listNode3;//赋值
        do {
            System.out.println(next.num);
            next = next.next; //移位
        } while (next != null);//判断



    }

}
