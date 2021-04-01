from math import sqrt
from itertools import count, islice


def is_prime(n)
    return n > 1 and all(n % i for i in islice(count(2), int(sqrt(n) - 1)))


while True:
    while True:
        number = float(input("Input Your Number: "))
        if number == 0.0:
            exit()
        if len(str(number)) <= 12:
            break

    floatPrime = 0
    for i in [10, 100, 1000]:
        if is_prime(int(number * i)):
            floatPrime = 1
            break

    if floatPrime == 1:
        print("TRUE")
    else:
        print("FALSE")