def solution(n, lost, reserve):
    s = set(lost) & set(reserve)
    l = set(lost) - s  # 체육복을 빌려야 하는 학생들
    r = set(reserve) - s # 체육복을 빌려줄 수 있는 학생들
    for x in sorted(r):
        if x - 1 in l:
            l.remove(x - 1)
        elif x + 1 in l:
            l.remove(x + 1)
    return n - len(l)