// Last updated: 2026. 7. 16. 오전 11:28:35
import java.util.*;

class Solution {
    public String findSortedKey(String str) {
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		return String.valueOf(chars);
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> hashMap = new HashMap<>();

		for (String str : strs) {
			hashMap.computeIfAbsent(findSortedKey(str), key -> new ArrayList<>()).add(str);
		}

		return new ArrayList<>(hashMap.values());
	}
}