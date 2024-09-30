def solution(answers):
    arr_1 = [1,2,3,4,5]
    arr_2 = [2, 1, 2, 3, 2, 4, 2, 5]
    arr_3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    answer = [0,0,0]
    
    for i in range(len(answers)):
        if (arr_1[i%5] == answers[i]):
            answer[0] += 1
        if (arr_2[i%8] == answers[i]):
            answer[1] += 1            
        if (arr_3[i%10] == answers[i]):
            answer[2] += 1        

    a_b = max(answer[0],answer[1])
    a_b_c = max(a_b,answer[2])
    tmp = []
    for i in range(3):
        if (a_b_c == answer[i]):
            tmp.append(i+1)
    


    return tmp