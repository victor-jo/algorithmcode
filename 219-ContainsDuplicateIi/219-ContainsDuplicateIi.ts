// Last updated: 2026. 7. 16. 오전 11:27:16
function containsNearbyDuplicate(nums: number[], k: number): boolean {
    const seen = {};
    for (let index=0; index<nums.length; ++index) {
        if ((index - seen[nums[index]]) <= k) return true;
        seen[nums[index]] = index;
    }
    return false;
};