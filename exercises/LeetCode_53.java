package exercises;

public class LeetCode_53 {

    public int maxSubArray(int[] nums) {

        int preSum = 0;
        int maxSum = nums[0];
        for (int i : nums) {
            preSum = Math.max(preSum + i, i);
            maxSum = Math.max(preSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(new LeetCode_53().maxSubArray(nums));
        
    }
}
