// Last updated: 2026. 7. 16. 오전 11:27:15
class MyStack {
    arr;
    t = -1;

    constructor() {
        this.t = -1;
        this.arr = [];
    }

    push(x: number): void {
        ++this.t;
        this.arr.push(x);
    }

    pop(): number {
        this.t = Math.max(-1, this.t - 1);
        return this.arr.pop() ?? null;
    }

    top(): number {
        return this.arr.at(this.t);
    }

    empty(): boolean {
        return this.t === -1;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = new MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */