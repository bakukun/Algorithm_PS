def solution(n, computers):
    answer = 0
    visited = [False] * n
    
    def dfs(i):
        #1. 해당 노드 방문 처리
        #2. 해당 노드와 임의 인덱스 순차 비교
        #3. 만약 값도 1이고 방문 안했다면 dfs
        visited[i] = True
        
        for idx in range(n):
            if(computers[i][idx] == 1 and not visited[idx]):
                dfs(idx)
                
        return
        
    for i in range(n):
        if (not visited[i]):
            answer += 1
            dfs(i)
        
    return answer