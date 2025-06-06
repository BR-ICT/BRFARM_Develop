/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BREggTrans01 extends javax.swing.JFrame {

    public static String vINVE_FARM, vINVE_DATE, vINVE_HOUSE, vHOUS_NAME, vINVE_ITEM, vITEM_NAME, vINVE_BALANCE, vITEM_UNIT;
    public static String OnCreate, OnChange;
    String JPanel = "Transection";
    String DoubleClick = "No";
    String StsAddStockItem = "Yes";
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd", Locale.US);
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel mTransection, mEggTransection;
//    DefaultTableModel mDuck, mCullDuck, mEgg, mOther;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Launch the application.
     */
    public BREggTrans01() {
        initComponents();
        this.setTitle("BR01P007. Egg Transfer : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        mTransection = (DefaultTableModel) jTableEggTransfer.getModel();
        mEggTransection = (DefaultTableModel) jTableEggTransection.getModel();
        jcbEggTran.setModel(new DefaultComboBoxModel(cld.GetResultEggTran(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        jXDateStart.setFormats(sdf);
        jXDateEnd.setFormats(sdf);
        jXDateTransfer.setFormats(sdf);
        jXDateStart.setDate(new Date());
        jXDateEnd.setDate(new Date());
        jXDateTransfer.setDate(new Date());
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelFlockSTDate3 = new javax.swing.JLabel();
        jXDateStart = new org.jdesktop.swingx.JXDatePicker();
        jLabelFlockSTDate1 = new javax.swing.JLabel();
        jXDateEnd = new org.jdesktop.swingx.JXDatePicker();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEggTransfer = new javax.swing.JTable();
        jLabelFlockSTDate = new javax.swing.JLabel();
        jXDateTransfer = new org.jdesktop.swingx.JXDatePicker();
        jButtonTransfer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelFlockSTDate2 = new javax.swing.JLabel();
        jButtonEggSearch = new javax.swing.JButton();
        jButtonEggCancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEggTransection = new javax.swing.JTable();
        jcbEggTran = new javax.swing.JComboBox();
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

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabelFlockSTDate3.setText("Start Date :");

        jLabelFlockSTDate1.setText("To Date :");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableEggTransfer.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTableEggTransfer);

        jLabelFlockSTDate.setText("Transfer Date :");

        jButtonTransfer.setText("Transfer");
        jButtonTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFlockSTDate3)
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
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFlockSTDate3)
                        .addComponent(jXDateStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelFlockSTDate1)
                        .addComponent(jXDateEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFlockSTDate)
                        .addComponent(jXDateTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonTransfer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Egg Transfer", jPanel1);

        jPanel3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel3ComponentShown(evt);
            }
        });

        jLabelFlockSTDate2.setText("Transfer Date :");

        jButtonEggSearch.setText("Search");
        jButtonEggSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEggSearchActionPerformed(evt);
            }
        });

        jButtonEggCancel.setText("Cancel Transfer");
        jButtonEggCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEggCancelActionPerformed(evt);
            }
        });

        jTableEggTransection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "House", "Date", "Item", "Item Desc", "Lot Number", "Type", "Desc", "Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEggTransection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEggTransectionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEggTransection);

        jcbEggTran.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Date" }));
        jcbEggTran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEggTranActionPerformed(evt);
            }
        });
        jcbEggTran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbEggTranKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFlockSTDate2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbEggTran, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEggSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEggCancel)
                .addContainerGap(751, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFlockSTDate2)
                    .addComponent(jButtonEggSearch)
                    .addComponent(jButtonEggCancel)
                    .addComponent(jcbEggTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Egg Transection", jPanel3);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClose)
                .addContainerGap())
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClose)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetModel() {

        if ("Transection".equals(JPanel)) {
            while (mTransection.getRowCount() > 0) {
                for (int i = 0; i < mTransection.getRowCount(); ++i) {
                    mTransection.removeRow(i);
                }
            }

        } else {
            while (mEggTransection.getRowCount() > 0) {
                for (int i = 0; i < mEggTransection.getRowCount(); ++i) {
                    mEggTransection.removeRow(i);
                }
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
                mTransection.insertRow(mTransection.getRowCount(), new Object[]{
                    CheckEggStockDetail[0].trim(),
                    CheckEggStockDetail[1].trim(),
                    CheckEggStockDetail[2].trim(),
                    CheckEggStockDetail[3].trim(),
                    CheckEggStockDetail[4].trim(),
                    CheckEggStockDetail[5].trim(),
                    CheckEggStockDetail[6].trim()
                });
                mTransection.insertRow(mTransection.getRowCount(), new Object[]{
                    "",
                    "",
                    "",
                    "",
                    "",
                    "",
                    ""
                });
            } else {
                mTransection.insertRow(mTransection.getRowCount(), new Object[]{
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

    private void TransectionEggDetail() {
        String vEgg;
        if ("GP".equals(BRLogin.vDuckBreed)) {
            vEgg = BRLogin.vDuckHC + "3";
        } else {
            vEgg = BRLogin.vDuckHC + "1";
        }

        String[] getEggTran = jcbEggTran.getSelectedItem().toString().split(":");
        Date getDate = null;
        String getLotDate = "";

        try {
            getDate = new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(getEggTran[0]);
        } catch (ParseException ex) {
            Logger.getLogger(BRTrans01.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (getEggTran.length >= 2) {
            getLotDate = getEggTran[1].trim();
        }

//        List<String> getListEggTransection = cld.GetResultEggTransection(BRLogin.vFarm, BRLogin.vDuckBreed, sdf2.format(jXDateEggTransfer.getDate()), vEgg);
        List<String> getListEggTransection = cld.GetResultEggTransectionLotDate(BRLogin.vFarm, BRLogin.vDuckBreed, sdf2.format(getDate), vEgg, getLotDate);

        ResetModel();
        for (int i = 0; i < getListEggTransection.size(); i++) {
            String[] CheckEggTransection = getListEggTransection.get(i).split(";");
            mEggTransection.insertRow(mEggTransection.getRowCount(), new Object[]{
                CheckEggTransection[0].trim(),
                CheckEggTransection[1].trim(),
                CheckEggTransection[2].trim(),
                CheckEggTransection[3].trim(),
                CheckEggTransection[4].trim(),
                CheckEggTransection[5].trim(),
                CheckEggTransection[6].trim(),
                CheckEggTransection[7].trim()
            });
        }

    }

    private void AddStockItem(String vSource, String vType, String date, String vHouseSelection, String vItem, String lot, Float qty) {

        //Add Item Stock & Not Item Effect Stock
        String getSubLot = lot.substring(0, 12);
        String CheckInvenBalNotDate = crd.CheckInvenBalDuplicateNotDate(BRLogin.vFarm, vHouseSelection, vItem, vItem, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);
        String CheckInvenLotNotDate = crd.CheckInvenLotDuplicateNotDate(BRLogin.vFarm, vHouseSelection, getSubLot, vItem, vItem, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);

        String getLotDate = lot.substring(0, 6);
        String getYear = "20" + getLotDate.substring(0, 2);
        String getMonth = getLotDate.substring(2, 4);
        String getDay = getLotDate.substring(4, 6);
        String DateConvert = getDay + "/" + getMonth + "/" + getYear;

        if (Integer.valueOf(CheckInvenBalNotDate) == 0) {
            cid.InsertInvenBal(BRLogin.vFarm, vHouseSelection, DateConvert, vItem, String.valueOf(qty), BRLogin.vDuckBreed);
            cid.InsertInvenLot(BRLogin.vFarm, vHouseSelection, getSubLot, DateConvert, vItem, String.valueOf(qty), BRLogin.vDuckBreed);
            cid.InsertMTransection(BRLogin.vFarm, date, vHouseSelection, vItem, getSubLot, vType, vSource, String.valueOf(qty), BRLogin.vDuckBreed);
            cid.InsertDTransection(BRLogin.vFarm, date, vHouseSelection, vItem, lot, vType, vSource, String.valueOf(qty * -1), BRLogin.vDuckBreed);
            StsAddStockItem = "Yes";
        } else {
            if (Integer.valueOf(CheckInvenLotNotDate) == 0) {
                cid.UpdateInvenBalChangeDate(BRLogin.vFarm, vHouseSelection, DateConvert, vItem, String.valueOf(qty), BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);
                cid.InsertInvenLot(BRLogin.vFarm, vHouseSelection, getSubLot, date, DateConvert, String.valueOf(qty), BRLogin.vDuckBreed);
                cid.InsertMTransection(BRLogin.vFarm, date, vHouseSelection, vItem, getSubLot, vType, vSource, String.valueOf(qty), BRLogin.vDuckBreed);
                cid.InsertDTransection(BRLogin.vFarm, date, vHouseSelection, vItem, lot, vType, vSource, String.valueOf(qty * -1), BRLogin.vDuckBreed);
                StsAddStockItem = "Yes";
            } else {
                cid.UpdateInvenBalChangeDate(BRLogin.vFarm, vHouseSelection, DateConvert, vItem, String.valueOf(qty), BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);
                cid.UpdateInvenLot(BRLogin.vFarm, vHouseSelection, getSubLot, DateConvert, vItem, String.valueOf(qty), BRLogin.vDuckBreed, BRLogin.vDuckBreedAll);
                cid.InsertMTransection(BRLogin.vFarm, date, vHouseSelection, vItem, getSubLot, vType, vSource, String.valueOf(qty), BRLogin.vDuckBreed);
                cid.InsertDTransection(BRLogin.vFarm, date, vHouseSelection, vItem, lot, vType, vSource, String.valueOf(qty * -1), BRLogin.vDuckBreed);
                StsAddStockItem = "Yes";
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
        if ("Yes".equals(DoubleClick)) {
            DoubleClick = "No";
        }
    }//GEN-LAST:event_formWindowActivated

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRefreshMouseClicked

    private void jPanel3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel3ComponentShown
        // TODO add your handling code here:
        jcbEggTran.setModel(new DefaultComboBoxModel(cld.GetResultEggTran(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        JPanel = "EGGTransfer";
    }//GEN-LAST:event_jPanel3ComponentShown

    private void jTableEggTransectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEggTransectionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableEggTransectionMouseClicked

    private void jButtonEggCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEggCancelActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i <= mEggTransection.getRowCount() - 1; i++) {
            String vHouse = mEggTransection.getValueAt(i, 0).toString();
            String vDate = mEggTransection.getValueAt(i, 1).toString();
            String vItem = mEggTransection.getValueAt(i, 2).toString();
            String vLot = mEggTransection.getValueAt(i, 4).toString();
            String vType = mEggTransection.getValueAt(i, 5).toString();
            String vSource = mEggTransection.getValueAt(i, 6).toString();
            String vQty = mEggTransection.getValueAt(i, 7).toString();

            AddStockItem(vSource, vType, vDate, vHouse, vItem, vLot, Float.valueOf(vQty));
        }

        if ("Yes".equals(StsAddStockItem)) {
            JOptionPane.showMessageDialog(this, "Cancel Completed");
            jcbEggTran.setModel(new DefaultComboBoxModel(cld.GetResultEggTran(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
            StsAddStockItem = "No";
            ResetModel();
        }
    }//GEN-LAST:event_jButtonEggCancelActionPerformed

    private void jButtonEggSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEggSearchActionPerformed
        // TODO add your handling code here:
        TransectionEggDetail();
    }//GEN-LAST:event_jButtonEggSearchActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        JPanel = "Transection";
    }//GEN-LAST:event_jPanel1ComponentShown

    private void jcbEggTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEggTranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEggTranActionPerformed

    private void jcbEggTranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbEggTranKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEggTranKeyPressed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        EggDetail();
    }//GEN-LAST:event_jButtonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(BREggTrans01.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BREggTrans01.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BREggTrans01().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonEggCancel;
    private javax.swing.JButton jButtonEggSearch;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonTransfer;
    private javax.swing.JLabel jLabelFlockSTDate;
    private javax.swing.JLabel jLabelFlockSTDate1;
    private javax.swing.JLabel jLabelFlockSTDate2;
    private javax.swing.JLabel jLabelFlockSTDate3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuChange;
    private javax.swing.JMenu jMenuCreate;
    private javax.swing.JMenu jMenuDelete;
    private javax.swing.JMenu jMenuRefresh;
    private javax.swing.JMenu jMenuSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableEggTransection;
    private javax.swing.JTable jTableEggTransfer;
    private org.jdesktop.swingx.JXDatePicker jXDateEnd;
    private org.jdesktop.swingx.JXDatePicker jXDateStart;
    private org.jdesktop.swingx.JXDatePicker jXDateTransfer;
    private javax.swing.JComboBox jcbEggTran;
    // End of variables declaration//GEN-END:variables
}
