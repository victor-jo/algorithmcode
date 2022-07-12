class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int sum = nums[0];
        int kmx = nums[0];
        int mx = nums[0];
        int kmn = nums[0];
        int mn = nums[0];
        for (int i=1; i<nums.length; ++i) {
            sum += nums[i];
            kmx = Math.max(kmx + nums[i], nums[i]);
            kmn = Math.min(kmn + nums[i], nums[i]);
            mx = Math.max(mx, kmx);
            mn = Math.min(mn, kmn);
        }
        
        if (mn == sum) {
            return mx;
        }
        
        return Math.max(mx, sum - mn);
    }
}