T = int(input())
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    answer = 0
    maxi = 0
    n = int(input())
    arr = list(map(int, input().split()))

    for i in range(len(arr)-1,-1,-1):
        maxi = max(arr[i],maxi)
        if (maxi-arr[i] > 0):
            answer += (maxi-arr[i])
            
    print(f"#{test_case}", answer)