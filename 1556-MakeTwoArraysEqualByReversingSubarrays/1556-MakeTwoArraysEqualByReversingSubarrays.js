// Last updated: 2026. 7. 16. 오전 11:25:43
/**
 * @param {number[]} target
 * @param {number[]} arr
 * @return {boolean}
 */
var canBeEqual = function(target, arr) {
    target.sort((a, b) => a - b);
    arr.sort((a, b) => a - b);
    for (const index in target) {
        if (target[index] !== arr[index]) {
            return false;
        }
    }
    return true;
};