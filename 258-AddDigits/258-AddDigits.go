// Last updated: 2026. 7. 16. 오전 11:27:10
func addDigits(num int) int {
	// Repeat until num is a single digit.
	for num >= 10 {
		// Sum of digits.
		sum := 0
		for num > 0 {
			sum += num % 10
			num /= 10
		}
		num = sum
	}

	return num
}