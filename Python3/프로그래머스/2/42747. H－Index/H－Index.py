def solution(citations):
    
    n = len(citations)
    citations.sort()
    maximum = max(citations)
    h = 0
    
    print(citations)
    for i in range(maximum+1):
        high_h = 0
        under_h = 0 
        for j in range(n):
            
            if (citations[j] < i):
                under_h += 1
            if (citations[j] >= i):
                high_h += 1    
        
        print(i,high_h,under_h)
        if (high_h >= i and under_h <= i):
            h = i
    
    return h