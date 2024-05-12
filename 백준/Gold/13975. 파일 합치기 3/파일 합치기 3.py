import heapq

t = int(input())
for _ in range(t):
    n = int(input())
    nums = list(map(int, input().split()))
    heap = []
    for num in nums:
        heapq.heappush(heap, num)
    cnt = 0
    while len(heap) > 1:
        a = heapq.heappop(heap)
        b = heapq.heappop(heap)
        cnt += (a+b)
        heapq.heappush(heap, a+b)
    print(cnt)