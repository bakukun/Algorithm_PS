from collections import deque


def solution(bridge_length, weight, truck_weights):
    
    trucks = [[i, bridge_length] for i in truck_weights]
    st = deque(trucks)
    bridge = deque()
    time = 0
    current_weight = 0

    while st or bridge:
        time += 1
        maxi = 0
        
        if (bridge and bridge[0][1] == 0):
            truck_weight , _ = bridge.popleft()
            current_weight -= truck_weight


        if (st and current_weight + st[0][0] <= weight):
            
            truck = st.popleft()
            current_weight += truck[0]
            bridge.append(truck)
                

        for i in range(len(bridge)):
            if bridge[i][1] > 0:
                bridge[i][1] -= 1


            
    return time

