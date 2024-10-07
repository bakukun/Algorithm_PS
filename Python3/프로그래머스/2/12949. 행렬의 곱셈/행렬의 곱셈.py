def solution(arr1, arr2):
    arr1_n = len(arr1)
    arr1_m = len(arr1[0])
    arr2_n = len(arr2)
    arr2_m = len(arr2[0])
    
    ans = [[0 for _ in range(arr2_m)] for _ in range(arr1_n) ] 
    

    for i in range(arr1_n):
        for j in range(arr2_m): 
            temp = 0
            for l in range(arr2_n):
                temp += (arr1[i][l] * arr2[l][j])
            ans[i][j] = temp
    print(ans)
    return ans