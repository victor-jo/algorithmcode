class Solution {
    public List<String> letterCasePermutation(String s) {
        Set<String> results = new HashSet<>();
        int len = s.length();
        results.add(s);
        if (len == 1) {
            char c = s.charAt(0);
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            results.add(String.valueOf(c));
        }
        else {
            for (int i=1; i<(1 << len); ++i) {
                StringBuilder sb = new StringBuilder();
                for (int j=0; j<len; ++j) {
                    char c = s.charAt(j);
                    int element = (1 << j);
                    if ((i & element) == element) {
                        if (Character.isUpperCase(c)) {
                            c = Character.toLowerCase(c);
                        }
                        else if (Character.isLowerCase(c)) {
                            c = Character.toUpperCase(c);
                        }
                    }
                    sb.append(c);
                }
                results.add(sb.toString());
            }
        }
        return new ArrayList<>(results);
    }
}