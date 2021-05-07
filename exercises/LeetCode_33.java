package exercises;
public class LeetCode_33 {
    /**
     * 搜索旋转排序数组 https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        if (len == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = right + (left - right >> 1);
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr3 = { 1, 3 };
        int[] arr4 = { 1, 3, 5 };
        int[] arr5 = { 3, 1 };
        int[] arr6 = { 7, 8, 9, 1, 2, 3 };
        int target = 8;
        System.out.println(search(arr5, 1));
    }
}
