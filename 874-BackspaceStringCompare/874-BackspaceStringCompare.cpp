// Last updated: 2026. 7. 16. 오전 11:26:24
class Solution {
public:
    string getString(string s) {
        string t;
        for (char ch : s) {
            if (ch == '#') {
                if (t.size() > 0) {
                    t.pop_back();
                }
            }
            else {
                t += ch;
            }
        }
        return t;
    }
    
    bool backspaceCompare(string s, string t) {
        return getString(s) == getString(t);
    }
};