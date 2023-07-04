package exercise_review;

import common.ListNode;

public class LT2 {

    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {

        ListNode<Integer> head = new ListNode<>(-1, null);
        ListNode<Integer> cur = head;
        int mod = 0;

        while (l1 != null || l2 != null) {
            int curVal = 0;
            curVal += l1 == null ? 0 : l1.val;
            curVal += l2 == null ? 0 : l2.val;
            curVal += mod;
            cur.next = new ListNode<>(curVal % 10);

            mod = curVal >= 10 ? 1 : 0;
            cur = cur.next;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (mod != 0) {
            cur.next = new ListNode<>(1, null);
        }

        return head.next;
    }

    public static void main(String[] args) {

        ListNode<Integer> l1 = new ListNode<>(9);
        ListNode<Integer> l2 = new ListNode<>(9);
        ListNode<Integer> l3 = new ListNode<>(9);
        ListNode<Integer> l31 = new ListNode<>(9);
        ListNode<Integer> l32 = new ListNode<>(9);
        ListNode<Integer> l33 = new ListNode<>(9);
        ListNode<Integer> l34 = new ListNode<>(9);

        l1.next = l2;
        l2.next = l3;
        l3.next = l31;
        l31.next = l32;
        l32.next = l33;
        l33.next = l34;

        ListNode<Integer> l4 = new ListNode<>(9);
        ListNode<Integer> l5 = new ListNode<>(9);
        ListNode<Integer> l6 = new ListNode<>(9);
        ListNode<Integer> l7 = new ListNode<>(9);
        // ListNode l6 = new ListNode(4);

        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        // ListNode1 tar = l1;
        // ListNode tar = l4;
        // while (tar != null) {
        // System.out.println("cur val -> " + tar.val);
        // tar = tar.next;
        // }

        ListNode<Integer> t = new LT2().addTwoNumbers(l1, l4);

        while (t != null) {
            System.out.print(t.val + "\t");
            t = t.next;
        }
        System.out.println();
    }
}
