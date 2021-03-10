x_str = input('enter a number: ')
x_int = int(x_str)
y_str = input('enter b number: ')
y_int = int(x_str)
z_str = input('enter c number: ')
z_int = int(x_str)
a_str = input('enter d number: ')
a_int = int(x_str)
'''Max = 0
if(x_str > y_str):
    Max = x_str
else:
    Max = y_str
if(z_str > Max):
    Max = z_str
if(a_str > Max):
    Max = a_str
print(Max)'''

Max = x_str
if(Max < y_str):
    Max = y_str
if(Max < z_str):
    Max = z_str
if(Max < a_str):
    Max = a_str
print(Max)


    

