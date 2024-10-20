from collections import Counter

def solution(topping):
    ans = 0
    prev = set()
    back = Counter(topping)
    
    for i in topping:
        back[i] -= 1
        if(back[i] == 0):
            del back[i]
        prev.add(i)
        
        if(len(back)==len(prev)):
            ans +=1

    


    return ans