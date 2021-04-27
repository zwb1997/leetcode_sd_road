import java.util.Arrays;

public class LeetCode_5739 {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int j = 0;
        long a = 0;
        for (int i = 1; i < nums.length; i++) {
            // 计算区间内每个值，与区间内最后一个值相差的总和
            a += (nums[i] - nums[i - 1]) * (i - j);
            // 如果超过目标值
            while (a > k) {
                // 那么就减去区间内最左侧的值与最后一个值的差距。
                // 然后再让区间左侧向右移动一位，相等于整个区间缩小了一位距离，在缩小的区间内再判断是否满足要求
                a -= nums[i] - nums[j];
                j++;
            }
            ans = Math.max(i - j + 1, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6 };
        System.out.println(maxFrequency(arr, 5));
    }
}
