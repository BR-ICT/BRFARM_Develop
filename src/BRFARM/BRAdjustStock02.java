/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Wattana
 */
public class BRAdjustStock02 extends javax.swing.JFrame {

    public static String vINVE_FARM, vINVE_DATE, vINVE_HOUSE, vHOUS_NAME, vINVE_ITEM, vITEM_NAME, vINVE_BALANCE, vITEM_UNIT;
    public static String OnCreate, OnChange;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd", Locale.US);
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel mTransection;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();
    DecimalFormat df = new DecimalFormat("#");
//    String[] maximumno;
    ArrayList<String> maximumno = new ArrayList<String>();

    /**
     * Launch the application.
     */
    public BRAdjustStock02() {
        initComponents();
        this.setTitle("BF01D003. Balance Stock By Lot Number : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        jcbHouse.setModel(new DefaultComboBoxModel(cld.GetResultHouseDesc(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        mTransection = (DefaultTableModel) jTableTransection.getModel();
        jMenuSave.setEnabled(false);
        jMenuCreate.setEnabled(false);
        jMenuChange.setEnabled(false);
        jMenuDelete.setEnabled(false);
        jMenuRefresh.setEnabled(true);
        jcbHouse.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonClose = new javax.swing.JButton();
        jLabelHouse = new javax.swing.JLabel();
        jcbHouse = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransection = new javax.swing.JTable();
        jButtonSearch1 = new javax.swing.JButton();
        jButtonSearch2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSave = new javax.swing.JMenu();
        jMenuCreate = new javax.swing.JMenu();
        jMenuChange = new javax.swing.JMenu();
        jMenuDelete = new javax.swing.JMenu();
        jMenuRefresh = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

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

        jLabelHouse.setText("House Code :");

        jcbHouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select House" }));
        jcbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHouseActionPerformed(evt);
            }
        });

        jTableTransection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Item", "Lot Number", "Qty", "Unit", "Remark"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTransection.setColumnSelectionAllowed(true);
        jTableTransection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTransection);
        jTableTransection.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTableTransection.getColumnModel().getColumnCount() > 0) {
            jTableTransection.getColumnModel().getColumn(0).setMinWidth(150);
            jTableTransection.getColumnModel().getColumn(0).setMaxWidth(150);
            jTableTransection.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        jButtonSearch1.setText("Select All");
        jButtonSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch1ActionPerformed(evt);
            }
        });

        jButtonSearch2.setText("Submit");
        jButtonSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearch2ActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSearch2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1202, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHouse)
                    .addComponent(jcbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch1)
                    .addComponent(jButtonSearch2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addContainerGap())
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

    private void TransectionDetail() {
        jcbHouse.setSelectedItem(BRAdjustStock01.vTRAN_HOUSE);
        String[] getHouse = jcbHouse.getSelectedItem().toString().split(":");
        String vHouse = getHouse[0].trim();
        List<String> getListTransection;
        String itemCullDuck = BRLogin.vDuckBreed + "4";

        getListTransection = cld.GetResultLotNumberDetailCullDuck(BRLogin.vFarm, vHouse, itemCullDuck, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);

        ResetModel();
        maximumno.clear();
        for (int i = 0; i < getListTransection.size(); i++) {
            String[] CheckTransection = getListTransection.get(i).split(";");
            maximumno.add(CheckTransection[3]);
            mTransection.insertRow(mTransection.getRowCount(), new Object[]{
                CheckTransection[0],
                CheckTransection[1],
                CheckTransection[2],
                CheckTransection[3],
                CheckTransection[4]
            });

        }

    }

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        TransectionDetail();
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

    private void jcbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHouseActionPerformed

    private void jTableTransectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransectionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTransectionMouseClicked

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
        TransectionDetail();
    }//GEN-LAST:event_jMenuRefreshMouseClicked

    private void jButtonSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch1ActionPerformed
        // TODO add your handling code here:
        for (int row = 0; row < mTransection.getRowCount(); row++) {
            mTransection.setValueAt(true, row, 5);
        }
    }//GEN-LAST:event_jButtonSearch1ActionPerformed

    private void jButtonSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearch2ActionPerformed
        // TODO add your handling code here:
        Boolean nobug = true;
        for (int i = 0; i < mTransection.getRowCount(); i++) {
            if (mTransection.getValueAt(i, 5) != null) {
                if (Integer.parseInt(mTransection.getValueAt(i, 3).toString().trim()) <= Integer.parseInt(maximumno.get(i).trim())) {
                    BRAdjustStock01.mTransection.addRow(new Object[]{
                        BRAdjustStock01.vTRAN_HOUSE, // vHouseSelection,
                        BRAdjustStock01.vTRAN_DATE, // date,
                        mTransection.getValueAt(i, 1).toString().trim() + " : " + mTransection.getValueAt(i, 4).toString().trim(), // vItem + " : " + vItemDesc + " : " + vUnit,
                        mTransection.getValueAt(i, 3).toString().trim(), // qty,
                        mTransection.getValueAt(i, 4).toString().trim(), // vUnit,
                        BRAdjustStock01.vTRAN_PENE, // vSource,
                        BRAdjustStock01.vTRAN_TYPE, // vType,
                        mTransection.getValueAt(i, 2).toString().trim(), // lot,
                        true, // remark
                    });
                } else {
                    nobug = false;
                    JOptionPane.showMessageDialog(null, "Item" + mTransection.getValueAt(i, 1).toString().trim() + " : " + mTransection.getValueAt(i, 4).toString().trim() + "is greater than existed item");
                    clearTable(BRAdjustStock01.mTransection);
                    break;
                }

            };
        }
        if (nobug) {
            this.setVisible(false);
        }


    }//GEN-LAST:event_jButtonSearch2ActionPerformed
    private static void clearTable(DefaultTableModel model) {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

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
            java.util.logging.Logger.getLogger(BRAdjustStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRAdjustStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRAdjustStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRAdjustStock02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRAdjustStock02().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonSearch1;
    private javax.swing.JButton jButtonSearch2;
    private javax.swing.JLabel jLabelHouse;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChange;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableTransection;
    private javax.swing.JComboBox jcbHouse;
    // End of variables declaration//GEN-END:variables
}
