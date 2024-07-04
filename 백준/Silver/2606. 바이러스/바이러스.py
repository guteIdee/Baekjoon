import sys
from collections import deque

n = int(sys.stdin.readline())
m = int(sys.stdin.readline())

graph = [[] for _ in range(n + 1)]

for _ in range(m):
    v1, v2 = map(int, sys.stdin.readline().split())
    graph[v1].append(v2)
    graph[v2].append(v1)

visited_dfs = [0] * (n + 1)
answer = 0
def dfs(v):
    visited_dfs[v] = 1
    for w in sorted(graph[v]):
        if visited_dfs[w] == 0:
            dfs(w)

dfs(1)
print(visited_dfs.count(1) - 1)
