class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int result = 0;
        int skip = 0;

        for (int i=0, j=0; i<n; ++i) {
            if (nums[i] == 0) {
                ++skip;
            }
            while (skip > k) {
                if (nums[j] == 0) {
                    --skip;
                }
                ++j;
            }
            result = Math.max(result, i - j + 1);
        }

        return result;
    }
}