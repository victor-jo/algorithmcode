class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] countp = new int[26];
        for (char ch : p.toCharArray()) {
            countp[ch - 'a'] += 1;
        }
        
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int length = p.length();
        
        int[] counts = new int[26];
        while (j < s.length()) {
            counts[s.charAt(j) - 'a'] += 1;
            if (isAnagram(counts, countp)) {
                while (i < s.length() && isAnagram(counts, countp)) {
                    counts[s.charAt(i++) - 'a'] -= 1;
                }
                if (((j - i) + 2) == length) {
                    result.add(i-1);    
                }
            }
            ++j;
        }
        
        return result;
    }
    
    public boolean isAnagram(int[] counts, int[] countp) {
        int count = 0;
        for (int i=0; i<26; ++i) {
            if (counts[i] >= countp[i]) {
                ++count;
            }
        }
        return count == 26;
    }
}