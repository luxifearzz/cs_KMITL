import math

def checkPrime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n%i==0:
            return False
    return True

N = int(input())
for _ in range(N):
    ans = ""
    x = [int(i) for i in input().split()]
    for i in range(x[0], x[1]+1):
        if checkPrime(i):
            ans += str(i)
    for element in ans:
        print(element)
    print()