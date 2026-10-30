# Last updated: 2026. 10. 30. 오전 11:43:30
1class Solution:
2    def lexicalOrder(self, n: int) -> list[int]:
3        res = [1]
4        cur = 1
5
6        for _ in range(n - 1):
7            if cur * 10 <= n:
8                cur *= 10
9            else:
10                while (cur % 10 == 9) or (cur >= n):
11                    cur //= 10
12                cur += 1
13            res.append(cur)
14
15        return res
16        