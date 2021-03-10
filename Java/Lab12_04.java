// File Name : Lab12_04.java
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Lab12_04 extends JApplet implements ActionListener,
MouseListener, MouseMotionListener{
 private int lastx, lasty;
 private JButton redBtn, greenBtn, blueBtn,clearBtn;
 private Graphics g;
 private Color color;

 public void init() {
 Container c = getContentPane();
 c.setLayout(new FlowLayout());
 redBtn = new JButton("Red");
 redBtn.addActionListener(this);
 c.add(redBtn);
 greenBtn = new JButton("Green");
 greenBtn.addActionListener(this);
 c.add(greenBtn);
 blueBtn = new JButton("Blue");
 blueBtn.addActionListener(this);
 c.add(blueBtn);
 clearBtn = new JButton("Clear");
 clearBtn.addActionListener(this);
 c.add(clearBtn);
 g = getGraphics();
 color = Color.BLACK;
 addMouseListener(this);
 addMouseMotionListener(this);
 setSize(320, 240);
 }

 public void paint(Graphics g) {
 super.paint(g);
 }

 public void mousePressed(MouseEvent event) {
 lastx = event.getX();
 lasty = event.getY();
 }

 public void mouseReleased(MouseEvent event) { }

 public void mouseClicked(MouseEvent event) { }

 public void mouseEntered( MouseEvent event ) { }

 public void mouseExited(MouseEvent event) { }

 public void mouseDragged(MouseEvent event) {
 int x = event.getX();
 int y = event.getY();
 g.setColor( color );
 g.drawLine(lastx, lasty, x, y);
 lastx = x;
 lasty = y;
 }

 public void mouseMoved(MouseEvent event) {
 showStatus(event.getX() + ", " + event.getY() );
 }
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == redBtn) color = Color.RED;
 else if (e.getSource() == greenBtn) color = Color.GREEN;
 else if (e.getSource() == blueBtn) color = Color.BLUE;
 else if (e.getSource() == clearBtn) {
 color = Color.BLACK;
 clear();
 }
 }

 public void clear() {
 repaint();
 g.setColor(this.getBackground());
 g.fillRect(0, 0, bounds().width, bounds().height );
 }

}