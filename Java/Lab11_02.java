// File Name : Lab11_02.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab11_02 extends JApplet implements
AdjustmentListener {
 private Graph myGraph;
 private JScrollBar aScrollbar, bScrollbar, cScrollbar,
dScrollbar;

 public void init() {
 Container c = getContentPane();
 c.setLayout( new FlowLayout() );

 c.add( new JLabel(" a : ") );
 aScrollbar = new JScrollBar( JScrollBar.HORIZONTAL, 50, 10,
 0 , 100);
 c.add( aScrollbar );
 aScrollbar.addAdjustmentListener( this );

 c.add( new JLabel(" b : ") );
 bScrollbar = new JScrollBar( JScrollBar.HORIZONTAL, 50, 10,
 0 , 100);
 c.add( bScrollbar );
 bScrollbar.addAdjustmentListener( this );

 c.add( new JLabel(" c : ") );
 cScrollbar = new JScrollBar( JScrollBar.HORIZONTAL, 50, 10,
 0 , 100);
 c.add( cScrollbar );
 cScrollbar.addAdjustmentListener( this );

 c.add( new JLabel(" d : ") );
 dScrollbar = new JScrollBar( JScrollBar.HORIZONTAL, 50, 10,
 0 , 100);
 c.add( dScrollbar );
 dScrollbar.addAdjustmentListener( this );

 setSize( 400, 400);
 myGraph = new Graph();

 }

 public void paint(Graphics g) {
 super.paint( g );
 myGraph.draw( g );
 }

 public void adjustmentValueChanged(AdjustmentEvent event) {
 int aValue = aScrollbar.getValue() ;
 int bValue = bScrollbar.getValue() ;
 int cValue = cScrollbar.getValue() ;
 int dValue = dScrollbar.getValue() ;

 myGraph.setParameters(aValue, bValue, cValue, dValue);
 repaint();
 }
}