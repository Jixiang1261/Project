/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ProjectOop;

import java.awt.Image;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Oscar LCW
 */
public class KedahPlace extends javax.swing.JFrame {

    
    public KedahPlace() {
        initComponents();
        scaledImage1();
        scaledImage2();
        scaledImage3();
        scaledImage4();
                
    }
    public void scaledImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Kedah\\Place\\pic\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel3.setIcon(scaledIcon);
    }
    public void scaledImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Kedah\\Place\\pic\\5.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);
    }
    public void scaledImage3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Kedah\\Place\\pic\\8.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
    }
    public void scaledImage4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Kedah\\Place\\pic\\11.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel9.setIcon(scaledIcon);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>\n<h1><font color=\"red\">Langkawi Skybridge Cable Car</h1>\nThe Langkawi Cable Car, also known as Langkawi SkyCab, is one of the major attractions in <br>Langkawi Island, Kedah, Malaysia. It provides an aerial link from the Oriental Village at <br>Teluk Burau to the peak of Gunung Machinchang, which is also the location of the <br>Langkawi Sky Bridge. The total length is 2.2 km, with a journey time from the base to the <br>top of around 15 minutes. It was officially opened in 2003. Langkawi Cable Car is located <br>just north of Telaga Harbour, Pantai Kok, with the entrance within 'Oriental Village' at the <br>foothill of the Mat Chincang mountain range. It is located to the north-west of the <br>Langkawi International Airport, on the west coast of the main island of Langkawi. It is <br>approximate 30 minutes drive from Kuah town and 15 minutes drive from Langkawi <br>International Airport.\n<br><br>Address: Jalan Telaga Tujuh, 07000 Langkawi, Kedah\n<br>Hours: \n<br>Friday\t9:30am–6pm\n<br>Saturday\t9:30am–6pm\n<br>Sunday\t9:30am–6pm\n<br>Monday\t10am–6pm\n<br>Tuesday\t10am–6pm\n<br>Wednesday\t10am–6pm\n<br>Thursday\t10am–6pm\n<br>Phone: 04-959 4225\n<br>Line length: 2200 meter\n<h1><font color=\"red\">Pulau Payar</h1>\nPayar Island is an island in Kedah, Malaysia. Payar Island status as a marine park offers protection for its diverse marine life. Payar Island is also a snorkelling and diving site famous for its corals. The Payar Island Marine Park is situated in the northern part of the Straits of Melaka, 19 nautical miles south of Langkawi and encompasses the islands of Payar, Lembu, Segantang and Kaca which are surrounded by coral reefs. \n<br>The marine park teems with a diversity of marine life and vegetation. Many endangered species of fishes and marine organisms live within the sanctuary. Measuring 2 km long and 1/4 km wide, Payar Island is the most popular of the islands as its sheltered waters are ideal are for snorkelling, diving and swimming. Among the dive spots is the \"Coral Garden\", an area covered with bright, multi-hued soft corals. There are several sandy beaches on Payar \n<br>island for picnics as well as hiking trails for those who wish to explore the island. Just off the beach, one can indulge in the experience of feeding baby sharks. Facilities include gazebos, picnic tables, barbecue pits and restrooms at selected areas. \n<br><br>Address: Jalan Telaga Tujuh, 07000 Langkawi, Kedah.\n<h1><font color=\"red\">Paddy Museum</h1>\nThe Kedah Paddy Museum is nothing to do with Irishmen. It is dedicated to the rice plant, paddy, the world's most important crop.\n<br>The word \"paddy\" is derived from the Malay word padi meaning rice plant so it is appropriate that one of the world's few rice museums should be in Malaysia. The other rice museums that I am aware of are the Gohan Museum in Yurakucho, Japan and IRRI's RiceWorld in Los Baños, Philippines.\n<br>The Paddy Museum is big, with an area of 12,000 square meters spread over three floors.\n<br>The architecture of the building is designed to symbolize bushels of harvested rice stalks.\n<br>Rice motifs decorate the external facade and are used on railings in the interior.\n<br>The museum explains the rice cultivation process, displays different varieties of rice, showcases equipment and tools used in rice cultivation through the ages and in various countries.\n<br>On entering the museum I was directed to a spiral staircase which has been decorated to resemble the interior of a cave, possible inspired by the cave in Gunung Keriang which is located a short distance away.\n<br>The stairs lead to the top floor of the museum and I emerged onto a revolving platform equipped with forty cinema seats from which visitors can admire a 360 degree diorama and mural which has been painted on the entire inside wall of the upper level.\n<br>Apparently the mural was painted by a team of 60 North Korean artists and I have to say they did an excellent job in creating a realistic panorama of the paddy fields and scenery found in this part of Kedah.\n<br><br>Opening Hours and Admission Charges\n<br>Open daily from 9am to 5pm (Closed between 12:30pm and 2:30pm on a Friday).\n<br>Closed on Hari Raya Aidilfitri and Hari Raya Aidiladha.\n<br>Adults RM 3\n<br>Children (ages 7 - 12) RM 1\n<br>Camera Charge RM 2\n<br><br>Address:\n<br>brMuzium Padi\n<br>Lot 798 Jalan Gunung Keriang, Mukim Gunung Keriang\n06570 Alor Setar, Kedah Darul Aman.\n<br>Tel: 04 735 1315\n<h1><font color=\"red\">Underwater World Langkawi</h1>\nUnderwater World Langkawi (UWL) is one of the largest marine and freshwater aquaria in South East Asia. Since the start of its operation on 26 August 1995, it has become one of the must visit tourist destinations in Langkawi and has attracted a large number of foreign as well as local tourists.\n<br>The concept and theme of Underwater World Langkawi are geared towards\n<br>Research & Development, Education and Entertainment. It is built to raise awareness on the importance of conserving our precious aquatic life forms, thus creating understanding of the deep and inseparable bond between man and nature.\n<br>At Underwater World Langkawi, we have three main sections, which displays Tropical Rainforest & River Ecosystem, Temperate & Sub-Antarctic and Marine Section.\n<br>Other attractions include the Freshwater Fish Section, the Seashell Display, the Koi Pond, the Reptilium Section, Invertebrate Section, the Coral Reef Section and the Poisonous & Venomous Section.\n<br>Visitors are thus provided with a one-stop shopping, eating and entertainment package, all of which are available within one area. \n<br>Langkawi Underwater World\n<br>•\tOpening Hours:\n<br>09:30 – 18:30 Monday – Friday\n<br>09:30 – 22:30 Friday – Sunday\n<br>•\tAddress: Zon Pantai Cenang, Mukim Kedawang\n<br>•\tTel: +604 955 6100\n</html>\n\n");
        jScrollPane1.setViewportView(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("<html>\n<b>Langkawi Skybridge Cable Car</b>\n</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("<html>\n<b>Pulau Payar</b>\n</html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html>\n<b>Paddy Museum</b>\n</html>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("<html>\n<b>Underwater World Langkawi</b>\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 375, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       systemExit();//exit the login page 
              KedahInterface Info = new KedahInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KedahPlace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
