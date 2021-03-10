length=int(input("Enter length: "))
width=int(input("Enter width:" ))
height=int(input("Enter height: "))

print("length", length)
print("width", width)
print("height", height)

#menu
print("Menu")
print("F= Floor Area")
print("W= Wall Area")
print("V= Voulme Area")
print("A= Total Area")
print("Q= Quit")

option=input("Enter Choice: ")
if(option=="F"):
    area=length*width
    print("Floor Area = ", area)
else:
    if(option=="W"):
        wall=2*height*(length+width)
        print("Wall Area = ", wall)
    else:
        if(option=="V"):
            volume=height*width*length
            print("Wall Area = ", volume)
        else:
            if(option=="A"):
                total=(2*height*(length+width))+(2*length*width)
                print("Wall Area = ", total)
            else:
                if(option=="Q"):
                    print("Exit Program")
                else:
                    print("Choice Error")
        
