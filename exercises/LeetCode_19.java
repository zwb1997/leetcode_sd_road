package exercises;

import listnode.ListNode;

public class LeetCode_19{

 //1-2-3-4-5
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        ListNode pHead = new ListNode(0,head);
        ListNode pCur = pHead;
        while(head != null){
            len++;
            head = head.next;
        }
        
        for(int i = 1; i < len - n + 1; i++){
            pCur = pCur.next;
        }
        pCur.next = pCur.next.next;
        ListNode ans = pHead.next;
        return ans;
    }

    public static void main(String[] args) {
        ListNode n5 = new ListNode(5);
        ListNode n4 = new ListNode(4,n5);
        ListNode n3 = new ListNode(3,n4);
        ListNode n2 = new ListNode(2,n3);
        ListNode n1 = new ListNode(1,n2);

        // ListNode n1 = new ListNode(1,new ListNode(2));
        ListNode n = removeNthFromEnd(n1, 2);
        while(n != null){
            System.out.println(n.val);
            n  = n.next;
        }
    }
}