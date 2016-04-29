# function for checking if number is prime
def isPrime(number):
    for x in range(2, int(number/2)+1):
        if number % x == 0:
            return False
    return True
# function for printing sum of first "howMany" primes
def printSumOfPrimes(howMany):
    sumOfAll = 0
    primesCount = 0;
    i = 2;
    while primesCount != howMany:
        if isPrime(i):
            sumOfAll += i
            primesCount += 1
        i += 1
        
    print(sumOfAll)
# print sum of first 1000 primes
printSumOfPrimes(1000)