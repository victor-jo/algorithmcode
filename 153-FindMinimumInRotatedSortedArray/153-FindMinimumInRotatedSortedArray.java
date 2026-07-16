// Last updated: 2026. 7. 16. 오전 11:27:41
class Solution {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length);
    }

    public int findMin(int[] nums, int low, int high) {
        if (low > high) {
            return Integer.MAX_VALUE;
        }

        int mid = (low + high + 1) / 2;

        int left = (mid == 0) ? Integer.MAX_VALUE : nums[mid - 1];
        int right = (mid == nums.length) ? Integer.MAX_VALUE : nums[mid];

        if (left > right) {
            return right;
        }

        return Math.min(findMin(nums, low, mid - 1), findMin(nums, mid + 1, high));
    }
}