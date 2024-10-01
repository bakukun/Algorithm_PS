from collections import deque, defaultdict

def solution(land):
    n = len(land)
    m = len(land[0])
    components = [[-1]*m for _ in range(n)]
    component_sizes = []
    component_columns = []
    component_id = 0
    dxs = [1, 0, -1, 0]
    dys = [0, 1, 0, -1]
    
    # Step 1: 연결된 석유 덩어리 찾기
    for i in range(n):
        for j in range(m):
            if land[i][j] == 1 and components[i][j] == -1:
                size = 0
                columns = set()
                q = deque()
                q.append((i, j))
                components[i][j] = component_id
                while q:
                    x, y = q.popleft()
                    size += 1
                    columns.add(y)
                    for dx, dy in zip(dxs, dys):
                        nx = x + dx
                        ny = y + dy
                        if 0 <= nx < n and 0 <= ny < m:
                            if land[nx][ny] == 1 and components[nx][ny] == -1:
                                components[nx][ny] = component_id
                                q.append((nx, ny))
                component_sizes.append(size)
                component_columns.append(columns)
                component_id += 1
    
    # Step 2: 각 열에 대해 얻을 수 있는 석유량 계산
    column_to_components = [set() for _ in range(m)]
    for idx, cols in enumerate(component_columns):
        for col in cols:
            column_to_components[col].add(idx)
    
    max_oil = 0
    for col in range(m):
        total = 0
        for idx in column_to_components[col]:
            total += component_sizes[idx]
        max_oil = max(max_oil, total)
    
    return max_oil
