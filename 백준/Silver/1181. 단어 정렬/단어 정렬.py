import sys

n = int(sys.stdin.readline())
arr = []

for _ in range(n):
    arr.append(sys.stdin.readline().strip())
arr = list(set(arr))
arr.sort(key=lambda x: (len(x), x))

for a in arr:
    print(a)