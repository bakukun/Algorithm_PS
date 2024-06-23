def solution(N, stages):
    ans = {}
    player = len(stages)
    
    for i in range(1,N+1):
        if player == 0:
            ans[i] = 0
        else:
            ans[i] = stages.count(i)/player
            player -= stages.count(i)
    
    answer = sorted(ans, key=lambda x : ans[x],reverse=True)
    return answer
