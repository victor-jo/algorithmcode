class Solution {
    public boolean validPalindrome(String s) {
        boolean usedChance = false;
        return validPalindrome(s, usedChance);
    }
    
    public boolean validPalindrome(String s, boolean usedChance) {
        int l = 0;
        int r = s.length() - 1;
        
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                if (usedChance) {
                    return false;
                }
                System.out.println("(s.substring(l, r) = " + s.substring(l, r));
                System.out.println("(s.substring(l+1, r) = " + s.substring(l+1, r));
                return validPalindrome(s.substring(l, r), true)
                    || validPalindrome(s.substring(l+1, r+1), true);
            }
            else {
                ++l;
                --r;    
            }
        }
        
        return true;
    }
}