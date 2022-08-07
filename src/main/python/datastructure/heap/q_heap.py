import heapq

toBeDeleted = {}
heap = []
Q = int(input())
for q in range(Q):
    l = [int(x) for x in input().strip().split(' ')]
    (a,b) = (l[0], l[1] if len(l) > 1 else None)
    if a == 1: heapq.heappush(heap,b)
    elif a == 2:
        if b in toBeDeleted: toBeDeleted[b] += 1
        else: toBeDeleted[b] = 1
    else:
        while True:
            x = heap[0]
            if x in toBeDeleted:
                heapq.heappop(heap)
                toBeDeleted[x] -= 1
                if toBeDeleted[x] <= 0: del(toBeDeleted[x])
            else: break
        print(x)