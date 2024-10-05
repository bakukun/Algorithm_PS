def solution(prices):
    stack = []
    arr = [0] * len(prices)

    for i in range(len(prices)):
        # 현재 가격이 스택에 있는 이전 가격보다 낮을 경우, 스택에서 꺼내고 유지 시간을 업데이트
        while stack and prices[stack[-1]] > prices[i]:
            idx = stack.pop()
            arr[idx] = i - idx

        # 현재 인덱스를 스택에 추가
        stack.append(i)

    # 스택에 남아있는 인덱스들은 끝까지 유지된 것으로 간주하여 처리
    while stack:
        idx = stack.pop()
        arr[idx] = len(prices) - 1 - idx

    return arr
