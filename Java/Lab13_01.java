// File Name : Lab13_01.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab13_01 extends JApplet implements ActionListener {
 private Picture image1, image2, image3;
 private JPanel guiPanel, graphicsPanel;
 private JButton btn1, btn2, btn3, btn4, btn5;
 private boolean isShow = false;
 private int imageNo;

 public void init()
 {
 setSize(500,350);
 Container c = getContentPane();
 c.setLayout(new FlowLayout());
 guiPanel = new JPanel();
 guiPanel.setPreferredSize(new Dimension(400, 50));
 guiPanel.setBorder( BorderFactory.createBevelBorder(0));
 btn1 = new JButton("Logo");
 btn1.addActionListener(this);
 guiPanel.add(btn1);
 btn2 = new JButton("Car");
 btn2.addActionListener(this);
 guiPanel.add(btn2);
 btn3 = new JButton("Beach");
 btn3.addActionListener(this);
 guiPanel.add(btn3);
 btn4 = new JButton("Show");
 btn4.addActionListener(this);
 guiPanel.add(btn4);
 btn5 = new JButton("Clear");
 btn5.addActionListener(this);
 guiPanel.add(btn5);

 graphicsPanel = new JPanel();
 graphicsPanel.setPreferredSize(new Dimension(320, 240));
 graphicsPanel.setBorder(
 BorderFactory.createBevelBorder(0));
 c.add(guiPanel);
 c.add(graphicsPanel);
 loadImage();
 }

 public void loadImage()
 {
 image1 = new Picture( "logo.gif" );
 image2 = new Picture( "car.gif" );
 image3 = new Picture( "beach.jpg" );
 }
 public void paint( Graphics g )
 {
 super.paint( g );
 if (isShow) {
 switch( imageNo ) {
 case 1:
 image1.draw( graphicsPanel );
 break;
 case 2:
 image2.draw( graphicsPanel );
 break;
 case 3:
 image3.draw( graphicsPanel );
 break;
 }
 }
 }
 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == btn1) imageNo = 1;
	 else if (e.getSource() == btn2) imageNo = 2;
	 else if (e.getSource() == btn3) imageNo = 3;
	 else if (e.getSource() == btn4) {
	 if (isShow == true) btn4.setText("Not show");
	 else btn4.setText("Show");
	 isShow = !isShow;
	 }
	 else {
	 imageNo = 0;
	 image1.clear( graphicsPanel );
	 }
	 repaint();
	 }
	}