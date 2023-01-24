def checkInList(x):
    if p[n-1] == 3:
        return
    if p[x] == 3:
        p[x+1] += 1
        p[x] = 0
        checkInList(x+1)

def findMiddle(arr):
    q = arr.copy()
    q.sort()
    return q[k]

k = int(input())
n = 2*k + 1
p = [0] * n
numCase = 3**n
cnt = 0

for i in range(numCase):
    checkInList(0)
    # print(p)
    if findMiddle(p) == 1:
        cnt += 1
    p[0] += 1

print("number of cases is :", numCase)
print("The probability that the sample median is the median value of the data is :", cnt, "/", numCase)