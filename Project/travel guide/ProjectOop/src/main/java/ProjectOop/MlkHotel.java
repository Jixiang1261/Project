/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectOop;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Oscar LCW
 */
public class MlkHotel extends javax.swing.JFrame {

    
    public MlkHotel() {
        initComponents();
        scaledImage1();
        scaledImage2();
        scaledImage3();
        scaledImage4();
        scaledImage5();
        scaledImage6();
        scaledImage7();
        scaledImage8();
    }
    public void scaledImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 1\\2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel4.setIcon(scaledIcon);
    }
    public void scaledImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 1\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);
    }
    public void scaledImage3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 2\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
    }
    public void scaledImage4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 2\\2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel8.getWidth(), jLabel8.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel8.setIcon(scaledIcon);
    }
    public void scaledImage5(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 3\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel10.setIcon(scaledIcon);
    }
    public void scaledImage6(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 3\\2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel11.getWidth(), jLabel11.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel11.setIcon(scaledIcon);
    }
    public void scaledImage7(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 4\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel13.setIcon(scaledIcon);
    }
    public void scaledImage8(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Hotel\\Hotel 4\\2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel14.getWidth(), jLabel14.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel14.setIcon(scaledIcon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>\n<h1><font color=\"red\">The Shore Hotel & Residences</h1>\nThe Shore Hotel & Residences offers spacious apartments and suites in Melaka. It boasts 2 <br>swimming pools, a water park, and a 43rd floor rooftop bar. Free WiFi is accessible in <br>certain units, while free parking is provided.\n<br>Fully air-conditioned, each unit is fitted with a flat-screen TV, coffee/tea making facilities <br>and bottled water. Some have a seating area and guests enjoy city or river view. The en <br>suite bathroom includes free toiletries and a hairdryer.\n<br>Breakfast is served at Garden Terrace, while Sky Deli offers a la carte dining. Opens until <br>midnight, Sky Garden bar specialises in drinks and cocktails.\n<br>You can choose between the indoor or outdoor pools, and a sauna is available. Staff at <br>the 24-hour desk can assist you with tickets to nearby attractions. Laundry is available at <br>an additional charge, while daily housekeeping is free.\n<br>The Shore Hotel & Residences is within walking distance to the river cruise stop and <br>across the river from Kampong Morten, the traditional Malay village. Jonker Street is 2.2 <br>km away and The Stadthuys is 1.9 km from the property. The nearest airport is Melaka <br>Airport, reachable via a 8.6 km drive.\n<br>This is our guests' favourite part of Melaka, according to independent reviews.\n<br>Couples particularly like the location — they rated it 8.6 for a two-person trip.\n<br><br>We speak your language!\n<br>Address :\n <br>Level GF, 193, Pinggiran @Sungai Melaka, Jalan Persisiran Bunga Raya, 75100, Melaka.\n<h1><font color=\"red\">Hatten Hotel</h1>\nSet in the heart of historical Melaka, Hatten Hotel’s prime location makes it conveniently accessible for both business and leisure travellers. With 704 spacious suites, a grand ballroom for up to 1000 persons and complete recreational facilities, Hatten Hotel offers you utmost comfort, style and convenience. Surrounded by historical <br>landmarks, major shopping malls, dining & entertainment outlets and more, discover history and excitement literally just footsteps away.\n<br><br>Address :\n<br>Hatten Square, Jalan Merdeka, Bandar Hilir, Melaka 75000 Malaysia.\n<h1><font color=\"red\">Bayview Hotel Melaka</h1>\nIdeally located in the heart of the historical city, Bayview Hotel Melaka boasts 188 spacious guest rooms including luxurious suites with Jacuzzi and kitchenette, 6 dining and entertainment outlets including a dance club and KTV studio, a comprehensive range of recreational facilities from gym to spa pool and toddler's pool as well as <br>complete meeting and convention facilities. For business or leisure, find it all at Bayview Hotel Melaka.\n<br><br>Address :\n<br>Bayview Hotel Melaka Jalan Bendahara, Melaka 75100 Malaysia.\n<h1><font color=\"red\">Casa del Rio Melaka</h1>\nCasa del Rio, Melaka, part of The Boutique Collection by HPL Hotels & Resorts, is located on Jalan Kota Laksamana, Melaka, a literal 2 minute walk away from the popular Jonkers Walk and heritage attractions. Keen observers will pick out the Arabic, Chinese and Dutch influences woven into the dominantly Mediterranean architecture. This <br>boutique hotel, offering first class services, is already a striking addition to the historic skyline of the city. The hotel's 66 guest rooms and suites, each covering a minimum of 50 sq meters, uniquely feature dressing areas, bathrooms, split level bedrooms and private balconies as well as a number of unique personal touches. Aiming to <br>provide an \"at Home\" atmosphere, Casa del Rio is a sanctuary from the city's bustle, with spaces for indulgent reflective solitude or stimulating interactive conversation depending on the choice of the traveller.\n<br><br>Address :\n<br>88 Jalan Kota Laksamana, Melaka 75200 Malaysia.\n\n\n\n");
        jScrollPane1.setViewportView(jLabel1);

        jLabel2.setText("<html>\n<h1><font color='blue'>For more information, please visit these link :</h1>\n</html>");

        jButton1.setText("<html>\n<b>The Shore Hotel & Residences</b>\n</html>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<html>\n<b>Bayview Hotel Melaka</b>\n</html>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<html>\n<b>Hatten Hotel</b>\n</html>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<html>\n<b>Casa del Rio Melaka</b>\n</html>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("<html>\n<b>The Shore Hotel & Residences</b>\n</html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html>\n<b>Hatten Hotel</b>\n</html>");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("<html>\n<b>Bayview Hotel Melaka</b>\n</html>");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("<html>\n<b>Casa del Rio Melaka</b>\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 379, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        systemExit();//exit the login page 
              MelakaInterface Info = new MelakaInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.booking.com/hotel/my/the-shore-hotel-residences.en-gb.html?aid=356938;label=metagha-link-MRMY-hotel-1508384_dev-desktop_los-1_bw-35_dow-Wednesday_defdate-1_room-0_gstadt-2_rateid-my_aud-0_gacid-6641364928_mcid-50_ppa-0_clrid-0_ad-1_gstkid-0_checkin-20211201_lp-1010257_r-13838845631699953331;sid=0e39753ee30bc4668fbf88905dac7863;all_sr_blocks=150838402_277136279_0_2_0;checkin=2021-12-01;checkout=2021-12-02;dest_id=-2403412;dest_type=city;dist=0;group_adults=2;group_children=0;hapos=0;highlighted_blocks=150838402_277136279_0_2_0;hpos=0;matching_block_id=150838402_277136279_0_2_0;no_rooms=1;req_adults=2;req_children=0;room1=A%2CA;sb_price_type=total;sr_order=popularity;sr_pri_blocks=150838402_277136279_0_2_0__14574;srepoch=1635344058;srpvid=0568641c43d3001c;type=total;ucfs=1&#hotelTmpl").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.tripadvisor.com.my/Hotel_Review-g306997-d2701589-Reviews-Hatten_Hotel_Melaka-Melaka_Central_Melaka_District_Melaka_State.html").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.tripadvisor.com.my/Hotel_Review-g306997-d447621-Reviews-Bayview_Hotel_Melaka-Melaka_Central_Melaka_District_Melaka_State.html").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            Desktop.getDesktop().browse(new URL("https://www.tripadvisor.com.my/Hotel_Review-g306997-d1859159-Reviews-Casa_del_Rio_Melaka-Melaka_Central_Melaka_District_Melaka_State.html").toURI());
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(MlkHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MlkHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MlkHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MlkHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MlkHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    private void systemExit() {
        WindowEvent wincloseing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    }
}
