// Last updated: 2026. 7. 16. 오전 11:25:28
class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append((ch - 'a') + 1);
        }
        String str = sb.toString();
        while (k-- > 0) {
            str = transform(str);
        }
        return Integer.parseInt(str);
    }
    
    public String transform(String str) {
        int sum = 0;
        for (char ch : str.toCharArray()) {
            sum += (ch - '0');
        }
        return String.valueOf(sum);
    }
}