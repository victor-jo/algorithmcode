// Last updated: 2026. 7. 16. 오전 11:25:16
func successfulPairs(spells []int, potions []int, success int64) []int {
    results := make([]int, len(spells))
    length := len(potions)
    
    sort.Ints(potions)

	for i, spell := range spells {
		low := 0
		high := length - 1
		result := length

		for low <= high {
			mid := low + (high-low)/2

			if int64(potions[mid]*spell) >= success {
				result = mid
				high = mid - 1
			} else {
				low = mid + 1
			}
		}

		results[i] = length - result
	}

	return results
}