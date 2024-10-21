def solution(land):
    dp = [[0 for _ in range(4)] for _ in range(len(land)+1)] 
    dp[1] = land[0]
    
    for i in range(2,len(land)+1):
        for prev in range(4):
            for current in range(4):
                if prev == current:
                    continue
                dp[i][current] = max(dp[i][current],dp[i-1][prev] + land[i-1][current])

    return max(dp[len(land)])
