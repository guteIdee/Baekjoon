import sys

n = int(sys.stdin.readline())
meetings = []
for _ in range(n):
    start, end = map(int, sys.stdin.readline().split())
    meetings.append((start, end))

meetings.sort(key=lambda x: (x[1], x[0]))

answer = 0
last_end_time = 0

for start_time, end_time in meetings:
    if start_time >= last_end_time:
        answer += 1
        last_end_time = end_time

print(answer)