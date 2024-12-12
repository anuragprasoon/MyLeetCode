class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buypos=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buypos) {
                profit += prices[i] - buypos;
            }
            buypos = prices[i];
        }
        return profit;
    }
}