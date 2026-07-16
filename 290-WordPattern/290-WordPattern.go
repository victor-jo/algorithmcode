// Last updated: 2026. 7. 16. 오전 11:27:02
import (
    "strings"
)

func wordPattern(pattern string, s string) bool {
	// Create a map to store the pattern and the words.
	wordMap := make(map[string]byte)

	// Create a map to store the words and the pattern.
	patternMap := make(map[byte]string)

	// Split the passed string by space.
	words := strings.Split(s, " ")

	// If the length of the pattern and the words are different, return false.
	if len(pattern) != len(words) {
		return false
	}

	// Iterate over the words.
	for i, word := range words {
		// If the word does not exist in the map, it is stored in the map with the word as the key and pattern[i] as the value.
		if _, ok := wordMap[word]; !ok {
			wordMap[word] = pattern[i]
		} else {
			// If the word exists in the map, the value of the word is compared with pattern[i].
			// If the value of the word is different from pattern[i], return false.
			if wordMap[word] != pattern[i] {
				return false
			}
		}
		// If the pattern[i] does not exist in the map, it is stored in the map with pattern[i] as the key and word as the value.
		if _, ok := patternMap[pattern[i]]; !ok {
			patternMap[pattern[i]] = word
		} else {
			// If the pattern[i] exists in the map, the value of the pattern[i] is compared with word.
			// If the value of the pattern[i] is different from word, return false.
			if patternMap[pattern[i]] != word {
				return false
			}
		}
	}

	return true
}
