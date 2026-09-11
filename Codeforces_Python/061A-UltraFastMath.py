msg1 = input()
msg2 = input()
count = 0
length = len(msg1)
result = ''
if len(msg1) == len(msg2):
    while count < length:
        if msg1[count] == msg2[count]:
            result += '0'
        else:
            result += '1'
        count += 1
print(result)
