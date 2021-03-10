// File Name : Lab8_2.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab8_2 extends JApplet implements ActionListener {
 JLabel textLabel;
 JTextField textField;
 JButton saveBtn, clearBtn, showBtn;
 Container container;
 Number obj;
 public void init( ) {
	 container = getContentPane();
	 container.setLayout( new FlowLayout() );
	 textLabel = new JLabel("Enter number :");
	 textLabel.setFont(new Font("Courier New",Font.BOLD,20));
	 container.add( textLabel );
	 textField = new JTextField( 10 );
	 textField.setFont(new Font("Courier New",Font.BOLD,24));
	 container.add( textField );
	 saveBtn = new JButton(" Save ");
	 saveBtn.setFont(new Font("Courier New",Font.BOLD,20));
	 saveBtn.addActionListener( this);
	 container.add( saveBtn );
	 clearBtn = new JButton(" Clear ");
	 clearBtn.setFont(new Font("Courier New",Font.BOLD,20));
	 clearBtn.addActionListener( this);
	 container.add( clearBtn );
	 showBtn = new JButton(" Show ");
	 showBtn.setFont(new Font("Courier New",Font.BOLD,20));
	 showBtn.addActionListener( this);
	 container.add( showBtn );
	 obj = new Number();
	 textField.setText(obj.toString());
	 }
	 public void actionPerformed( ActionEvent event )
	 {
	 if (event.getSource() == saveBtn)
	 {
	 int value = Integer.parseInt(textField.getText());
	 obj.setValue(value);
	 textField.setText("");
	 }
	 else if (event.getSource() == clearBtn)
	 {
	 obj.setValue( 0 );
	 textField.setText("");
	 }
	 else if (event.getSource() == showBtn)
	 {
	 textField.setText(obj.toString());
	 }
	 }
	}