// Last updated: 2026. 7. 16. 오전 11:25:36
import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) {
            return 0;
        }

        int result = 2000000001;

        Arrays.sort(nums);
        
        for (int i=0; i<4; ++i) {
            result = Math.min(result, nums[nums.length - (4-i)] - nums[i]);
        }

        return result;
    }
}