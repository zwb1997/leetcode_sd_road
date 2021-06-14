package exercises;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode_5750 {
    public static int maximumPopulation(int[][] logs) {
        Arrays.sort(logs, (int[] a,int[] b)->{
            
        });
        int peopleSize = 1;
        int pos = 0;
        int len = logs.length;
        for (int i = 1; i < len; i++) {
            int beforeBirth = logs[i-1][0];
            int beforeDeath = logs[i-1][1];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1950, 1961 }, { 1960, 1971 }, { 1970, 1981 } };
        maximumPopulation(arr);
    }
}
