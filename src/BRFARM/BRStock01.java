/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BRStock01 extends javax.swing.JFrame {

    public static String vINVE_FARM, vINVE_DATE, vINVE_HOUSE, vHOUS_NAME, vINVE_ITEM, vITEM_NAME, vINVE_BALANCE, vITEM_UNIT;
    public static String OnCreate, OnChange;
    public static String FrameOpen = "Yes";
    public static String JPanel = "Duck";
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel mDuck, mCullDuck, mEgg, mOther;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();
    DecimalFormat df = new DecimalFormat("#");

    /**
     * Launch the application.
     */
    public BRStock01() {
        initComponents();
        this.setTitle("BR01D001. Balance Stock : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        jcbHouse.setModel(new DefaultComboBoxModel(cld.GetResultMainHouse(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        mDuck = (DefaultTableModel) jTableDuck.getModel();
        mCullDuck = (DefaultTableModel) jTableCullDuck.getModel();
        mEgg = (DefaultTableModel) jTableEgg.getModel();
        mOther = (DefaultTableModel) jTableOther.getModel();
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
        jTabbedPane = new javax.swing.JTabbedPane();
        jpDuck = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDuck = new javax.swing.JTable();
        jpCullDuck = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCullDuck = new javax.swing.JTable();
        jpEgg = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEgg = new javax.swing.JTable();
        jpOther = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableOther = new javax.swing.JTable();
        jLabelHouse = new javax.swing.JLabel();
        jcbHouse = new javax.swing.JComboBox();
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

        jTabbedPane.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jpDuck.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jpDuckComponentShown(evt);
            }
        });

        jTableDuck.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House", "Date", "Item", "Item Desc", "Onhand", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDuck);

        javax.swing.GroupLayout jpDuckLayout = new javax.swing.GroupLayout(jpDuck);
        jpDuck.setLayout(jpDuckLayout);
        jpDuckLayout.setHorizontalGroup(
            jpDuckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpDuckLayout.setVerticalGroup(
            jpDuckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Duck", jpDuck);

        jpCullDuck.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jpCullDuckComponentShown(evt);
            }
        });

        jTableCullDuck.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "House", "Date", "Item", "Item Desc", "Onhand", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableCullDuck);

        javax.swing.GroupLayout jpCullDuckLayout = new javax.swing.GroupLayout(jpCullDuck);
        jpCullDuck.setLayout(jpCullDuckLayout);
        jpCullDuckLayout.setHorizontalGroup(
            jpCullDuckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpCullDuckLayout.setVerticalGroup(
            jpCullDuckLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Cull Duck", jpCullDuck);

        jpEgg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jpEggComponentShown(evt);
            }
        });

        jTableEgg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
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

        javax.swing.GroupLayout jpEggLayout = new javax.swing.GroupLayout(jpEgg);
        jpEgg.setLayout(jpEggLayout);
        jpEggLayout.setHorizontalGroup(
            jpEggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1168, Short.MAX_VALUE)
        );
        jpEggLayout.setVerticalGroup(
            jpEggLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Egg", jpEgg);

        jpOther.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jpOtherComponentShown(evt);
            }
        });

        jTableOther.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "House", "Date", "Item", "Item Desc", "Onhand", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableOther);

        javax.swing.GroupLayout jpOtherLayout = new javax.swing.GroupLayout(jpOther);
        jpOther.setLayout(jpOtherLayout);
        jpOtherLayout.setHorizontalGroup(
            jpOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpOtherLayout.setVerticalGroup(
            jpOtherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
        );

        jTabbedPane.addTab("Other", jpOther);

        jLabelHouse.setText("Main House :");

        jcbHouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select House" }));
        jcbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHouseActionPerformed(evt);
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
            .addComponent(jTabbedPane)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHouse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHouse)
                    .addComponent(jcbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addContainerGap())
        );

        jTabbedPane.getAccessibleContext().setAccessibleName("");
        jTabbedPane.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetModel() {

        if ("Duck".equals(JPanel)) {
            while (mDuck.getRowCount() > 0) {
                for (int i = 0; i < mDuck.getRowCount(); ++i) {
                    mDuck.removeRow(i);
                }
            }
        } else if ("CullDuck".equals(JPanel)) {

            while (mCullDuck.getRowCount() > 0) {
                for (int i = 0; i < mCullDuck.getRowCount(); ++i) {
                    mCullDuck.removeRow(i);
                }
            }
        } else if ("Egg".equals(JPanel)) {

            while (mEgg.getRowCount() > 0) {
                for (int i = 0; i < mEgg.getRowCount(); ++i) {
                    mEgg.removeRow(i);
                }
            }
        } else if ("Other".equals(JPanel)) {

            while (mOther.getRowCount() > 0) {
                for (int i = 0; i < mOther.getRowCount(); ++i) {
                    mOther.removeRow(i);
                }
            }
        }
    }

    private void DuckStockDetail() {

        String vHouse = jcbHouse.getSelectedItem().toString();
        String vEgg = BRLogin.vDuckHC + "3";
        String vDuck4 = BRLogin.vDuckBreed + "4";
        String vDuck5 = BRLogin.vDuckBreed + "5";
        List<String> getListDuckStockDetail = cld.GetResultDuckStockDesc(BRLogin.vFarm, vHouse, BRLogin.vDuckBreed, vEgg, vDuck4, vDuck5);
        ResetModel();

        for (int i = 0; i < getListDuckStockDetail.size(); i++) {
            String[] CheckDuckStockDetail = getListDuckStockDetail.get(i).split(";");
            mDuck.insertRow(mDuck.getRowCount(), new Object[]{
                CheckDuckStockDetail[0].trim(),
                CheckDuckStockDetail[1].trim(),
                CheckDuckStockDetail[2].trim(),
                CheckDuckStockDetail[3].trim(),
                CheckDuckStockDetail[4].trim(),
                CheckDuckStockDetail[5].trim()
            });
        }

    }

    private void CullDuckStockDetail() {

        String vHouse = jcbHouse.getSelectedItem().toString();
        String vDuck4 = BRLogin.vDuckBreed + "4";
        String vDuck5 = BRLogin.vDuckBreed + "5";
        List<String> getListCullDuckStockDetail = cld.GetResultCullDuckStockDesc(BRLogin.vFarm, vHouse, BRLogin.vDuckBreed, vDuck4, vDuck5);
        ResetModel();

        for (int i = 0; i < getListCullDuckStockDetail.size(); i++) {
            String[] CheckCullDuckStockDetail = getListCullDuckStockDetail.get(i).split(";");
            mCullDuck.insertRow(mCullDuck.getRowCount(), new Object[]{
                CheckCullDuckStockDetail[0].trim(),
                CheckCullDuckStockDetail[1].trim(),
                CheckCullDuckStockDetail[2].trim(),
                CheckCullDuckStockDetail[3].trim(),
                CheckCullDuckStockDetail[4].trim(),
                CheckCullDuckStockDetail[5].trim()
            });
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

        List<String> getListEggStockDetail = cld.GetResultEggStockDesc(BRLogin.vFarm, BRLogin.vDuckBreed, vEgg, FEgg1, FEgg2, FEgg3, FEgg4, MEgg1, MEgg2, MEgg3, MEgg4);
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

    private void OtherStockDetail() {

        String vHouse = jcbHouse.getSelectedItem().toString();
        List<String> getListOtherStockDetail = cld.GetResultOtherStockDesc(BRLogin.vFarm, vHouse, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll, JPanel);
        ResetModel();

        for (int i = 0; i < getListOtherStockDetail.size(); i++) {
            String[] CheckOtherStockDetail = getListOtherStockDetail.get(i).split(";");
            mOther.insertRow(mOther.getRowCount(), new Object[]{
                CheckOtherStockDetail[0].trim(),
                CheckOtherStockDetail[1].trim(),
                CheckOtherStockDetail[2].trim(),
                CheckOtherStockDetail[3].trim(),
                CheckOtherStockDetail[4].trim(),
                CheckOtherStockDetail[5].trim()
            });
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
        if (!"Yes".equals(FrameOpen)) {
            DuckStockDetail();
            FrameOpen = "Yes";
        }
    }//GEN-LAST:event_formWindowActivated

    private void jpDuckComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpDuckComponentShown
        // TODO add your handling code here:
        JPanel = "Duck";
        jcbHouse.setEnabled(true);
        DuckStockDetail();
    }//GEN-LAST:event_jpDuckComponentShown

    private void jpCullDuckComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpCullDuckComponentShown
        // TODO add your handling code here:
        JPanel = "CullDuck";
        jcbHouse.setEnabled(true);
        CullDuckStockDetail();
    }//GEN-LAST:event_jpCullDuckComponentShown

    private void jpEggComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpEggComponentShown
        // TODO add your handling code here:
        JPanel = "Egg";
        jcbHouse.setEnabled(false);
        EggDetail();
        jcbHouse.setSelectedIndex(0);
    }//GEN-LAST:event_jpEggComponentShown

    private void jpOtherComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jpOtherComponentShown
        // TODO add your handling code here:
        JPanel = "Other";
        jcbHouse.setEnabled(true);
        OtherStockDetail();
    }//GEN-LAST:event_jpOtherComponentShown

    private void jcbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHouseActionPerformed
        // TODO add your handling code here:
        if ("Duck".equals(JPanel)) {
            DuckStockDetail();
        } else if ("CullDuck".equals(JPanel)) {
            CullDuckStockDetail();
        } else if ("Other".equals(JPanel)) {
            OtherStockDetail();
        } else {
            EggDetail();
        }

    }//GEN-LAST:event_jcbHouseActionPerformed

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
        if ("Duck".equals(JPanel)) {
            DuckStockDetail();
        } else if ("CullDuck".equals(JPanel)) {
            CullDuckStockDetail();
        } else if ("Other".equals(JPanel)) {
            OtherStockDetail();
        } else {
            EggDetail();
        }

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
            java.util.logging.Logger.getLogger(BRStock01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRStock01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRStock01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRStock01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BRStock01().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabelHouse;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChange;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JTable jTableCullDuck;
    private javax.swing.JTable jTableDuck;
    private javax.swing.JTable jTableEgg;
    private javax.swing.JTable jTableOther;
    private javax.swing.JComboBox jcbHouse;
    private javax.swing.JPanel jpCullDuck;
    private javax.swing.JPanel jpDuck;
    private javax.swing.JPanel jpEgg;
    private javax.swing.JPanel jpOther;
    // End of variables declaration//GEN-END:variables
}