import random as rnd
def CheckGrade(score):
    grade=""
    if(score>=80):
        grade="A"
    elif(score>=70):
        grade="B"
    elif(score>=60):
        grade="C"
    elif(score>=50):
        grade="D"
    else:
        grade="F"
    return(grade)
def Reports(Scores,Grades):
    for n in range(len (Scores)):
        print("%2d\t%3d\t%3s"%(n+1,Scores[n],Grades[n]))
Scores=[]
Grades=[]
MAX=int(input("Enter student number: "))
n=1
while(n<=MAX):
    message="Enter score %d: " %n

    score=rnd.randint(10,100)
    print(message,score)
    Scores.append(score)
    n=n+1
print("Scores in list: ", Scores)
total=0
for score in Scores:
    total=total+score
for score in Scores:
    Grades.append(CheckGrade(score))
average=total/MAX
print("Average score= ",average)
print("Grade in list ",Grades)
Reports(Scores,Grades)
