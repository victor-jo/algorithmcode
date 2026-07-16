// Last updated: 2026. 7. 16. 오전 11:27:20
class WordDictionary {
public:
    class Node {
    public:
        bool isWord;
        map<char, Node*> next;
    };
    
    Node* root;
    
    WordDictionary() {    
        root = new Node();
    }
    
    void addWord(string word) {
        Node* node = root;
        for (char ch : word) {
            if (node->next.find(ch) == node->next.end()) {
                node->next.insert(make_pair(ch, new Node()));
            }
            node = node->next[ch];
        }
        node->isWord = true;
    }
    
    bool search(string word) {
        Node* node = root;
        return search(node, word);
    }
    
    bool search(Node* node, string word) {
        for (int i=0; i<word.length(); ++i) {
            if (word[i] == '.') {
                for (auto& [key, value] : node->next) {
                    if (search(value, word.substr(i + 1))) {
                        return true;
                    }
                }
                return false;
            }
            if (node->next.find(word[i]) == node->next.end()) {
                return false;
            }
            node = node->next[word[i]];
        }
        return node->isWord;
    }
};

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary* obj = new WordDictionary();
 * obj->addWord(word);
 * bool param_2 = obj->search(word);
 */