def lcm(a,b):
    for i in range(max(a,b),a*b+1):
        if (i % a == 0 and i % b == 0):
            return i

def solution(arr):
    
    if (len(arr) == 1):
        return arr[0]
    
    else:
        length = len(arr) - 1
        tmp = lcm(arr[0],arr[1])
        
        for i in range(1,length+1):
            if (i > 0):
                tmp = lcm(tmp,arr[i])

        return tmp