function fib(n: number): number {
    let one: number = 0;
    let two: number = 1;
    if (n == 0) {
        return one;
    }
    n -= 1;
    while (n-- > 0) {
        let temp: number = one + two;
        one = two;
        two = temp;
    }
    return two;
};