import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode_179 {
    public static String largestNumber(int[] nums) {
        int len = nums.length;
        String[] resArrs = new String[len];
        int pos = 0;
        for (int x : nums) {
            resArrs[pos++] = x + "";
        }
        Arrays.sort(resArrs, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s1.compareTo(s2);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : resArrs) {
            sb.append(s);
        }
        pos = 0;
        len = sb.length();
        while (pos < len - 1 && sb.charAt(pos) == '0') {
            pos++;
        }
        return sb.substring(pos).toString();
    }

    public static void main(String[] args) {
        int[] nums = { 3, 30, 34, 5, 9 };
        int[] nums2 = { 10, 2 };
        int[] nums3 = { 1 };
        int[] nums4 = { 432, 43243 };
        System.out.println(largestNumber(nums2));
        String[] arrs = {"10","9","8","7","6","5","4","3"};
        String[] arrs2 = {"1","2","3","4","5"};
        Arrays.sort(arrs2,(a,b)->{
            return a.compareTo(b);
        });
        ArrayList<Integer> lists = new ArrayList<>();

        for(String s : arrs2){
            System.out.println(s);
        }
    }
}
