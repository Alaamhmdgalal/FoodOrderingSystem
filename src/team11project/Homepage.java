/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team11project;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.AbstractButton;

/**
 *
 * @author Copy Center
 */
public class Homepage extends javax.swing.JFrame {
    DefaultListModel list = new DefaultListModel();
    private ArrayList<Product> items = new ArrayList<>();
    private ArrayList<Product> items1 = new ArrayList<>();
    private ArrayList<Product> items2 = new ArrayList<>();
    double total = 0.0;
    
    public Homepage() {
        initComponents();
    }

    private void add(String name){
        list1.setModel(list);
        list.addElement(name);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        zinger = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        twister = new javax.swing.JLabel();
        chickenbucket = new javax.swing.JLabel();
        fries = new javax.swing.JLabel();
        coleslaw = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bigtasty = new javax.swing.JLabel();
        bigmac = new javax.swing.JLabel();
        nuggets = new javax.swing.JLabel();
        fries1 = new javax.swing.JLabel();
        macdo = new javax.swing.JLabel();
        chickenranch = new javax.swing.JLabel();
        chickensupreme = new javax.swing.JLabel();
        pepperoni = new javax.swing.JLabel();
        seafoodlovers = new javax.swing.JLabel();
        margherita = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        nametext = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JList<>();
        jLabel25 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        show = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Food Ordering System");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));

        zinger.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        zinger.setText("Zinger  60.0");
        zinger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zingerMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Pizza Hut Products");

        jLabel11.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("KFC Products");

        twister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        twister.setText("Twister 30.0");
        twister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twisterMouseClicked(evt);
            }
        });

        chickenbucket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chickenbucket.setText("Chicken bucket 140.0");
        chickenbucket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickenbucketMouseClicked(evt);
            }
        });

        fries.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fries.setText("Fries 20.0");
        fries.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friesMouseClicked(evt);
            }
        });

        coleslaw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coleslaw.setText("Coleslaw 10.0");
        coleslaw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coleslawMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("MAC Products");

        bigtasty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bigtasty.setText("BigTasty 60.0");
        bigtasty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bigtastyMouseClicked(evt);
            }
        });

        bigmac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bigmac.setText("BigMac  50.0");
        bigmac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bigmacMouseClicked(evt);
            }
        });

        nuggets.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nuggets.setText("Nuggets  20.0");
        nuggets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuggetsMouseClicked(evt);
            }
        });

        fries1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fries1.setText("Fries  20.0");
        fries1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fries1MouseClicked(evt);
            }
        });

        macdo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        macdo.setText("Macdo  30.0");
        macdo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                macdoMouseClicked(evt);
            }
        });

        chickenranch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chickenranch.setText("Chicken Ranch  70.0");
        chickenranch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickenranchMouseClicked(evt);
            }
        });

        chickensupreme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chickensupreme.setText("Chicken Supreme  70.0");
        chickensupreme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chickensupremeMouseClicked(evt);
            }
        });

        pepperoni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        pepperoni.setText("Pepperoni  50.0");
        pepperoni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pepperoniMouseClicked(evt);
            }
        });

        seafoodlovers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        seafoodlovers.setText("Sea Food Lovers  90.0");
        seafoodlovers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seafoodloversMouseClicked(evt);
            }
        });

        margherita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        margherita.setText("Margherita  40.0");
        margherita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                margheritaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(zinger, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(twister)
                    .addComponent(fries)
                    .addComponent(coleslaw)
                    .addComponent(chickenbucket)
                    .addComponent(bigtasty)
                    .addComponent(bigmac)
                    .addComponent(nuggets)
                    .addComponent(fries1)
                    .addComponent(macdo)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chickenranch)
                    .addComponent(chickensupreme)
                    .addComponent(pepperoni)
                    .addComponent(seafoodlovers)
                    .addComponent(margherita))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(zinger)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chickenbucket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fries)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coleslaw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bigtasty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bigmac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuggets, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fries1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(macdo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chickenranch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chickensupreme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seafoodlovers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(margherita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        select.setForeground(new java.awt.Color(0, 102, 102));
        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.darkGray));

        jLabel5.setFont(new java.awt.Font("Cambria", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Contact Staff");

        jLabel7.setText("Phone number:");

        jLabel8.setText("Email:");

        jLabel9.setText("07775000");

        jLabel10.setText("staff_eng@eng.asu.edu.eg");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        logout.setForeground(new java.awt.Color(0, 102, 102));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(list1);

        jScrollPane4.setViewportView(jScrollPane2);

        jLabel25.setText("Name:");

        remove.setForeground(new java.awt.Color(0, 102, 102));
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        checkout.setForeground(new java.awt.Color(0, 102, 102));
        checkout.setText("Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(select, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nametext, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                            .addComponent(checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(logout))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(select)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkout)
                        .addGap(18, 18, 18)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_logoutActionPerformed

    private void twisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twisterMouseClicked
        String selected;
        selected = twister.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_twisterMouseClicked

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
    add(nametext.getText());
    nametext.setText("");
    }//GEN-LAST:event_selectActionPerformed

    private void zingerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zingerMouseClicked
        String selected;
        selected = zinger.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_zingerMouseClicked

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextActionPerformed

    private void chickenbucketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickenbucketMouseClicked
        String selected;
        selected = chickenbucket.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_chickenbucketMouseClicked

    private void friesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friesMouseClicked
        String selected;
        selected = fries.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_friesMouseClicked

    private void coleslawMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coleslawMouseClicked
        String selected;
        selected = coleslaw.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_coleslawMouseClicked

    private void bigtastyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigtastyMouseClicked
        String selected;
        selected = bigtasty.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_bigtastyMouseClicked

    private void bigmacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bigmacMouseClicked
        String selected;
        selected = bigmac.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_bigmacMouseClicked

    private void nuggetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuggetsMouseClicked
        String selected;
        selected = nuggets.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_nuggetsMouseClicked

    private void fries1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fries1MouseClicked
        String selected;
        selected = fries1.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_fries1MouseClicked

    private void macdoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_macdoMouseClicked
        String selected;
        selected = macdo.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_macdoMouseClicked

    private void chickenranchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickenranchMouseClicked
        String selected;
        selected = coleslaw.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_chickenranchMouseClicked

    private void chickensupremeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chickensupremeMouseClicked
        String selected;
        selected = chickensupreme.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_chickensupremeMouseClicked

    private void pepperoniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pepperoniMouseClicked
        String selected;
        selected = pepperoni.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_pepperoniMouseClicked

    private void seafoodloversMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seafoodloversMouseClicked
        String selected;
        selected = seafoodlovers.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_seafoodloversMouseClicked

    private void margheritaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_margheritaMouseClicked
        String selected;
        selected = margherita.getText();
        nametext.setText(selected);
    }//GEN-LAST:event_margheritaMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        int index = list1.getSelectedIndex();
        list.removeElementAt(index);
    }//GEN-LAST:event_removeActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        
    items.add(new Product("BigTasty", 60.0));
    items.add(new Product("BigMac", 50.0));
    items.add(new Product("Nuggets", 20.0));
    items.add(new Product("Fries", 20.0));
    items.add(new Product("Macdo", 30.0));
    items.add(new Product("Zinger", 60.0));
    items.add(new Product("Twister", 30.0));
    items.add(new Product("Chicken bucket", 140.0));
    items.add(new Product("Fries", 20.0));
    items.add(new Product("Coleslaw", 10.0));
    items.add(new Product("Chicken Ranch", 70.0));
    items.add(new Product("Chicken Supreme", 70.0));
    items.add(new Product("Pepperoni", 50.0));
    items.add(new Product("Sea Food Lovers", 90.0));
    items.add(new Product("Margherita", 40.0));
        
    for(int i = 0; i<items.size(); i++){
        for (int z = 0; z< list1.getModel().getSize(); z++)
        if ((list1.getModel().getElementAt(z)).contains(items.get(i).getName())){
            total += items.get(i).getPrice();
        }
    }
        show.setText(Double.toString(total));
        Checkout x = new Checkout();
        x.totalprice.setText(show.getText());
        
        dispose();
        x.setVisible(true);
    }//GEN-LAST:event_checkoutActionPerformed

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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bigmac;
    private javax.swing.JLabel bigtasty;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel chickenbucket;
    private javax.swing.JLabel chickenranch;
    private javax.swing.JLabel chickensupreme;
    private javax.swing.JLabel coleslaw;
    private javax.swing.JLabel fries;
    private javax.swing.JLabel fries1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> list1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel macdo;
    private javax.swing.JLabel margherita;
    private javax.swing.JTextField nametext;
    private javax.swing.JLabel nuggets;
    private javax.swing.JLabel pepperoni;
    private javax.swing.JButton remove;
    private javax.swing.JLabel seafoodlovers;
    private javax.swing.JButton select;
    private javax.swing.JLabel show;
    private javax.swing.JLabel twister;
    private javax.swing.JLabel zinger;
    // End of variables declaration//GEN-END:variables
}
