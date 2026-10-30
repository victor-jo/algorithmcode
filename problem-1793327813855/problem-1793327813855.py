# Last updated: 2026. 10. 30. 오전 11:36:53
1class Solution:
2    def lexicalOrder(self, n: int) -> list[int]:
3        res = [1]
4        cur = 1
5
6        for i in range(n - 1):
7            if cur * 10 <= n:
8                cur *= 10
9            elif (cur // 10 != (cur + 1) // 10) or (cur >= n):
10                while ((cur // 10 != (cur + 1) // 10) or (cur >= n)):
11                    cur //= 10
12                cur += 1
13            else:
14                cur += 1
15            res.append(cur)
16
17        return res
18        