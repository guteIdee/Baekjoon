def solution(number, k):
    st = []
    for n in number:
        while st and k > 0 and st[-1] < n:
            st.pop()
            k -= 1
        st.append(n)
    return ''.join(st[:len(number)-k])