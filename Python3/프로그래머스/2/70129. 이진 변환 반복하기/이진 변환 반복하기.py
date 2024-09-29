def solution(s):
    n = 120
    #10진수 -> n진수
    b = format(n,'b') #2진수
    o = format(n,'o') #8진수
    x = format(n,'x') #16진수
    print(b,o,x)
    #n진수 -> 10진수
    b = int(b, 2)
    o = int(o, 8)
    x = int(x, 16)
    print(b,o,x)
    return 
