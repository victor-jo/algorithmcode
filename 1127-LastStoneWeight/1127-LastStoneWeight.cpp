// Last updated: 2026. 7. 16. 오전 11:25:52
class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        stones.push_back(0);
        while (true) {
            sort(stones.begin(), stones.end());
            if (stones[stones.size()-2] == 0) {
                break;
            }
            stones.back() -= stones[stones.size()-2];
            stones[stones.size()-2] = 0;
        }
        return stones.back();
    }
};