// Last updated: 2026. 7. 16. 오전 11:27:14
package main

import "fmt"

func summaryRanges(nums []int) []string {
	// Has the starting point number to be grouped first.
	var inner bool = false
	var num int

	// Collect the result here and return it.
	var result []string

	// Store the length for nums.
	var length int = len(nums)

	// for loop nums to length
	for i := 0; i < length; i++ {
		// As you increase the number one by one, if a consecutive number appears, group it based on that number.
		// If no consecutive numbers are found, the numbers are printed as they are.
		if inner == false {
			num = nums[i]
			inner = true
		}

		if i == length-1 || nums[i]+1 != nums[i+1] {
			if num == nums[i] {
				result = append(result, fmt.Sprintf("%d", num))
			} else {
				result = append(result, fmt.Sprintf("%d->%d", num, nums[i]))
			}
			inner = false
		}
	}

	return result
}