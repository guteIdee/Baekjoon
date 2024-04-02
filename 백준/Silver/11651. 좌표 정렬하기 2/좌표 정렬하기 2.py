import sys

n = int(sys.stdin.readline())
data = []

for i in range(0, n):
    i, j = map(int, sys.stdin.readline().split())
    data.append((i, j))
data.sort(key=lambda x:(x[1], x[0]))

for d in data:
    print(*d)