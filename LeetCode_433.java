import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class LeetCode_433 {

    public static int minMutation(String start, String end, String[] bank) {
        int minLen = Integer.MAX_VALUE;
        Set<String> banks = new LinkedHashSet<>();
        for (String s : bank) {
            banks.add(s);
        }
        if (!banks.contains(end)) {
            return -1;
        }
        minLen = dfs(banks, start, end, 0, minLen);

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    private static int dfs(Set<String> banks, String currentStr, String endStr, int level, int minLen) {
        if (level >= banks.size()) {
            return Integer.MAX_VALUE;
        }
        if (!banks.contains(currentStr) && level != 0) {
            return Integer.MAX_VALUE;
        }

        for (String pos : banks) {
            if (check(pos, currentStr)) {
                if (pos.equals(endStr)) {
                    return level + 1;
                } else {
                    minLen = Math.min(minLen, dfs(banks, pos, endStr, level + 1, minLen));
                }
            }
        }
        return minLen;
    }

    private static boolean check(String posString, String currentStr) {
        int count = 0;
        int len = posString.length();
        for (int i = 0; i < len; i++) {
            if (posString.charAt(i) != currentStr.charAt(i)) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String start = "AACCGGTT";
        String end = "AAACGGTA";
        String[] bank = { "AACCGATT", "AACCGATA", "AAACGATA", "AAACGGTA" };
        System.out.println(minMutation(start, end, bank));
    }
}
