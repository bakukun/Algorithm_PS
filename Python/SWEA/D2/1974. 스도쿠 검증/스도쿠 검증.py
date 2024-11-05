T = int(input())

for test_case in range(1, T + 1):
    
    chk = True
    arr = [list(map(int,input().split())) for _ in range(9)]
    
    one_chk = True
    for i in range(9):
        visited = [False for _ in range(9)]
        for j in range(9):
            idx = arr[i][j] - 1
            if (not visited[idx]):
            	visited[idx] = True
            else:
                chk = False
                one_chk = False
                break
        if (not one_chk):
            break
    
    if(chk):
    	three_check = True
    	for i in range(9):
            visited = [False for _ in range(9)]
            for j in range(9):
                idx = arr[j][i] - 1
                if (not visited[idx]):
                    visited[idx] = True
                else:
                	chk = False
                	three_check = False
                	break
            if (not three_check):
            	break
    
    if (chk):
        two_chk = True
        for i in range(0,9,3):
            for j in range(0,9,3):
                visited = [False for _ in range(9)]
                for x in range(3):
                    for y in range(3):
                        idx = arr[i+x][j+y] - 1
                        if (not visited[idx]):
                            visited[idx] = True
                        else:
                	        chk = False
                	        two_chk = False
                	        break
                if (not two_chk):
            	    break
    if chk:
    	print(f"#{test_case} 1")
    else:
    	print(f"#{test_case} 0")
