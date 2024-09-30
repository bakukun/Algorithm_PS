def solution(citations):
    
    n = len(citations)
    citations.sort()
    h = 0
    for i in range(n):
        print(i,citations[i],n-i)
        if (citations[i] >= n-i):
            h = max(h,n-i)
            print("in",h)
    
    return h