// Last updated: 2026. 7. 16. 오전 11:25:44
function findMinFibonacciNumbers(k: number): number {
    const limit = 1000000000;
    const fibo = [1, 1];

    while (fibo[0] <= limit) {
        fibo.unshift(fibo[0] + fibo[1]);
    }
    
    let count = 0;
    for (const num of fibo) {
        while (k >= num) {
            k -= num;
            count += 1;
        }
    }
    
    return count;
};