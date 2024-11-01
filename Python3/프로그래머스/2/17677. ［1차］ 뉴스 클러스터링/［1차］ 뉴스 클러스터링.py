from collections import Counter

def solution(str1, str2):
    
    str1_tmp = []
    str2_tmp = []
    
    for i in range(len(str1)-1):
        tmp_str = str1[i:i+2].upper()
        if (65 <= ord(tmp_str[0]) <= 90 and 65 <= ord(tmp_str[1]) <= 90):
            str1_tmp.append(tmp_str)
                
    for i in range(len(str2)-1):
        tmp_str = str2[i:i+2].upper()
        if (65 <= ord(tmp_str[0]) <= 90 and 65 <= ord(tmp_str[1]) <= 90):
            str2_tmp.append(tmp_str)
                
    inter_set = []
    union_set = []
    
    one = Counter(str1_tmp)
    two = Counter(str2_tmp)
    ans = 0

    for i in one.keys():
        if i in two.keys():
            cnt = min(one[i],two[i])
            print(i,cnt)
            for _ in range(cnt):
                inter_set.append(i)
    
    
    for i in one.keys():
        if i in two.keys():
            cnt = max(one[i],two[i])
            print(i,cnt)
            for _ in range(cnt):
                union_set.append(i)
        else:
            for _ in range(one[i]):
                union_set.append(i)
    
    for i in two.keys():
        if i not in one.keys():
            for _ in range(two[i]):
                union_set.append(i)
    
    n = len(inter_set)
    m = len(union_set)
    
    if (m > 0):
        ans = n / m * 65536
    elif (n == 0 and m == 0):
        ans = 65536
        
    return int(ans)

  

