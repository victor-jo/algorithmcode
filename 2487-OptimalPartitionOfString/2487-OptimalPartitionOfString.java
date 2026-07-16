// Last updated: 2026. 7. 16. 오전 11:25:12
class Solution {
    public int partitionString(String s) {
        int result = 1;
        int charMask = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int charIndex = s.charAt(i) - 'a';
            if ((charMask & (1 << charIndex)) != 0) {
                result++;
                charMask = 1 << charIndex;
            } else {
                charMask |= (1 << charIndex);
            }
        }
        
        return result;
    }
}