import sys

n = int(sys.stdin.readline())
change = 1000 - n
answer = 0

changes = [500, 100, 50, 10, 5, 1]

for i in changes:
    if change >= i:
        x = change // i
        answer += x
        change -= i * x
    if change == 0:
        break

print(answer)
