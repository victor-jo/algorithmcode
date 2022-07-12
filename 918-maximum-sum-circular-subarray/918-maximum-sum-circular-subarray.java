class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        int m = kadane(nums, 0, nums.length, 1);
        int n1 = kadane(nums, 1, nums.length, -1);
        int n2 = kadane(nums, 0, nums.length-1, -1);
        
        return Math.max(m, Math.max(sum + n1, sum + n2));
    }
    
    public int kadane(int[] nums, int s, int e, int sign) {
        int result = Integer.MIN_VALUE;
        int num = Integer.MIN_VALUE;
        for (int i=s; i<e; ++i) {
            num = sign * nums[i] + Math.max(num, 0);
            result = Math.max(result, num);
        }
        return result;
    }
}