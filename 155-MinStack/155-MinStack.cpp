// Last updated: 2026. 7. 16. 오전 11:27:42
class MinStack {
public:
    stack<int> s;
    stack<int> minStack;
        
    MinStack() {
        s = stack<int>();
        minStack = stack<int>();
    }
    
    void push(int val) {
        if (minStack.size()) {
            minStack.push(min(minStack.top(), val));
        }
        else {
            minStack.push(val);
        }
        s.push(val);
    }
    
    void pop() {
        s.pop();
        minStack.pop();
    }
    
    int top() {
        return s.top();
    }
    
    int getMin() {
        return minStack.top();
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */