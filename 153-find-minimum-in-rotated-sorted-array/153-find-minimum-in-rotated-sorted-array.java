class Solution {
    public int findMin(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        
        if (nums[end] > nums[0]) {
            return nums[0];
        }
        
        while (begin < end) {
            int mid = (begin + end) / 2;
            
            if (nums[mid] > nums[mid+1]) {
                return nums[mid+1];
            }
            
            if (nums[mid-1] > nums[mid]) {
                return nums[mid];
            }
            
            if (nums[mid] < nums[0]) {
                end = mid - 1;
            }
            else {
                begin = mid + 1;
            }
        }
        
        return nums[begin];
    }
}