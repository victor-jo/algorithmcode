// Last updated: 2026. 7. 16. 오전 11:27:03
class Solution {
    public int findDuplicate(int[] nums) {
        int[] n = new int[nums.length];
        for (int num : nums) {
            n[num] ^= num;
            if (n[num] == 0) {
                return num;
            }
        }
        return 100001;
    }
}