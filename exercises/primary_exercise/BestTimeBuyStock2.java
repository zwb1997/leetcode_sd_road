package exercises.primary_exercise;

public class BestTimeBuyStock2 {

    public int maxProfit(int[] prices) {
        int pro = 0;
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i - 1]) {
                pro += prices[i] - prices[i - 1];
            }
        }

        return pro;
    }

    public int maxProfit2(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        // 第一天 买了股票的利润
        dp[0][1] = -prices[0];
        // 第一天 没买股票的利润
        dp[0][0] = 0;
        for (int i = 1; i < len; i++) {
            // 第 i天 手里没股票 1.前一天也没股票 2. 前一天有股票，今天(第i天卖了)
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            // 第 i天 手里有股票 1. 前一天也有股票 2. 前一天手里没股票，今天买了
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
        }

        return dp[len - 1][0];
    }

    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        // int[] nums = { 1, 2, 3, 4, 5 };
        // int[] nums = { 7, 6, 4, 3, 1 };
        // int maxProfit = new BestTimeBuyStock2().maxProfit(nums);
        int maxProfit = new BestTimeBuyStock2().maxProfit2(nums);
        System.out.println(String.format("max profit -> [%s]", maxProfit));
    }
}