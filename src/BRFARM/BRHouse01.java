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
public class BRHouse01 extends javax.swing.JFrame {

    public static String vMulti = "";
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel model;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Creates new form M001House
     */
    public BRHouse01() {
        initComponents();
        this.setTitle("FAR_MHOUSE : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);

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
        jTextHouse = new javax.swing.JTextField();
        jLabelCostc = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabelAdd1 = new javax.swing.JLabel();
        jTextLastMO = new javax.swing.JTextField();
        jLabelAdd2 = new javax.swing.JLabel();
        jcbMultiYes = new javax.swing.JCheckBox();
        jcbMultiNo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_MHOUSE. CREATE");
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

        jLabelName.setForeground(java.awt.Color.red);
        jLabelName.setText("House Code : *");

        jTextHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHouseActionPerformed(evt);
            }
        });

        jLabelCostc.setText("House Name :");

        jLabelAdd1.setText("House Last MO :");

        jLabelAdd2.setText("House Multi  :");

        jcbMultiYes.setText("Yes");
        jcbMultiYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMultiYesActionPerformed(evt);
            }
        });

        jcbMultiNo.setText("No");
        jcbMultiNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMultiNoActionPerformed(evt);
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
                        .addGap(0, 433, Short.MAX_VALUE)
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAdd1)
                            .addComponent(jLabelName)
                            .addComponent(jLabelCostc)
                            .addComponent(jLabelAdd2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbMultiYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcbMultiNo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextLastMO, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                            .addComponent(jTextName)
                            .addComponent(jTextHouse))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCostc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLastMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdd1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdd2)
                    .addComponent(jcbMultiYes)
                    .addComponent(jcbMultiNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonCreate)
                    .addComponent(jButtonUpdate))
                .addContainerGap(14, Short.MAX_VALUE))
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
            if (jTextHouse.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insert House Code");
                jTextHouse.requestFocusInWindow();
            } else if (jcbMultiYes.isSelected() == false && jcbMultiNo.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Select House Multi");
                jcbMultiYes.requestFocusInWindow();
            } else {

                String count = crd.CheckHouseDuplicate(BRLogin.vFarm, jTextHouse.getText());
                String breed;
                if ("1".equals(vMulti)) {
                    breed = "AL";
                } else {
                    breed = BRLogin.vDuckBreed;
                }

                if (Integer.valueOf(count) > 0) {
                    JOptionPane.showMessageDialog(null, jTextHouse.getText() + " Data Already");
                } else {
                    cid.InsertHouse(BRLogin.vFarm, jTextHouse.getText(), jTextName.getText(), jTextLastMO.getText(), vMulti.trim(), breed);
                    JOptionPane.showMessageDialog(null, "Insert Success");
                    BRData01.FrameOpen = "No";
                    this.setVisible(false);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_jButtonCreateActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        String breed;
        if (jcbMultiYes.isSelected() == false && jcbMultiNo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select House Multi");
            jcbMultiYes.requestFocusInWindow();
        }
        if ("1".equals(vMulti)) {
            breed = "AL";
        } else {
            breed = BRLogin.vDuckBreed;
        }

        cid.UpdateHouse(BRLogin.vFarm, jTextHouse.getText(), jTextName.getText(), jTextLastMO.getText(), vMulti.trim(), breed);
        JOptionPane.showMessageDialog(null, "Update Success");
        BRData01.FrameOpen = "No";
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

        if ("Yes".equals(BRData01.OnChange)) {
            jTextHouse.setText(BRData01.vHOUS_CODE);
            jTextName.setText(BRData01.vHOUS_NAME);
            jTextLastMO.setText(BRData01.vHOUS_LASTMO);

            vMulti = BRData01.vHOUS_MULTI;
            if ("No".equals(vMulti) || "".equals(vMulti)) {
                jcbMultiNo.setSelected(true);
            } else {
                jcbMultiYes.setSelected(true);
            }

            if (jcbMultiYes.isSelected() == true) {
                vMulti = "1";
            } else {
                vMulti = "0";
            }

            jTextName.requestFocusInWindow();
            jTextHouse.setEnabled(false);
            jButtonCreate.setVisible(false);
            jButtonUpdate.setVisible(true);
            BRData01.OnChange = "No";
        } else {
            jTextHouse.requestFocusInWindow();
            jTextHouse.setEnabled(true);
            jButtonCreate.setVisible(true);
            jButtonUpdate.setVisible(false);
            BRData01.OnCreate = "No";
        }

    }//GEN-LAST:event_formWindowOpened

    private void jTextHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHouseActionPerformed

    private void jcbMultiYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMultiYesActionPerformed
        // TODO add your handling code here:
        if (jcbMultiYes.isSelected() == true) {
            vMulti = "1";
            jcbMultiNo.setSelected(false);
        } else {
            vMulti = "";
        }
    }//GEN-LAST:event_jcbMultiYesActionPerformed

    private void jcbMultiNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMultiNoActionPerformed
        // TODO add your handling code here:
        if (jcbMultiNo.isSelected() == true) {
            vMulti = "0";
            jcbMultiYes.setSelected(false);
        } else {
            vMulti = "";
        }
    }//GEN-LAST:event_jcbMultiNoActionPerformed

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
            java.util.logging.Logger.getLogger(BRHouse01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRHouse01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRHouse01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRHouse01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRHouse01().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAdd1;
    private javax.swing.JLabel jLabelAdd2;
    private javax.swing.JLabel jLabelCostc;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JTextField jTextHouse;
    private javax.swing.JTextField jTextLastMO;
    private javax.swing.JTextField jTextName;
    private javax.swing.JCheckBox jcbMultiNo;
    private javax.swing.JCheckBox jcbMultiYes;
    // End of variables declaration//GEN-END:variables

}
