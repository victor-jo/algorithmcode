# Last updated: 2026. 7. 16. 오전 11:28:36
class Solution(object):
    def combinationSum2(self, candidates, target):
        """
        :type candidates: List[int]
        :type target: int
        :rtype: List[List[int]]
        """
        dp = [set() for _ in range(target + 1)]
        dp[0].add(())

        candidates.sort() 

        for num in candidates:
            if num > target:
                continue

            for i in range(target, num - 1, -1):
                for prev_comb in dp[i - num]:
                    dp[i].add(prev_comb + (num,))

        return [list(comb) for comb in dp[target]]
        