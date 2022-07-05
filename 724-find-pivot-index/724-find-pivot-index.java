class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;
        int[] sums = new int[N];
        sums[0] = nums[0];
        for (int i=1; i<N; ++i) {
            sums[i] = sums[i-1] + nums[i];
        }
        for (int i=0; i<N; ++i) {
            int left = i > 0 ? sums[i-1] : 0;
            int right = i < N-1 ? sums[N-1] - sums[i] : 0;
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}