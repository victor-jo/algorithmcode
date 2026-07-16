// Last updated: 2026. 7. 16. 오전 11:25:39
class Solution {
    public int[] runningSum(int[] nums) {
        int[] run = new int[nums.length];
        run[0] = nums[0];
        for (int i=1; i<nums.length; ++i) {
            run[i] = run[i-1] + nums[i];
        }
        return run;
    }
}