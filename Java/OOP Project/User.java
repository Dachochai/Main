package proj_oop;
import java.awt.*;
import java.awt.Event;
import javax.swing.*;

public class User extends javax.swing.JFrame {
    private cusinfo cus;
    private int selecttime = 0;
    private int imageNo;
    private ImageIcon image1 = new ImageIcon(new ImageIcon("endgame.jpg").getImage());
    private ImageIcon image2 = new ImageIcon(new ImageIcon("infinitywars.jpg").getImage());
    private ImageIcon image3 = new ImageIcon(new ImageIcon("captain.jpg").getImage());
    private ImageIcon image4 = new ImageIcon(new ImageIcon("aquaman.jpg").getImage());
    private endgame endgame[] = new endgame[2]; //1
    private infinitywar infi[] = new infinitywar[2]; //#2
    
    
    public User() {
        super("Genaral User");
        initComponents();
        cus = new cusinfo();
        time1200.setVisible(false);
        time1500.setVisible(false);
        endgame[0] = new endgame();
        endgame[1] = new endgame();
        infi[0] = new infinitywar();
        infi[1] = new infinitywar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        poster = new javax.swing.JPanel();
        movie = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        time1200 = new javax.swing.JButton();
        time1500 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("ออกจากระบบ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("ออกจากโปรแกรม");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("รายการภาพยนตร์");

        poster.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout posterLayout = new javax.swing.GroupLayout(poster);
        poster.setLayout(posterLayout);
        posterLayout.setHorizontalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        posterLayout.setVerticalGroup(
            posterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        movie.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        movie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "เลือกภาพยนต์", "Avengers Endgame", "Avengers Infinity wars" }));
        movie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("เลือกรอบฉายที่ต้องการ");

        time1200.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time1200.setText("12:00");
        time1200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1200ActionPerformed(evt);
            }
        });

        time1500.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time1500.setText("15:00");
        time1500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                time1500ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(movie, 0, 387, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(time1500, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                    .addComponent(time1200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(poster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(movie, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(time1200, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(time1500, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadimage(){
       image1 = new ImageIcon("endgame.jpg");
       image2 = new ImageIcon("infinitywars.jpg");
       image3 = new ImageIcon("captain.jpg");
       image4 = new ImageIcon("aquaman.jpg");
       
        
    }
    
    public void paint(Graphics g){
        super.paint(g);
        if(imageNo == 1){
            image1.paintIcon(poster, poster.getGraphics(), 0, 0);
        }
        else if(imageNo == 2){
            image2.paintIcon(poster, poster.getGraphics(), 0, 0);
        }
        else if(imageNo == 3){
            image3.paintIcon(poster, poster.getGraphics(), 0, 0);
        }
        else if(imageNo == 4){
            image4.paintIcon(poster, poster.getGraphics(), 0, 0);
        }
    }
    
    private void movieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieActionPerformed
        int n = movie.getSelectedIndex();
                if(n == 1) {
            selecttime = 1;
            imageNo = 1;
            time1200.setVisible(true);
            time1500.setVisible(true);
        }
        else if(n == 2) {
            selecttime = 2;
            imageNo = 2;
            time1200.setVisible(true);
            time1500.setVisible(true);
        }
        else if(n == 3) {
            selecttime = 3;
            imageNo = 3;
            
        }
        else if(n == 4){
            selecttime = 4;
            imageNo = 4;
        }
        else{
            selecttime = 0;
            imageNo = 0;
            time1200.setVisible(false);
            time1500.setVisible(false);
        }
        repaint();
    }//GEN-LAST:event_movieActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(evt.getSource() == jButton3){
            new confirm().setVisible(true);
            
	}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Login().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void time1200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1200ActionPerformed
        // TODO add your handling code here:
            if(selecttime==1)
            {
                if(imageNo ==1)
                    endgame[0].setVisible(true);
            }
            else if(selecttime==2)
            {
                if(imageNo ==2)
                    infi[0].setVisible(true);
            }
            setVisible(false);
    }//GEN-LAST:event_time1200ActionPerformed
    private void time1500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_time1500ActionPerformed
        // TODO add your handling code here:
            if(selecttime==1)
            {
                if(imageNo ==1)
                    endgame[1].setVisible(true);
            }
            else if(selecttime==2)
            {
                if(imageNo ==2)
                    infi[1].setVisible(true);
            }
            setVisible(false);
    }//GEN-LAST:event_time1500ActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox movie;
    private javax.swing.JPanel poster;
    private javax.swing.JButton time1200;
    private javax.swing.JButton time1500;
    // End of variables declaration//GEN-END:variables
}
