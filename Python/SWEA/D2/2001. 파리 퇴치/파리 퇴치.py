T = int(input())
for test_case in range(1, T + 1):
    n , m = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(n)]
    dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
    maxi = 0
    for i in range(1,n+1):
        for j in range(1,n+1):
            dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1]  + arr[i-1][j-1]
    
    for i in range(1,n-m+2):
        for j in range(1,n-m+2):
            maxi = max(maxi, dp[i+m-1][j+m-1] - dp[i-1][j+m-1] -  dp[i+m-1][j-1] + dp[i-1][j-1])

    print(f"#{test_case}",maxi)