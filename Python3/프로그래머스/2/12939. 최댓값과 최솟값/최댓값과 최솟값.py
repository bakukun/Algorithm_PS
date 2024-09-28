def solution(s):
    arr = list(map(int,s.split()))
    maximum = max(arr)
    minimum = min(arr)
    
    answer = str(minimum) +" "+ str(maximum)
    return answer