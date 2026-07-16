// Last updated: 2026. 7. 16. 오전 11:25:32
class Solution {
    public int numSplits(String s) {
        int[] prefix = new int[26];
        int right = 0;

        int[] suffix = new int[26];
        int left = 0;

        for (char ch : s.toCharArray()) {
            if (prefix[ch - 'a'] == 0) {
                right += 1;
            }
            prefix[ch - 'a'] += 1;
        }

        int count = 0;

        for (char ch : s.toCharArray()) {
            if (suffix[ch - 'a'] == 0) {
                left += 1;
            }
            
            prefix[ch - 'a'] -= 1;
            suffix[ch - 'a'] += 1;

            if (prefix[ch - 'a'] == 0) {
                right -= 1;
            }
            
            if (left == right) {
                count += 1;
            }
        }

        return count;
    }
}