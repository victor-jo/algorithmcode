// Last updated: 2026. 7. 16. 오전 11:26:05
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