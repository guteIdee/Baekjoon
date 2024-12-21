import sys

n, k = map(int, sys.stdin.readline().split())
l = []
answer = 0
for i in range(n):
    l.append(int(sys.stdin.readline()))
l.sort(reverse=True)
for i in l:
    if k >= i:
        answer += k // i
        k %= i
    if k == 0:
        break
print(answer)