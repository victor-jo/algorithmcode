class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int l = 0;
        int k = 0;
        int have = 0;
        int need = 0;
        int minLength = Integer.MAX_VALUE;
        
        int[] count = new int[128];
        int[] window = new int[128];
        
        if (s.length() < t.length()) {
            return "";
        }
        
        HashSet<Character> hashSet = new HashSet<>();
        for (char ch : t.toCharArray()) {
            count[ch] += 1;
            hashSet.add(ch);
        }
        
        need = hashSet.size();
        
        for (int i=0, j=0; j<n; ++j) {
            window[s.charAt(j)] += 1;
            if (count[s.charAt(j)] > 0 && window[s.charAt(j)] == count[s.charAt(j)]) {
                have += 1;
            }
            while (have == need) {
                if (minLength > (j - i + 1)) {
                    minLength = (j - i + 1);
                    l = i;
                    k = j;
                }
                window[s.charAt(i)] -= 1;
                if (count[s.charAt(i)] > 0 && window[s.charAt(i)] < count[s.charAt(i)]) {
                    have -= 1;
                }
                ++i;
            }
        }
        
        return minLength != Integer.MAX_VALUE ? s.substring(l, k + 1) : "";
    }
}