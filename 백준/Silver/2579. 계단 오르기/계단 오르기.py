n = int(input())
st = [0]
for i in range(n):
    st.append(int(input()))
dp = [0] * (n + 1)
dp[1] = st[1]

if n >= 2:
    dp[2] = st[1] + st[2]
if n >= 3:
    for i in range(3, n + 1):
        dp[i] = max(st[i] + st[i - 1] + dp[i - 3], st[i] + dp[i - 2])
print(dp[n])
