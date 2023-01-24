def FastModularExponentiation(b, k, m):
    b %= m
    for _ in range(k):
        b = b ** 2 % m
    return b

def fast_mod_exp(b, exp, m):
    res = 1
    while exp > 1:
        if exp & 1:
            res = (res * b) % m
        b = b ** 2 % m
        exp >>= 1
    return (b * res) % m

x = 130

y = (x ** 47) % 221
z = FastModularExponentiation(x, 47, 221)
a = fast_mod_exp(x, 47, 221)

print(y)
print(z)
print(a)

print(9**0.5)