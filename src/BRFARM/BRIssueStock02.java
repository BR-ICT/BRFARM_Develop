/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BRIssueStock02 extends javax.swing.JFrame {

    DefaultTableModel mTransection;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();
    DecimalFormat df = new DecimalFormat("#.00");

    /**
     * Launch the application.
     */
    public BRIssueStock02() {
        initComponents();
        this.setTitle("BF01E002D. Infor Description : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        mTransection = (DefaultTableModel) jTableTransection.getModel();
        jMenuSave.setEnabled(true);
        jMenuCreate.setEnabled(false);
        jMenuChange.setEnabled(false);
        jMenuDelete.setEnabled(true);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransection = new javax.swing.JTable();
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
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableTransection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Desc", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTransection);

        jMenuSave.setText("Save :");
        jMenuSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSaveMouseClicked(evt);
            }
        });
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetModel() {

        while (mTransection.getRowCount() > 0) {
            for (int i = 0; i < mTransection.getRowCount(); ++i) {
                mTransection.removeRow(i);
            }
        }

    }

    private void InforDetail() {

        List<String> getListDInforDetail = cld.GetResultDInforDetail(BRLogin.vFarm, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_ITEM, crd.CheckItemGroup(BRLogin.vFarm, BRIssueStock01.vTRAN_ITEM), BRLogin.vDuckBreed, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase());
        ResetModel();

        for (int i = 0; i < getListDInforDetail.size(); i++) {
            String[] CheckDInforDetail = getListDInforDetail.get(i).split(";");
            mTransection.insertRow(mTransection.getRowCount(), new Object[]{
                CheckDInforDetail[0].trim(),
                CheckDInforDetail[1].trim(),
                CheckDInforDetail[2].trim()
            });
        }

    }

    private void CheckRemark() {

        float sumQty = 0;
        for (int i = 0; i <= mTransection.getRowCount() - 1; i++) {
            String getQty = mTransection.getValueAt(i, 2).toString();
            sumQty += Float.valueOf(getQty);
        }
        String ItemGroup = crd.CheckItemGroup(BRLogin.vFarm, BRIssueStock01.vTRAN_ITEM);

        if ("G".equals(ItemGroup.substring(0, 1)) || "P".equals(ItemGroup.substring(0, 1))) {
            if (df.format(Float.valueOf(BRIssueStock01.vTRAN_QTY)).equals(df.format(sumQty))) {
                BRIssueStock01.MathRemark = true;
            } else {
                BRIssueStock01.MathRemark = false;
            }
        } else if ("H".equals(ItemGroup.substring(0, 1))) {
            if (sumQty != 0) {
                BRIssueStock01.MathRemark = true;
            } else {
                BRIssueStock01.MathRemark = false;
            }
        } else {
            BRIssueStock01.MathRemark = true;
        }

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        InforDetail();
        CheckRemark();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCreateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuCreateMouseClicked

    private void jMenuChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuChangeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuChangeMouseClicked

    private void jMenuDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDeleteMouseClicked
        // TODO add your handling code here:
        int index = jTableTransection.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please select record for Delete!");
        } else {
            String getDise = mTransection.getValueAt(jTableTransection.getSelectedRow(), 0).toString();
            String getQty = mTransection.getValueAt(jTableTransection.getSelectedRow(), 2).toString();
            if (Float.valueOf(getQty) != 0) {
                cid.DeleteDInforByDise(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, getDise);
            }
        }
        InforDetail();
        CheckRemark();
    }//GEN-LAST:event_jMenuDeleteMouseClicked

    private void jMenuSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSaveMouseClicked
        // TODO add your handling code here:
        for (int i = 0; i <= mTransection.getRowCount() - 1; i++) {
            String getDise = mTransection.getValueAt(i, 0).toString();
            String getQty = mTransection.getValueAt(i, 2).toString();

            if (Float.valueOf(getQty) != 0) {

                if ("-".equals(BRIssueStock01.vTRAN_QTY.substring(0, 1))) {
                    String CheckMInfor = crd.CheckMInforDuplicate(BRLogin.vFarm, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_ITEM, getDise, BRLogin.vDuckBreed);
                    if (Integer.valueOf(CheckMInfor) > 0) {

                        List<String> getListDiseMInform = cld.GetResultDiseMInform(BRLogin.vFarm, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_ITEM, getDise, BRLogin.vDuckBreed);
                        for (int ii = 0; ii < getListDiseMInform.size(); ii++) {
                            String[] CheckQtyInvenLot = getListDiseMInform.get(ii).split(";");
                            String vItem = CheckQtyInvenLot[0].trim();
                            String vDise = CheckQtyInvenLot[1].trim();
                            String vQty = CheckQtyInvenLot[2].trim();

                            if (Math.abs(Float.valueOf(getQty)) <= Float.valueOf(vQty) && "-".equals(getQty.substring(0, 1))) {
                                String getCount = crd.CheckDInforDuplicate(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, getDise, BRIssueStock01.vTRAN_QTY);
                                if (Integer.valueOf(getCount) != 0) {
                                    cid.UpdateDInfor(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, getDise, getQty, BRIssueStock01.vTRAN_QTY, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase());
                                } else {
                                    cid.InsertDInfor(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, BRIssueStock01.vTRAN_PENE, getDise, getQty, BRIssueStock01.vTRAN_QTY, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase(), BRLogin.vDuckBreed);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Item : " + BRIssueStock01.vTRAN_ITEM + " " + getDise + " not enough");
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Item : " + BRIssueStock01.vTRAN_ITEM + " " + getDise + " dose not exit MInform");
                    }

                } else {
                    String getCount = crd.CheckDInforDuplicate(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, getDise, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase());
                    if (Integer.valueOf(getCount) != 0) {
                        cid.UpdateDInfor(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, getDise, getQty, BRIssueStock01.vTRAN_QTY, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase());
                    } else {
                        cid.InsertDInfor(BRLogin.vFarm, BRIssueStock01.vTRAN_DATE, BRIssueStock01.vTRAN_HOUSE, BRIssueStock01.vTRAN_ITEM, BRIssueStock01.vTRAN_PENE, getDise, getQty, BRIssueStock01.vTRAN_QTY, BRIssueStock01.vTRAN_DATE + BRIssueStock01.vTRAN_HOUSE + BRIssueStock01.vTRAN_ITEM + BRLogin.vUsername.toUpperCase(), BRLogin.vDuckBreed);
                    }
                }
            }

        }
        InforDetail();
        CheckRemark();
    }//GEN-LAST:event_jMenuSaveMouseClicked

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
        InforDetail();
    }//GEN-LAST:event_jMenuRefreshMouseClicked

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
            java.util.logging.Logger.getLogger(BRIssueStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRIssueStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRIssueStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRIssueStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRIssueStock02().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChange;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTransection;
    // End of variables declaration//GEN-END:variables
}