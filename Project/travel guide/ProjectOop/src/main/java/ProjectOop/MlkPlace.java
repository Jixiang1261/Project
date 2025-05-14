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
public class MlkPlace extends javax.swing.JFrame {

    
    public MlkPlace() {
        initComponents();
        scaledImage1();
        scaledImage2();
        scaledImage3();
        scaledImage4();
    }
    public void scaledImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Place\\pic\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel3.setIcon(scaledIcon);
    }public void scaledImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Place\\pic\\4.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);
    }public void scaledImage3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Place\\pic\\15.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
    }public void scaledImage4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Malacca\\Place\\pic\\12.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel9.getWidth(), jLabel9.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel9.setIcon(scaledIcon);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
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

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("<html>\n<h1><font color=\"red\">Baba Nyonya Heritage Museum in Malacca</h1>\nAt the beginning of the 16th century, merchants and entrepreneurs were lured to Malacca’s shores due to stories of the city’s burgeoning success and wealth. In particular the city saw an influx of Chinese traders who arrived in droves in an effort to escape Manchu rule. These entrepreneurs went on to marry local Malay women – descendents of these marriages were known as Peranakan or ‘Straits-born Chinese’.\n<br>Their relative success resulted in these expatriate merchants becoming the principal wealth catalysts of the thriving city. The ‘Babas’ (male Sino-Malays) flaunted their affluence by purchasing Dutch townhouses and transforming them into out-and-out palaces. The interiors of these homes were opulent and stuffed to the tee with Dutch-influenced fixtures including hand-painted tiles and Victorian lamps.\n<h2>Makanan Peranakan</h2>\nYet Peranakan culture as a whole is largely defined by its cuisine – makanan (food) Nyonya. Malaysians laud it as one their major food heritages and Malacca’s culture is irrevocable defined by it. An amalgamation of Malay and Chinese traditions, Nyonya cuisine comprises dishes with out-of-the-ordinary vegetables, curries thickened by coconut milk and sauces that are delightfully pungent. \n<br>Noteworthy though is the social etiquette of eating – locals use their fingers, not chopsticks, to eat – a fact that belies their Chinese ancestral roots and establishes Nyonya culture as one of Malaysia’s veritable legacies. \n<h2>Heritage House</h2>\nLocated at No. 48-50 along Jalan Tun Cheng Lock in Malacca, the Baba-Nyonya Heritage Museum is actually a collection of three beautifully restored houses arranged to look like a typical 19th-cenutry Baba-Nyonya residence. Excellent examples of Chinese-Palladian style, these townhouses, built in 1896, were transformed into a traditional Peranakan museum in later years; connected by a common covered footway, the museum features hand-painted tiles, elaborately carved teakwood outer swing doors and a sturdier internal door which provides extra security. \n<br>Framed by Greco-Roman columns, two red lanterns, one bearing a household name and the other messages of good luck, hang on either side of the entrance.\nThe upper level of the house has a short canopy of Chinese tiles above the portico which frames the almost-Venetian shuttered windows. Boasting distinctively east-meets-west allure, the glass windows feature wrought-iron grilles and the eaves and fascias are covered with painted, floral designs. \n<br>Inside the house there’s a collection of gold-leaf fixtures, Chinese- and Dutch-design black wood furniture inlaid with mother of pearl as well as skilfully carved lacquer screens and Victorian chandeliers.\n<br>The best parts of this tour are the guides who regal guests with Baba Nyonya tales of yore with noticeable Peranakan wit during the informative 45-minute tours.\n<br><br>Baba Nyonya Heritage Museum\n<br>•\tOpening Hours: 10:00 – 12:30 & 14:00 – 16:30 Monday - Saturdays\n<br>•\tAddress: 48-50 Jalan Tun Tan Cheng Lock, 75200.\n<br>•\tTel: +606 283 1273\n<h1><font color=\"red\">A'Famosa in Melaka</h1>\n<br>A’Famosa is more than just quick photo stop opportunity for tourists. Built in 1511, the settlement used to sprawl across a whole hillside but now only a lone gate (Porta de Santiago) remains. One of the oldest surviving European architectural remains in Asia; it is set beside the Istana ke Sultanan on Jalan Kota.\n<br>A’Famosa is perhaps Malacca’s best known sightseeing spot. Originally constructed by Alfonso de Albuquerque (who led the Portuguese invasion on the Malacca Sultanate), the remains of the fort is now a crumbling whitewashed gatehouse and is located downhill from St. Paul’s Church.\n<h2>Structure of A'Famosa</h2>\nIn the 16th century A’Famosa housed the entire Portuguese administration, including its hospitals, five churches, elongated stockades and four key towers. One tower was a four-storey keep; the others were an ammunition storage room, captain’s residence and an officer’s quarters. \n<br>The rest of the bastion comprised of townhouses clustered inside the fortress walls. The fort was expanded in 1586 to accommodate Malacca’s growing population.\n<br><br>A’Famosa Melaka\n<br>•\tLocation: Jalan Kota, Malacca.\n<h1><font color=\"red\">Christ Church Melaka</h1>\nChrist Church  built by the Dutch when they took possession of Malacca from the Portuguese, it's one of Malacca’s most defining structures. Situated along Jalan Gereja (also known as Church Street) it is an instantly recognizable brick-red building with a huge white cross at the top. Sitting opposite the Stadhuys, Christ Church was built in 1753 to celebrate a century of Dutch occupation. The interior of the cathedral has 200 year-old handmade pews, decorative fanlights and plaques that honour Dutch soldiers and locals.\n<h2>Christ Church Information</h2>\nChrist Church is located near to Malacca’s Chinatown centre. Across the bridge from the Jonker Street, it is one of the most popular sightseeing attractions in the Stadthuys area. A lot of colourful trishaws (You can pay to ride it) and directly opposite is the Historical Museum and Ethnographical Museum.\n<br>The area is stepped in Baba Nyonya culture with opulent ‘Baba merchants’ houses and elegantly-conserved Nyonya restaurants that line the constricted roads. Christ Church is small – once inside, right beside the front doors there is a long table with brochures and religious paraphernalia for sale set up. There are about ten rows of pews before the main altar and the whole place has old light fixtures and plenty of worn-but-well-kept tiles.\n<h3>Dutch occupation</h3>\nBesides its commemorative purpose, Christ Church was constructed due to the fact that when the Dutch first conquered Malacca, they had no place of worship other than St. Paul’s Church, a small chapel built on St. Paul Hill.\n<br>Later on, when the British took over Malacca they added a weathercock and bell to Christ Church and transformed it from a Protestant church into an Anglican one. Entrance into the basilica is free; it is not a big building and the interior is dark yet cosy, with dark polished wooden pews that face the altar and large timber crucifixes that hang on the walls. Meanwhile, outside the church is a beautiful collection of potted plants and a colourful group of trishaws lined up for tourists.\n <br><br>Christ Church Melaka\n<br>•\tAddress: Jalan Kota Melaka, Melaka.\n<h1><font color=\"red\">River Of Bridges</h1>\nThe Melaka River winds its way from Dutch Square and goes past Tan Boon Seng Bridge. During the Portuguese invasion of Malacca, they seized this bridge and cut off communications between the two sides of the river, effectively dividing Malacca into two and leading to Malacca’s defeat.\n<br>There are a few other bridges along the Melaka River worth mentioning. Besides the Tan Boon Seng Bridge, there is the ‘Ghost Bridge of Malacca’ (a pedestrian bridge which links Kampung Pantai to Kampung Jawa) and the Old Market Bridge (which links Kampung Hulu to Jalan Kee Ann and the old Central Market). It used to be a picturesque scene of fishing boats berthed along the riverbanks here, but it is now mostly rows of Chinese restaurants. \n<br>Fun fact: one of these restaurants was featured in the Hollywood blockbuster Entrapment, starring Sean Connery and Catherine Zeta Jones.\n<h2>Chan Boon Cheng Bridge</h2>\nAlso on the Melaka River is the historical Chan Boon Cheng Bridge. It used to be a concrete structure until major renovations in 1963 led to its current steel façade. In the early 20th century, it linked the old quarter of Chinatown (then known as Kampung Pantai) on the west side of the riverbank to the new quarter of Chinatown (via Jalan Bunga Raya) on the east side.\n<br>The bridge is also known for its gruesome past. During the Japanese occupation, Japanese soldiers placed the severed heads of their victims at the foot of the bridge as a not-so-gentle reminder for locals to toe the line.\n<h2>Kampung Morten</h2>\nAfter passing several more bridges, the Melaka River leads up to Kampung Morten: an old Malay settlement classified as a national heritage site. It is a typical Malay village, but is widely-recognised as a living museum with well-preserved traditional Malay architecture and a conservative olden-days lifestyle. \n<br>A 17th century Portuguese cathedral called Church of Rosary is also located in Kampung Morten, though not much of the structure stood the test of time after Dutch colonials occupied Malacca in 1641.\n\n\n");
        jScrollPane1.setViewportView(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("<html> \n<b>Baba Nyonya Heritage Museum in Malacca</b> \n</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("<html>\n<b>A'Famosa in Melaka</b>\n</html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html> \n<b>Christ Church Melaka</b> \n</html>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("<html> \n<b>Melaka River</b> \n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MlkPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MlkPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MlkPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MlkPlace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MlkPlace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
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

