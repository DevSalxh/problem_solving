from math import ceil
first,second,third = map(int,input().split())
x = ceil(first/third)
y = ceil(second/third)
print(int(x*y))