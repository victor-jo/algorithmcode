class Solution {
    public String longestPalindrome(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        int right = 0;
        int left = 0;
        
        for (int r = 0; r < s.length(); r++) {
            for (int l = 0; l < r; l++) {
                dp[l][r] = (s.charAt(l) == s.charAt(r)) &&
                    ((r - l) <= 2 || dp[l+1][r-1]);
                if (dp[l][r] && r-l > right-left) {
                    right = r;
                    left = l;
                }
            }
        }
        
        return s.substring(left, right + 1);
    }
}