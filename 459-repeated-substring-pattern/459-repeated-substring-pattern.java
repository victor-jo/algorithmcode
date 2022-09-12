class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i=1; i<=n/2; ++i) {
            String substring = s.substring(0, i);
            StringBuilder sb = new StringBuilder();
            int j = i;
            while (j <= n) {
                sb.append(substring);
                j += i;
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}