// Last updated: 2026. 7. 16. 오전 11:28:43
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        int p = 0;
        
        for (int i=0; i<k-1; ++i) {
            if (nums[i] != nums[i+1]) {
                if (p == 0) {
                    nums[p++] = nums[i];   
                }
                nums[p++] = nums[i+1];
            }
        }
        
        return p == 0 ? 1 : p;
    }
}