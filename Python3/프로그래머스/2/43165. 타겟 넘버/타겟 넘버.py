def check(tmp_arr,target):

    return sum(tmp_arr) == target

def solution(numbers, target):
    tmp_arr = []
    answer = 0
    
    def backtracking(depth):
        nonlocal answer
        if depth == len(numbers):
            if(check(tmp_arr,target)):
                answer += 1
            return

        tmp_arr.append(numbers[depth])
        backtracking(depth+1)
        tmp_arr.pop()

        tmp_arr.append(-numbers[depth])
        backtracking(depth+1)
        tmp_arr.pop()
    
        return
    
    backtracking(0) 
    
    return answer