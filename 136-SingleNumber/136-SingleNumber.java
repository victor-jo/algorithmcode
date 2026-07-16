// Last updated: 2026. 7. 16. 오전 11:27:54
class Solution {
    public int singleNumber(int[] nums) {
		for (int i = 1; i < nums.length; ++i) {
			nums[0] ^= nums[i];
		}
		return nums[0];
	}
}