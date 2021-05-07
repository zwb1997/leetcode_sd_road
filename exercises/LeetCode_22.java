package exercises;
import java.util.ArrayList;
import java.util.List;

public class LeetCode_22 {

    // public static List<String> generateParenthesis(int n) {
    // List<String> res = new ArrayList<>();
    // helper(res, 0, 0, n, "");
    // return res;
    // }

    // private static void helper(List<String> res, int llevel, int rlevel, int n,
    // String string) {
    // if (llevel == n || rlevel == n) {
    // System.out.println("l:" + llevel + ";r:" + rlevel);
    // System.out.println(string);
    // return;
    // }
    // helper(res, llevel + 1, rlevel, n, string + "(");
    // helper(res, llevel, rlevel + 1, n, string + ")");
    // }

    public static void generateParenthesis(int n) {
        helper(n, 0, 0, "");
    }

    public static void helper(int n, int left, int right, String current) {
        if (left == n && right == n) {
            System.out.println(current);
            return;
        }
        if(left <= n){
            helper(n, left + 1, right, current + "(");
        }
        if(left > right){
            helper(n, left, right + 1, current + ")");
        }
    }

    public static void main(String[] args) {
        // List<String> lists = generateParenthesis(3);
        // for (String s : lists) {
        // System.out.println(s);
        // }
        generateParenthesis(3);
    }
}
