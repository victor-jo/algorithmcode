class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        for (int i=0; i<31; ++i) {
            int element = (1 << i);
            if ((n & (1 << i)) == element) {
                ++count;
            }
        }
        return n < 0 ? false : count == 1;
    }
}