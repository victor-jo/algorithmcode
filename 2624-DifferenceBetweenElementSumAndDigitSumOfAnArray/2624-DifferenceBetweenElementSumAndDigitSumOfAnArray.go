// Last updated: 2026. 7. 16. 오전 11:25:11
func differenceOfSum(nums []int) int {
	elementSum := 0
	digitSum := 0

	for _, num := range nums {
		elementSum += num
		digitSum += sumOfDigits(num)
	}

	if elementSum > digitSum {
		return elementSum - digitSum
	}
	
	return digitSum - elementSum
}

func sumOfDigits(num int) int {
	sum := 0
	for num > 0 {
		sum += num % 10
		num /= 10
	}

	return sum
}