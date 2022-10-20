/**
 Do not return anything, modify nums in-place instead.
 */
function rotate(nums: number[], k: number): void {
  let n: number = nums.length;
  k %= n;
  reverse(nums, n-k, n-1);
  reverse(nums, 0, n-k-1);
  reverse(nums, 0, n-1);
};

function reverse(nums: number[], s: number, e: number): void {
  while (s < e) {
    let temp: number = nums[s];
    nums[s] = nums[e];
    nums[e] = temp;
    ++s;
    --e;
  }
};