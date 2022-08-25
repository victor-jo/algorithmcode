class Solution {
    public int findMin(int[] nums) {
        int point = nums[0];
        for (int i=1; i<nums.length; ++i) {
            if (point > nums[i]) {
                return nums[i];
            }
        }
        return point;
    }
}