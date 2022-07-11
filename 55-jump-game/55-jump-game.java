class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for (int i=0; i<nums.length-1; ++i) {
            if (nums[i] == 0 && maxIndex <= i) return false;
            maxIndex = Math.max(maxIndex, i+nums[i]);
        }
        return true;
    }
}