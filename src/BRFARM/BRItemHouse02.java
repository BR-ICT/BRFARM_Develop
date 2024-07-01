/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BRItemHouse02 extends javax.swing.JFrame {

    DefaultTableModel model;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Creates new form FarmJFrame
     */
    public BRItemHouse02() {
        initComponents();
        this.setTitle("BR01IH01. Item House Edit : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
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
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jLabelCode = new javax.swing.JLabel();
        jTextHouse = new javax.swing.JTextField();
        jcbItem = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_MPENE. CREATE");
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);
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

        jButtonCreate.setText("Create");
        jButtonCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCreateMouseClicked(evt);
            }
        });
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelName.setText("Item Code :");

        jLabelCode.setForeground(java.awt.Color.red);
        jLabelCode.setText("House Code : *");

        jTextHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHouseActionPerformed(evt);
            }
        });

        jcbItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Farm" }));
        jcbItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbItemActionPerformed(evt);
            }
        });
        jcbItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbItemKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 332, Short.MAX_VALUE)
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCode)
                            .addComponent(jLabelName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextHouse, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(jcbItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCode)
                    .addComponent(jTextHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jcbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here: 
        try {

            if ("Please Select : Item".equals(jcbItem.getSelectedItem().toString())) {
                JOptionPane.showMessageDialog(this, "Please Select Item");
                jcbItem.requestFocusInWindow();
            } else {
                String[] getItem = jcbItem.getSelectedItem().toString().split(" : ");
                String vItem = getItem[0];
                String count = crd.CheckItemHouseDuplicate(BRLogin.vFarm, jTextHouse.getText(), vItem, BRLogin.vDuckBreed);

                if (Integer.valueOf(count) > 0) {
                    JOptionPane.showMessageDialog(null, jcbItem.getSelectedItem().toString() + " Data Already");
                } else {
                    cid.InsertItemHouse(BRLogin.vFarm, jTextHouse.getText(), vItem, BRLogin.vDuckBreed);
                    JOptionPane.showMessageDialog(null, "Insert Success");
                    BRItemHouse01.FrameOpen = "No";
                    this.setVisible(false);
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String[] getItem = BRItemHouse01.vITEMH_CODE.split(" : ");
        String vItem = getItem[0];
        String[] getItemSelection = jcbItem.getSelectedItem().toString().split(" : ");
        String vItemSelection = getItemSelection[0];
        cid.UpdateItemHouse(BRLogin.vFarm, jTextHouse.getText(), vItem, vItemSelection, BRLogin.vDuckBreed);
        JOptionPane.showMessageDialog(null, "Update Success");
        BRItemHouse01.FrameOpen = "No";
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:   
        jcbItem.setModel(new DefaultComboBoxModel(cld.GetResultItemDesc(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));

        if ("Yes".equals(BRItemHouse01.OnChange)) {
            jTextHouse.setText(BRItemHouse01.vITEMH_HOUSE);
            jcbItem.setSelectedItem(BRItemHouse01.vITEMH_CODE);
            jcbItem.requestFocusInWindow();
            jTextHouse.setEnabled(false);
            jButtonCreate.setVisible(false);
            jButtonUpdate.setVisible(true);
            BRItemHouse01.OnChange = "No";
        } else {
            jTextHouse.setText(BRItemHouse01.vHouse);
            jcbItem.requestFocusInWindow();
            jTextHouse.setEnabled(false);
            jButtonCreate.setVisible(true);
            jButtonUpdate.setVisible(false);
            BRItemHouse01.OnCreate = "No";
        }

    }//GEN-LAST:event_formWindowOpened

    private void jTextHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHouseActionPerformed

    private void jcbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemActionPerformed

    private void jcbItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbItemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemKeyPressed

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
            java.util.logging.Logger.getLogger(BRItemHouse02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRItemHouse02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRItemHouse02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRItemHouse02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRItemHouse02().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JTextField jTextHouse;
    private javax.swing.JComboBox jcbItem;
    // End of variables declaration//GEN-END:variables

}
