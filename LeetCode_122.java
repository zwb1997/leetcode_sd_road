public class LeetCode_122 {

    public static int maxProfit(int[] prices) {
        boolean could_buy = true;
        int maxProfit = 0;
        int buy_count = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (could_buy && prices[i] < prices[i + 1]) {
                buy_count = prices[i];
                could_buy = false;
            }
            if (!could_buy && prices[i] > prices[i + 1]) {
                int val = prices[i] - buy_count;
                maxProfit += val;
                could_buy = true;
            }
        }
        if (!could_buy) {
            maxProfit += prices[prices.length - 1] - buy_count;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {6,1,3,2,4,7};
        System.out.println(maxProfit(arr));
    }
}
