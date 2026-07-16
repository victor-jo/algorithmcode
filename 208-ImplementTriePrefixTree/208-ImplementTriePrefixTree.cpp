// Last updated: 2026. 7. 16. 오전 11:27:22
class Trie {
public:
    class Node {
        public:
            bool isWord;
            Node* next[26];
    };
    
    Node *rootNode;
    
    Trie() {
        rootNode = new Node();
    }
    
    void insert(string word) {
        Node *node = rootNode;
        for (char ch : word) {
            if (!node->next[ch - 'a']) {
                node->next[ch - 'a'] = new Node();
            }
            node = node->next[ch - 'a'];
        }
        node->isWord = true;
    }
    
    bool search(string word) {
        Node *node = rootNode;
        for (char ch : word) {
            if (!node->next[ch - 'a']) {
                return false;
            }
            node = node->next[ch - 'a'];
        }
        return node->isWord;
    }
    
    bool startsWith(string prefix) {
        Node *node = rootNode;
        for (char ch : prefix) {
            if (!node->next[ch - 'a']) {
                return false;
            }
            node = node->next[ch - 'a'];
        }
        return true;
    }
};

/**
 * Your Trie object will be instantiated and called as such:
 * Trie* obj = new Trie();
 * obj->insert(word);
 * bool param_2 = obj->search(word);
 * bool param_3 = obj->startsWith(prefix);
 */