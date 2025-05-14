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
public class JohorPlace extends javax.swing.JFrame {

    
    public JohorPlace() {
        initComponents();
        scaledImage1();
        scaledImage2();
        scaledImage3();
        scaledImage4();
    }
    public void scaledImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Johor\\Place\\pic\\2.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel3.setIcon(scaledIcon);
    }
    public void scaledImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Johor\\Place\\pic\\5.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);
    }
    public void scaledImage3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Johor\\Place\\pic\\8.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
    }
    public void scaledImage4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Johor\\Place\\pic\\10.jpg");
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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>\n<h1><font color=\"red\">Desaru Beach</h1>\nThis is a beautiful 26 km stretch of white sandy beaches. Located in the district of Kota Tinggi, <br>there is plenty of accommodation available, from budget resorts to family-run chalets. <br>Families can expect to enjoy water sports such as canoeing or water skiing. There’s even a <br>theme park for the children nearby.\n<br><br>Location\n<br>•\tDesaru, 82200 Bandar Penawar, Johor.\n<h1><font color=\"red\">Johor Bahru</h1>\nThe capital city of Johor State is a favourite haunt for visitors from Singapore via the Causeway, and is fondly referred to as ‘JB’. Rich in culture, Johor has a wealth of traditional dances that include the ‘Ghazal’, a form of contemporary jazz-like Malay music, and ‘Kuda Kepang’ a dance imitating the movement of horses.\n<br>There are many landmarks to explore such as the Grand Palace, with its distinct Anglo-Malay architecture and the Johor Art Gallery, where various art collections, artifacts and many items related to Johor's historical heritage are stored.\n<br>Shopping opportunities are aplenty in JB. From modern malls to handicraft centers and bazaars to markets, a large range of international and local products go on sale. This is also one of the reasons why Singaporeans absolutely adore JB.\n<br>When night falls over the city, a delectable array of food stalls and vendors open around the streets peddling the famous Laksa Johor, a dish of flake fish and gravy cooked with coconut milk served with noodles and vegetables.\n<br>If you’re looking for cosmopolitan sights, but something not too busy like Kuala Lumpur, JB is the place to go.\n<br><br>Location\n<br>•\tJohor Bahru, Malaysia.\n<h1><font color=\"red\">Gunung Ledang</h1>\n<br>The mysterious mountain of Ledang is central to the tale of a Sumatran Princess who spurned the love of a Malaccan Sultan and was exiled here as a result. The mountain attracts climbers, campers and picnickers who come here to enjoy the marvellous scenery set amidst a backdrop of supernatural encounters. Gunung Ledang is <br>located in the Muar district. Mount Ledang is a mountain in the Gunung Ledang National Park located in Tangkak District, Johor, Malaysia. The summit is located between the border of Muar and Melaka. Standing at 1,276 m, it is the 64th highest mountain in Malaysia and the highest peak in Johor. \n<br><br>Location\n<br>•\tMount Ophir, 84900, Johor.\n<h1><font color=\"red\">Legoland Malaysia Resort</h1>  \n<br>Legoland Malaysia Resort is Malaysia's first international theme park, which opened in Iskandar Puteri, Johor, Malaysia on 15 September 2012 with over 40 interactive rides, shows and attractions. It is the first Legoland theme park in Asia and sixth in the world upon its establishment.[2] The official opening of Legoland Malaysia was made <br>by Sultan Ibrahim Ismail, Sultan of Johor on 22 September.\n<br><br>Location\n•\tAddress: No 7, Persiaran Medini Utara 3, Bandar, 79250 Johor Bahru, Johor\n•\tHours: \n<br>Friday\t10am–5pm\n<br>Saturday\t10am–5pm\n<br>Sunday\t10am–5pm\n<br>Monday\tClosed\n<br>Tuesday\tClosed\n<br>Wednesday\tClosed\n<br>Thursday\n<br>(Diwali)\n<br>Closed\n<br>•\tPhone: 07-597 8888\n</html>\n\n\n");
        jScrollPane1.setViewportView(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("<html>\n<b>Desaru Beach</b>\n</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("<html>\n<b>Johor Bahru</b>\n</html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html>\n<b>Gunung Ledang</b>\n</html>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("<html>\n<b>Legoland Malaysia Resort </b>\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 39, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        systemExit();//exit the login page 
              JohorInterface Info = new JohorInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JohorPlace().setVisible(true);
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
