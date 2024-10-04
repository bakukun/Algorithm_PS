def solution(name):
    
    answer = 0
    n = len(name)
    visited = [False] * n
    n_list = [0] * n
    min_move = 0
    
    left_A = 0
    right_A = 0

    
    for i in range(n):
        tmp = ord(name[i]) - 65
        if (tmp > 13):
            n_list[i] = 26 - tmp
        else:
            n_list[i] = tmp
    
    print(n_list)

    # 2. 커서 이동 최소 횟수 계산
    min_move = n - 1  # 기본적으로 오른쪽으로 쭉 가는 경우를 초기값으로 설정

    for start in range(n):
        next_position = start + 1  # 다음 위치 초기화

        # 연속된 'A' 구간의 끝을 찾기
        while next_position < n and name[next_position] == 'A':
            next_position += 1

        # start에서 연속된 A 구간을 건너뛰고 남은 거리 + 뒤로 돌아가서 이동하는 거리
        # 1) 왼쪽으로 돌아가는 경우
        distance = 2 * start + n - next_position
        # 2) 오른쪽으로 계속 이동하는 경우
        reverse_distance = 2 * (n - next_position) + start

        # 최소 이동 거리 업데이트
        min_move = min(min_move, distance, reverse_distance)

    # 알파벳 변경 횟수 + 최소 커서 이동 횟수 반환
    return sum(n_list) + min_move
        

            
        
        
    