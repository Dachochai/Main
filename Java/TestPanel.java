/* TestPanel.java */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestPanel extends JPanel
{
	Font font1 = new Font("Tahoma", Font.PLAIN, 26);

	Color maple = new Color(185, 142, 97);
	
	int count;
	
	public TestPanel()
	{
		super.setPreferredSize(new Dimension(300, 300));
		super.setBorder(BorderFactory.createBevelBorder(0));
	}
	
	public void increaseCount(int count)
	{
		this.count = count;
	}
	
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		g.setFont(font1);
		g.setColor(maple);
		
		g.drawString("Hello World!", 15, 55);
		g.drawString("Count : " + count, 15, 75);
	}
	
	public void paint(Graphics g) 
	{
		super.paint(g);
	}
}
