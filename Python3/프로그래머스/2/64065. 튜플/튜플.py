from collections import deque

def solution(s):
    stack = []
    tmp_stack = []
    tmp = ''
    for i in range(1,len(s)-1):

        if (s[i] == '}'):
            if(len(tmp) > 0 and len(tmp_stack) == 0):
                stack.append([int(tmp)])
                tmp = ''
            else:
                tmp_stack.append(int(tmp))
                stack.append(tmp_stack)
            tmp_stack = []

        elif (s[i] == ','):
            if(len(tmp) > 0):
                tmp_stack.append(int(tmp))
                tmp = '' 
        elif (48<= ord(s[i])<= 57):
            tmp += s[i]
            
        elif (s[i] == '{'):
            tmp_stack = []

    stack.sort(key = lambda x: len(x))
    
    answer = []
    real_stack = []
    real_stack.append(stack[0][0])

    
    for i in range(len(stack)):
        for j in range(len(stack[i])):
            if (stack[i][j] not in real_stack):
                real_stack.append(stack[i][j])
                break

    return real_stack

    