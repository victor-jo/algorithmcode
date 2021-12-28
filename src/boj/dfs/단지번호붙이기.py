dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(i, j):
    count = 0
    if i < 0 or i >= n or j < 0 or j >=n:
        return 0

    if visit[i][j] or map[i][j] == '0':
        return 0

    visit[i][j] = True
    count += 1

    for k in range(4):
        count += dfs(i + dx[k], j + dy[k])

    return count


n = int(input())
map = [[] for _ in range(n)]
visit = [[False for _ in range(n)] for _ in range(n)]

for i in range(n):
    map[i] = list(input())

jarNumber = 0
count = []

for i in range(n):
    for j in range(n):
        if map[i][j] == '1' and not visit[i][j]:
            jarNumber += 1
            count.append(dfs(i, j))

count.sort()
print(jarNumber)
for c in count:
    print(c)