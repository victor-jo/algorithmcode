// Last updated: 2026. 7. 16. 오전 11:28:33
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum = 0;
        int sumMax = INT_MIN;
        for (int num : nums) {
            sum += num;
            sumMax = max(sumMax, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return sumMax;
    }
};