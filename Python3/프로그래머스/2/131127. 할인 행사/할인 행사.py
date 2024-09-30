from collections import Counter

def solution(want, number, discount):
    ans = 0
    arr = []
    for i in range(len(want)):
        for j in range(number[i]):
            arr.append(want[i])
    arr.sort()
    all_sum = sum(number)
    
    for i in range(len(discount)-all_sum+1):
        tmp = discount[i:all_sum+i]
        #print(i, "before tmp: ", tmp)
        tmp.sort()
        #print("arr: ", arr)
        

        if (arr == tmp):
            ans += 1
        #print(ans)       
    return ans
        