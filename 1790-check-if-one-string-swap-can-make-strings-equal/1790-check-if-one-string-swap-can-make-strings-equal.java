class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() == 2) {
            return s1.equals(s2);
        }
        
        int[] p1 = new int[26];
        int[] p2 = new int[26];
        int diff = 0;
        
        for (int i=0; i<s1.length(); ++i) {
            int c1 = s1.charAt(i) - 'a';
            int c2 = s2.charAt(i) - 'a';
            if (c1 != c2) {
                ++diff;
            }
            ++p1[c1];
            ++p2[c2];
        }
        
        for (int i=0; i<26; ++i) {
            if (p1[i] != p2[i]) {
                return false;
            }
        }
        
        return diff <= 2;
    }
}