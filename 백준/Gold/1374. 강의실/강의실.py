import sys
import heapq

n = int(sys.stdin.readline())

study = []
for _ in range(n):
    num, start, end = map(int, sys.stdin.readline().rstrip().split())
    study.append([start, end])

study.sort()

rooms = []
heapq.heappush(rooms, study[0][1])

for i in range(1, n):
    if study[i][0] < rooms[0]:
        heapq.heappush(rooms, study[i][1])
    else:
        heapq.heappop(rooms)
        heapq.heappush(rooms, study[i][1])

print(len(rooms))