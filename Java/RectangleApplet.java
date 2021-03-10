// File Name : RectangleApplet.java
import javax.swing.*;
import java.awt.*;
public class RectangleApplet extends javax.swing.JApplet {
 int x, y;
 Rectangle r ;

 public void init()
 {
 String input; // user's input
 // obtain user's choice
 input = JOptionPane.showInputDialog(
 "Enter value x of left point : " );
 x = Integer.parseInt( input ); // convert input to int
 input = JOptionPane.showInputDialog(
 "Enter value y of left point : " );
 y = Integer.parseInt( input ); // convert input to int

 int w = 10 + (int) (Math.random() * 280);
 int h = 10 + (int) (Math.random() * 180);
 r = new Rectangle(x, y, w, h);
 } // end method init
 // draw shapes on applet's background
 public void paint( Graphics g )
 {
 super.paint( g ); //call paint method inherited from JApplet
 // set color
 g.setColor( Color.ORANGE );
 g.drawRect(r.getX(), r.getY(), r.getWidth(),r.getHeight() );
 g.setColor( Color.BLUE );
 g.drawString( "Point Left : " + r.getX() + ", " + r.getY(),r.getX(), r.getY());
 g.drawString( "Width : " + r.getWidth() , r.getX(),
 r.getY() + 15);
 g.drawString( "Height : " + r.getHeight() , r.getX(),
 r.getY() + 30);
 g.drawString( "Area : " + r.getArea() , r.getX(),
 r.getY() + 45);
 } // end method paint
}