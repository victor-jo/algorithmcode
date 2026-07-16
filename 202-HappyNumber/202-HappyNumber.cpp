// Last updated: 2026. 7. 16. 오전 11:27:31
class Solution {
public:
    int next(int n) {
        int sum = 0;
        int m = n;
        while (m) {
            sum += (m%10) * (m%10);
            m /= 10;
        }
        return sum;
    }
    
    bool isHappy(int n) {
        int tortoise = n;
        int hare = next(n);
        while (tortoise != hare && hare != 1) {
            tortoise = next(tortoise);
            hare = next(next(hare));
        }
        return hare == 1;
    }
};