import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dicimal = new DecimalFormat(".00");
		String message,output="",grade="";
		int menu,j=0,count=0,subject=0,value=0,points=0,subject_pass_credit=0,subject_total_credit=0;
		float grade_point=0,gpa=0;
		do{
		message = JOptionPane.showInputDialog("========================== \n: Menu Program Calculate GPA : \n========================== \n1.Input Number Subject \n2.Input Grade Subject \n3.Show Result Grade \n4.Show Result GPA \n5.Exit \nEnter Choice: ");
		menu = Integer.parseInt(message);
		if(menu==1){
			count=0;
			++count;
			do{
			message = JOptionPane.showInputDialog("Enter max subject (1-8): ");
			subject = Integer.parseInt(message);
			}while(subject<0 || subject>8);
		}
		else if(menu==2 && count>0){
			output="";
			j=0;
			grade_point=0;
			subject_pass_credit=0;
			subject_total_credit=0;
			gpa=0;
			for(int i=1;i<=subject;i++){
				grade = JOptionPane.showInputDialog("Enter grade of subject "+ i + ": ");
				if(grade.equals("a")||grade.equals("A")){
					grade="A";
					value=4;
					points=value*3;
				}
				else if(grade.equals("b")||grade.equals("B")){
					grade="B";
					value=3;
					points=value*3;
				}
				else if(grade.equals("c")||grade.equals("C")){
					grade="C";
					value=2;
					points=value*3;
				}
				else if(grade.equals("d")||grade.equals("D")){
					grade="D";
					value=1;
					points=value*3;
				}
				else if(grade.equals("f")||grade.equals("F")){
					grade="F";
					value=0;
					points=value*3;
				}
				output += "        "+i+"                       "+grade+"                "+value+"                "+points+"\n";
				grade_point+=points;
				if(!grade.equals("F")){
					++j;
					subject_pass_credit=3*j;
				}
				subject_total_credit=3*i;
				gpa=grade_point/subject_total_credit;
				
			}
		}
		else if(menu==3){
			JOptionPane.showMessageDialog(null, "************************************************ \nSubject No.        Grade        Value        Points \n************************************************ \n" + output);
		}
		else if(menu==4){
			JOptionPane.showMessageDialog(null, "Grade Point = "+grade_point+"\nSubject Pass Credit = "+subject_pass_credit+"\nSubject Total Credit = "+subject_total_credit+"\nYour GPA = "+dicimal.format(gpa));
		}
		else if(menu==5){
			JOptionPane.showMessageDialog(null, "Bye bye.");
		}
		else{
			JOptionPane.showMessageDialog(null, "Error");
			if(count!=1){
				JOptionPane.showMessageDialog(null, "Please Input Menu 1.");
			}
		}
		}while(menu!=5);

	}

}
