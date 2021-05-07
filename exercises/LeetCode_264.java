package exercises;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LeetCode_264 {
    public static int[] nums = { 2, 3, 5 };

    public static int nthUglyNumber(int n) {
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        set.add(1L);
        queue.add(1L);
        for (int i = 1; i <= n; i++) {
            long x = queue.poll();
            if (i == n) {
                return (int) x;
            }
            for (int num : nums) {
                long tar = x * num;
                if (!set.contains(tar)) {
                    set.add(tar);
                    queue.add(tar);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
}
