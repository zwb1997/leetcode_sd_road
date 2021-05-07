public class LeetCode_154 {

    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left < right && nums[0] == nums[right]) {
            right--;
        }
        while (left < right) {
            int mid = left + (right - left >> 1);
            if(nums[mid] >= nums[left]){
                right = right - 1;
            }else{
                left = mid;
            }
        }
        return nums[left];
    }

    public static int findMin2(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r && nums[0] == nums[r]) r--;
        while (l < r) {
            int mid = l + r + 1 >> 1;
            if (nums[mid] >= nums[0]) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return r + 1 < n ? nums[r + 1] : nums[0];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };
        int[] arr2 = { 2, 2, 2, 0, 1 };
        int[] arr3 = { 0 };
        int[] arr4 = { 0, 1 };
        int[] arr5 = { 3, 1, 1 };
        int[] arr6 = { 3, 3, 0, 1, 3 };
        int[] arr7 = { 1, 3, 3 };
        // System.out.println(findMin(arr6));
        System.out.println(findMin2(arr6));
    }
}
