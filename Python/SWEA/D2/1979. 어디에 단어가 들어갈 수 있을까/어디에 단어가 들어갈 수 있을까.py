T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n, m = map(int,input().split())
    arr = [list(map(int,input().split())) for _ in range(n)]
    ans_list = []
    ans = 0
    
    for i in range(len(arr)):
        tmp = 0
        for j in range(len(arr)):
            if (arr[i][j] == 1):
                tmp+=1
            elif (arr[i][j] == 0):
                if (tmp>0):
                    ans_list.append(tmp)
                tmp = 0
            if ( j == len(arr)-1):
                if (tmp>0):
                    ans_list.append(tmp)   
                
    for i in range(len(arr)):
        tmp = 0
        for j in range(len(arr)):
            if (arr[j][i] == 1):
                tmp+=1
            elif (arr[j][i] == 0):
                if (tmp>0):
                    ans_list.append(tmp)
                tmp = 0
            if ( j == len(arr)-1):
                if (tmp>0):
                    ans_list.append(tmp)   
                

    
    print(f"#{test_case}",ans_list.count(m))
