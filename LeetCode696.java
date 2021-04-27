import java.util.ArrayList;
import java.util.List;

public class LeetCode696 {

    public static int countBinarySubstrings(String s) {
        List<Integer> counts = new ArrayList<>();
        int cur = 0;
        int n = s.length();
        while (cur < n) {
            char c = s.charAt(cur);
            int count = 0;
            while (cur < n && c == s.charAt(cur)) {
                cur++;
                count++;
            }
            counts.add(count);
        }
        int ans = 0;
        for (int i = 1; i < counts.size(); i++) {
            ans += Math.min(counts.get(i), counts.get(i - 1));
        }
        return ans;
    }

    public static int countBinarySubstring(String s) {
        int cur = 0;
        int n = s.length();
        int ans = 0;
        int last = 0;
        while (cur < n) {
            char c = s.charAt(cur);
            int count = 0;
            while (cur < n && s.charAt(cur) == c) {
                ++cur;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }

    public static void main(String[] args) {

        String s = "00110011";
        System.out.println(countBinarySubstring(s));
    }
}