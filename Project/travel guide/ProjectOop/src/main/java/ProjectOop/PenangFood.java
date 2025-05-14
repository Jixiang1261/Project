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
public class PenangFood extends javax.swing.JFrame {

    
    public PenangFood() {
        initComponents();
        scaledImage1();
        scaledImage2();
        scaledImage3();
        scaledImage4();
    }
    public void scaledImage1(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Penang\\Food\\pic\\1.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel3.setIcon(scaledIcon);
    }
    public void scaledImage2(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Penang\\Food\\pic\\3.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel5.setIcon(scaledIcon);
    }
    public void scaledImage3(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Penang\\Food\\pic\\5.jpg");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel7.setIcon(scaledIcon);
    }
    public void scaledImage4(){
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Desktop\\Oop\\Penang\\Food\\pic\\6.jpg");
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

        jLabel1.setText("<html>\n<h1><font color=\"red\">Kheng Pin Cafe</h1>\nIf deep-fried Malaysian food is your thing, then you’ll enjoy lor bak. It’s a Hokkien/Teochew <br>dish consisting of various meats, seafood, tofu, and vegetables. They’re seasoned with <br>five-spice powder and rolled in a thin beancurd skin before being deep-fried and served <br>with chili sauce and loh, which is a sweet sauce thickened with corn starch and beaten <br>eggs.\n<br>Khen Pin Cafe has been cited by leading Singapore and Penang food blogs as having <br>some of the best lor bak in Penang. So shiok ah!\n<br>If you’re familiar with Filipio street food, then you may recognize this as kikiam. They’re <br>similar but the coating on lor bak is drier, thicker, and crunchier.\n<br><br>Kheng Pin Cafe\n<br>Address: 80, Jalan Penang, George Town, 10000 George Town, Pulau Pinang, Malaysia\n<br>Operating Hours: 7AM-3PM, Tue-Sun (closed Mon)\n<br>Expect to Pay: About RM 10 (for two)\n<br>How to Get There: Kheng Pin Cafe is a short walk from the corner of Penang Road and Chulia Street. Walk northeast on Penang Road and you’ll see it on your left at the corner of Sri Bahari Road.\n<h1><font color=\"red\">Sister Yao’s Char Koay Kak at Macalister Lane</h1>\nChar koay kak is a type of radish cake stir-fried in a thick black soy sauce with preserved radish, bean sprouts, and eggs. It’s known as chai tow kueh or “carrot cake” in Singapore.\n<br>In Penang, this humble stall along Macalister Lane has been serving some of the city’s best char koay kak for over forty years. Char koay kak is super tasty. It’s savory and a little sweet with a nice gummy texture.\n<br>At first, we weren’t too crazy about this dish but it quickly grew on us. This seemed to be the case with many of the Malaysian dishes we tried in Penang.\n<br>It doesn’t knock your socks off right away but you develop a taste for it at the end. I loved the contrasting crunchiness of the bean sprouts with the gumminess of the radish cake.\n<br>Sister Yao’s Char Koay Kak stall is located outside Seow Fong Lye Cafe along Macalister Lane. The Eoh sisters took over from their father over thirty years ago and have kept the recipe intact.\n<br>We made a quick stop here en route to the Komtar Bus Terminal. If you’re taking the bus to Kek Lok Si Temple, then this is a great place to have breakfast or a light snack.\n<br><br>Sister Yao’s Char Koay Kak @ Macalister Lane\n<br>Address: 94, Lorong Macalister, George Town, 10400 George Town, Pulau Pinang, Malaysia\n<br>Operating Hours: 7AM–1PM, daily\n<br>Expect to Pay: About RM 5\n<br>How to Get There: From the corner of Penang Road and Chulia Street, walk southwest on Penang Road until you reach Burmah Road. Turn right onto Burma Road then turn left onto Macalister Lane. Sister Yao’s Char Koay Kak stall will be on your left around the entrance to Seow Fong Lye Cafe.\n<h1><font color=\"red\">Lok Lok at Medan Selera Padang Brown</h1>\nThis was fun and perhaps our most enjoyable meal in Penang. Like kaiten-zushi restaurants in Japan, there’s just something really fun about grabbing whatever food you want whenever you want without having to order from a waiter.\n<br>Lok Lok is a type of communal hot pot dish wherein every ingredient is skewered on sticks so you can easily dunk and retrieve your food from a central pot of boiling water.\n<br>A variety of ingredients are typically offered like fresh seafood, meatballs, fish cakes, mushrooms, dumplings, eggs, and offal. Sticks are labeled with different colors to indicate price, all of which are added up at the end of your meal.\n<br>There are many lok lok restaurants in Penang but we read about this place at Medan Selera Padang Brown, the same food court as the seafood popiah stall, so we visited both on the same day. \n<br>Lok lok is a communal steamboat meal so other diners may share your table. Luckily for us, we arrived at Medan Selera Padang Brown at an off time so we were the only ones there.\n<br>Having the entire spread all to ourselves made it even more fun. I didn’t have to elbow anyone for that last stick of cuttlefish! On the table are different sauces like satay and sambal which you can mix to make your own blend. \n<br><br>Medan Selera Padang Brown\n<br>Address: Jalan Perak, 10400 George Town, Pulau Pinang, Malaysia\n<br>Operating Hours: 5:30–11:30PM, daily\n<br>Expect to Pay: About RM 10 per person\n<br>How to Get There: The Padang Brown Food Court is too far to walk from the center of George Town so it’s best to take a taxi or use Grab.\n<h1><font color=\"red\">Air Itam Asam Laksa</h1>\nLike char koay teow, asam laksa is considered one of the best dishes to eat in Penang. It’s a tamarind-based laksa so it’s more sour compared to the coconut-based curry laksas that are popular in Singapore.\n<br>Interestingly, curry laksa is a common food in Penang as well, but it’s referred to as curry mee to distinguish it from asam laksa. When someone in Penang says “laksa”, they’re typically referring to asam laksa.\n<br>Asam laksa at a Penang street food stall in Air Itam Market near Kek Lok Si Temple. It’s a famous stall that has a reputation for serving some of the best asam laksa in Penang. This was one of our favorite dishes in Penang. We enjoy curry laksa but we instantly fell in love with the depth of flavor in asam laksa.\n<br>Apart from the noodles and tamarind used as a souring agent, the main ingredients in an asam laksa are mackerel, lemongrass, galangal, and chili. It’s garnished with mint, pineapple, onion, a sweet prawn paste, and torch ginger flower.\n<br>The use of pineapple was interesting. I don’t recall seeing it but the laksa did have a distinctly chewy and stringy texture that’s consistent with pineapple.\n<br>This famous hawker stall at Air Itam market has been serving their signature asam laksa at this very spot for over thirty years.\n<br><br>Air Itam Asam Laksa\n<br>Address: Jalan Pasar, Paya Terubong, 11500 George Town, Pulau Pinang, Malaysia\n<br>Operating Hours: 10:30AM-7PM, Thurs-Tue (closed Wednesdays)\n<br>Expect to Pay: Around RM 6 per person\n<br>How to Get There: From Komtar Bus Terminal, take bus 203 or 204 to Air Itam (RM 2 each way). It’s the last stop so you can’t miss it. Air Itam Asam Laksa is located on the corner of Jalan Pasar and the main road of Jalan Paya Terubong.\n</html>\n");
        jScrollPane1.setViewportView(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("<html>\n<b>Kheng Pin Cafe</b>\n</html>");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("<html>\n<b>Sister Yao’s Char Koay Kak at Macalister Lane</b>\n</html>");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("<html>\n<b>Lok Lok at Medan Selera Padang Brown</b>\n</html>");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("<html>\n<b>Air Itam Asam Laksa</b>\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 60, Short.MAX_VALUE))
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        systemExit();//exit the login page 
              PenangInterface Info = new PenangInterface();//open Admin Menu
              Info.setVisible(true);//Set the Admin Menu visible to true
              dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenangFood().setVisible(true);
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
