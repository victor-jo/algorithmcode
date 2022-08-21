class Solution {
    public int mySqrt(int x) {
        long begin = 0;
        long end = Integer.MAX_VALUE;
        int result = 0;
        
        while (begin <= end) {
            long mid = (begin + end) / 2;
            if (mid*mid <= x) {
                result = (int) mid;
                begin = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}