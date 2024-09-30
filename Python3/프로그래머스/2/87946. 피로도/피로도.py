from itertools import permutations

def solution(k, dungeons):
    dungeons.sort(key = lambda x : x[1])
    length = len(dungeons)
    arr = list(range(0,length))
    idx_list = []
    ans = 0
    for j in permutations(arr,length):
        idx_list.append(list(j))
    
    for i in range(len(idx_list)):
        tmp = 0
        tmp_k = k
        for j in idx_list[i]:
            min_k = dungeons[j][0]
            use_k = dungeons[j][1]
            
            if (tmp_k >= min_k):
                tmp_k -= use_k
                tmp +=1     
            else:
                break

        ans = max(ans,tmp)
    
    return ans