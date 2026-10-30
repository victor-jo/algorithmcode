# Last updated: 2026. 10. 30. 오후 3:46:49
1class Solution:
2    def firstUniqChar(self, s: str) -> int:
3        text = s
4        char_counts = {}
5        
6        for char in s:
7            char_counts[char] = char_counts.get(char, 0) + 1
8        
9        for index, char in enumerate(s):
10            if char_counts[char] == 1:
11                return index
12        
13        return -1