n = int(input())

times = list(map(int, input().split()))
times.sort()

total = 0
answer = 0

for i in times:
    total += i
    answer += total

print(answer)