import copy

def solution(n):
    arr = []
    
    for i in range(1,n+1):
        arr.append([0 for _ in range(i)])
    
    num = 1
    dirs = [[1,0],[0,1],[-1,-1]]
    cnt = 0
    x , y = 0 , 0
    
    for i in range(len(arr),0,-1):
        for _ in range(i):
            arr[x][y] = num
            num += 1
            if ( _ < i - 1): # 4일때, 0~3까지 , 3일때 0~2까지 인데
                dx , dy = dirs[cnt%3]
                x += dx
                y += dy
        
        cnt += 1
        dx , dy = dirs[cnt%3]
        x , y = x+dx , y+dy
    
    

    arr = sum(arr,[])
    return arr