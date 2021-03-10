print("1.อาหารจานเดี่ยว\n2.ของหวาน\n3.เครื่องดื่ม")
menu = int(input("Enter menu: "))
if(menu == 1):
    print("เลือกอาหาร")
    print("1.ก๋วยเตี๋ยวราดหน้า\n2.ข้าวหมูแดง\n3.ข้าวยำ")
    menu2 = int(input("Enter menu: "))
    print("คุณเลือก")
    if(menu2 == 1):
        print("ก๋วยเตี๋ยวราดหน้า")
    elif(menu2 == 2):
        print("ข้าวหมูแดง")
    elif(menu2 == 3):
        print("ข้าวยำ")
elif(menu == 2):
    print("เลือกของหวาน")
    print("1.เฉาก๋วย\n2.รวมมิตร")
    menu2 = int(input("Enter menu: "))
    print("คุณเลือก")
    if(menu2 == 1):
        print("เฉาก๋วย")
    elif(menu2 == 2):
        print("รวมมิตร")
elif(menu == 3):
    print("เลือกเครื่องดื่ม")
    print("1.น้ำเปล่า\n2.น้ำอัดลม")
    menu2 = int(input("Enter menu: "))
    print("คุณเลือก")
    if(menu2 == 1):
        print("น้ำเปล่า")
    elif(menu2 == 2):
        print("น้ำอัดลม")
