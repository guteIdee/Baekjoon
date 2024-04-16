N, M = map(int, input().split())
set = set()

for _ in range(N):
    set.add(input())

answer = 0

for _ in range(M):
    str = input()
    if str in set:
        answer += 1

print(answer)