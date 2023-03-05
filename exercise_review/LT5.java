package exercise_review;

public class LT5 {
    public String longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        int end = chars.length - 1;
        int maxLen = 1;
        int sPos = 0;
        for (int i = 0; i <= end; i++) {
            // decide if current sub string is palindrome
            for (int j = i + 1; j <= end; j++) {
                String curVal = s.substring(i, j + 1);
                int curLen = j - i + 1;
                if (maxLen < curLen && isPalindrome(curVal)) {
                    maxLen = curLen;
                    sPos = i;
                }
            }
        }

        // find the lengest string
        return s.substring(sPos, sPos + maxLen);
    }

    private boolean isPalindrome(String subString) {
        int pos = 0;
        int endPos = subString.length() - 1;
        while (pos <= endPos) {
            if (subString.charAt(pos) != subString.charAt(endPos)) {
                return false;
            }
            pos++;
            endPos--;
        }
        return true;
    }

    public static void main(String[] args) {
        String target = "abcdef";
        // System.out.println(target.substring(0, 5));
        System.out.println(String.format("palindrome is [%s]", new LT5().longestPalindrome(target)));

    }

}
