package exercises;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LeetCode_208 {

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("a");
        System.out.println(t.search("a"));
        System.out.println(t.startsWith("a"));
    }
}

class Trie {

    private class TreeNode {
        TreeNode[] children = new TreeNode[26];
        boolean isEnd;
    }

    TreeNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root = new TreeNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        int len = word.length();
        TreeNode curNode = root;
        for (int i = 0; i < len; i++) {
            int pos = word.charAt(i) - 'a';
            if (curNode.children[pos] == null) {
                curNode.children[pos] = new TreeNode();
            }
            curNode = curNode.children[pos];
        }
        curNode.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TreeNode curNode = root;
        int len = word.length();
        for(int i = 0; i < len; i++){
            int curPos = word.charAt(i) - 'a';
            if(curNode.children[curPos] == null){
                return false;
            }
            curNode = curNode.children[curPos];
        }
        return curNode.isEnd;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TreeNode curNode = root;
        int len = prefix.length();
        for(int i = 0; i < len ;i++){
            int curPos = prefix.charAt(i) - 'a';
            if(curNode.children[curPos] == null){
                return false;
            }
            curNode = curNode.children[curPos];
        }
        return true;
    }
}