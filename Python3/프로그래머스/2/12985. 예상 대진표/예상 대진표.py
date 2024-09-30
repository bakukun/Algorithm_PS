def check(a,b):
    if (b == a+1 or a == b+1) and ( (a+b) % 4 == 3):
        print((a+b) % 4,a,b)
        return False
    return True


def solution(n,a,b):
    
    answer = 0
    while check(a,b):
        a = (a+1) // 2
        b = (b+1) // 2
        print((a+b) % 4,a,b)
        answer +=1

        

    
    return answer +1