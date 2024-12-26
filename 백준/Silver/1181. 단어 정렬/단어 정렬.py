import sys

n = int(sys.stdin.readline())
l = []

for _ in range(n):
    str = sys.stdin.readline().rstrip()
    if str not in l:
        l.append(str)

l.sort(key=lambda x:(len(x), x))

for i in l:
    print(i)