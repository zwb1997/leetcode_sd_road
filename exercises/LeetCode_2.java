package exercises;

import listnode.ListNode;

public class LeetCode_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode curP = null;
        int p1Len = 0;
        int p2Len = 0;
        while (p1 != null || p2 != null) {
            if (p1 != null) {
                p1Len++;
                p1 = p1.next;
            }
            if (p2 != null) {
                p2Len++;
                p2 = p2.next;
            }
        }
        curP = p1Len >= p2Len ? l1 : l2;
        int mod = 0;

        ListNode p3 = l1;
        ListNode p4 = l2;
        while (p3 != null || p4 != null) {
            int val = 0;
            if(p3 != null){
                val+=p3.val;
            }
            if(p4 != null){
                val+=p4.val;
            }
            curP.val = (val + mod) / 10;
            mod = (val + mod) % 10;
            curP = curP.next;
            p3 = p3.next;
            p4 = p4.next;
        }
        return p1Len >= p2Len ? l1 : l2;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        ListNode n8 = new ListNode(9);
        ListNode n9 = new ListNode(9);
        ListNode n10 = new ListNode(9);
        ListNode n11 = new ListNode(9);

        n8.next = n9;
        n9.next = n10;
        n10.next = n11;

        ListNode p = addTwoNumbers(n1, n8);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}
