class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int l = 0;
        int r = 0;
        while (r < nums.length) {
            if (sum >= target) {
                result = Math.min(result, r - l);
                sum -= nums[l++];
            }
            else {
                sum += nums[r++];    
            }
        }
        while (sum >= target) {
            result = Math.min(result, r - l);
            sum -= nums[l++];
        }
        return l == 0 ? 0 : result;
    }
}