package exercises;

import java.util.Arrays;
import java.util.Deque;

public class LeetCode_2679 {
    public static int matrixSum(int[][] nums) {
        int len = nums.length;
        int singleLen = nums[0].length;
        for (int i = 0; i < len; i++) {
            Arrays.sort(nums[i]);
        }

        int res = 0;
        // 纵向遍历
        for (int i = 0; i < singleLen; i++) {
            int max = -1;
            for(int j = 0; j< len; j++){
                max = Math.max(max,nums[j][i]);
            }
            res += max;
        }

        return res;
    }

    /**
     * [7,2,1]
     * [6,4,2]
     * [6,5,3]
     * [3,2,1]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[][] matrix = {
                {7, 2, 1},
                {6, 4, 2},
                {6, 5, 3},
                {3, 2, 1}
        };

        int res = matrixSum(matrix);
        System.out.println(res);
    }
}
