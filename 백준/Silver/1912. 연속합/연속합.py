import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

dp = [0 for _ in range(len(a))]
dp[0] = a[0]

for i in range(1, len(a)):
    if dp[i - 1] + a[i] >= a[i]:
        dp[i] = dp[i - 1] + a[i]
    else:
        dp[i] = a[i]
print(max(dp))