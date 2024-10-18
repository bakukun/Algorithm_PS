from collections import deque

def solution(cacheSize, cities):
    cash = deque()
    sec = 0
    
    for city in cities:
        city = city.upper()
        
        if (city in cash):
            cash.remove(city)
            #print(cash)
            cash.append(city)
            sec += 1
            continue
            
        if (len(cash) >= cacheSize and cacheSize > 0):
            cash.popleft()
        if (cacheSize > 0):
            cash.append(city)
        sec += 5
    
    return sec