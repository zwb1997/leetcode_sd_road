package sorts;

import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {

        int size = array.length;
        int[] temp = Arrays.copyOf(array, size);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (temp[i] < temp[j]) {
                    swap(temp, i, j);
                }
            }
        }
        return temp;
    }

    public int[] bubbleSort_1(int[] array) {
        int size = array.length;
        int[] temp = Arrays.copyOf(array, size);

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (temp[j] > temp[j + 1]) {
                    swap(temp, j, j + 1);
                }
            }
        }
        return temp;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[] { 10, 11, 33, 2, 0, 99, 1, 33, 4, 55, 9910, 212 };

        // int[] res = new BubbleSort().bubbleSort(array);
        int[] res = new BubbleSort().bubbleSort_1(array);

        System.out.println(Arrays.toString(res));

    }
}
