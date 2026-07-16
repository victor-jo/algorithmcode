// Last updated: 2026. 7. 16. 오전 11:28:49
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int minClosest = INT_MAX;
        int result = 0;

        sort(nums.begin(), nums.end());

        for (size_t k = 0; k < nums.size() - 2; ++k) {
            int l = k + 1;
            int r = nums.size() - 1;

            while (l < r) {
                int sum = nums[k] + nums[l] + nums[r];
                int bet = abs(sum - target);

                if (minClosest > bet) {
                    minClosest = bet;
                    result = sum;
                }

                if (sum < target) {
                    ++l;
                } else if (sum > target) {
                    --r;
                } else {
                    return target;
                }
            }
        }
        return result;
    }
};