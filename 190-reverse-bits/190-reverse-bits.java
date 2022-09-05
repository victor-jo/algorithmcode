public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i=0, j=31; i<=31 && j>=0; ++i, --j) {
            int bit = n & (1 << i);
            if (bit != 0) {
                result |= 1 << j;    
            }
        }
        return result;
    }
}