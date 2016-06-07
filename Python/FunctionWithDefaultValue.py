class OptionalParameters:               # class
    def testOptional(self, a, b = 0):
        print(a, b)
    def __init__(self):
        self.testOptional(2, 5)
        self.testOptional(2)
OptionalParameters()
# ili
def testOptional1(a, b = 0):            # func
    print(a, b)
testOptional1(2, 5)
testOptional1(2)