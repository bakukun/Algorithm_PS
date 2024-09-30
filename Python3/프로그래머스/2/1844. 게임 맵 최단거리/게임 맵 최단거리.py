from collections import deque

def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    dxs = [1,0,-1,0]
    dys = [0,1,0,-1]
    distance = [[-1]* m for _ in range(n)] 
    distance[0][0] = 1
    
    def bfs(i,j):
        q = deque([(i,j)])
        
        while q:
            node = q.popleft()
            a , b = node
            for dx, dy in zip(dxs,dys):
                
                x = a + dx
                y = b + dy
                
                if (0 <= x < n and 0 <= y < m):
                    if (maps[x][y] == 1  and distance[x][y] == -1):         
 
                        distance[x][y] = distance[a][b] + 1 
                        q.append((x,y))
                        
       

    bfs(0,0)
    return distance[n-1][m-1]
    
