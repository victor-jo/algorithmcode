// Last updated: 2026. 7. 16. 오전 11:28:39
class Solution {
    public int searchInsert(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = ((begin + end) / 2);
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return begin;
    }
}