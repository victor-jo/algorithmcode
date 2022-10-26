function numSubseq(nums: number[], target: number): number {
    const MODULO = 1000000007;

    nums.sort((a, b) => a - b);
    
    const pow2: number[] = [];
    pow2[0] = 1;
    for (let i=1; i<100000; ++i) {
        pow2[i] = (pow2[i-1] * 2) % MODULO;
    }

    let i: number = 0;
    let j: number = nums.length - 1;
    let res: number = 0;

    while (i <= j) {
        if (nums[i]+nums[j] <= target) {
            res = (res + pow2[j-i]) % MODULO;
            ++i;
        }
        else {
            --j;
        }
    }

    return res;
};