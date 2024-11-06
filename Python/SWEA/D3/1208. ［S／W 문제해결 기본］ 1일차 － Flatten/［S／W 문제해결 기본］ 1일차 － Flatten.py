T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    
    cnt = int(input())
    arr = list(map(int,input().split()))
    
    for i in range(cnt):
        maxi = max(arr)
        mini = min(arr)
        maxi_idx = arr.index(maxi)
        mini_idx = arr.index(mini)
        if (maxi - mini > 2):
            arr[maxi_idx] -= 1
            arr[mini_idx] += 1
        else:
            break
        

    print(f"#{test_case}",max(arr)-min(arr))
