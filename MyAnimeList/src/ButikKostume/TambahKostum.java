/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ButikKostume;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Lenovo
 */
public class TambahKostum extends javax.swing.JFrame {

    /**
     * Creates new form TambahKostum
     */
    private DefaultTableModel model;
    private String filePath = "data.txt";

    public TambahKostum() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        loadTableData();
    }

    private void loadTableData() {
        model.setRowCount(0);

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membaca file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     private void saveTableData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder line = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    line.append(model.getValueAt(i, j));
                    if (j < model.getColumnCount() - 1) {
                        line.append(",");
                    }
                }
                writer.write(line.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menulis ke file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BtnUp = new javax.swing.JButton();
        BtnTambah = new javax.swing.JButton();
        BtnHapus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NamaKostum = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        Durasi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(177, 232, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnUp.setBackground(new java.awt.Color(255, 153, 51));
        BtnUp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnUp.setForeground(new java.awt.Color(255, 255, 255));
        BtnUp.setText("Update");
        BtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpActionPerformed(evt);
            }
        });
        jPanel1.add(BtnUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 350, 30));

        BtnTambah.setBackground(new java.awt.Color(4, 163, 211));
        BtnTambah.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnTambah.setForeground(new java.awt.Color(255, 255, 255));
        BtnTambah.setText("Tambah");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        jPanel1.add(BtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 350, 30));

        BtnHapus.setBackground(new java.awt.Color(255, 102, 102));
        BtnHapus.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BtnHapus.setForeground(new java.awt.Color(255, 255, 255));
        BtnHapus.setText("Hapus");
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 350, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButikKostume/Tak berjudul178_20230606161513.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButikKostume/Group 40 (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(223, 179, 179));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 58, -1, -1));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(223, 179, 179));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMIN");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 360, 400));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kostum", "Harga", "Estimasi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 770, 320));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel1.setText("Kostum");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 34, -1, -1));

        jLabel4.setText("Nama Kostum");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setText("Harga");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel6.setText("Estimasi");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        NamaKostum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaKostumActionPerformed(evt);
            }
        });
        jPanel5.add(NamaKostum, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 310, -1));

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel5.add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 310, -1));

        Durasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DurasiActionPerformed(evt);
            }
        });
        jPanel5.add(Durasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 310, -1));

        jButton1.setBackground(new java.awt.Color(4, 163, 211));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diedit");
        return;
    }

    String namaKostum = NamaKostum.getText();
    String harga = Harga.getText();
    String durasi = Durasi.getText();
    
    NamaKostum.setText("");
    Durasi.setText("");
    Harga.setText("");

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setValueAt(namaKostum, selectedRow, 0);
    model.setValueAt(harga, selectedRow, 1);
    model.setValueAt(durasi, selectedRow, 2);

    saveTableData(); // Simpan data setelah diedit

    JOptionPane.showMessageDialog(this, "Data berhasil diubah");
    }//GEN-LAST:event_BtnUpActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        // TODO add your handling code here:
    String namaKostum = NamaKostum.getText();
    String harga = Harga.getText();
    String durasi = Durasi.getText();
    
    NamaKostum.setText("");
    Durasi.setText("");
    Harga.setText("");

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[]{namaKostum, harga, durasi});

    saveTableData(); // Simpan data setelah ditambahkan

    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
        // TODO add your handling code here:
        saveTableData();
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.removeRow(selectedRow);

    saveTableData(); // Simpan data setelah dihapus

    JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    }//GEN-LAST:event_BtnHapusActionPerformed

    private void NamaKostumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaKostumActionPerformed

    // Pindahkan fokus ke kolom teks Durasi
    Harga.requestFocus();
    }//GEN-LAST:event_NamaKostumActionPerformed

    private void DurasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DurasiActionPerformed

    // Pindahkan fokus ke kolom teks Harga
    NamaKostum.requestFocus();
    }//GEN-LAST:event_DurasiActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed

    // Pindahkan fokus ke kolom teks NamaKostum (kembali ke awal)
    Durasi.requestFocus();
    }//GEN-LAST:event_HargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampilanAwal a;
            a = new tampilanAwal();
            a.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
//    private void populateTableFromFile(String filePath) {
//    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//
//    // Hapus semua data yang ada di tabel
//    model.setRowCount(0);
//
//    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//        String line;
//        while ((line = reader.readLine()) != null) {
//            String[] data = line.split(",");
//            model.addRow(data);
//        }
//    } catch (IOException e) {
//        e.printStackTrace();
//        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membaca file", "Error", JOptionPane.ERROR_MESSAGE);
//    }
//}
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahKostum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahKostum().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHapus;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JButton BtnUp;
    private javax.swing.JTextField Durasi;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField NamaKostum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
