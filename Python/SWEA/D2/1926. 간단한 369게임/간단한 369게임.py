n = int(input())
num_list = ["3","6","9"]
for i in range(1,n+1):
    tmp = str(i)
    is_369 = 0
    for k in tmp:
        for num in num_list:
            #print(tmp,k,num,is_369)
            if k == num:
                is_369 += 1        
    if is_369 > 0:
        for is369 in range(is_369):
            print("-",end="")
        print(end=" ")
    if (is_369 == 0):
        print(tmp,end=" ")
                
