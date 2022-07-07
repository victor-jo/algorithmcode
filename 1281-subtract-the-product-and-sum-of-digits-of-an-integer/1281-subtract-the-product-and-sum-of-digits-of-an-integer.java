class Solution {
    public int subtractProductAndSum(int n) {
        int sub = 1;
        int sum = 0;
        while (n > 0) {
            sub *= (n%10);
            sum += (n%10);
            n /= 10;
        }
        return sub - sum;
    }
}