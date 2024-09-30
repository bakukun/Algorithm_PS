def solution(elements):
    ans = set(elements)
    ans.add(sum(elements))
    length = len(elements)
    elements *= 2
    
    for i in range(2,length):
        for j in range(length):
            ans.add(sum(elements[j:j+i]))

    return len(ans)