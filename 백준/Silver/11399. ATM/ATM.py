import sys

n = int(sys.stdin.readline())
l = list(map(int, sys.stdin.readline().split()))
l.sort()
time = 0
answer = 0
for i in l:
    time += i
    answer += time
print(answer)