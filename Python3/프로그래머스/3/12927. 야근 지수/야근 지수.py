def solution(n, works):
    works.sort(reverse=True)
    while n > 0:
        if sum(works) == 0:
            return 0
        
        max_work = works[0]
        for i in range(len(works)):
            if works[i] == max_work:
                works[i] -= 1
                n -= 1
                if n == 0:
                    break
            else:
                break
        works.sort(reverse=True)
    
    return sum(w ** 2 for w in works if w > 0)
