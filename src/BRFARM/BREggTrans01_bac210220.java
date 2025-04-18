/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BREggTrans01_bac210220 extends javax.swing.JFrame {

    public static String vINVE_FARM, vINVE_DATE, vINVE_HOUSE, vHOUS_NAME, vINVE_ITEM, vITEM_NAME, vINVE_BALANCE, vITEM_UNIT;
    public static String OnCreate, OnChange;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd", Locale.US);
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel mDuck, mCullDuck, mEgg, mOther;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Launch the application.
     */
    public BREggTrans01_bac210220() {
        initComponents();
        this.setTitle("BR01P007. Egg Transfer : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        mEgg = (DefaultTableModel) jTableEgg.getModel();
        jXDateStart.setFormats(sdf);
        jXDateEnd.setFormats(sdf);
        jXDateTransfer.setFormats(sdf);
        jXDateStart.setDate(new Date());
        jXDateEnd.setDate(new Date());
        jXDateTransfer.setDate(new Date());
        jMenuSave.setEnabled(false);
        jMenuSave.setEnabled(false);
        jMenuCreate.setEnabled(false);
        jMenuChange.setEnabled(false);
        jMenuDelete.setEnabled(false);
        jMenuRefresh.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonClose = new javax.swing.JButton();
        jButtonTransfer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEgg = new javax.swing.JTable();
        jLabelFlockSTDate = new javax.swing.JLabel();
        jXDateTransfer = new org.jdesktop.swingx.JXDatePicker();
        jXDateEnd = new org.jdesktop.swingx.JXDatePicker();
        jLabelFlockSTDate1 = new javax.swing.JLabel();
        jLabelFlockSTDate2 = new javax.swing.JLabel();
        jXDateStart = new org.jdesktop.swingx.JXDatePicker();
        jButtonSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSave = new javax.swing.JMenu();
        jMenuCreate = new javax.swing.JMenu();
        jMenuChange = new javax.swing.JMenu();
        jMenuDelete = new javax.swing.JMenu();
        jMenuRefresh = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_MFARM. LIST");
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonTransfer.setText("Transfer");
        jButtonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferActionPerformed(evt);
            }
        });

        jTableEgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House", "Qty (Pcs.)", "Good Egg", "Double Egg", "Small Egg", "Crack Egg", "Double + Small + Crack"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableEgg);

        jLabelFlockSTDate.setText("Transfer Date :");

        jLabelFlockSTDate1.setText("To Date :");

        jLabelFlockSTDate2.setText("Start Date :");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jMenuSave.setText("Save :");
        jMenuBar1.add(jMenuSave);

        jMenuCreate.setText("Create :");
        jMenuCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCreateMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCreate);

        jMenuChange.setText("Change :");
        jMenuChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuChangeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuChange);

        jMenuDelete.setText("Delete :");
        jMenuDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDeleteMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuDelete);

        jMenuRefresh.setText("Refresh :");
        jMenuRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRefreshMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuRefresh);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFlockSTDate2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFlockSTDate1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFlockSTDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jXDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonTransfer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFlockSTDate2)
                        .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFlockSTDate1)
                        .addComponent(jXDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFlockSTDate)
                        .addComponent(jXDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTransfer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetModel() {

        while (mEgg.getRowCount() > 0) {
            for (int i = 0; i < mEgg.getRowCount(); ++i) {
                mEgg.removeRow(i);
            }
        }

    }

    private void EggDetail() {

        String vEgg, FEgg1, FEgg2, FEgg3, FEgg4, MEgg1, MEgg2, MEgg3, MEgg4;
        if ("GP".equals(BRLogin.vDuckBreed)) {
            vEgg = BRLogin.vDuckHC + "3";
            FEgg1 = BRLogin.vDuckHC + "302001";
            FEgg2 = BRLogin.vDuckHC + "302002";
            FEgg3 = BRLogin.vDuckHC + "302003";
            FEgg4 = BRLogin.vDuckHC + "302004";
            MEgg1 = BRLogin.vDuckHC + "303001";
            MEgg2 = BRLogin.vDuckHC + "303002";
            MEgg3 = BRLogin.vDuckHC + "303003";
            MEgg4 = BRLogin.vDuckHC + "303004";
        } else {
            vEgg = BRLogin.vDuckHC + "1";
            FEgg1 = BRLogin.vDuckHC + "102001";
            FEgg2 = BRLogin.vDuckHC + "102002";
            FEgg3 = BRLogin.vDuckHC + "102003";
            FEgg4 = BRLogin.vDuckHC + "102004";
            MEgg1 = BRLogin.vDuckHC + "103001";
            MEgg2 = BRLogin.vDuckHC + "103002";
            MEgg3 = BRLogin.vDuckHC + "103003";
            MEgg4 = BRLogin.vDuckHC + "103004";
        }

        List<String> getListEggStockDetail = cld.GetResultEggStockDescTransfer(BRLogin.vFarm, BRLogin.vDuckBreed, vEgg, FEgg1, FEgg2, FEgg3, FEgg4, MEgg1, MEgg2, MEgg3, sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()), MEgg4);
        ResetModel();

        for (int i = 0; i < getListEggStockDetail.size(); i++) {
            String[] CheckEggStockDetail = getListEggStockDetail.get(i).split(";");

            if ("Total Line".equals(CheckEggStockDetail[0].trim())) {
                mEgg.insertRow(mEgg.getRowCount(), new Object[]{
                    CheckEggStockDetail[0].trim(),
                    CheckEggStockDetail[1].trim(),
                    CheckEggStockDetail[2].trim(),
                    CheckEggStockDetail[3].trim(),
                    CheckEggStockDetail[4].trim(),
                    CheckEggStockDetail[5].trim(),
                    CheckEggStockDetail[6].trim()
                });
                mEgg.insertRow(mEgg.getRowCount(), new Object[]{
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                });
            } else {
                mEgg.insertRow(mEgg.getRowCount(), new Object[]{
                    CheckEggStockDetail[0].trim(),
                    CheckEggStockDetail[1].trim(),
                    CheckEggStockDetail[2].trim(),
                    CheckEggStockDetail[3].trim(),
                    CheckEggStockDetail[4].trim(),
                    CheckEggStockDetail[5].trim(),
                    CheckEggStockDetail[6].trim()
                });
            }

        }

    }

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jMenuCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCreateMouseClicked

    private void jMenuChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuChangeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuChangeMouseClicked

    private void jMenuDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuDeleteMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButtonTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferActionPerformed
        // TODO add your handling code here:

        String vEgg;
        if ("GP".equals(BRLogin.vDuckBreed)) {
            vEgg = BRLogin.vDuckHC + "3";
        } else {
            vEgg = BRLogin.vDuckHC + "1";
        }

        String MaxLotNo = crd.CheckMaxTranferNumber(BRLogin.vFarm, sdf2.format(jXDateTransfer.getDate()), BRLogin.vDuckBreed);

        cid.InsertEggMTransection(BRLogin.vFarm, sdf.format(jXDateTransfer.getDate()), sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()), vEgg, BRLogin.vDuckBreed);
        cid.InsertEggDTransection(BRLogin.vFarm, sdf.format(jXDateTransfer.getDate()), sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()), vEgg, MaxLotNo, BRLogin.vDuckBreed);
        cid.UpdateEggInvenBalUpDate(BRLogin.vFarm, sdf.format(jXDateTransfer.getDate()), sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()), vEgg, BRLogin.vDuckBreed);
        cid.UpdateEggInvenLot(BRLogin.vFarm, sdf.format(jXDateTransfer.getDate()), sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()), vEgg, BRLogin.vDuckBreed);
        JOptionPane.showMessageDialog(this, "Transfer Completed");
        ResetModel();
    }//GEN-LAST:event_jButtonTransferActionPerformed

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
        EggDetail();
    }//GEN-LAST:event_jMenuRefreshMouseClicked

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        EggDetail();
    }//GEN-LAST:event_jButtonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(BREggTrans01_bac210220.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01_bac210220.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01_bac210220.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01_bac210220.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BREggTrans01_bac210220().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonTransfer;
    private javax.swing.JLabel jLabelFlockSTDate;
    private javax.swing.JLabel jLabelFlockSTDate1;
    private javax.swing.JLabel jLabelFlockSTDate2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChange;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableEgg;
    private org.jdesktop.swingx.JXDatePicker jXDateEnd;
    private org.jdesktop.swingx.JXDatePicker jXDateStart;
    private org.jdesktop.swingx.JXDatePicker jXDateTransfer;
    // End of variables declaration//GEN-END:variables
}
