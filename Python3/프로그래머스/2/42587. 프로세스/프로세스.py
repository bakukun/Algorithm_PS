from collections import deque

def solution(priorities, location):
    
    maximum = max(priorities)
    q = deque(list(priorities))
    cnt = 0


    while(len(q) > 0):
        tmp = q.popleft()
        
        if(location == 0):
            if (tmp >= maximum):
                cnt += 1
                return cnt
            
            else:
                q.append(tmp)
                location = len(q) - 1
        
        else:    
            location = max(0,location - 1)
        
            if (tmp < maximum):
                q.append(tmp)
        
            else:
                cnt += 1
                tmp_max = max(q)
                maximum = min(maximum,tmp_max)

    
    answer = 0
    return answer