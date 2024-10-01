


def solution(video_len, pos, op_start, op_end, commands):
    v_m , v_s = map(int,video_len.split(":"))
    video_len = v_m*60 + v_s
    o_m , o_s = map(int,op_start.split(":"))
    op_start = o_m*60 + o_s
    e_m , e_s = map(int,op_end.split(":"))
    op_end = e_m*60 + e_s
    mm , ss = map(int,pos.split(":"))
    pos = mm*60 + ss
    
    for i in range(len(commands)):
        cmd = commands[i]
        print(pos)
        if (cmd == "next"):
            
            if (op_start <= pos <= op_end):
                pos = op_end
            
            if(pos + 10 > video_len):
                pos = video_len
            
            else:
                pos += 10
                
                if(op_start <= pos <= op_end):
                    pos = op_end
                
        
        elif (cmd == "prev"):
            
            if(pos - 10 < 0):
                pos = 0
                
            
            else:
                pos -= 10
            
            if(op_start <= pos <= op_end):
                    pos = op_end
        
    m = pos // 60
    s = (pos - (m *60)) 
    str_m = str(m)
    str_s = str(s)
    
    if len(str_m) < 2:
        str_m = "0" + str_m
        
    if len(str_s) < 2:
        str_s = "0" + str_s

    return (str_m+":"+str_s)