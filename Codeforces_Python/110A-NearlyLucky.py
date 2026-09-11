n = input()
counter = 0
for digit in n:
    if digit == '4' or digit == '7':
        counter += 1
if counter == 7 or counter == 4:
    print('YES')
else:
    print('NO')
