from collections import deque

def solution(n, edge):
    num = [[] for _ in range(n+1)] 
    
    for i in edge:
        x , y = i 
        num[x].append(y)
        num[y].append(x)

    cnt = 0
    q = deque([1])

    distance = [-1 for _ in range(n+1)]
    distance[1] = 0
    
    while(q):
        
        next = q.popleft()
        
        for i in range(len(num[next])):
            tmp = num[next][i]
            
            if(distance[tmp] == -1):
                q.append(tmp)
                distance[tmp] = distance[next] + 1
                
                
    maximum = max(distance)
    
    return distance.count(maximum)

