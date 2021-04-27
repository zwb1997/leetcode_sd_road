import treemodels.TreeNode;

public class LeetCode_897 {
    
    public static TreeNode increasingBST(TreeNode root) {
        TreeNode head = new TreeNode(999);
        infixHelper(root,head,head);
        return head;
    }
    public static void infixHelper(TreeNode root,TreeNode pHead,TreeNode head){
        if(root == null){
            return;
        }
        infixHelper(root.left,pHead,head);
        pHead.right = new TreeNode(root.val);
        pHead = pHead.right;
        infixHelper(root.right,pHead,head);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);




        TreeNode n1 = new   TreeNode(5);

        TreeNode n2 = new   TreeNode(3);
        TreeNode n3 = new   TreeNode(6);

        TreeNode n4 = new   TreeNode(2);
        TreeNode n5 = new   TreeNode(4);
        TreeNode n6 = new   TreeNode(1);

        TreeNode n7 = new   TreeNode(8);
        TreeNode n8 = new   TreeNode(7);
        TreeNode n9 = new   TreeNode(9);



        n1.left = n2;
        n1.right = n3;

        n2.left = n4;
        n2.right = n5;

        n4.left = n6;

        n3.left = null;
        n3.right = n7;
        n7.left = n8;
        n7.right = n9;


        increasingBST(n1);
    }
}
