def solution(progresses, speeds):
    progresses = list(reversed(progresses))
    speeds = list(reversed(speeds))
    answer = []
    
    cnt = 0
    
    while (len(progresses) > 0):
        for i in range(len(progresses)):
            progresses[i] += speeds[i]
        while(len(progresses) > 0 and progresses[-1] >= 100):
            cnt += 1
            progresses.pop()
        if(cnt > 0):
            answer.append(cnt)
            cnt = 0

    
    return answer