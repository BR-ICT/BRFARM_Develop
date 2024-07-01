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
public class BRFarm01 extends javax.swing.JFrame {

    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel model;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();

    /**
     * Creates new form M001Farm
     */
    public BRFarm01() {
        initComponents();
        this.setTitle("FAR_MFARM : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
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
        jTextCode = new javax.swing.JTextField();
        jTextCostc = new javax.swing.JTextField();
        jTextAdd2 = new javax.swing.JTextField();
        jTextAdd1 = new javax.swing.JTextField();
        jTextName = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelCostc = new javax.swing.JLabel();
        jLabelAdd1 = new javax.swing.JLabel();
        jLabelAdd2 = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelFax = new javax.swing.JLabel();
        jTextTel = new javax.swing.JTextField();
        jTextFax = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_MFARM. CREATE");
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
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

        jTextCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodeActionPerformed(evt);
            }
        });

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jLabelCode.setForeground(java.awt.Color.red);
        jLabelCode.setText("Farm Code : *");

        jLabelName.setForeground(java.awt.Color.red);
        jLabelName.setText("Farm Name : *");

        jLabelCostc.setForeground(java.awt.Color.red);
        jLabelCostc.setText("Farm Costc : *");

        jLabelAdd1.setText("Address 1 :");

        jLabelAdd2.setText("Address 2 :");

        jLabelTel.setText("Tel :");

        jLabelFax.setText("Fax :");

        jTextFax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFaxActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 496, Short.MAX_VALUE)
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCostc)
                            .addComponent(jLabelName)
                            .addComponent(jLabelCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextCode)
                            .addComponent(jTextCostc)
                            .addComponent(jTextName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAdd2)
                            .addComponent(jLabelTel)
                            .addComponent(jLabelAdd1)
                            .addComponent(jLabelFax))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFax)
                            .addComponent(jTextAdd2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextAdd1)
                            .addComponent(jTextTel))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCostc)
                    .addComponent(jTextCostc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAdd1)
                    .addComponent(jTextAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAdd2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFax)
                    .addComponent(jTextFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextFaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFaxActionPerformed

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here: 
        
        try {

            if (jTextCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insert Farm Code");
                jTextCode.requestFocusInWindow();
            } else if (jTextName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insert Farm Name");
                jTextName.requestFocusInWindow();
            } else if (jTextCostc.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insert Farm Costc");
                jTextCostc.requestFocusInWindow();
            } else {

                String count = crd.CheckFarmDuplicate(jTextCode.getText());

                if (Integer.valueOf(count) > 0) {
                    JOptionPane.showMessageDialog(null, jTextCode.getText() + " Data Already");
                } else {
                    cid.InsertFarm(jTextCode.getText(), jTextName.getText(), jTextCostc.getText(), jTextAdd1.getText(), jTextAdd2.getText(), jTextTel.getText(), jTextFax.getText());
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
        cid.UpdateFarm(jTextCode.getText(), jTextName.getText(), jTextCostc.getText(), jTextAdd1.getText(), jTextAdd2.getText(), jTextTel.getText(), jTextFax.getText());
        JOptionPane.showMessageDialog(null, "Update Success");
        BRData01.FrameOpen = "No";
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateMouseClicked

    private void jTextCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        if ("Yes".equals(BRData01.OnChange)) {
            jTextCode.setText(BRData01.vFARM_CODE);
            jTextName.setText(BRData01.vFARM_NAME);
            jTextCostc.setText(BRData01.vFARM_COSTC);
            jTextAdd1.setText(BRData01.vFARM_ADDR1);
            jTextAdd2.setText(BRData01.vFARM_ADDR2);
            jTextTel.setText(BRData01.vFARM_TEL);
            jTextFax.setText(BRData01.vFARM_FAX);
            jTextName.requestFocusInWindow();
            jTextCode.setEnabled(false);
            jButtonCreate.setVisible(false);
            jButtonUpdate.setVisible(true);
            BRData01.OnChange = "No";
        } else {
            jTextCode.requestFocusInWindow();
            jTextCode.setEnabled(true);
            jButtonCreate.setVisible(true);
            jButtonUpdate.setVisible(false);
            BRData01.OnCreate = "No";
        }

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(BRFarm01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRFarm01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRFarm01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRFarm01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRFarm01().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAdd1;
    private javax.swing.JLabel jLabelAdd2;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelCostc;
    private javax.swing.JLabel jLabelFax;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JTextField jTextAdd1;
    private javax.swing.JTextField jTextAdd2;
    private javax.swing.JTextField jTextCode;
    private javax.swing.JTextField jTextCostc;
    private javax.swing.JTextField jTextFax;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextTel;
    // End of variables declaration//GEN-END:variables

}
