import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class LeetCode_973 {

    public static int[][] kClosest(int[][] points, int K) {
       Arrays.sort(points,Comparator.comparingInt((array) -> array[0] * array[0] + array[1] * array[1]));
       return Arrays.copyOf(points, K);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { -2, 2 } };
        int k = 1;
        int[][] res = kClosest(arr, k);
        for (int[] i : res) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}
