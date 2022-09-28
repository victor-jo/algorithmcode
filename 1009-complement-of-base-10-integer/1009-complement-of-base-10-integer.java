class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 0;
        int count = 1;
        while (n != 0) {
            if ((n & 1) == 0) {
                result += count;
            }
            n >>= 1;
            count *= 2;
        }
        return result;
    }
}