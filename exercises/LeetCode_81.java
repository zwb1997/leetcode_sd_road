package exercises;
public class LeetCode_81 {
    public static boolean search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return false;
        }
        if (len == 1) {
            return nums[0] == target;
        }
        int left = 0;
        int right = len - 1;
        int mid = 0;
        while (left <= right) {
            if (nums[mid] == target || nums[left] == target || nums[right] == target) {
                return true;
            } else if (nums[left] < target && target < nums[mid]) {
                right = mid - 1;
            } else if (nums[mid] > target && target < nums[right]) {
                left = mid + 1;
            } else {
                left++;
                right--;
            }
            mid = left + (right - left >> 1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 0, 0, 1, 2 };
        int[] arr1 = { 1, 2, 0, 1, 1, 1, 0 };
        int target = 0;
        System.out.println(search(arr1, target));
    }
}
