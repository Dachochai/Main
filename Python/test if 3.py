x_str = input("input your toket number: ")
x_int = int(x_str)

if(45 <= x_int and x_int <= 55):
    print("you got first prizel")
elif((15 <= x_int and x_int <= 30) or (75 <= x_int and x_int <= 90)):
    print("you got second prize")
else:
        print("sory you did not get any prize")
