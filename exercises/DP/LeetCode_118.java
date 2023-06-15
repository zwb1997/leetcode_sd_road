package exercises.DP;

import java.util.ArrayList;
import java.util.List;

import exercises.Leetcode_1605;

public class LeetCode_118 {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 2;
        List<List<Integer>> res = new LeetCode_118().generate(numRows);

        System.out.println(res.toString());
        ;

    }
}
