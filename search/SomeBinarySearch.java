package search;

public class SomeBinarySearch {

    /**
     * 取中值 但不能保证是第一个出现的目标值
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int demo1(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length - 1;
        int mid = leftBound + (rightBound - leftBound >> 1);
        while (leftBound <= rightBound) {
            mid = leftBound + (rightBound - leftBound >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                rightBound = mid - 1;
            } else {
                leftBound = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 向左收敛区间，取第一个出现的目标值
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int demo2(int[] nums, int target) {
        int leftBound = 0;
        int rightBound = nums.length - 1;
        while (leftBound < rightBound) {
            int mid = leftBound + (rightBound - leftBound >> 1);
            if (nums[mid] == target) {
                rightBound = mid;
            } else if (nums[mid] > target) {
                rightBound = mid;
            } else {
                leftBound = mid + 1;
            }
        }
        if (leftBound == nums.length) {
            return -1;
        }
        return target == nums[leftBound] ? leftBound : -1;
    }

    /**
     * 寻找最后一个target
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int demo3(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left >> 1);
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (left == nums.length && nums[left - 1] != target) {
            return -1;
        }
        return left - 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] arr2 = { 1, 1, 2, 3, 3, 3, 4 };
        int target = 1;
        System.out.println(demo3(arr2, target));
    }
}
