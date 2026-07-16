// Last updated: 2026. 7. 16. 오전 11:27:47
import java.util.*;

class MinStack {
    PriorityQueue<Integer> queue;
    Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        queue = new PriorityQueue<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        queue.add(x);
    }

    public void pop() {
        queue.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */