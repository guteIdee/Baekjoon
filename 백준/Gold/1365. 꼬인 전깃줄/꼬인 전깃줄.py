import bisect

n = int(input())
a = list(map(int, input().split()))
b = []
for x in a:
    pos = bisect.bisect_left(b, x)
    if pos < len(b):
        b[pos] = x
    else:
        b.append(x)
print(n - len(b))
