import sys
from collections import deque

n, m, v = map(int, sys.stdin.readline().split())
graph = [[] for _ in range(n + 1)]

for _ in range(m):
    v1, v2 = map(int, sys.stdin.readline().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

visited_dfs = [0] * (n + 1)
visited_bfs = [0] * (n + 1)

def dfs(v):
    visited_dfs[v] = 1
    print(v, end = ' ')
    for w in sorted(graph[v]):
        if visited_dfs[w] == 0:
            dfs(w)

def bfs(s):
    visited_bfs[s] = 1
    queue = deque([s])
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for w in sorted(graph[v]):
            if visited_bfs[w] == 0:
                visited_bfs[w] = 1
                queue.append(w)
dfs(v)
print()
bfs(v)
