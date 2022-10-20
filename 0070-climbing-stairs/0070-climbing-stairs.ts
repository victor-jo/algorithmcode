function climbStairs(n: number): number {
  let dp: number[] = [];
  dp[n] = 1;
  dp[n-1] = 1;
  for (let i: number=n-2; i>=0; --i) {
    dp[i] = dp[i+1] + dp[i+2];
  }
  return dp[0];
};