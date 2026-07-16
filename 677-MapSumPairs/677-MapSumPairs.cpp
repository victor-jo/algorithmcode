// Last updated: 2026. 7. 16. 오전 11:26:34
class MapSum {
public:
    class Node {
        public:
            int count;
            map<char, Node*> next;
    };
    
    Node* rootNode;
    
    MapSum() {
        rootNode = new Node();
        rootNode->next = {};
    }
    
    void insert(string key, int val) {
        Node* node = rootNode;
        for (char ch : key) {
            if (node->next.find(ch) == node->next.end()) {
                node->next.insert(make_pair(ch, new Node()));
            }
            node = node->next[ch];
        }
        node->count = val;
    }
    
    int sum(string prefix) {
        Node* node = rootNode;
        for (char ch : prefix) {
            if (node->next.find(ch) == node->next.end()) {
                return 0;
            }
            node = node->next[ch];
        }
        int sumCount = node->count;
        map<char, Node*>::iterator it;
        for (it=node->next.begin(); it!=node->next.end(); ++it) {
            sumCount += childrenSum(it->second, it->second->count);
        }
        return sumCount;
    }
    
    int childrenSum(Node *node, int sum) {
        map<char, Node*>::iterator it;
        for (it=node->next.begin(); it!=node->next.end(); ++it) {
            sum += childrenSum(it->second, it->second->count);
        }
        return sum;
    }
};

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum* obj = new MapSum();
 * obj->insert(key,val);
 * int param_2 = obj->sum(prefix);
 */