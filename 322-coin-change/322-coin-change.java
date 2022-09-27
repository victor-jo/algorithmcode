class Solution {
    
    public int coinChange(int[] coins, int amount) {
        int inf = 10001;
        int[] dp = new int[inf];
        
        Arrays.fill(dp, inf);
        
        dp[0] = 0;
        
        for (int i=1; i<=amount; ++i) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        
        return dp[amount] == inf ? -1 : dp[amount];
    }
}