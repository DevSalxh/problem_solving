msg = input()
upperCount = 0
for letter in msg:
    if letter.isupper():
        upperCount += 1
if upperCount > (len(msg)/2):
    print(msg.upper())
else:
    print(msg.lower())