package exercises;
public class LeetCode941 {

    public static boolean validMountainArray(int[] A) {

        int size = A.length;
        int pos = 0;
        while (pos + 1 < size && A[pos] < A[pos + 1]) {
            pos++;
        }
        if (pos == 0 || pos == size - 1) {
            return false;
        }
        while (pos + 1 < size && A[pos] > A[pos + 1]) {
            pos++;
        }
        return pos == size - 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1 };
        int[] arr1 = new int[] { 2, 1, 2 };
        int[] arr2 = new int[] { 3, 5, 5 };
        int[] arr3 = new int[] { 0, 1, 3, 2, 1 };
        System.out.println(validMountainArray(arr2));
    }
}
