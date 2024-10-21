def solution(picks, minerals):
    
    max_mineral = sum(picks) * 5
    
    if (len(minerals) > max_mineral):
        minerals = minerals[:max_mineral]
    
    idx = len(minerals)//5 if len(minerals)%5 == 0 else len(minerals)//5+1
    
    mineral_index = [[0,0,0] for _ in range(idx)]
    
    for j in range(len(minerals)):
        if (minerals[j] == 'diamond'):
            mineral_index[j//5][0] += 1
        elif (minerals[j] == 'iron'):
            mineral_index[j//5][1] += 1    
        elif (minerals[j] == 'stone'):
            mineral_index[j//5][2] += 1   
    
    mineral_index.sort(key=lambda x: (-x[0], -x[1], -x[2]))
    
    ans = 0
    
    for index in range(len(mineral_index)):

        if picks[0] > 0:
            picks[0] -= 1
            ans += sum(mineral_index[index]) 
        
        elif picks[1] > 0:
            picks[1] -= 1
            ans += (mineral_index[index][0] * 5 + mineral_index[index][1] + mineral_index[index][2])
        
        elif picks[2] > 0:
            picks[2] -= 1
            ans += (mineral_index[index][0] * 25 + mineral_index[index][1] * 5+ mineral_index[index][2])
        
    return ans
    

    
