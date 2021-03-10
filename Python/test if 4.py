car = int(input("Enter Car: "))
speed = int(input("Enter Speed: "))
if(car <= 5):
    if(speed <= 90):
        print("safe")
    else:
        print("carful")
else:
    if(speed <= 60):
        print("safe")
    else:
        print("carful")
    
