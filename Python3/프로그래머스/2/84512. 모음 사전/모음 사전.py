from itertools import product

def solution(word):
    
    arr = ['A','E','I','O','U']
    word_list = []
    for i in range(6):
        for j in product( arr , repeat = i):
            word_list.append("".join(j))
    word_list = list(set(word_list))
    word_list.sort()

    answer = word_list.index(word)

    return answer 