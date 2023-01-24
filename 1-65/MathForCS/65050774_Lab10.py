import math

def SieveOfEratosthenes(n, isPrime) :
	isPrime[0], isPrime[1] = False, False
	for i in range(2, n + 1) :
		isPrime[i] = True
	for p in range(2, int(math.sqrt(n)) + 1) :
		if isPrime[p] == True :
			for i in range(p * 2, n + 1, p) :
				isPrime[i] = False

def findPrimePair(n) :
	flag = 0
	isPrime = [False] * (n + 1)
	SieveOfEratosthenes(n, isPrime)
	for i in range(2, n) :
		x = int(n / i)
		if (isPrime[i] & isPrime[x] and
			x != i and x * i == n) :
			return i, x

def mod_inverse(a, m):
    for x in range(1, m):
        if (a * x) % m == 1:
            return x
    return -1

def decode(b, exp, m):
		res = 1
		while exp > 1:
			if exp & 1:
				res = (res * b) % m
			b = b ** 2 % m
			exp >>= 1
		return (b * res) % m

# E = a, D = b, phi = phi --> given n, E
n = 3233
E = 17
Cypher = [ 3023, 3031, 3061, 2549, 0, 1211 ]

decoding_list = list()

p, q = findPrimePair(n)
phi = (p-1) * (q-1)
D = mod_inverse(E, phi)
print(p, q, D)

for element in Cypher :
	decoding_list.append(decode(element, D, n))
# print(decoding_list)

# print(''.join(chr(i) for i in decoding_list))
print(decoding_list)