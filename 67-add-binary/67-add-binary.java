class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        
        int len1 = a.length() - 1;
        int len2 = b.length() - 1;
        
        int carry = 0;
        int total = 0;
        
        while (len1 >= 0 || len2 >= 0) {
            total = carry;
            total += len1 >= 0 ? a.charAt(len1--) - '0' : 0;
            total += len2 >= 0 ? b.charAt(len2--) - '0' : 0;
            
            if (total == 3) {
                total = 1;
                carry = 1;
            }
            else if (total == 2) {
                total = 0;
                carry = 1;
            }
            else {
                carry = 0;
            }
            
            sb.append(total);
        }
        
        if (carry == 1) {
            sb.append(1);
        }
        
        return sb.reverse().toString();
    }
}