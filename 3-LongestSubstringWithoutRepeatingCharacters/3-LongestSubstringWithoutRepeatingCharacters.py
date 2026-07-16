# Last updated: 2026. 7. 16. 오전 11:29:06
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        length_of_longest = 0
        from_index = 0
        dic = {}

        for to_index in range(0, len(s)):
            c = s[to_index]
            if c in dic:
                from_index = max([dic[c], from_index])

            length_of_longest = max([length_of_longest, to_index-from_index+1])
            dic[c] = to_index + 1

        return length_of_longest