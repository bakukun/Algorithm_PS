import heapq

def solution(scoville, K):
    
    heapq.heapify(scoville)
    summ = 0
    
    while(scoville[0] < K):
        if(len(scoville) == 1):
            return -1
        one = heapq.heappop(scoville)
        two = heapq.heappop(scoville)
        heapq.heappush(scoville,one + two*2)
        summ +=1
            
        

    return summ