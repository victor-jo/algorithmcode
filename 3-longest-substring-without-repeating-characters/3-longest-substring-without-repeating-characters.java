class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[256];
        int n = s.length();
        int result = 0;
        
        for (int i=0, j=0; j<n; ++j) {
            if (seen[s.charAt(j)] > 0) {
                i = Math.max(i, seen[s.charAt(j)]);
            }
            result = Math.max(result, j - i + 1);
            seen[s.charAt(j)] = j + 1;
        }
        
        return result;
    }
}