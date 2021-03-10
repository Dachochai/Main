package proj_oop;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

public class endgame extends javax.swing.JFrame implements MouseListener {

    private int imageNo=1;
    private ImageIcon image1 = new ImageIcon(new ImageIcon("screen.png").getImage());
    private ImageIcon chair[][] = new ImageIcon[4][10];
    private ImageIcon chairW = new ImageIcon("chair-1.png");
    private ImageIcon chairB = new ImageIcon("chair-2.png");
    private ImageIcon chairR = new ImageIcon("chair-3.png");
    private int posX[][] = new int[4][10];
    private int posY[][] = new int[4][10];
    private boolean initialize = false;
    private int Reservations[][] = new int[4][10]; //จอง
    private int Price =0;
    private cusinfo cus;
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private backarr br;
    private ImageIcon[][] infw1200;
    
    private void loadimage(){
       int x = 0;
       int y = 0;
       
       for (int r = 0; r < 4; r++)
       {
           for (int c = 0; c < 10; c++)
           {
               chair[r][c] = new ImageIcon("chair-1.png");
               posX[r][c] = x;
               posY[r][c] = y;
               x += 70;
           }
           
           x = 0;
           
           y += 40;
       }
       
       addMouseListener(this);
       
       initialize = true;
    }
   
    
    public void paint(Graphics g){
        super.paint(g);
        if(imageNo == 1){
            image1.paintIcon(poster, poster.getGraphics(), 0, 0);
        }
        
        if (initialize)
        {
            for (int r = 0; r < 4; r++)
            {
                for (int c = 0; c < 10; c++)
                {
                    chair[r][c].paintIcon(chairPanel, chairPanel.getGraphics(), posX[r][c], posY[r][c]);
                }
            }
        }
    }
    
    public boolean isInside(int mX, int mY, int posX, int posY, ImageIcon img)
    {
        if (mX >= posX && mX <= (posX + img.getIconWidth()))
        {
            if (mY >= posY && mY <= (posY + img.getIconHeight()))
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void mouseClicked(MouseEvent e) { }

    public void mousePressed(MouseEvent e) { }

    public void mouseReleased(MouseEvent e) 
    {
        int mX = e.getX() - 80;
        int mY = e.getY() - 220;
        
        for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 10; c++)
            {
                if (isInside(mX, mY, posX[r][c], posY[r][c], chair[r][c]))
                {
                    if (e.getButton() == 1)
                    {
                        if (chair[r][c] != chairB && chair[r][c] != chairR)
                        {
                            chair[r][c] = chairB; //Chair Black
                            Price += 180;                            
                            value.setText(String.valueOf(Price));
                        }
                        else if(chair[r][c] != chairW && chair[r][c] != chairR)
                        {
                            chair[r][c] = chairW; //Chair White
                            Price -= 180;
                            value.setText(String.valueOf(Price));
                        }
                    }
                }
            }
        }

        chairPanel.repaint();
        repaint();
    }

    public void mouseEntered(MouseEvent e) { }

    public void mouseExited(MouseEvent e) { }
                  
    public endgame() {
        loadimage();
        initComponents();
        value.setEditable(false);
        cus = new cusinfo();
        con = Connect.ConnectDB();
        br = new backarr();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        poster = new javax.swing.JPanel();
        okbtn = new javax.swing.JToggleButton();
        chairPanel = new javax.swing.JPanel();
        cancelbtn = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        value = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout posterLayout = new javax.swing.GroupLayout(poster);
        poster.setLayout(posterLayout);
        posterLayout.setHorizontalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        posterLayout.setVerticalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        okbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        okbtn.setText("OK");
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });

        chairPanel.setPreferredSize(new java.awt.Dimension(715, 154));

        javax.swing.GroupLayout chairPanelLayout = new javax.swing.GroupLayout(chairPanel);
        chairPanel.setLayout(chairPanelLayout);
        chairPanelLayout.setHorizontalGroup(
            chairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 715, Short.MAX_VALUE)
        );
        chairPanelLayout.setVerticalGroup(
            chairPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        cancelbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelbtn.setText("Cancel");
        cancelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("D");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("D");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("C");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("B");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("A");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("1                2               3                4              5              6                7                8               9                 10");

        value.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ราคา : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("บาท");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("กรุณาเลือกที่นั่ง");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("เก้าอี้สีขาว = จองได้ / เก้าอี้สีดำ = กำลังจอง / เก้าอี้สีแดง = ไม่สามารถจองได้");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 847, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chairPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(14, 14, 14))
                        .addComponent(poster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13)
                            .addGap(29, 29, 29)
                            .addComponent(okbtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cancelbtn)
                            .addGap(10, 10, 10))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(jLabel10)))
                            .addGap(105, 105, 105)))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22)
                    .addComponent(poster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel7)
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel6))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(chairPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(okbtn)
                        .addComponent(cancelbtn)
                        .addComponent(jLabel13))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed

        String id = cus.getid();
        String v = value.getText();
        int value = Integer.parseInt(v);
        int n = 0;
        String mon = "";
        JOptionPane.showMessageDialog( null,"จองเรียบร้อย ราคารวม : "+value,"Complete", JOptionPane.INFORMATION_MESSAGE);
        for (int r = 0; r < 4; r++)
            {
                for (int c = 0; c < 10; c++)
                {
                    if(chair[r][c] == chairB)
                    {
                        chair[r][c] = chairR; //Chair Red
                        Reservations[r][c] = 1;
                        br.setinfw1200(chair);
                    }
                }
            } 
        chairPanel.repaint();
        repaint();
        new User().setVisible(true);

    }//GEN-LAST:event_okbtnActionPerformed

    private void cancelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtnActionPerformed
        // TODO add your handling code here:
        new User().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_cancelbtnActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(endgame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new endgame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cancelbtn;
    private javax.swing.JPanel chairPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton okbtn;
    private javax.swing.JPanel poster;
    private javax.swing.JTextField value;
    // End of variables declaration//GEN-END:variables
}
