public class LeetCode_153 {
    public static int findMin(int[] nums) {
        int maxMin = Integer.MAX_VALUE;
        for (int x : nums) {
            if (x < maxMin) {
                maxMin = x;
            }
        }
        return maxMin;
    }

    public static int findMin2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left >> 1);
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 4, 5, 1, 2 };
        int[] arr2 = { 4, 5, 6, 7, 0, 1, 2 };
        int[] arr3 = { 11, 13, 15, 17 };
        int[] arr4 = { 2, 1 };
        int[] arr5 = { 3, 1, 2 };
        int[] arr6 = { 3, 4, 5, 1, 2 };
        System.out.println(findMin2(arr5));
    }
}
