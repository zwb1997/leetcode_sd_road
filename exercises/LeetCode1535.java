package exercises;
public class LeetCode1535 {

    // solution 1 stupid...
    // public static int getWinner(int[] arr, int k) {
    // // winner times over than k times
    // int maxVal = -1;
    // int len = arr.length;
    // int winTimes = 0;
    // for (int i = 0; i < len; i++) {
    // maxVal = Math.max(arr[i], maxVal);
    // }
    // if (k >= len - 1) {
    // return maxVal;
    // }
    // while (winTimes != k) {
    // // compare arr[0] with arr[1]
    // // calc the larger number times
    // // move elements in arr
    // // repear till win times equal to k
    // if (arr[0] > arr[1]) {
    // changeArrElement(arr);
    // winTimes++;
    // continue;
    // }
    // if (arr[0] < arr[1]) {
    // int temp = arr[1];
    // arr[1] = arr[0];
    // arr[0] = temp;
    // changeArrElement(arr);
    // winTimes = 1;
    // }
    // }

    // return arr[0];
    // }

    // public static void changeArrElement(int[] arr) {
    // int len = arr.length - 1;
    // int temp = arr[len];
    // arr[len] = arr[1];
    // arr[1] = temp;
    // int subTemp = arr[1];
    // for (int i = 1; i < len - 1; i++) {
    // arr[i] = arr[i + 1];
    // }
    // arr[len - 1] = subTemp;
    // }

    // not need move the arr
    public static int getWinner(int[] arr, int k) {
        // winner times over than k times
        int maxVal = -1;
        int len = arr.length;
        int winTimes = 0;
        for (int i = 0; i < len; i++) {
            maxVal = Math.max(arr[i], maxVal);
        }
        if (k >= len - 1) {
            return maxVal;
        }

        int theMaxValue = arr[0];
        for (int i = 1; i < len; i++) {
            if (theMaxValue > arr[i]) {
                winTimes++;
            } else if (theMaxValue < arr[i]) {
                theMaxValue = arr[i];
                winTimes = 1;
            }
            if (winTimes == k) {
                break;
            }
        }
        return theMaxValue;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 25, 35, 42, 68, 70 };
        int[] arr1 = { 2, 1, 3, 5, 4, 6, 7 };
        int k = 2;
        System.out.println(getWinner(arr1, k));
    }
}
