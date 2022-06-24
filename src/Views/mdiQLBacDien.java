package Views;

import Controller.QLBacDien_Controller;
import Model.tbBacDien;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class mdiQLBacDien extends javax.swing.JInternalFrame {
    DefaultTableModel tblDanhSach;
    List<tbBacDien> arr = new ArrayList<>();
    int b1,b2,b3,b4,b5;
    public mdiQLBacDien() {
        initComponents();
        tblDanhSach = (DefaultTableModel) dgDanhSach.getModel();
        LayNguon();
    }
    
    public void LayNguon(){
        arr = QLBacDien_Controller.LayNguonBD();
        tblDanhSach.setRowCount(0); //Xóa trắng danh sách
        arr.forEach(p->{
        tblDanhSach.addRow(new Object[]{
            p.getB1(), p.getB2(), p.getB3(),p.getB4(), p.getB5()
        });
    });
    }
    
    public void CapNhat(){
    b1= Integer.parseInt(sodien1.getText());
    b2= Integer.parseInt(sodien2.getText());
    b3= Integer.parseInt(sodien3.getText());
    b4= Integer.parseInt(sodien4.getText());
    b5= Integer.parseInt(sodien5.getText());
    tbBacDien bd = new tbBacDien(b1,b2,b3,b4,b5);
    QLBacDien_Controller.CapNhatBD(bd);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bd1 = new javax.swing.JTextField();
        kt1 = new javax.swing.JTextField();
        sodien1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgDanhSach = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bd2 = new javax.swing.JTextField();
        kt2 = new javax.swing.JTextField();
        sodien2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bd3 = new javax.swing.JTextField();
        kt3 = new javax.swing.JTextField();
        sodien3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bd4 = new javax.swing.JTextField();
        kt4 = new javax.swing.JTextField();
        sodien4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bd5 = new javax.swing.JTextField();
        kt5 = new javax.swing.JTextField();
        sodien5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bd6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1614, 965));
        setMinimumSize(new java.awt.Dimension(1614, 965));
        setPreferredSize(new java.awt.Dimension(1614, 965));
        setRequestFocusEnabled(false);

        bd1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bd1.setText("0");
        bd1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd1.setEnabled(false);
        bd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd1ActionPerformed(evt);
            }
        });

        kt1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        kt1.setText("50");
        kt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kt1ActionPerformed(evt);
            }
        });
        kt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kt1KeyReleased(evt);
            }
        });

        sodien1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sodien1.setText("50");
        sodien1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sodien1.setEnabled(false);
        sodien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodien1ActionPerformed(evt);
            }
        });
        sodien1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sodien1KeyReleased(evt);
            }
        });

        dgDanhSach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dgDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Bậc 1", "Bậc 2", "Bậc 3", "Bậc 4", "Bậc 5"
            }
        ));
        jScrollPane1.setViewportView(dgDanhSach);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bậc 1");

        bd2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bd2.setText("51");
        bd2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd2.setEnabled(false);
        bd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd2ActionPerformed(evt);
            }
        });

        kt2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        kt2.setText("100");
        kt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kt2ActionPerformed(evt);
            }
        });
        kt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kt2KeyReleased(evt);
            }
        });

        sodien2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sodien2.setText("50");
        sodien2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sodien2.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bậc 2");

        bd3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bd3.setText("101");
        bd3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd3.setEnabled(false);
        bd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd3ActionPerformed(evt);
            }
        });

        kt3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        kt3.setText("200");
        kt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kt3ActionPerformed(evt);
            }
        });
        kt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kt3KeyReleased(evt);
            }
        });

        sodien3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sodien3.setText("100");
        sodien3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sodien3.setEnabled(false);
        sodien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodien3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Bậc 3");

        bd4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bd4.setText("201");
        bd4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd4.setEnabled(false);
        bd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd4ActionPerformed(evt);
            }
        });

        kt4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        kt4.setText("300");
        kt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kt4ActionPerformed(evt);
            }
        });
        kt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kt4KeyReleased(evt);
            }
        });

        sodien4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sodien4.setText("100");
        sodien4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sodien4.setEnabled(false);
        sodien4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodien4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bậc 4");

        bd5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bd5.setText("301");
        bd5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd5.setEnabled(false);
        bd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd5ActionPerformed(evt);
            }
        });

        kt5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        kt5.setText("400");
        kt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kt5ActionPerformed(evt);
            }
        });
        kt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kt5KeyReleased(evt);
            }
        });

        sodien5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        sodien5.setText("100");
        sodien5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        sodien5.setEnabled(false);
        sodien5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodien5ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bậc 5");

        bd6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        bd6.setText("401");
        bd6.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        bd6.setEnabled(false);
        bd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bd6ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Bậc 6");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Số bắt đầu");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Số kết thúc");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Số số điện");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Quản Lý Bậc Điện");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(467, 467, 467)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bd6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bd5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kt5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bd4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kt4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bd3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kt3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bd2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kt2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(bd1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(90, 90, 90))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(103, 103, 103)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(kt1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sodien1)
                                        .addComponent(sodien2)
                                        .addComponent(sodien3, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                        .addComponent(sodien4)
                                        .addComponent(sodien5))
                                    .addComponent(jLabel9)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sodien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(sodien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sodien3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sodien4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sodien5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd1ActionPerformed

    private void kt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kt1ActionPerformed

    private void bd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd2ActionPerformed

    }//GEN-LAST:event_bd2ActionPerformed

    private void kt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kt2ActionPerformed

    private void bd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd3ActionPerformed

    private void kt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kt3ActionPerformed

    private void bd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd4ActionPerformed

    private void kt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kt4ActionPerformed

    private void bd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd5ActionPerformed

    private void kt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kt5ActionPerformed

    private void bd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bd6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bd6ActionPerformed

    private void sodien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sodien3ActionPerformed

    private void sodien4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodien4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sodien4ActionPerformed

    private void sodien5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodien5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sodien5ActionPerformed

    private void sodien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sodien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sodien1ActionPerformed

    private void sodien1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sodien1KeyReleased

    }//GEN-LAST:event_sodien1KeyReleased

    private void kt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kt1KeyReleased
    int sd1=Integer.parseInt(kt1.getText().toString())-Integer.parseInt(bd1.getText().toString());
        sodien1.setText(String.valueOf(sd1));
        int batdau2=Integer.parseInt(kt1.getText())+1;
       bd2.setText(String.valueOf(batdau2));
       int sd2=Integer.parseInt(kt2.getText().toString())-Integer.parseInt(bd2.getText().toString())+1;
        sodien2.setText(String.valueOf(sd2));
        CapNhat();
        LayNguon();
    }//GEN-LAST:event_kt1KeyReleased

    private void kt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kt2KeyReleased
    int sd2=Integer.parseInt(kt2.getText().toString())-Integer.parseInt(bd2.getText().toString())+1;
        sodien2.setText(String.valueOf(sd2));
        int batdau3=Integer.parseInt(kt2.getText())+1;
       bd3.setText(String.valueOf(batdau3));
       int sd3=Integer.parseInt(kt3.getText().toString())-Integer.parseInt(bd3.getText().toString())+1;
        sodien3.setText(String.valueOf(sd3));
        CapNhat();
        LayNguon();
    }//GEN-LAST:event_kt2KeyReleased

    private void kt3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kt3KeyReleased
    int sd3=Integer.parseInt(kt3.getText().toString())-Integer.parseInt(bd3.getText().toString())+1;
        sodien3.setText(String.valueOf(sd3));
        int batdau4=Integer.parseInt(kt3.getText())+1;
       bd4.setText(String.valueOf(batdau4));
       int sd4=Integer.parseInt(kt4.getText().toString())-Integer.parseInt(bd4.getText().toString())+1;
        sodien4.setText(String.valueOf(sd4));
        CapNhat();
        LayNguon();
    }//GEN-LAST:event_kt3KeyReleased

    private void kt4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kt4KeyReleased
    int sd4=Integer.parseInt(kt4.getText().toString())-Integer.parseInt(bd4.getText().toString())+1;
        sodien4.setText(String.valueOf(sd4));
        int batdau5=Integer.parseInt(kt4.getText())+1;
       bd5.setText(String.valueOf(batdau5));
       int sd5=Integer.parseInt(kt5.getText().toString())-Integer.parseInt(bd5.getText().toString())+1;
       sodien5.setText(String.valueOf(sd5));
       CapNhat();
       LayNguon();
    }//GEN-LAST:event_kt4KeyReleased

    private void kt5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kt5KeyReleased
    int sd5=Integer.parseInt(kt5.getText().toString())-Integer.parseInt(bd5.getText().toString())+1;
    sodien5.setText(String.valueOf(sd5));
    int batdau6=Integer.parseInt(kt5.getText())+1;
    bd6.setText(String.valueOf(batdau6));
    CapNhat();
    LayNguon();
    }//GEN-LAST:event_kt5KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bd1;
    private javax.swing.JTextField bd2;
    private javax.swing.JTextField bd3;
    private javax.swing.JTextField bd4;
    private javax.swing.JTextField bd5;
    private javax.swing.JTextField bd6;
    private javax.swing.JTable dgDanhSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kt1;
    private javax.swing.JTextField kt2;
    private javax.swing.JTextField kt3;
    private javax.swing.JTextField kt4;
    private javax.swing.JTextField kt5;
    private javax.swing.JTextField sodien1;
    private javax.swing.JTextField sodien2;
    private javax.swing.JTextField sodien3;
    private javax.swing.JTextField sodien4;
    private javax.swing.JTextField sodien5;
    // End of variables declaration//GEN-END:variables
}
