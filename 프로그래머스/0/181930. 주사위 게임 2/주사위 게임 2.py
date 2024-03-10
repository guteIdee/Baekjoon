def solution(a, b, c):
    if a != b and b != c and a != c:
        return a + b + c
    elif (a == b and b != c) or (a == c and a != b) or (b == c and a != b):
        return (a + b + c) * (a * a + b * b + c * c)
    else:
        return (a + b + c) * (a * a + b * b + c * c) * (a ** 3 + b ** 3 + c ** 3)