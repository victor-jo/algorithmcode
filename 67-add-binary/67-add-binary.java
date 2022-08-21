class Solution {
    public String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            return addBinary(a.toCharArray(), b.toCharArray());
        }
        else {
            return addBinary(b.toCharArray(), a.toCharArray());
        }
    }
    
    public String addBinary(char[] chars1, char[] chars2) {
        int[] stack = new int[10001];
        int top = -1;
        
        for (char ch : chars2) {
            stack[++top] = ch - '0';
        }
        
        String result = "";
        int carry = 0;
        for (int i=chars1.length-1; i>=0; --i) {
            int v1 = chars1[i] - '0';
            int v2 = top == -1 ? 0 : stack[top--];
            
            int total = v1 + v2 + carry;
            result = (total % 2) + result;
            carry = total / 2;
        }
        
        return carry == 1 ? 1 + result : result;
    }
}