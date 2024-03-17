import math
import sys

def main():
    prime_list = [False, False] + [True] * 1000

    for i in range(2, int(math.sqrt(1000)) + 1):
        if prime_list[i]:
            for j in range(i * i, 1001, i):
                prime_list[j] = False

    N = int(sys.stdin.readline().strip())
    numbers = list(map(int, sys.stdin.readline().split()))
    cnt = 0
    for x in numbers:
        if prime_list[x]:
            cnt += 1

    print(cnt)

if __name__ == "__main__":
    main()
