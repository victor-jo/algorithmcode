// Last updated: 2026. 7. 16. 오전 11:26:52
func countSegments(s string) int {
	count := 0
	for i := 0; i < len(s); i++ {
		if s[i] != ' ' && (i == 0 || s[i-1] == ' ') {
			count++
		}
	}
	return count
}