import sys

def printFizzBuzz(argumentOne, argumentTwo, howMany):
    for i in range(1, int(howMany+1)):
        printString = "";
        if i % argumentOne == 0:
            printString += "F";
        if i % argumentTwo == 0:
            printString += "B";
        if i % argumentOne != 0 and i % argumentTwo != 0:
            printString += str(i); 
        print(printString + " ", end='')
    print()
with open(sys.argv[1], 'r') as test_cases:
    for test in test_cases:
        test = test.split()
        printFizzBuzz(int(test[0]), int(test[1]), int(test[2]))