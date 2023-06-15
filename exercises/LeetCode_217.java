package exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode_217 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {1, 2, 3, 4};

        int[] arr3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        int[] arr4 = {1000000000,1000000000,11};
        System.out.println(new LeetCode_217().containsDuplicate4(arr4));

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


    public boolean containsDuplicate4(int[] nums) {
        int len = nums.length;
        int max = -1;
        for (int i = 0; i < len; i++) {
            max = Math.max(Math.abs(nums[i]), max);
        }
        byte[] bit = new byte[max + 1];
        byte[] bitNegative = new byte[max + 2];
        bitNegative[0] = (byte) 1;
        for (int i = 0; i < len; i++) {
            int cur = nums[i];

            if (cur >= 0) {
                if(bit[cur] == 1){
                    return true;
                }
                bit[cur] = 1;
            } else {
                if(bitNegative[-cur] == 1){
                    return true;
                }
                bitNegative[-cur] = 1;
            }
        }
        return false;
    }
}