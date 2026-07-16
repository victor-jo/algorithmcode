// Last updated: 2026. 7. 16. 오전 11:27:06
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (n * (n+1) / 2) - sum;
    }
}