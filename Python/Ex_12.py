a=str(input("say what: "))
b=str(input("say what: "))
c=str(input("say what: "))
d=str(input("say what: "))
times=0
if(a=="what" or a=="WHAT"):
    times+=1
if(b=="what" or b=="WHAT"):
    times+=1
if(c=="what" or c=="WHAT"):
    times+=1
if(d=="what" or d=="WHAT"):
    times+=1
if(times>0):
    print("said what", times, "times")
else:
    print("Youhaven't said what once")
    
