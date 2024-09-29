'''
def is_pair(s):
    i = 0
    while(i < 26):
        tmp = chr(i+97) * 2
        
        if (s.find(tmp) != -1):
            s = s.replace(tmp,"")
            i = 0
            if(not s):
                return 1
            continue
        i += 1
        
    return 0
'''

from collections import deque

def solution(s):
    stack = deque()
    
    for i in s:
        if (not stack):
            stack.append(i)
            continue
            
            
        tmp = stack[-1] 
        if(tmp != i):
            stack.append(i)
        else:
            stack.pop()
    if len(stack) > 0:
        return 0
    else:
        return 1
