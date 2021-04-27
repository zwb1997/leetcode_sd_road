public class LeetCode80 {

    public static int removeDuplicates1(int[] nums) {
        return process(nums, 2);
    }

    static int process(int[] nums, int k) {
        int pos = 0;
        for (int num : nums) {
            if (pos < k || nums[pos - k] != num) {
                nums[pos] = num;
                pos++;
            }
        }
        return pos;
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        int begin = 2;
        int end = 2;
        if (len <= 2) {
            return 2;
        }
        while (end < len && begin < len) {
            while (end < len && begin < len && nums[begin - 2] == nums[end]) {
                end++;
            }
            if (end < len && begin < len) {
                nums[begin] = nums[end];
                begin++;
                end++;
            }
        }
        return begin;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 2, 3 };
        int[] arr2 = { 0, 0, 1, 1, 1, 1, 2, 2, 3 };
        System.out.println(removeDuplicates1(arr2));
        for (int i : arr1) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
