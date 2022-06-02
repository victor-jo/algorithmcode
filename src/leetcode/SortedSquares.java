package leetcode;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length-1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                sorted[i] = (int) Math.pow(nums[left++], 2);
            }
            else {
                sorted[i] = (int) Math.pow(nums[right--], 2);
            }
        }

        return sorted;
    }
}
