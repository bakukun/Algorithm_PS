def solution(sequence, k):
    answer = []
    start = 0
    end = 0
    add = 0

    while start < len(sequence):
        if add == k:
            answer.append([start, end - 1])
            add -= sequence[start]
            start += 1
        elif add > k:
            add -= sequence[start]
            start += 1
        elif end < len(sequence):
            add += sequence[end]
            end += 1
        else:
            break
    
    answer.sort(key=lambda x: (x[1] - x[0], x[0]))

    return answer[0]