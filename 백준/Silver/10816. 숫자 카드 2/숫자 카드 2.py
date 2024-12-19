import sys

n = int(sys.stdin.readline())
n_list = list(map(int, sys.stdin.readline().split()))
m = int(sys.stdin.readline())
m_list = list(map(int, sys.stdin.readline().split()))
dict = {}

for x in n_list:
    dict[x] = dict.get(x, 0) + 1
for x in m_list:
    if x in dict:
        print(dict[x], end=' ')
    else:
        print(0, end=' ')