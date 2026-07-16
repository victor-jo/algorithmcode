// Last updated: 2026. 7. 16. 오전 11:27:08
func isUgly(n int) bool {
	// n must be positive
	if n <= 0 {
		return false
	}

	// Divide by three numbers 2, 3, 5 until the passed n is 1
	// All remainders must be 0.
	// If not, return false.
	// If n is 1, return true.
	for n > 1 {
		if n%2 == 0 {
			n /= 2
		} else if n%3 == 0 {
			n /= 3
		} else if n%5 == 0 {
			n /= 5
		} else {
			return false
		}
	}
	return true
}