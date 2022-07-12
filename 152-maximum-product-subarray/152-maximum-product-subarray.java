class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int r = nums[0];
        int p = nums[0];
        int n = nums[0];
        for (int i=1; i<nums.length; ++i) {
            int temp1 = Math.max(nums[i], Math.max(p * nums[i], n * nums[i]));
            int temp2 = Math.min(nums[i], Math.min(p * nums[i], n * nums[i]));
            p = temp1;
            n = temp2;
            r = Math.max(r, p);
        }
        
        return r;
    }
}