/* TestGC.java */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGC extends JFrame implements ActionListener
{
	private Pictures p1;
	private Pictures p2;
	
	private JButton button;
	
    public TestGC()
    {
    	super("Hello Garbage!");
    	
        setLayout(new FlowLayout());
        
        button = new JButton("Garbage");
        add(button);
        button.addActionListener(this);
        
        
        p1 = new Pictures(5, 8);
        p2 = new Pictures(10, 20);
        
        //p1.setX(5);
        System.out.println("P1 : ");
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        
        System.out.println("P2 : ");
        System.out.println(p2.getX());
        System.out.println(p2.getY());

        super.setSize(300, 150);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent event) 
    {
    	if (event.getSource() == button)
    	{
    		p1 = null;
    		p2 = null;
        	
        	System.gc();
    	}
    }
    
    public static void main(String[] args) 
    {
    	new TestGC();
	}
}
