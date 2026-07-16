// Last updated: 2026. 7. 16. 오전 11:28:42
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for (int i=0; i<k; ++i) {
            while (nums[i] == val && i < k) {
                k -= 1;
                for (int j=i; j<k; ++j) {
                    nums[j] = nums[j+1];
                }
            }
        }
        return k;
    }
}