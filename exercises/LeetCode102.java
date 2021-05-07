package exercises;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import treemodels.TreeNode;

public class LeetCode102 {

    public static HashMap<Integer, List<Integer>> MAP = new HashMap();

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<>();

        // recursion
        // levelOrderHelper(1, root);
        // Set<Map.Entry<Integer, List<Integer>>> entries = MAP.entrySet();
        // for (Map.Entry<Integer, List<Integer>> en : entries) {
        // resList.add(en.getValue());
        // }

        // loop
        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.add(root);
        while (!treeQueue.isEmpty()) {
            List<Integer> curList = new ArrayList<>();
            int len = treeQueue.size();
            for (int i = 0; i < len; i++) {
                TreeNode curNode = treeQueue.poll();
                curList.add(curNode.val);
                if(curNode.left != null){
                    treeQueue.add(curNode.left);
                }
                if(curNode.left != null){
                    treeQueue.add(curNode.right);
                }
            }
            resList.add(curList);
        }

        return resList;
    }

    private static void levelOrderHelper(int level, TreeNode root) {
        if (root == null) {
            return;
        }
        int val = root.val;
        List<Integer> curList = MAP.getOrDefault(level, new ArrayList<Integer>());
        curList.add(val);
        levelOrderHelper(level + 1, root.left);
        levelOrderHelper(level + 1, root.right);
        MAP.put(level, curList);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(10);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(15);
        TreeNode node6 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        // TreeNode root = new TreeNode(1);
        levelOrder(root);
    }
}
