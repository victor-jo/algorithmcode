// Last updated: 2026. 7. 16. 오전 11:26:37
class Solution {
public:
    class Trie {
        public:
            class Node {
                public:
                    bool isWord;
                    Node* next[26];
                    string value;
            };
        
            Node* root;
        
            Trie() {
                root = new Node();
            }
        
            void insert(string word) {
                Node* node = root;
                for (char ch : word) {
                    if (!node->next[ch - 'a']) {
                        node->next[ch - 'a'] = new Node();
                    }
                    node = node->next[ch - 'a'];
                }
                node->isWord = true;
                node->value = word;
            }
        
            string find(string word) {
                Node* node = root;
                for (char ch : word) {
                    if (!node->next[ch - 'a'] || node->isWord) {
                        break;
                    }
                    node = node->next[ch - 'a'];
                }
                return node->isWord ? node->value : word;
            }
    };
    
    vector<string> split(string sentence) {
        vector<string> result;
        string str = "";
        for (char ch : sentence) {
            if (ch == ' ') {
                result.push_back(str);
                str = "";
            }
            else {
                str += ch;
            }
        }
        result.push_back(str);
        return result;
    }
    
    string replaceWords(vector<string>& dictionary, string sentence) {
        Trie* trie = new Trie();        
        for (string word : dictionary) {
            trie->insert(word);
        }
        vector<string> words = split(sentence);
        string result = "";
        for (string word : words) {
            result += trie->find(word) + " ";
        }
        result.pop_back();
        return result;
    }
};