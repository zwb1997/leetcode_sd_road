package exercises.primary_exercise;

public class Rotaterray {

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = nums[i];
        }
        for (int i = 0; i < len; i++) {
            nums[(i + k) % len] = newArray[i];
        }
    }

    public void rotate2(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        rotateArrayByNum(nums, 0, len - 1);
        rotateArrayByNum(nums, 0, k - 1);
        rotateArrayByNum(nums, k, len - 1);
    }

    private void rotateArrayByNum(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
//        new Rotaterray().rotate(array, k);
        new Rotaterray().rotate2(array, k);
        for (int i : array) {
            System.out.print(i + "\t");
        }
    }
}
