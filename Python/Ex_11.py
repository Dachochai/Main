t=str(input("input c if you want to calculate the area of a circle , othera for square: "))
if(t=="C" or t=="c"):
    radius=float(input("input radius: "))
    pi=3.14159
    area=pi*radius*radius
    print("Area ", area)
else:
    side=float(input("input side: "))
    side=side*side
    print("Area ", side)
