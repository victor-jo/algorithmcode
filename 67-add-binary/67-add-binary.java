class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        
        int carry = 0;
        
        while (len1 >= 0 || len2 >= 0) {
            int v1 = len1 >= 0 ? a.charAt(len1--) - '0' : 0;
            int v2 = len2 >= 0 ? b.charAt(len2--) - '0' : 0;
            
            int total = v1 + v2 + carry;
            sb.append(total % 2);
            carry = total / 2;
        }
        
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}