n = int(input())
triangle = []

for i in range(n):
    triangle.append(list(map(int, input().split())))

dp = [[0 for _ in range(len(triangle))] for _ in range(len(triangle))]
dp[0][0] = triangle[0][0]

for i in range(1, len(triangle)):
    for j in range(i + 1):
        if j == 0:
            dp[i][j] = dp[i-1][j] + triangle[i][j]
        else:
            dp[i][j] = max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j]
print(max(dp[len(triangle)-1]))