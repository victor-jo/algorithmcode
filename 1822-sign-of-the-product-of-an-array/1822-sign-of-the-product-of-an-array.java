class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for (int i=0; i<nums.length; ++i) {
            if (nums[i] < 0) {
                ++neg;
            }
            if (nums[i] == 0) {
                return 0;
            }
        }
        return (neg%2==1) ? -1 : 1;
    }
}