/* TestSummation.java */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestSummation extends JFrame implements ActionListener 
{
	Summation sum = new Summation();
	JLabel header = new JLabel("Summation is The Best");
	JLabel label1 = new JLabel("Value 1 : ");
	JLabel label2 = new JLabel("Value 2 : ");
	JLabel label3 = new JLabel("Result : ");
	
	JLabel spacer1 = new JLabel("                    ");
	JLabel spacer2 = new JLabel("                    ");
	JLabel spacer3 = new JLabel("                    ");
	
	JTextField value1 = new JTextField(10);
	JTextField value2 = new JTextField(10);
	JTextField resultField = new JTextField(10);
	
	JButton calculate = new JButton("Calculate");
	
	Container con = getContentPane();
	
	public TestSummation()
	{
		super("Summation Programs is the Best forever");
		
		Initialize();
		
		super.setSize(300, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
	}
	
	public void Initialize()
	{
		con.setLayout(new FlowLayout());
		
		//Header
		header.setFont(new Font("Tahoma", Font.BOLD, 20));
		con.add(header);
		
		//Value 1
		con.add(label1);
		con.add(value1);
		
		con.add(spacer1);
		
		//Value 2
		con.add(label2);
		con.add(value2);
		
		con.add(spacer2);
		
		//Result
		con.add(label3);
		con.add(resultField);
		resultField.setEditable(false);
		
		con.add(spacer3);
		
		//Button
		con.add(calculate);
		calculate.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == calculate)
		{
			int x = Integer.parseInt(value1.getText());
			int y = Integer.parseInt(value2.getText());
			sum.Sum(x, y);
			int result = sum.getResult();
			resultField.setText(Integer.toString(result));
		}
	}
	
	public static void main(String[] args)
	{
		new TestSummation();
	}
}
