p=1000
r=0.05
prin=p
inter=0
print("Year %21s %12s %12s"%("Amount on deposit","Principle","Interest"))
for year in range(1,11):
    a=p*(1+r)**year
    inter = a - prin
    print("%4d%21.2f%13.2f%13.2f"%(year,a,prin,inter))
    prin = a
