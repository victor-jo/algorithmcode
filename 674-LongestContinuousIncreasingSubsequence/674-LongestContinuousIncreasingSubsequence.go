// Last updated: 2026. 7. 16. 오전 11:26:36
func findLengthOfLCIS(nums []int) int {
	prev := -1000000001
	result := 0
	count := 0
	for i := 0; i < len(nums); i++ {
		if prev < nums[i] {
			count++
			if result < count {
				result = count
			}
		} else {
			count = 1
		}
		prev = nums[i]
	}
	return result
}