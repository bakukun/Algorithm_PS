def solution(n, times):
    
    start = min(times)
    end = max(times) * n
    
    key = n
    while start <= end:
        
        mid = (start + end) // 2
        
        tmp = 0
        
        
        for i in times:
            tmp += (mid // i) 
            
        print(start,end,mid,tmp)
        
        if(tmp < key):
            start = mid + 1
            
        elif(tmp >= key):
            end = mid-1
        
    
    return start