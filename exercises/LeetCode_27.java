package exercises;
public class LeetCode_27 {

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        if (len == 1) {
            return nums[0] == val ? 0 : 1;
        }

        int pos = 0;

        for (int i = 0; i < len; i++) {
            if(nums[pos] != val){
                pos++;
            }else{
                if(nums[i] != val){
                    int temp = nums[pos];
                    nums[pos] = nums[i];
                    nums[i] = temp;
                    pos++;
                }
            }
        }
        return pos;
    }

    public static int removeElement1(int[] nums, int val) {
        int idx = 0;
        for(int x : nums){
            if(x != val){
                nums[idx] = x;
                idx++;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr1 = { 3, 2, 2, 3 };
        int[] arr2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] arr3 = { 2 };
        int[] arr4 = { 2,2,2 };
        int element = 0;
        System.out.println(removeElement(arr4, element));
    }
}
