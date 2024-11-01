T = 10
# 여러개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
for test_case in range(1, T + 1):
    building = input()
    floor = list(map(int,input().split()))
    ans = 0
    for i in range(2,len(floor)-2):
        left =max(floor[i-1],floor[i-2])
        right = max(floor[i+1],floor[i+2])
        view = floor[i] - max(left,right)
        #print(i,view)
        if(view >0):
        	ans += view
    print(f"#{test_case}",ans)