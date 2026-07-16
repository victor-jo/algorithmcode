// Last updated: 2026. 7. 16. 오전 11:26:54
class Solution {
public:
    class Trie {
    public:
        class Node {
        public:
            Node* next[2];
        };
        
        Node* root;
        
        Trie() {
            root = new Node();
        }
        
        void insert(int num) {
            Node* node = root;
            for (int i=31; i>=0; --i) {
                bool bit = (bool) ((1 << i) & num);
                if (!node->next[bit]) {
                    node->next[bit] = new Node();
                }
                node = node->next[bit];
            }
        }
        
        int findMaximumXOR(int num) {
            int maximumXOR = 0;
            Node* node = root;
            for (int i=31; i>=0; --i) {
                bool bit = (bool) ((1 << i) & num);
                if (node->next[!bit]) {
                    maximumXOR += 1 << i;
                    node = node->next[!bit];
                }
                else {
                    node = node->next[bit];
                }
            }
            return maximumXOR;
        }
    };
    
    
    int findMaximumXOR(vector<int>& nums) {
        Trie* trie = new Trie();
        for (int num : nums) {
            trie->insert(num);
        }
        int maximumXOR = INT_MIN;
        for (int num : nums) {
            maximumXOR = max(maximumXOR, trie->findMaximumXOR(num));
        }
        return maximumXOR;
    }
};