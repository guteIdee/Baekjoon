import sys

n = int(sys.stdin.readline())
l = []

for _ in range(n):
    start, end = map(int, sys.stdin.readline().split())
    l.append([start, end])

l.sort(key=lambda x:(x[1], x[0]))

for i in range(n):
    print(l[i][0], l[i][1])

