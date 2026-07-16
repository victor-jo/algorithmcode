// Last updated: 2026. 7. 16. 오전 11:26:02
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        
        int[] result = new int[nums.length];
        int pos = result.length - 1;
        
        while (l <= r) {
            int leftN = nums[l] * nums[l];
            int rightN = nums[r] * nums[r];
            
            if (leftN > rightN) {
                result[pos] = leftN;
                ++l;
            }
            else {
                result[pos] = rightN;
                --r;
            }
            
            --pos;
        }
        
        return result;
    }
}