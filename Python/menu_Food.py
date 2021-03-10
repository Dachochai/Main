money = 0
print("เลือกประเภทอาหาร\n1.อาหารจานเดี่ยว\n2.ของหวาน\n3.เครื่องดื่ม\n4.ออกจากโปรแกรม")
menu = int(input("Enter menu: "))
while menu != 4:
    if(menu == 1):
        print("เลือกอาหาร")
        print("1.ก๋วยเตี๋ยวราดหน้า 40\n2.ข้าวหมูแดง 40\n3.ข้าวยำ 40")
        menu2 = int(input("Enter menu: "))
        print("คุณเลือก")
        if(menu2 == 1):
            print("ก๋วยเตี๋ยวราดหน้า")
            money = money+40
        elif(menu2 == 2):
            print("ข้าวหมูแดง")
            money = money+40
        elif(menu2 == 3):
            print("ข้าวยำ")
            money = money+40
    elif(menu == 2):
        print("เลือกของหวาน")
        print("1.เฉาก๋วย 20\n2.รวมมิตร 30")
        menu2 = int(input("Enter menu: "))
        print("คุณเลือก")
        if(menu2 == 1):
            print("เฉาก๋วย")
            money = money+20
        elif(menu2 == 2):
            print("รวมมิตร")
            money = money+30
    elif(menu == 3):
        print("เลือกเครื่องดื่ม")
        print("1.น้ำเปล่า 10\n2.น้ำอัดลม 20")
        menu2 = int(input("Enter menu: "))
        print("คุณเลือก")
        if(menu2 == 1):
            print("น้ำเปล่า")
            money = money+10
        elif(menu2 == 2):
            print("น้ำอัดลม")
            money = money+20
    print("เลือกประเภทอาหาร\n1.อาหารจานเดี่ยว\n2.ของหวาน\n3.เครื่องดื่ม\n4.ออกจากโปรแกรม")
    menu = int(input("Enter menu: "))
print("รวมเงินที่ต้องจ่าย ",money)
    

