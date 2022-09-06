class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int result = 0;
        
        while (i < j) {
            int l = height[i];
            int r = height[j];
            
            result = Math.max(result, Math.min(l, r) * (j - i));
            
            if (l < r) {
                ++i;
            }
            else {
                --j;
            }
        }
        
        return result;
    }
}