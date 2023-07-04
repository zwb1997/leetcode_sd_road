package exercises;


import listnode.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> nodeDeque1 = new ArrayDeque<>();
        Deque<Integer> nodeDeque2 = new ArrayDeque<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                nodeDeque1.addFirst(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                nodeDeque2.addFirst(l2.val);
                l2 = l2.next;
            }
        }
        ListNode pHead = new ListNode();
        ListNode p = pHead;
        int digital = 0;
        while (!nodeDeque1.isEmpty() || !nodeDeque2.isEmpty()) {
            ListNode curNode = new ListNode();
            int node1Val = 0;
            int node2Val = 0;
            if (!nodeDeque1.isEmpty()) {
                node1Val = nodeDeque1.poll();
            }
            if (!nodeDeque2.isEmpty()) {
                node2Val = nodeDeque2.poll();
            }
            int curSum = (node1Val + node2Val + digital);
            if (curSum >= 10) {
                curSum = curSum % 10;
                digital = 1;
            } else {
                digital = 0;
            }
            curNode.val = curSum;
            p.next = curNode;
            p = p.next;
        }
        if (digital == 1)
            p.next = new ListNode(1);
        pHead = pHead.next;
        while (pHead != null) {
            nodeDeque1.addLast(pHead.val);
            pHead = pHead.next;
        }
        ListNode ppHead = new ListNode(0, null);
        ListNode pRes = ppHead;
        while (!nodeDeque1.isEmpty()) {
            ppHead.next = new ListNode(nodeDeque1.pollLast());
            ppHead = ppHead.next;
        }
        return pRes.next;
    }

    public static ListNode solution_2(ListNode l1, ListNode l2) {
        Deque<Integer> nodeDeque1 = new ArrayDeque<>();
        Deque<Integer> nodeDeque2 = new ArrayDeque<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                nodeDeque1.addFirst(l1.val);
                l1 = l1.next;
            }
            if (l2 != null) {
                nodeDeque2.addFirst(l2.val);
                l2 = l2.next;
            }
        }
        ListNode pHead = null;
        int digital = 0;
        while (!nodeDeque1.isEmpty() || !nodeDeque2.isEmpty() || digital != 0) {
            int node1Val = 0;
            int node2Val = 0;
            if (!nodeDeque1.isEmpty()) {
                node1Val = nodeDeque1.poll();
            }
            if (!nodeDeque2.isEmpty()) {
                node2Val = nodeDeque2.poll();
            }
            int curSum = (node1Val + node2Val + digital);
            if (curSum >= 10) {
                curSum = curSum % 10;
                digital = 1;
            } else {
                digital = 0;
            }
            ListNode curNode = new ListNode();
            curNode.val = curSum;
            curNode.next = pHead;
            pHead = curNode;

        }
        return pHead;
    }


    public static void main(String[] args) {
        ListNode n1 = new ListNode(7);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode n11 = new ListNode(5);
        ListNode n12 = new ListNode(6);
        ListNode n13 = new ListNode(4);
        n11.next = n12;
        n12.next = n13;

        ListNode n111 = new ListNode(9);
        ListNode n112 = new ListNode(9);
        ListNode n113 = new ListNode(9);
        n111.next = n112;
        n112.next = n113;

        ListNode n123 = new ListNode(1);
//        ListNode res = addTwoNumbers(n1, n11);
        ListNode res = solution_2(n111, n123);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
