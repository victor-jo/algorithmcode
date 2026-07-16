// Last updated: 2026. 7. 16. 오전 11:26:51
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length();
        int np = p.length();
        
        if (ns < np) {
            return new ArrayList<>();
        }
        
        int[] countp = new int[26];
        for (char ch : p.toCharArray()) {
            countp[ch - 'a'] += 1;
        }
        
        List<Integer> result = new ArrayList<>();
        
        int[] counts = new int[26];
        for (int i=0; i<ns; ++i) {
            counts[s.charAt(i) - 'a'] += 1;
            
            if (i >= np) {
                counts[s.charAt(i - np) - 'a'] -= 1;
            }
            
            if (Arrays.equals(counts, countp)) {
                result.add(i - np + 1);
            }
        }
        
        return result;
    }
}