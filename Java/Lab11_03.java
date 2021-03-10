// File Name : Lab11_03.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
public class Lab11_03 extends JApplet implements ActionListener {
 Timer swTimer;
 public void init () {
 swTimer = new Timer(1000, this);
 swTimer.start();
 setSize(480, 300);
 }
 public void paint(Graphics g) {
 super.paint(g);
 int x = 20 + (int) (Math.random() * 450);
 int y = 20 + (int) (Math.random() * 270);
 int Red = (int) (Math.random() * 256);
 int Green = (int) (Math.random() * 256);
 int Blue = (int) (Math.random() * 256);
 g.setColor(new Color(Red, Green, Blue) );
 g.drawOval( x, y, 20, 20);
 }

 public void actionPerformed(ActionEvent event) {
 repaint();
 }
}