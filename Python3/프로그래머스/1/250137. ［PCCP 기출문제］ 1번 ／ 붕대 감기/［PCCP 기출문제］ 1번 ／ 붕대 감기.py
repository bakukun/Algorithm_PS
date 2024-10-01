def solution(bandage, health, attacks):
    time = bandage[0]
    recover = bandage[1]
    add_recover = bandage[2]
    max_attacks = max(attacks)
    max_time = max_attacks[0]
    current_health = health
    
    health_cnt = 0

    for i in range(1,max_time+1):
        
        check = False
        
        for j in range(len(attacks)):            
            if (i == attacks[j][0]):
                current_health -= attacks[j][1]
                if current_health <=0:
                    return -1
                health_cnt = 0
                check = True
                break
                
                              
        if (not check):
            health_cnt += 1
            current_health = min(health,current_health+recover) 
            if (health_cnt == time):
                current_health = min(health,current_health+add_recover)
                health_cnt = 0
    answer = 0
    return current_health