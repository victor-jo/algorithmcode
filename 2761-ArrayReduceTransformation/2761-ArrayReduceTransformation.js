// Last updated: 2026. 7. 16. 오전 11:25:02
/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    return nums.reduce((acc, curr) => fn(acc, curr), init);
};