def DectoBin(dec):
    binStr=''
    while(dec>0):
        binStr=str(dec%2)+binStr
        dec=dec//2
    return binStr
print("Program convert number")
print("======================")
num=int(input("Enter decimal number: "))
print("Binary of ",num,"is ",DectoBin(num))
