// File Name : Lab11_04.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_04 extends JApplet {
 private JButton plainBtn, fancyBtn;

 public void init () {
 Container c = getContentPane();
 c.setLayout( new FlowLayout() );
 plainBtn = new JButton("Plain Button");
 c.add( plainBtn );
 ImageIcon plane1 = new ImageIcon("airplan201.gif");
 ImageIcon plane2 = new ImageIcon("airplan202.gif");
 // ImageIcon plane1 = new ImageIcon(
 // getClass().getResource("airplan201.gif") );
 // ImageIcon plane2 = new ImageIcon(
 // getClass().getResource("airplan202.gif") );
 fancyBtn = new JButton("Fancy Button", plane1);
 fancyBtn.setRolloverIcon(plane2);
 c.add( fancyBtn );
 ButtonHandler handler = new ButtonHandler();
 fancyBtn.addActionListener( handler );
 plainBtn.addActionListener( handler );
 setSize(280, 200);
 }

 private class ButtonHandler implements ActionListener {
 public void actionPerformed(ActionEvent event) {
 JOptionPane.showMessageDialog( Lab11_04.this ,"You pressed : " + event.getActionCommand() );
 }
 }
}