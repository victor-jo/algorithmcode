function subsets(nums: number[]): number[][] {
    const result: number[][] = [];
    const subset: number[] = [];
    const index: number = 0;
    subsetsHelper(nums, result, subset, index);
    return result;
};

function subsetsHelper(nums: number[], result: number[][], subset: number[], index: number): void {
    const len: number = nums.length;
    result.push([...subset]);
    for (let i=index; i<len; ++i) {
        subset.push(nums[i]);
        subsetsHelper(nums, result, subset, i + 1);
        subset.pop();
    }
}