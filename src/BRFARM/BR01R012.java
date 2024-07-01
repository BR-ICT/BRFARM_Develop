/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author Wattana
 */
public class BR01R012 extends javax.swing.JFrame {

    ClassGetReport cgr = new ClassGetReport();
    ClassListData cld = new ClassListData();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd", Locale.US);

    /**
     * Launch the application.
     */
    public BR01R012() {
        initComponents();
        this.setTitle("BR01R012. Dialy Report : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        jLabelCode9.setText("Dialy Report " + BRLogin.vDuckBreed + " Farm");
        jXDateStart.setFormats(sdf);
        jXDateEnd.setFormats(sdf);
        jXDateStart.setDate(new Date());
        jXDateEnd.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelTransport4 = new javax.swing.JPanel();
        jLabelCode9 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jButtonClose = new javax.swing.JButton();
        jLabelFlockSTDate = new javax.swing.JLabel();
        jXDateStart = new org.jdesktop.swingx.JXDatePicker();
        jLabelFlockSTDate1 = new javax.swing.JLabel();
        jXDateEnd = new org.jdesktop.swingx.JXDatePicker();
        jLabelHouse1 = new javax.swing.JLabel();
        jcbPRDLine = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAS_MSTD. PS FARM STANDARD");
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bangkok Ranch Public Co .,Ltd.");

        jPanelTransport4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCode9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCode9.setForeground(java.awt.Color.red);
        jLabelCode9.setText("Standard Farm");

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jButtonClose.setText("Close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jLabelFlockSTDate.setText("Start Date :");

        jLabelFlockSTDate1.setText("To Date :");

        jLabelHouse1.setText("Production Line :");

        jcbPRDLine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select : PRD Line", "GFL : Grower Female Line", "GML : Grower Male Line", "LFL : Laying Female Line", "LML : Laying Male Line", "PSG : PS Grower", "PSL : PS Laying" }));
        jcbPRDLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPRDLineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTransport4Layout = new javax.swing.GroupLayout(jPanelTransport4);
        jPanelTransport4.setLayout(jPanelTransport4Layout);
        jPanelTransport4Layout.setHorizontalGroup(
            jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransport4Layout.createSequentialGroup()
                .addComponent(jLabelCode9)
                .addGap(0, 374, Short.MAX_VALUE))
            .addGroup(jPanelTransport4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFlockSTDate1)
                    .addComponent(jLabelFlockSTDate)
                    .addComponent(jLabelHouse1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTransport4Layout.createSequentialGroup()
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose))
                    .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jXDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jXDateStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbPRDLine, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTransport4Layout.setVerticalGroup(
            jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTransport4Layout.createSequentialGroup()
                .addComponent(jLabelCode9)
                .addGap(27, 27, 27)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHouse1)
                    .addComponent(jcbPRDLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFlockSTDate)
                    .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFlockSTDate1)
                    .addComponent(jXDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelTransport4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(jButtonClose))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTransport4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTransport4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:

        if ("Please Select : PRD Line".equals(jcbPRDLine.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please Select PRD Line");
            jcbPRDLine.requestFocusInWindow();
        } else {
            String[] getPRDLine = jcbPRDLine.getSelectedItem().toString().split(":");
            String vPRDLine = getPRDLine[0].trim();
            btnPrint.enable(false);
            cgr.rBR01R012("BR01R012", BRLogin.vFarm, BRLogin.vDuckBreed, vPRDLine, sdf2.format(jXDateStart.getDate()), sdf2.format(jXDateEnd.getDate()));
            btnPrint.enable(true);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jcbPRDLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPRDLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPRDLineActionPerformed

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
            java.util.logging.Logger.getLogger(BR01R012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BR01R012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BR01R012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BR01R012.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BR01R012().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCode9;
    private javax.swing.JLabel jLabelFlockSTDate;
    private javax.swing.JLabel jLabelFlockSTDate1;
    private javax.swing.JLabel jLabelHouse1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelTransport4;
    private org.jdesktop.swingx.JXDatePicker jXDateEnd;
    private org.jdesktop.swingx.JXDatePicker jXDateStart;
    private javax.swing.JComboBox jcbPRDLine;
    // End of variables declaration//GEN-END:variables
}
