class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int major = 0;
        for (int i=0; i<nums.length; ++i) {
            if (count == 0) {
                major = nums[i];
            }
            if (major == nums[i]) {
                ++count;
            }
            else {
                --count;
            }
        }
        return major;
    }
}