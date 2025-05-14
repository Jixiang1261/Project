/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectOop;

import java.awt.event.WindowEvent;

/**
 *
 * @author Oscar LCW
 */
public class MainPage extends javax.swing.JFrame {

    
    public MainPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButton16.setText("jButton16");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\OOP image\\Malaysia.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 102));
        jLabel1.setText("Web based travel guide system for Malaysia");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 523, 23));

        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Melaka");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 102, -1));

        jButton3.setForeground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Kedah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 55, 109, -1));

        jButton4.setForeground(new java.awt.Color(0, 102, 102));
        jButton4.setText("Penang");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 55, 102, -1));

        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Pahang");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 55, 119, -1));

        jButton6.setForeground(new java.awt.Color(0, 102, 102));
        jButton6.setText("Sabah");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 102, -1));

        jButton7.setForeground(new java.awt.Color(0, 102, 102));
        jButton7.setText("Johor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 96, 109, -1));

        jButton8.setForeground(new java.awt.Color(0, 102, 102));
        jButton8.setText("Sarawak");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 96, 102, -1));

        jButton12.setForeground(new java.awt.Color(0, 102, 102));
        jButton12.setText("Kuala Lumpur");
        jButton12.setToolTipText("");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 96, 119, -1));

        jButton19.setForeground(new java.awt.Color(102, 0, 102));
        jButton19.setText("About");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 3, 119, -1));

        jButton9.setForeground(new java.awt.Color(102, 0, 102));
        jButton9.setText("Comment Page");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\OOP image\\Malaysia.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            systemExit();//exit the login page 
              MelakaInterface Info = new MelakaInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        systemExit();//exit the login page 
              JohorInterface Info = new JohorInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        systemExit();//exit the login page 
              SabahInterface Info = new SabahInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        systemExit();//exit the login page 
              KedahInterface Info = new KedahInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        systemExit();//exit the login page 
             PenangInterface Info = new PenangInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        systemExit();//exit the login page 
              SarawakInterface Info = new SarawakInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       systemExit();//exit the login page 
              CommentPage Info = new CommentPage();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        systemExit();//exit the login page 
              PahangInterface Info = new PahangInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        systemExit();//exit the login page 
              KLInterface Info = new KLInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        systemExit();//exit the login page 
              About Info = new About();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton19ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private void systemExit() {
        WindowEvent wincloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    } 
}
