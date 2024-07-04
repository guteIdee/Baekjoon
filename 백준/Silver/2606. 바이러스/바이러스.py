import sys
from collections import deque

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    v1, v2 = map(int, sys.stdin.readline().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

visited_bfs = [0] * (n + 1)

def bfs(s):
    visited_bfs[s] = 1
    queue = deque([s])
    while queue:
        v = queue.popleft()
        for w in sorted(graph[v]):
            if visited_bfs[w] == 0:
                visited_bfs[w] = 1
                queue.append(w)

bfs(1)
print(visited_bfs.count(1) - 1)
