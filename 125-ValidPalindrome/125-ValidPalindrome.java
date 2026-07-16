// Last updated: 2026. 7. 16. 오전 11:27:49
class Solution {
    public boolean isPalindrome(String s) {
        String origin = excludeNonAlphabetAndNumeric(s).toLowerCase();
        String left = origin.substring(0, origin.length() / 2);
        String right = origin.substring((origin.length() + 1) / 2);
        return isPalindrome(left, right);
    }

    public boolean isPalindrome(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(right.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public String excludeNonAlphabetAndNumeric(String s) {
        return s.replaceAll("[^a-zA-Z0-9]", "");
    }
}