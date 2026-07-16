// Last updated: 2026. 7. 16. 오전 11:27:11
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int length = nums.size();
        // left
        vector<int> left = vector<int>(length, 1);
        for (int i=1; i<length; ++i) {
            left[i] = left[i-1] * nums[i-1];
        }
        // right
        vector<int> right = vector<int>(length, 1);
        for (int i=length-1; i; --i) {
            right[i-1] = right[i] * nums[i];
        }
        // result
        vector<int> result;
        for (int i=0; i<length; ++i) {
            result.push_back(left[i] * right[i]);
        }
        return result;
    }
};