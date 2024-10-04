def solution(number, k):
    num = list(map(int,number))
    n = len(num) - k
    stack = []
    tmp_stack=[]
    stack.append(num[0])
    num.pop(0)
    
    if(len(set(num)) == 1):
        return str(num[0]) * (len(num) - k + 1)

    for i in range(len(num)):
        while(len(stack) > 0 and stack[-1] < num[i] and k > len(tmp_stack)):
            tmp_stack.append(stack[-1])
            stack.pop()
        stack.append(num[i])
    
    stack = list(map(str,stack))
    if (len(stack) != n):
        stack.pop()

    return "".join(stack)
