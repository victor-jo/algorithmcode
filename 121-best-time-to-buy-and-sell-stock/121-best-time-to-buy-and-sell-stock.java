class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; ++i) {
            int q = prices[i] - p;
            if (profit < q) {
                profit = q;
            }
            if (p > prices[i]) {
                p = prices[i];
            }
        }
        return profit;
    }
}