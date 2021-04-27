public class LeetCode17_21 {
    //solution 1
    public static int trap(int[] height) {
        // get height => rows
        // calc rows volume then calc sum
        // return sum volume - pillar volume

        int row = 0;
        int len = height.length;
        int sumVolume = 0;
        int lPos = 0;
        int rPos = len - 1;
        for (int i = 0; i < len; i++) {
            row = Math.max(height[i], row);
        }
        for (int j = 0; j < row; j++) {
            while (height[lPos] < j + 1) {
                lPos++;
            }
            while (height[rPos] < j + 1) {
                rPos--;
            }
            sumVolume += rPos - lPos + 1;
        }
        int sumPillarVolume = 0;
        for (int val : height) {
            sumPillarVolume += val;
        }
        return sumVolume - sumPillarVolume;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(arr));
    }
}
