// Last updated: 2026. 7. 16. 오전 11:28:47
class Solution {
    public boolean isValid(String s) {
        int[] stack = new int[10001];
        int top = -1;
        
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (top == -1) return false;
                else if (stack[top--] != '(') return false;
            }
            else if (ch == ']') {
                if (top == -1) return false;
                else if (stack[top--] != '[') return false;
            }
            else if (ch == '}') {
                if (top == -1) return false;
                else if (stack[top--] != '{') return false;
            }
            else {
                stack[++top] = ch;    
            }
        }
        
        return top == -1;
    }
}