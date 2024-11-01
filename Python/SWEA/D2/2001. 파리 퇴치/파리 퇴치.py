T = int(input())
for test_case in range(1, T + 1):
    n , m = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(n)]
    dp = [[0 for _ in range(n+1)] for _ in range(n+1)]
    maxi = 0
    
    for i in range(1,n+1):
        for j in range(1,n+1):
            dp[i][j] = arr[i-1][j-1] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1]
	
    for i in range(1,n-m+2): # n:5 , m:2 , i = 1,2,3,4
        for j in range(1,n-m+2): #왜 n-m+2인가 ? => 행렬이 배열의 경계를 벗어나지 않도록 탐색 
            maxi = max(maxi,dp[i+m-1][j+m-1] - dp[i-1][j+m-1] - dp[i+m-1][j-1] + dp[i-1][j-1])
            # 왜 i+m-1인가? -> dp의 누적합 저장 부분은 기존 arr배열보다 [i+1][j+1] 된 좌표에 저장
            # 거기서 m만큼 고려한 부분의 합을 구해야함 -> 그러기 위해선, 앞 옆 빼주고 왼쪽 대각선 중복 부분 더해주기 
            # arr[1][1] -> dp[2][2] 
    print(f"#{test_case}",maxi)