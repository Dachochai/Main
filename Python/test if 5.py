day = int(input("Enter day: "))
month = int(input("Enter month1-12: "))
if(1 <= month and month <= 12):
    if(month == 2):
        lastDay = 28
    else:
        if(month == 4 or month == 6 or month == 9 or month == 11):
            lastDay = 30
        else:
            lastDay = 31

    if(1 <= day and day <= lastDay):
        dayLeft = lastDay - day
        print(dayLeft)
    else:
        print("Bad day")
else:
    print("Bad month")
