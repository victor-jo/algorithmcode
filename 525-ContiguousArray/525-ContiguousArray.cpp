// Last updated: 2026. 7. 16. 오전 11:26:44
class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        map<int, int> m = {{0, 0}};
        int zeroOneFlag = 0;
        int maxLength = 0;
        for (int i=0; i<nums.size(); ++i) {
            zeroOneFlag += nums[i] ? 1 : -1;
            if (m.find(zeroOneFlag) != m.end()) {
                maxLength = max(maxLength, (i+1) - m[zeroOneFlag]);
            }
            else {
                m[zeroOneFlag] = i+1;
            }
        }
        return maxLength;
    }
};