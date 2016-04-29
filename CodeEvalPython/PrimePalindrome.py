# function for checking if number is prime
def isPrime(number):
	for x in range(2, int(number/2)):
		if number % x == 0:
			return False
	return True
# function for checking if number is palindrome
def isPalindrome(number):
	number = str(number)
	for x in range(int(len(number)/2)):
		if number[x] != number[len(number) - 1 - x]:
			return False
	return True
# function for printing largest prime palindrome in a given range
def highestPrimePalindrome(howMany):
	highestPossible = 0
	for x in range(howMany):
		if isPrime(x) and isPalindrome(x):
			highestPossible = x
	print(highestPossible)
# check from 0 to 1000 for highest possible prime palindrome
highestPrimePalindrome(1000)