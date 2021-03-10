done = True
while done:
    decStr = input("Input num: ")
    if decStr.isdigit():
        done = False

dec = int(decStr)
print("decimal to binary",bin(dec))
print("decimal to oct",oct(dec))
print("decimal to hex",hex(dec))
