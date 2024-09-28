from collections import deque

def solution(s):
    answer = True
    stack = deque()
    for i in s:
        if i == "(":
            stack.append('(')
        else:
            try:
                stack.pop()
            except IndexError:
                return False
    if len(stack) > 0:
        return False
    else:
        return True