class Solution {
    public int maxProfit(int[] prices) {
        int p = prices[0];
        int max = 0;
        for (int i=1; i<prices.length; ++i) {
            int q = prices[i];
            max = Math.max(max, q - p);
            p = Math.min(p, prices[i]);
        }
        return max;
    }
}