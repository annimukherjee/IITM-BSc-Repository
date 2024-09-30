# def updateDict(d):
#     d["rollno"] = 12
# Dict = {"name" : "John", "Age" : 21}
# updateDict(Dict)
# print(Dict)

# def elementSum(n):
#      sum = 0
#      while (n != 0):
#            sum = sum + n % 10
#            n = n // 10
#      return sum
# num = 22
# x = elementSum(num)
# print(x)

# i = 42
# def f():
#    j = i+10
# print(i)
# f()
# print(j)

class Demo:
    def __init__(self,str):
            self.name = str
    def print_Demo(self):
            print(self.name)

obj1 = Demo("IITM")
obj2 = Demo("Java")
obj1.print_Demo()
obj2.print_Demo()