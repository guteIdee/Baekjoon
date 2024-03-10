def solution(a, d, included):
    answer = 0
    tmp = []
    
    for i in range(len(included)):
        tmp.append(a + (d * i))
        
    for idx, val in enumerate(included):
        if val:
            answer += tmp[idx]
    
    return answer