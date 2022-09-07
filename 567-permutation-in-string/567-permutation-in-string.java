class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        
        if (n1 > n2) {
            return false;
        }
        
        int[] count1 = new int[26];
        for (char ch : s1.toCharArray()) {
            count1[ch - 'a'] += 1;
        }
        
        int[] count2 = new int[26];
        for (int i=0; i<n2; ++i) {
            count2[s2.charAt(i) - 'a'] += 1;
            if (i >= n1) {
                count2[s2.charAt(i - n1) - 'a'] -= 1;
            }
            
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }
        
        return false;
    }
}