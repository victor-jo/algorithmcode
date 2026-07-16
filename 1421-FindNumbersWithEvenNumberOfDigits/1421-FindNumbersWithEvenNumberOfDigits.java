// Last updated: 2026. 7. 16. 오전 11:25:46
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; ++i) {
            if (countOfDigit(nums[i]) % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
    
    private int countOfDigit(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count += 1;
        }
        return count;
    }
}