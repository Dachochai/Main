sum=0.0
inp=input("number student: ")
n=int(inp)
for i in range(n):
    inp=input("score : ")
    score=float(inp)
    sum+=score
    print(score)
print("Sum= ",sum,"Averrage= ",sum/n)
