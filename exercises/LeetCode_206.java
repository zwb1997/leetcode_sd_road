package exercises;

import listnode.ListNode;

public class LeetCode_206 {
    public static ListNode reverseList(ListNode head) {
        ListNode pHead = null;
        ListNode helper = head;
        while (helper != null) {
            ListNode node = helper.next;
            helper.next = pHead;
            pHead = helper;
            helper = node;
        }
        return pHead;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode p = reverseList(n1);
        while (p != null) {
            System.out.print(p.val + "\t");
            p = p.next;
        }
    }
}
