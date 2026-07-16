// Last updated: 2026. 7. 16. 오전 11:26:58
class Solution {
public:
    int getSum(int a, int b) {
        if (b != 0) {
            return getSum(a ^ b, (a & b) << 1);
        }
        return a;
    }
};