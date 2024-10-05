from collections import deque

def is_same(A,B):
    cnt = 0
    for a,b in zip(A,B):
        if (a != b):
            cnt +=1 
        if(cnt > 1):
            return False
    return cnt == 1


def solution(begin, target, words): 
    if target not in words:
        return 0
    
    n = len(begin)
    visited = [0] * len(words)
    q = deque([begin])
    cnt = 0
    
    while(q):
        cnt += 1
        for _ in range(len(q)):
            tmp = "".join(q.popleft())
            for i in range(len(words)):
                if(is_same(tmp,words[i]) and visited[i] == 0):
                    visited[i] = cnt 
                    q.append(words[i])

    return visited[words.index(target)]

    
