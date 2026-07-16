// Last updated: 2026. 7. 16. 오전 11:25:01

func hasMatch(s string, p string) bool {
	// Split the pattern string by '*' to get two patterns.
	patterns := strings.Split(p, "*")
	if len(patterns) != 2 {
		return false
	}
	pattern1 := patterns[0]
	pattern2 := patterns[1]

	// Find the index of the first pattern.
	index1 := strings.Index(s, pattern1)
	if index1 == -1 {
		return false
	}

	// Find the index of the second pattern.
	index2 := strings.LastIndex(s, pattern2)
	if index2 == -1 {
		return false
	}

	// Check if the second pattern appears after the first one.
	if index2 < index1+len(pattern1) {
		return false
	}

	return true
}