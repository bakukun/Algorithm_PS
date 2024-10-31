def hanoi(n,start,finish,tmp,answer):
    if n == 0: return
    hanoi(n-1,start,tmp,finish,answer)
    answer.append([start,finish])
    hanoi(n-1,tmp,finish,start,answer)

def solution(n):
    answer = []
    hanoi(n,1,3,2,answer)

    
    
    
    return answer