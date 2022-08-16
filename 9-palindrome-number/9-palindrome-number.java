class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int[] stack = new int[32];
        int top = -1;
        
        int length = getLength(x);
        int mid = length / 2;
        
        if (length == 1) {
            return true;
        }
        
        if ((length % 2) == 0) { // even
            for (int i=0; i<length; ++i) {
                if (mid <= i) {
                    if (stack[top--] != (x % 10)) {
                        return false;
                    }
                }
                else {
                    stack[++top] = (x % 10);
                }
                x /= 10;
            }
        }
        else { // odd
            for (int i=0; i<length; ++i) {
                System.out.println("enter i = " + i);
                if (mid == i) {
                    // ignore
                }
                else if (mid < i) {
                    if (stack[top--] != (x % 10)) {
                        return false;
                    }
                }
                else {
                    stack[++top] = (x % 10);
                }
                x /= 10;
            }
        }
        
        return true;
    }
    
    public int getLength(int number) {
        int length = 1;
        if (number >= 100000000) {
            length += 8;
            number /= 100000000;
        }
        if (number >= 10000) {
            length += 4;
            number /= 10000;
        }
        if (number >= 100) {
            length += 2;
            number /= 100;
        }
        if (number >= 10) {
            length += 1;
        }
        return length;
    }
}