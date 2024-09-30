from itertools import permutations

def solution(numbers):
    numbers = list(numbers)
    arr =[]
    for i in range(0,len(numbers)+1):
        for j in permutations(numbers, i+1):
            arr.append(int(''.join(j)))
    
    arr = list(set(arr))
    answer = 0
    
    for i in arr:
        is_answer = True
        if (i > 1):
            for j in range(2,i):
                if i % j == 0:
                    is_answer = False
                    break
            if(is_answer):
                answer += 1

        
    return answer