public class LeetCode_213 {

    public static int rob(int[] nums) {
        int begin = 0;
        int pos = 0;
        int len = nums.length;
        int maxVal = -1;
        for (int i = 1; i < len; i++) {
            pos = (i + 2) % len;
            if ((pos + 1) % i != i + 1 && (pos + 1) % i != i - 1 && (pos + 1) % i != i) {
                maxVal = Math.max(maxVal, nums[i] + nums[pos]);
            } else {
                maxVal = Math.max(maxVal, nums[i]);
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 3, 2 };
        int[] nums2 = { 1, 2, 3, 1 };
        System.out.println(rob(nums1));
    }
}
