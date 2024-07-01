/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BRDescEggTrans03 extends javax.swing.JFrame {

    public static String vStatus;
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel model;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    final Date startDate = new Date();
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Creates new form M001Flock
     */
    public BRDescEggTrans03() {
        initComponents();
        this.setTitle("BR01E008. Description Egg Transfer : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        jXDateStart.setFormats(sdf);
        jButtonUpdate.setEnabled(true);

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
        jTextTruckNo = new javax.swing.JTextField();
        jLabelFlockSTDate = new javax.swing.JLabel();
        jXDateStart = new org.jdesktop.swingx.JXDatePicker();
        jButtonUpdate = new javax.swing.JButton();
        jLabelFlockSTDate1 = new javax.swing.JLabel();
        jLabelFemale29 = new javax.swing.JLabel();
        jTextHCCBW = new javax.swing.JTextField();
        jLabelFemale47 = new javax.swing.JLabel();
        jTextHCCAW = new javax.swing.JTextField();
        jLabelFemale46 = new javax.swing.JLabel();
        jTextHCD = new javax.swing.JTextField();
        jLabelFemale45 = new javax.swing.JLabel();
        jTextHCS = new javax.swing.JTextField();
        jLabelFemale44 = new javax.swing.JLabel();
        jTextHCDT = new javax.swing.JTextField();
        jLabelFemale43 = new javax.swing.JLabel();
        jTextHCTTL = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_FLOCK. CREATE");
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

        jTextTruckNo.setSelectionEnd(2);

        jLabelFlockSTDate.setText("วันที่ส่งไข่ :");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabelFlockSTDate1.setText("ทะเบียนรถ :");

        jLabelFemale29.setText("ไข่แตกก่อนล้าง :");

        jTextHCCBW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCCBWFocusLost(evt);
            }
        });

        jLabelFemale47.setText("ไข่แตกหลังล้าง :");

        jTextHCCAW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCCAWFocusLost(evt);
            }
        });

        jLabelFemale46.setText("ไข่แฝด :");

        jTextHCD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCDFocusLost(evt);
            }
        });

        jLabelFemale45.setText("ไข่เล็ก :");

        jTextHCS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCSFocusLost(evt);
            }
        });

        jLabelFemale44.setText("ไข่ทำลาย :");

        jTextHCDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCDTFocusLost(evt);
            }
        });

        jLabelFemale43.setText("จำนวนไข่ทั้งหมด :");

        jTextHCTTL.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextHCTTLFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFemale43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextHCTTL))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFlockSTDate)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelFemale29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelFemale46)
                                            .addComponent(jLabelFemale47)
                                            .addComponent(jLabelFemale45)
                                            .addComponent(jLabelFemale44)))
                                    .addComponent(jLabelFlockSTDate1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextTruckNo, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextHCDT, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextHCS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                            .addComponent(jTextHCD, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextHCCAW, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextHCCBW, javax.swing.GroupLayout.Alignment.LEADING)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClose)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFlockSTDate)
                    .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTruckNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFlockSTDate1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCCBW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale29))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCCAW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale47))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale46))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale45))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale44))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextHCTTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFemale43))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonUpdate))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {

            jXDateStart.setDate(sdf.parse(BRDescEggTrans02.vDESC_DATE));
            jTextTruckNo.setText(BRDescEggTrans02.vDESC_TRUCKNO);
            jTextHCCBW.setText(BRDescEggTrans02.vDESC_HCCBW);
            jTextHCCAW.setText(BRDescEggTrans02.vDESC_HCCAW);
            jTextHCD.setText(BRDescEggTrans02.vDESC_HCD);
            jTextHCS.setText(BRDescEggTrans02.vDESC_HCS);
            jTextHCDT.setText(BRDescEggTrans02.vDESC_HCDT);
            jTextHCTTL.setText(BRDescEggTrans02.vDESC_HCTTL);
            jTextHCCBW.requestFocusInWindow();
            jXDateStart.setEnabled(false);
            jTextTruckNo.setEnabled(false);
            jButtonUpdate.setVisible(true);
            BRData01.OnChange = "No";

        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:

        if ("".equals(jTextHCCBW.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCCBW");
            jTextHCCBW.requestFocusInWindow();

        } else if ("".equals(jTextHCCAW.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCCAW");
            jTextHCCAW.requestFocusInWindow();

        } else if ("".equals(jTextHCD.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCD");
            jTextHCD.requestFocusInWindow();

        } else if ("".equals(jTextHCS.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCS");
            jTextHCS.requestFocusInWindow();

        } else if ("".equals(jTextHCDT.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCDT");
            jTextHCDT.requestFocusInWindow();

        } else if ("".equals(jTextHCTTL.getText())) {
            JOptionPane.showMessageDialog(null, "Please Insert HCTTL");
            jTextHCTTL.requestFocusInWindow();

        }
        cid.UpdateEggDesc(BRLogin.vFarm, sdf.format(jXDateStart.getDate()), jTextTruckNo.getText(), jTextHCCBW.getText(), jTextHCCAW.getText(), jTextHCD.getText(), jTextHCS.getText(), jTextHCDT.getText(), jTextHCTTL.getText(), BRLogin.vDuckBreed);
        JOptionPane.showMessageDialog(null, "Update Success");
        BRDescEggTrans02.FrameOpen = "No";
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextHCCBWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCCBWFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCCBWFocusLost

    private void jTextHCCAWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCCAWFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCCAWFocusLost

    private void jTextHCDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCDFocusLost

    private void jTextHCSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCSFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCSFocusLost

    private void jTextHCDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCDTFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCDTFocusLost

    private void jTextHCTTLFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextHCTTLFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHCTTLFocusLost

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
            java.util.logging.Logger.getLogger(BRDescEggTrans03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRDescEggTrans03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRDescEggTrans03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRDescEggTrans03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRDescEggTrans03().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelFemale29;
    private javax.swing.JLabel jLabelFemale43;
    private javax.swing.JLabel jLabelFemale44;
    private javax.swing.JLabel jLabelFemale45;
    private javax.swing.JLabel jLabelFemale46;
    private javax.swing.JLabel jLabelFemale47;
    private javax.swing.JLabel jLabelFlockSTDate;
    private javax.swing.JLabel jLabelFlockSTDate1;
    private javax.swing.JTextField jTextHCCAW;
    private javax.swing.JTextField jTextHCCBW;
    private javax.swing.JTextField jTextHCD;
    private javax.swing.JTextField jTextHCDT;
    private javax.swing.JTextField jTextHCS;
    private javax.swing.JTextField jTextHCTTL;
    private javax.swing.JTextField jTextTruckNo;
    private org.jdesktop.swingx.JXDatePicker jXDateStart;
    // End of variables declaration//GEN-END:variables

}
