def findMiddle(arr):
    q = arr.copy()
    q.sort()
    return q[k]

def toTernaryList(num):
    x, y = divmod(num, 3)
    l.append(y)
    while x > 2:
        x, y = divmod(x, 3)
        l.append(y)
    l.append(x)
    while len(l)<n:
        l.append(0)

k = int(input())
n = 2*k+1
allCase = 3**n
midCnt = 0
p = [0] * n

for i in range(allCase):
    l = list()
    toTernaryList(i)
    # print(l)
    if findMiddle(l)==1:
        # print(l)
        midCnt+=1

print("number of cases is :", allCase)
print("The probability that the sample median is the median value of the data is :", midCnt, "/", allCase)