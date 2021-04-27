import java.util.Arrays;

public class LeetCode_1011 {
    public static int shipWithinDays(int[] weights, int D) {


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int D = 5;
        Arrays.stream(arr).max().getAsInt();
        System.out.println(shipWithinDays(arr, D));
    }
}
