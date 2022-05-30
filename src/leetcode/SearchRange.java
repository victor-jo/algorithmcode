package leetcode;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int begin = findRangeStart(nums, target);
        int end = findRangeEnd(nums, target);
        if (begin > end) {
            return new int[] {-1, -1};
        }
        return new int[] {begin, end};
    }

    private int findRangeEnd(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = (begin + end) >> 1;
            if (nums[mid] <= target) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return end;
    }

    private int findRangeStart(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;

        while (begin <= end) {
            int mid = (begin + end) >> 1;
            if (nums[mid] < target) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return begin;
    }
}
