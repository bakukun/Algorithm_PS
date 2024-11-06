T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    n = int(input())
    arr = []
    for i in range(n):
        arr.append([])
    arr[0].append(1)
    
    for i in range(1,len(arr)):
        for j in range(i+1):
            if (j==0 or j==i):
                ans = 1 
            else:
                ans = arr[i-1][j-1] + arr[i-1][j]
            arr[i].append(ans)
            
    print(f"#{test_case}")      
    for i in range(len(arr)):
        for j in range(len(arr[i])):
            print(arr[i][j],end=" ")
        print()

    