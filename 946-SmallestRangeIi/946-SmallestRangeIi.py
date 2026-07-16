# Last updated: 2026. 7. 16. 오전 11:26:14
class Solution(object):
    def smallestRangeII(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        n = len(nums)
        if n <= 1:
            return 0
        
        nums.sort()
        
        result = nums[-1] - nums[0]
        
        for i in range(n - 1):
            new_max = max(nums[i] + k, nums[-1] - k)
            new_min = min(nums[0] + k, nums[i+1] - k)
            
            result = min(result, new_max - new_min)
            
        return result