def solution(n, computers):
    cnt = 0
    visited = [False] * n
    
    def dfs(idx):
        
        visited[idx] = True
        
        for connect_idx in range(n):
            if computers[idx][connect_idx] == 1 and not visited[connect_idx]:
                dfs(connect_idx)
    
    for i in range(n):
        if not visited[i]:
            cnt += 1
            dfs(i)    
                
    return cnt