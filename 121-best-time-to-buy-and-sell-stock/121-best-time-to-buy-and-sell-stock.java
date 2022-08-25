class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; ++i) {
            int q = prices[i];
            if (profit < (q - p)) {
                profit = (q - p);
            }
            if (p > q) {
                p = q;
            }
        }
        return profit;
    }
}