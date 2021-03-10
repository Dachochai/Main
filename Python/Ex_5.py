weight=(float(input("Input weight in kg: ")))
height=(int(input("Input height in cm: ")))
height2=height/100
BMI=weight/(height2*height2)
print("Weight = ", weight, "kg", "Height = ", height, "cm", "BMI = ", BMI)
