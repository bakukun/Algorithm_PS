from collections import deque

def solution(land):
    
    dxs = [1,0,-1,0]
    dys = [0,1,0,-1]   
    n , m = len(land) , len(land[0])
    
    arr = [0] * m
    visited = list([False] * m for _ in range(n))
    
    
    for i in range(m):
        for j in range(n):
            if (land[j][i] == 1 and not visited[j][i]):
                visited[j][i] = True
                q = deque([(j,i)])
                col = set()
                tmp = 0
                
                while q:
                    
                    a,b = q.popleft()
                    col.add(b)
                    tmp += 1
                    
                    for dx,dy in zip(dxs,dys):
                        x = a + dx
                        y = b + dy
                        
                        
                        if ((0<=x<n and 0<=y<m) and not visited[x][y] and land[x][y] == 1):
                            visited[x][y] = True
                            q.append((x,y))
                    
                for y in col:
                    arr[y] += tmp
    
    
    return max(arr)