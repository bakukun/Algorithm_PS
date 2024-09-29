def solution(brown, yellow):
    size = brown + yellow
    # 어차피 n은 1500 안쪽
    # 12 => 1,12 / 2,6 / 3,4
    # fair 짝으로 엮고 완탐 (자기 자신과 1은 안됨)
    # 해봤자 격자는 1500 ^ 2 안쪽
    for i in range(2,2000):
        for j in range(i,2000):
            if(i*j == size):
                tmp = (2*j+2*i) - 4
                if ( tmp == brown and size == yellow + tmp):
                    return [j,i]
                
            
