from collections import deque

def solution(priorities, location):
    
    q = deque([(v, i) for i, v in enumerate(priorities)])
    cnt = 0

    while q:
        cur = q.popleft()
        if any(cur[0] < other[0] for other in q):
            q.append(cur)
        
        else:
            cnt += 1
            if(cur[1] == location):
                return cnt
            
            
        