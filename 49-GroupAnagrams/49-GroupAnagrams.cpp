// Last updated: 2026. 7. 16. 오전 11:28:30
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<array<int, 26>, vector<string>> m;
        for (string str : strs) {
            array<int, 26> key = {};
            for (char ch : str) {
                ++key[ch - 'a'];
            }
            m[key].push_back(str);
        }
        vector<vector<string>> result;
        for (auto tuple : m) {
            result.push_back(tuple.second);
        }
        return result;
    }
};