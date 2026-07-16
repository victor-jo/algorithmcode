// Last updated: 2026. 7. 16. 오전 11:28:51
class Solution {
public:
    class Node {
    public:
        Node* next[26];
        int count = 0;
    };
    
    Node* root = new Node();
    int maxCount = 0;
    int maxLength = 0;
    string result = "";
    
    void insert(string str) {
        Node* node = root;
        for (int i=0; i<str.size(); ++i) {
            char ch = str.at(i);
            if (!node->next[ch - 'a']) {
                node->next[ch - 'a'] = new Node();
            }
            node = node->next[ch - 'a'];

            int afterMaxCount = ++node->count;
            if (maxCount < afterMaxCount) {
                result = str.substr(0, i + 1);
                maxCount = afterMaxCount;
                maxLength = i;
            }
            if (maxCount == afterMaxCount && maxLength < i) {
                result = str.substr(0, i + 1);
                maxLength = i;
            }
        }
    }
    
    
    string longestCommonPrefix(vector<string>& strs) {
        for (string str : strs) {
            insert(str);
        }
        if (maxCount != strs.size()) {
            return "";
        }
        return result;
    }
};