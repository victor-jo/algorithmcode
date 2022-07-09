class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        for (int num : nums) {
            maxNumber = Math.max(maxNumber, num);
        }
        
        if (maxNumber == 0) {
            return 0;
        }    
        
        int[] dp = new int[maxNumber+1];
        for (int num : nums) {
            dp[num] = dp[num] + num;
        }
        
        int skip = 0;
        int take = dp[0];
        
        for (int i=1; i<=maxNumber; i++) {
            int temp = skip;
            skip = Math.max(skip, take);
            take = temp + dp[i];
        }
        
        return Math.max(skip, take);
    }
}