class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; ++i) {
            profit = Math.max(profit, prices[i] - p);
            p = Math.min(p, prices[i]);
        }
        return profit;
    }
}