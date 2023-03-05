package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 1 };
        int[] arr2 = { 1, 2, 3, 4 };

        int[] arr3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        System.out.println(new LeetCode_217().containsDuplicate2(arr2));

    }

    public boolean containsDuplicate1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == temp) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;

        for (int i = 1; i <= len - 1; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for (int i : nums) {
            if (!temp.add(i)) {
                return true;
            }
        }
        return false;
    }
}