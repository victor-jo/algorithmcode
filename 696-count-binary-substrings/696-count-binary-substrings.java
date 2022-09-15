class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int prev = 0;
        int cur = 1;
        for (int i=1; i<s.length(); ++i) {
            if (s.charAt(i-1) != s.charAt(i)) {
                result += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }
            else {
                cur += 1;
            }
        }
        return result + Math.min(prev, cur);
    }
}