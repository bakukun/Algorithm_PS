def solution(n, lost, reserve):
    
    new_lost = [l for l in lost if l not in reserve]
    new_reserve = [i for i in reserve if i not in lost]
    
    new_lost.sort()
    new_reserve.sort()
    
    cnt = n - len(new_lost)
    
    for i in new_lost:
        before = i - 1
        after = i + 1

        if (before in new_reserve):
            cnt += 1
            new_reserve.remove(before)
            
        elif after in new_reserve:
            cnt += 1
            new_reserve.remove(after)
            
        print(i,before,after)

    
    return cnt