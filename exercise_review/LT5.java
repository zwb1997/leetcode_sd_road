package exercise_review;

public class LT5 {
    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }
        int maxLen = 1;
        int cutPoint = 0;
        int sLen = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < sLen; i++) {
            for (int j = i + 1; j < sLen; j++) {
                int currentLen = j - i + 1;
                if (maxLen < currentLen && isPalindrome(chars, i, j)) {
                    maxLen = currentLen;
                    cutPoint = i;
                }
            }
        }
        return s.substring(cutPoint, cutPoint + maxLen);
    }

    public boolean isPalindrome(char[] s, int i, int j) {

        while (i < j) {
            if (s[i++] != s[j--]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String target = "cdabbaef";
        // System.out.println(target.substring(0, 5));

        LT5 l5 = new LT5();

        System.out.println(l5.longestPalindrome(target));
    }

}
