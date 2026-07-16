// Last updated: 2026. 7. 16. 오전 11:29:07
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // 해시 테이블을 사용하여 숫자와 그 인덱스를 저장합니다.
        unordered_map<int, int> num_dict;
        
        // 배열을 순회하며 각 요소에 대해 타겟에서 현재 요소를 뺀 값이 해시 테이블에 있는지 확인합니다.
        for (int i = 0; i < nums.size(); ++i) {
            int complement = target - nums[i];
            if (num_dict.find(complement) != num_dict.end()) {
                // 만약 있다면, 해당 인덱스와 현재 인덱스를 반환합니다.
                return {num_dict[complement], i};
            }
            // 없다면, 현재 숫자와 인덱스를 해시 테이블에 추가합니다.
            num_dict[nums[i]] = i;
        }
        
        // 항상 하나의 솔루션이 있다고 가정했으므로, 이 부분은 실행되지 않습니다.
        return {};
    }
};