class Solution {
    public boolean canJump(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0) {
            if (nums[i] == 0) {
                int dist = 0;
                while (nums[i] <= dist) {
                    ++dist;
                    --i;
                    if (i < 0) return false;
                }
            }
            --i;
        }
        return true;
    }
}