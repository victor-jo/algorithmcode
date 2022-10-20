function minCostClimbingStairs(cost: number[]): number {
  let dp: number[] = [];
  let n: number = cost.length;
  for (let i:number = n-1; i>=0; --i) {
    dp[i] = Math.min((dp[i+1] || 0) + cost[i], (dp[i+2] || 0) + cost[i]);
  }
  return Math.min(dp[0] || 0, dp[1] || 0);
};