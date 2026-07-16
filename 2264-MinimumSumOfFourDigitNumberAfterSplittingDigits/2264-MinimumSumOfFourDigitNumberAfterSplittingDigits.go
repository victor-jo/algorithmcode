// Last updated: 2026. 7. 16. 오전 11:25:22
import (
	"fmt"
	"sort"
)

func minimumSum(num int) int {
	min := 1000000000

	nums := toSlice(num)

	for i := 0; i < len(nums); i++ {
		var target []int
		for j := 0; j < len(nums); j++ {
			if i == j {
				continue
			}
			target = append(target, nums[j])
		}
		num := toInt(minDigit(target...)) + nums[i]
		if num < min {
			min = num
		}
	}

	for i := 0; i < len(nums); i++ {
		for j := 0; j < len(nums); j++ {
			var target []int
			if j == i {
				continue
			}
			for k := 0; k < len(nums); k++ {
				if k == j || k == i {
					continue
				}
				target = append(target, nums[k])
			}
			num := toInt(minDigit(target...)) + toInt(minDigit(nums[i], nums[j]))
			if num < min {
				min = num
			}
		}
	}

	return min
}

func toSlice(num int) []int {
	nums := make([]int, 0)
	for num > 0 {
		nums = append(nums, num%10)
		num /= 10
	}
	return nums
}

func toInt(nums []int) int {
	num := 0
	for i := 0; i < len(nums); i++ {
		num *= 10
		num += nums[i]
	}
	return num
}

func minDigit(nums ...int) []int {
	result := make([]int, len(nums))
	copy(result, nums)
	sort.Ints(result)
	return result
}