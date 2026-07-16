// Last updated: 2026. 7. 16. 오전 11:24:57
func beautifulSubstrings(s string, k int) int {
	L := 1
	for (L*L)%k != 0 {
		L++
	}

	type Pair struct{ diff, vMod int }
	counts := make(map[Pair]int)
	counts[Pair{0, 0}] = 1

	vowels, consonants := 0, 0
	result := 0

	isVowel := map[byte]bool{'a': true, 'e': true, 'i': true, 'o': true, 'u': true}

	for i := 0; i < len(s); i++ {
		if isVowel[s[i]] {
			vowels++
		} else {
			consonants++
		}

		diff := vowels - consonants
		vMod := vowels % L

		key := Pair{diff, vMod}

		if val, ok := counts[key]; ok {
			result += val
		}

		counts[key]++
	}

	return result
}