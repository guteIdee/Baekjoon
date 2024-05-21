n = int(input())
a = list(map(int, input().split()))
dp = []
dp = [1 for _ in range(len(a))]
for i in range(1, len(a)):
    for j in range(i):
        if a[j] < a[i]:
            dp[i] = max(dp[i], dp[j] + 1)
print(max(dp))
