x=int (input("Enter a number: "))
y=int (input("Enter another number: "))
if(x == y):
    print (x,"is equal to",y)
elif(x == -1*y):
    print (x,"is the negative of",y)
elif(x > y):
    print (x,"is greater than",y)
else:
    print(x,"is less than",y)
