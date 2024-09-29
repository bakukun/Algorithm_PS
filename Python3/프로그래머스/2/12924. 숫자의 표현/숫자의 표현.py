def solution(n):
    answer = 0
    start , end = 1 , 1
    current_sum = 0
    arr = list(range(1,n+1))
    while start <= n:
        if current_sum < n:
            current_sum += end
            end += 1
            
        elif current_sum > n:
            current_sum -= start
            start += 1
            
        else:
            answer += 1
            current_sum -= start
            start += 1
         
    return answer