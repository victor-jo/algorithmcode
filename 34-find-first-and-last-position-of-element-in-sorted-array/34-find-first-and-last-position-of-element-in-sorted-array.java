class Solution {
    
    int result = 0;
    
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }
    
    public int findFirst(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int idx = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
    
    public int findLast(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        int idx = -1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] <= target) {
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
            if (nums[mid] == target) {
                idx = mid;
            }
        }
        return idx;
    }
}