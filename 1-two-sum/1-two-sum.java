class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; ++i) {
            hashMap.put(nums[i], i);
        }
        
        for (int i=0; i<nums.length; ++i) {
            Integer find = hashMap.get(target - nums[i]);
            if (find != null && find != i) {
                return find > i ? new int[] {i, find} : new int[] {find, i};
            }
        }
        
        return new int[] {0, 0};
    }
}