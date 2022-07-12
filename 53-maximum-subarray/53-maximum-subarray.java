class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int val = 0;
        for (int num : nums) {
            val += num;
            max = Math.max(max, val);
            if (val < 0) val = 0;
        }
        return max;
    }
}