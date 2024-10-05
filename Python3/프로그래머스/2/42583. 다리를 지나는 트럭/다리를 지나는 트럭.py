from collections import deque


def solution(bridge_length, weight, truck_weights):
    
    trucks = [[i, bridge_length] for i in truck_weights]
    finishs = [[i, 0] for i in truck_weights]
    st = deque(trucks)
    bridge = deque()
    time = 0

    while (True):
        maxi = 0
        if (bridge and bridge[0][1] == 0):
            bridge.popleft()

        while (st):
            truck = st[0]
                 
            maxi += sum(item[0] for item in bridge) if bridge else 0
        
            if (len(bridge) == 0 or maxi + truck[0] <= weight):
                truck = st.popleft()
                bridge.append(truck)
                
            else:
                break

        for i in range(len(bridge)):
            if bridge[i][1] > 0:
                bridge[i][1] -= 1

        time += 1

        if(len(bridge) == 0):
            break  
            
    return time

