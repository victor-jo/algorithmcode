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