class Solution {
    public int removeDuplicates(int[] nums) {
        int begin = 0;
        int end = 0;
        nums[begin++] = nums[0];
        while (end < nums.length) {
            if (nums[begin-1] < nums[end]) {
                nums[begin++] = nums[end];
            }
            ++end;
        }
        return begin;
    }
}