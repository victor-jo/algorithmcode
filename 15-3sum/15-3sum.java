class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        boolean onlyZero = true;
        for (int num : nums) {
            if (num != 0) {
                onlyZero = false;
            }
        }
        
        if (onlyZero) {
            result.add(Arrays.asList(0, 0, 0));
            return result;
        }
        
        Arrays.sort(nums);
        
        for (int k=0; k<nums.length; ++k) {
            if (k > 0 && nums[k] == nums[k-1]) {
                continue;
            }
            
            int l = k + 1;
            int r = nums.length-1;
            
            while (l < r) {
                int sum = nums[k] + nums[l] + nums[r];
                if (sum > 0) {
                    --r;
                }
                else if (sum < 0) {
                    ++l;
                }
                else { 
                    result.add(Arrays.asList(nums[k], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1]) {
                        ++l;
                    }
                }
            }
        }
        
        return result;
    }
}