class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int result = 0;

        int[] queue = new int[100001];
        int front = -1;
        int rear = -1;
        int skip = 0;

        for (int i=0, j=0; j<n; ++j) {
            if (nums[j] == 0) {
                queue[++front] = j + 1;
                ++skip;
            }
            if (skip > k) {
                i = queue[++rear];
                --skip;
            }
            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}