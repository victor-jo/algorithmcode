class Solution {
    public int removeElement(int[] nums, int val) {
        int begin = 0;
        int end = 0;
        while (end < nums.length) {
            if (nums[end] != val) {
                nums[begin++] = nums[end];
            }
            end += 1;
        }
        return begin;
    }
}