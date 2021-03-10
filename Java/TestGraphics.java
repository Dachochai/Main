/* TestGraphics.java */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGraphics extends JFrame implements ActionListener, MouseListener, MouseMotionListener, KeyListener
{
	TestPanel panel = new TestPanel();
	
	Font font1 = new Font("Tahoma", Font.PLAIN, 26);
	Font font2 = new Font("Tahoma", Font.PLAIN, 12);
	Color red = Color.RED;
	Color maple = new Color(185, 142, 97);
	
	int count = 0;
	
	Timer time = new Timer(1000, this);
	
	ImageIcon tosilly = new ImageIcon("IMG\\Gags.jpg");
	
	Container con = getContentPane();
	
	public TestGraphics()
	{
		super("Test Grahpics");
		
		con.setLayout(new FlowLayout());
		
		super.add(panel);
		
		super.setSize(500, 500);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		
		time.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		panel.paintComponent(g);
		
		/*
		g.setFont(font1);
		g.setColor(maple);
		
		g.drawString("Hello World!", 15, 55);
		g.drawString("Count : " + count, 15, 75);
		
		g.setColor(red);
		
		//g.drawRect(150, 150, 50, 50);
		//g.drawOval(150, 250, 50, 50);
		//g.drawLine(150, 350, 280, 380);
		
		tosilly.paintIcon(this, g, 250 - (tosilly.getIconWidth() / 2), 250 - (tosilly.getIconHeight() / 2));
		*/
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == time)
		{
			panel.increaseCount(count++);
		}
		
		repaint();
	}
	
	public void keyPressed(KeyEvent e) { }
	
	public void keyReleased(KeyEvent e) { }
	
	public void keyTyped(KeyEvent e) { }
	
	public void mouseDragged(MouseEvent e) { }
	
	public void mouseMoved(MouseEvent e) { }
	
	public void mouseClicked(MouseEvent e) { }
	
	public void mousePressed(MouseEvent e) { }
	
	public void mouseReleased(MouseEvent e) { }
	
	public void mouseEntered(MouseEvent e) { }
	
	public void mouseExited(MouseEvent e) { }
	
	
	public static void main(String arg[])
	{
		new TestGraphics();
	}
}
