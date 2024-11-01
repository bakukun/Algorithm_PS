from collections import deque

T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    arr = [[0 for _ in range(n)] for _ in range(n)]
    num = 1
    max_num = n*n
    x,y, direction = 0, 0, 0
    cnt = 0
    
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    
    while (num <= max_num):
        arr[x][y] = num
        num += 1
        # 다음 좌표 계산
        new_x, new_y = x + dx[direction], y + dy[direction]
        
        if not ( 0 <= new_x <= n-1 and 0 <= new_y <= n-1 and arr[new_x][new_y] == 0):
            direction = (direction + 1) % 4
            new_x, new_y = x + dx[direction], y + dy[direction]
            
        x,y =new_x, new_y 
    
    print(f"#{test_case}")
    for i in range(n):
        for j in range(n):
        	print(arr[i][j],end=" ")
        print()
    
    # ///////////////////////////////////////////////////////////////////////////////////
