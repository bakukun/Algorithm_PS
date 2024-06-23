def solution(survey, choices):
    MBTI = ""
    dic = count(survey, choices)
    keys = list(dic.keys())

    for i in range(0,7,2):
        if (dic[keys[i]] == dic[keys[i+1]]):
            MBTI += keys[i]
        elif (dic[keys[i]] < dic[keys[i+1]]):
            MBTI += keys[i+1]
        else:
            MBTI += keys[i]

    return MBTI




def count(survey, choices):
    dic = {'R': 0, 'T': 0, 'C': 0, 'F': 0, 'J': 0, 'M': 0, 'A': 0, 'N': 0}
    for i in range(len(survey)):
        score = choices[i] - 4
        if score > 0:
            dic[survey[i][1]] += score
        elif score < 0:
            dic[survey[i][0]] -= score
    
    return dic