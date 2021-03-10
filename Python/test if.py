print ("calculate grade")

score = int (input("Enter score 0-100: "))
print ("Score of student:",score)

#calculate grade
grade = ""
if (score >= 80):
    grade = "A"
elif (score >= 70):
    grade = "B"
elif (score >= 60):
    grade = "C"
elif (score >= 50):
    grade = "D"
else:
    grade = "F"
print ("Your grade is: ",grade)
        
    

