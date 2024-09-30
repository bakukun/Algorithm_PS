from collections import deque

def bfs(start,arr,visited):
    q = deque([start])
    
    visited[start] = True
    cnt = 0
    
    while q:
        v = q.popleft()
        cnt += 1
        for i in arr[v]:
            if not visited[i]:
                q.append(i)
                visited[i] = True
        
    return cnt

        
def solution(n, wires):
    answer = n-2
    
    for i in range(len(wires)):
        tmps = wires.copy()
        arr = [[] for i in range(n+1)]
        visited = list(False for _ in range(n+1))
        tmps.pop(i)
        
        for wire in tmps:
            x,y = wire
            arr[x].append(y)
            arr[y].append(x)
            
        for idx , g in enumerate(arr):
            if g != []:
                start = idx
                break

        cnts = bfs(start,arr,visited)
        other_cnts = n - cnts
        answer = min(abs(other_cnts - cnts) ,answer)
    
    
    return answer