class Solution {
    
    public boolean isHappy(int n) {
        int slow = getHappyNumber(n);
        int fast = getHappyNumber(getHappyNumber(n));
        
        while (slow != fast) {
            slow = getHappyNumber(slow);
            fast = getHappyNumber(getHappyNumber(fast));
        }
        
        return slow == 1;
    }
    
    public int getHappyNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int num = (n%10);
            sum += num * num;
            n /= 10;
        }
        return sum;
    }
}