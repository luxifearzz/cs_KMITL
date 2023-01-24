import random
import functools

_PRIME = 1999
_RINT = functools.partial(random.SystemRandom().randint, 0)

def _eval_at(poly, x, prime):
    """Evaluates polynomial (coefficient tuple) at x, used to generate a
    shamir pool in make_random_shares below.
    """
    accum = 0
    for coeff in reversed(poly):
        accum *= x
        accum += coeff
        accum %= prime
    return accum

def make_random_shares(secret, minimum, shares, prime=_PRIME):
    """
    Generates a random shamir pool for a given secret, returns share points.
    """
    if minimum > shares:
        raise ValueError("Pool secret would be irrecoverable.")
    poly = [secret] + [_RINT(prime - 1) for i in range(minimum - 1)]
    points = [(i, _eval_at(poly, i, prime)) for i in range(1, shares + 1)]
    return points, poly
    
def main():
    """Main function"""
    # secret = 1234
    print("secret musn't be greater than or equal to prime(1999)")
    secret = int(input("input secret: "))
    minimum = int(input("input minimum: "))
    shares = int(input("input shares: "))

    shares, poly = make_random_shares(secret, minimum, shares)
    print('Shares:')
    if shares:
        for share in shares:
            print('  ', share)
    print("polynomial =", poly)

if __name__ == '__main__':
    main()