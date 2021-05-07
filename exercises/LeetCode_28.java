package exercises;
public class LeetCode_28 {

    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();
        int sameCount = 0;
        for (int i = 0; i < haystackLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needleLen; j++) {
                    if (haystack.charAt(i) == needle.charAt(j)) {
                        sameCount++;
                    }
                }
            }
            if (sameCount == needleLen) {
                return i;
            } else {
                sameCount = 0;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }
}
