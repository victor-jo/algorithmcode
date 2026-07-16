# Last updated: 2026. 7. 16. 오전 11:25:21
# Final Answer Code (Standard Interpretation)
import collections

class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        last_occurrence_index = -1
        n = len(number)

        for i in range(n):
            if number[i] == digit:
                last_occurrence_index = i
                if i + 1 < n and number[i+1] > digit:
                    return number[:i] + number[i+1:]

        return number[:last_occurrence_index] + number[last_occurrence_index+1:]