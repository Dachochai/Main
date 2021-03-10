#BMI
weight = float(input('input weight in kg: '))
height = float(input('input height in cm: '))
height = height/100
BMI = weight/(height*height)
print('weight = ',weight,'kg',',','height = ',height,'m',',','BMI = ',BMI )
