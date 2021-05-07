package exercises;

import java.util.HashMap;

public class LeetCode_3 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        HashMap<Character,Integer> posMap = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(posMap.containsKey(s.charAt(i))){
                left = Math.max(left,posMap.get(s.charAt(i)) + 1);
                // left = posMap.get(s.charAt(i)) + 1;
            }
            posMap.put(s.charAt(i), i);
            max = Math.max(i - left + 1,max);
        }
        return max;
    }

    public static void main(String[] args) {
        // System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
