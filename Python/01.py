msglist = [
num_msg = int(input("Input Your Massage Number: "))
for i in range(num_msg):
    text_init = ""
    msg = input("Your Message: ")
    msg_text = msg.split(" ")

    for j in msg_text:
        if j[0].isupper():
            text_init += j[0]
    msglist.append(text_init)

msglist.sort(key=lambda i: (-len(i), i))

for k in msglist:
    print(k)