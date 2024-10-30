import copy

def solution(n):
    arr = []
    
    for i in range(1,n+1):
        arr.append([0 for _ in range(i)])
    
    num = 1
    dirs = [[1,0],[0,1],[-1,-1]]
    cnt = 0
    x , y = -1 , 0
    
    for i in range(n):
        for j in range(i,n): 
            if (cnt % 3 == 0):
                x = x + 1
            elif (cnt % 3 == 1):
                y = y + 1
            else:
                x -= 1
                y -= 1
            arr[x][y] = num
            num += 1
        cnt += 1

    arr = sum(arr,[])
    return arr