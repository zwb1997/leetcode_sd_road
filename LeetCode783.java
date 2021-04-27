import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import treemodels.TreeNode;

public class LeetCode783 {

    public int minDiffInBST(TreeNode root) {
        return 1;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.sort((a,b)->{
            return b-a;
        });
        for(int x : list){
            System.out.println(x);
        }
    }

}
