package exercises;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_1 {

    public static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] solution_2(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i,map.get(target - nums[i])};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = solution_2(nums, target);

        System.out.println(String.format("%s", Arrays.toString(res)));
    }
}
