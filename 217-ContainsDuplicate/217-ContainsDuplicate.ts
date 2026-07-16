// Last updated: 2026. 7. 16. 오전 11:27:17
function containsDuplicate(nums: number[]): boolean {
    for (let value=nums.shift(); value !== undefined; value=nums.shift()) {
        if (nums.includes(value)) {
            return true;
        }
    }
    return false;
};