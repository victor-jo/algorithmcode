// Last updated: 2026. 7. 16. 오전 11:28:24
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i=s.length()-1; i>=0; --i) {
            if (s.charAt(i) != ' ') {
                ++count;
            }
            else if (count > 0) {
                break;
            }
        }
        return count;
    }
}