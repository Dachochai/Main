total=0
odd=0
even=0
done=True
while done:
    value = input("input number: ")
    num = int(value)
    if(num==0):
        done=False
    else:
        total+=1
        if(num%2==0):
            even+=1
        else:
            odd+=1
print("input number = ",total)
print("even number = ",even)
print("odd number = ",odd)
