def check(tmp):
    global answer
    return answer > tmp or answer == []
        
    
def backtracking(tmp,depth,tickets,visited):
    global answer
    
    if (depth == n+1):
        if(check(tmp)):
            answer = tmp.copy()
    
    for i in range(len(tickets)):
        
        if tickets[i][0] == tmp[-1] and not visited[i]:
            
            tmp.append(tickets[i][1])
            visited[i] = True
            backtracking(tmp,depth+1,tickets,visited)
            
            tmp.pop()
            visited[i] = False
            
    return 
    
def solution(tickets):
    
    global answer
    global tmp
    global n
    
    tickets.sort()
    n = len(tickets)
    visited = [False] * n
    
    tmp = ["ICN"]  # 경로를 저장할 리스트, "ICN"에서 출발
    answer = []  # 최적 경로를 저장할 리스트
    
    # 백트래킹 시작
    backtracking(tmp, 1, tickets, visited)
    
    return answer