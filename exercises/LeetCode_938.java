package exercises;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import treemodels.TreeNode;

public class LeetCode_938 {

    // public static int rangeSumBST(TreeNode root, int low, int high) {
    //     int sum = 0;
    //     List<Integer> lists = new ArrayList<>();
    //     helper(root, low, high, lists);
    //     for(int x : lists){
    //         sum += x;
    //     }
    //     return sum;
    // }

    // public static void helper(TreeNode root, int low, int high, List<Integer> lists) {
    //     if (root == null) {
    //         return;
    //     }

    //     helper(root.left, low, high, lists);
    //     if (root.val >= low && root.val <= high) {
    //         lists.add(root.val);
    //     }
    //     helper(root.right, low, high, lists);
    // }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null){
            return 0;
        }
        if(root.val > high){
            return rangeSumBST(root.left, low, high);
        }
        if(root.val < low){
            return rangeSumBST(root.right,low,high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    public static int rangeSumBST1(TreeNode root, int low, int high) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while(!q.isEmpty()){
            TreeNode curNode = q.poll();
            if(curNode == null){
                continue;
            }
            if(curNode.val < low){
                q.offer(curNode.right);
            }else if(curNode.val > high){
                q.offer(curNode.left);
            }else{
                sum += curNode.val;
                q.offer(curNode.left);
                q.offer(curNode.right);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(7);

        TreeNode n5 = new TreeNode(15);
        TreeNode n6 = new TreeNode(18);

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;

        n1.right = n5;
        n5.right = n6;

        System.out.println(rangeSumBST(n1, 7, 15));
    }
}
