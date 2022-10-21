function targetIndices(nums: number[], target: number): number[] {
    nums.sort((a, b) => a - b);
    const s: number = findLeftIndex(nums, target);
    const e: number = findRightIndex(nums, target);
    if (s == -1 || e == -1) {
        return [];
    }
    let result:number[] = [];
    for (let i=s; i<=e; ++i) {
        result.push(i);
    }
    return result;
};

function findLeftIndex(nums: number[], target: number): number {
    let begin: number = 0;
    let end: number = nums.length - 1;
    let res: number = -1;

    while (begin <= end) {
        let mid: number = Math.floor((begin + end) / 2);

        if (nums[mid] >= target) {
            if (nums[mid] == target) res = mid;
            end = mid - 1;
        }
        else {
            begin = mid + 1;
        }
    }

    return res;
};

function findRightIndex(nums: number[], target: number): number {
    let begin: number = 0;
    let end: number = nums.length - 1;
    let res: number = -1;

    while (begin <= end) {
        let mid: number = Math.floor((begin + end) / 2);

        if (nums[mid] <= target) {
            if (nums[mid] == target) res = mid;
            begin = mid + 1;
        }
        else {
            end = mid - 1;
        }
    }

    return res;
};