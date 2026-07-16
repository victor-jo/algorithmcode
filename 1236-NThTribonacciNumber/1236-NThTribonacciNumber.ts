// Last updated: 2026. 7. 16. 오전 11:25:51
function tribonacci(n: number): number {
    let one: number = 0;
    let two: number = 1;
    let three: number = 1;
    if (n == 0) {
        return one;
    }
    if (n == 1) {
        return two;
    }
    n -= 2;
    while (n-- > 0) {
        let temp: number = one + two + three;
        one = two;
        two = three;
        three = temp;
    }
    return three;
};