/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import java.awt.Toolkit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wattana
 */
public class BR01R009 extends javax.swing.JFrame {

    public static String vTable;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd", Locale.US);
    SimpleDateFormat sdf3 = new SimpleDateFormat("dd-MMM-yy", Locale.US);
    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
    DefaultTableModel mTransection;
    ClassListData cld = new ClassListData();
    ClassGetReport cgr = new ClassGetReport();
    DecimalFormat df = new DecimalFormat("#");

    /**
     * Launch the application.
     */
    public BR01R009() {
        initComponents();
        this.setTitle("BR01R009. Egg Transfer to Hatchery Report : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);
        mTransection = (DefaultTableModel) jTableTransection.getModel();
        jcbStartHouse.setModel(new DefaultComboBoxModel(cld.GetResultEggHouseDesc(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        jcbEndHouse.setModel(new DefaultComboBoxModel(cld.GetResultEggHouseDesc(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        jcbEggTran.setModel(new DefaultComboBoxModel(cld.GetResultEggTran(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonClose = new javax.swing.JButton();
        jLabelHouse = new javax.swing.JLabel();
        jcbStartHouse = new javax.swing.JComboBox();
        jButtonSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTransection = new javax.swing.JTable();
        jLabelHouse2 = new javax.swing.JLabel();
        jcbEndHouse = new javax.swing.JComboBox();
        jLabelFlockSTDate = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jButtonExport = new javax.swing.JButton();
        jcbPRDLine = new javax.swing.JComboBox();
        jLabelHouse1 = new javax.swing.JLabel();
        jcbEggTran = new javax.swing.JComboBox();
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

        jLabelHouse.setText("Start House :");

        jcbStartHouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select House" }));
        jcbStartHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStartHouseActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jTableTransection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Breed", "House", "Flock Code", "Date", "Week", "In Lay", "Lot Number", "Qty. (PCS)", "303001 (HCG)", "303002 (HCD)", "303003 (HCS)", "303004 (HCC)", "HCD + HCS + HCC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTransection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTransectionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTransection);

        jLabelHouse2.setText("End House :");

        jcbEndHouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select House" }));
        jcbEndHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEndHouseActionPerformed(evt);
            }
        });

        jLabelFlockSTDate.setText("Transfer Date :");

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jButtonExport.setText("Export Text");
        jButtonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportActionPerformed(evt);
            }
        });

        jcbPRDLine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select : PRD Line", "GWFL : Grower Female Line", "GWML : Grower Male Line", "LYFL : Laying Female Line", "LYML : Laying Male Line", "GMFL : Grower Moulting Female Line", "GMML : Grower Moulting Male Line", "LMFL : Laying Moulting Female Line", "LMML : Laying Moulting Male Line" }));
        jcbPRDLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPRDLineActionPerformed(evt);
            }
        });

        jLabelHouse1.setText("Production Line :");

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
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelHouse1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbPRDLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelFlockSTDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbEggTran, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelHouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbStartHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelHouse2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbEndHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonClose, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHouse2)
                        .addComponent(jcbEndHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHouse1)
                        .addComponent(jcbPRDLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFlockSTDate)
                        .addComponent(jcbEggTran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelHouse)
                        .addComponent(jcbStartHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonSearch)
                        .addComponent(jButtonExport)
                        .addComponent(btnPrint)))
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

        String[] getPRDLine = jcbPRDLine.getSelectedItem().toString().split(":");
        String vPRDLine = getPRDLine[0].trim();
        String[] getStartHouse = jcbStartHouse.getSelectedItem().toString().split(":");
        String vStartHouse = getStartHouse[0].trim();
        String[] getEndHouse = jcbEndHouse.getSelectedItem().toString().split(":");
        String vEndHouse = getEndHouse[0].trim();
        String HCG001, HCD002, HCS003, HCC004;

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

        if ("GW".equals(vPRDLine.substring(0, 2))) {
            vTable = "FAR_GROWER";
        } else if ("LY".equals(vPRDLine.substring(0, 2))) {
            vTable = "FAR_LAYING";
        } else if ("GM".equals(vPRDLine.substring(0, 2))) {
            vTable = "FAR_GROWERMT";
        } else {
            vTable = "FAR_LAYINGMT";
        }

        if ("GWFL".equals(vPRDLine) || "LYFL".equals(vPRDLine) || "GMFL".equals(vPRDLine) || "LMFL".equals(vPRDLine)) {

            if ("GP".equals(BRLogin.vDuckBreed)) {
                HCG001 = BRLogin.vDuckHC + "302001";
                HCD002 = BRLogin.vDuckHC + "302002";
                HCS003 = BRLogin.vDuckHC + "302003";
                HCC004 = BRLogin.vDuckHC + "302004";
            } else {
                HCG001 = BRLogin.vDuckHC + "102001";
                HCD002 = BRLogin.vDuckHC + "102002";
                HCS003 = BRLogin.vDuckHC + "102003";
                HCC004 = BRLogin.vDuckHC + "102004";
            }

        } else {
            if ("GP".equals(BRLogin.vDuckBreed)) {
                HCG001 = BRLogin.vDuckHC + "303001";
                HCD002 = BRLogin.vDuckHC + "303002";
                HCS003 = BRLogin.vDuckHC + "303003";
                HCC004 = BRLogin.vDuckHC + "303004";
            } else {
                HCG001 = BRLogin.vDuckHC + "103001";
                HCD002 = BRLogin.vDuckHC + "103002";
                HCS003 = BRLogin.vDuckHC + "103003";
                HCC004 = BRLogin.vDuckHC + "103004";
            }
        }

        List<String> getListTransection = cld.GetResultEggTransfer(BRLogin.vFarm, sdf2.format(getDate), getLotDate, vStartHouse, vEndHouse, HCG001, HCD002, HCS003, HCC004, BRLogin.vDuckBreed, vTable);
        ResetModel();

        for (int i = 0; i < getListTransection.size(); i++) {
            String[] CheckTransection = getListTransection.get(i).split(";");

            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(CheckTransection[3].trim());

                mTransection.insertRow(mTransection.getRowCount(), new Object[]{
                    CheckTransection[0].trim().substring(0, 2),
                    CheckTransection[1].trim(),
                    CheckTransection[2].trim(),
                    sdf3.format(date),
                    CheckTransection[4].trim(),
                    CheckTransection[5].trim(),
                    CheckTransection[6].trim(),
                    df.format(Float.valueOf(CheckTransection[7])),
                    df.format(Float.valueOf(CheckTransection[8])),
                    df.format(Float.valueOf(CheckTransection[9])),
                    df.format(Float.valueOf(CheckTransection[10])),
                    df.format(Float.valueOf(CheckTransection[11])),
                    df.format(Float.valueOf(CheckTransection[12]))
                });

            } catch (ParseException ex) {
                Logger.getLogger(BR01R009.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private void ExportTextFile() {

        String[] getEggTran = jcbEggTran.getSelectedItem().toString().split(":");
        Date getDate = null;

        try {
            getDate = new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(getEggTran[0]);
        } catch (ParseException ex) {
            Logger.getLogger(BRTrans01.class.getName()).log(Level.SEVERE, null, ex);
        }

        String PathFile = System.getProperty("user.dir").toString() + "\\export\\";
        String path = PathFile + BRLogin.vDuckBreed + "01R09_" + sdf2.format(getDate) + ".txt";
        FileWriter fw;
        try {
            File file = new File(path);
            fw = new FileWriter(file, false);  //True = Append to file, false = Overwrite

            for (int i = 0; i < jTableTransection.getRowCount(); i++) {

                fw.write("    "); //4 
//                fw.write(jTableTransection.getValueAt(i, 0).toString().trim() + "  ");//2

                String value0 = jTableTransection.getValueAt(i, 0).toString().trim();
                for (int ii = value0.length(); ii < 6; ii++) {
                    value0 += " ";
                }
//                fw.write(value0 + "  ");//2
                fw.write(value0);

                String value1 = jTableTransection.getValueAt(i, 1).toString().trim();
                for (int ii = value1.length(); ii < 10; ii++) {
                    value1 += " ";
                }
//                fw.write(value0 + "  ");//2
                fw.write(value1);

                String value2 = jTableTransection.getValueAt(i, 2).toString().trim();
                for (int ii = value2.length(); ii < 11; ii++) {
                    value2 += " ";
                }
//                fw.write(value2 + "    ");//4
                fw.write(value2);

                String value3 = jTableTransection.getValueAt(i, 3).toString().trim();
                for (int ii = value3.length(); ii < 13; ii++) {
                    value3 += " ";
                }
//                fw.write(value2 + "    ");//4
                fw.write(value3);

//                fw.write(jTableTransection.getValueAt(i, 4).toString().trim() + "    ");//4
                String value4 = jTableTransection.getValueAt(i, 4).toString().trim();
                for (int ii = value4.length(); ii < 5; ii++) {
                    value4 += " ";
                }
//                fw.write(value2 + "    ");//4
                fw.write(value4);

//                fw.write(jTableTransection.getValueAt(i, 5).toString().trim() + "   ");//3
                String value5 = jTableTransection.getValueAt(i, 5).toString().trim();
                for (int ii = value5.length(); ii < 5; ii++) {
                    value5 += " ";
                }
//                fw.write(value2 + "    ");//4
                fw.write(value5);

//                fw.write(jTableTransection.getValueAt(i, 6).toString().trim() + "            ");//12
                String value6 = jTableTransection.getValueAt(i, 6).toString().trim();
                for (int ii = value6.length(); ii < 24; ii++) {
                    value6 += " ";
                }
//                fw.write(value2 + "    ");//4
                fw.write(value6);

                String value7 = jTableTransection.getValueAt(i, 7).toString().trim();
                for (int ii = value7.length(); ii < 10; ii++) {
                    value7 += " ";
                }
                fw.write(value7);//5

                String value8 = jTableTransection.getValueAt(i, 8).toString().trim();
                for (int ii = value8.length(); ii < 11; ii++) {
                    value8 += " ";
                }
//                fw.write(value8 + "     ");//5
                fw.write(value8);

                String value9 = jTableTransection.getValueAt(i, 9).toString().trim();
                for (int ii = value9.length(); ii < 11; ii++) {
                    value9 += " ";
                }
//                fw.write(value9 + "      ");//6
                fw.write(value9);

                String value10 = jTableTransection.getValueAt(i, 10).toString().trim();
                for (int ii = value10.length(); ii < 10; ii++) {
                    value10 += " ";
                }
//                fw.write(value10 + "     ");//5
                fw.write(value10);

                String value11 = jTableTransection.getValueAt(i, 11).toString().trim();
                for (int ii = value11.length(); ii < 10; ii++) {
                    value11 += " ";
                }
//                fw.write(value11 + "     ");//5
                fw.write(value11);

                String value12 = jTableTransection.getValueAt(i, 12).toString().trim();
                for (int ii = value11.length(); ii < 10; ii++) {
                    value12 += " ";
                }
                fw.write(value12);

                fw.write("\r\n");
            }
            fw.write("+");
            fw.close();
            JOptionPane.showMessageDialog(this, "Export to " + path + " Complete");
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }

    }

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResetModel();
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

    private void jcbStartHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStartHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbStartHouseActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        if ("Please Select : PRD Line".equals(jcbPRDLine.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please Select PRD Line");
            jcbPRDLine.requestFocusInWindow();
        } else if ("Please Select : House".equals(jcbStartHouse.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please Select Start House");
            jcbStartHouse.requestFocusInWindow();
        } else if ("Please Select : House".equals(jcbEndHouse.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please Select End House");
            jcbEndHouse.requestFocusInWindow();
        } else {
            TransectionDetail();
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTableTransectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTransectionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTransectionMouseClicked

    private void jMenuRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRefreshMouseClicked
        // TODO add your handling code here:
        TransectionDetail();
    }//GEN-LAST:event_jMenuRefreshMouseClicked

    private void jcbEndHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEndHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEndHouseActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        String[] getPRDLine = jcbPRDLine.getSelectedItem().toString().split(":");
        String vPRDLine = getPRDLine[0].trim();
        String[] getStartHouse = jcbStartHouse.getSelectedItem().toString().split(":");
        String vStartHouse = getStartHouse[0].trim();
        String[] getEndHouse = jcbEndHouse.getSelectedItem().toString().split(":");
        String vEndHouse = getEndHouse[0].trim();

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

        btnPrint.enable(false);
        cgr.rBR01R009("BR01R009", BRLogin.vFarm, BRLogin.vDuckBreed, vPRDLine, sdf2.format(getDate), vStartHouse, vEndHouse, getLotDate, vTable);
        btnPrint.enable(true);
    }//GEN-LAST:event_btnPrintActionPerformed

    private void jButtonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportActionPerformed
        // TODO add your handling code here:
        int index = jTableTransection.getRowCount();
        if (index <= 0) {
            JOptionPane.showMessageDialog(this, "Please Search Data for Export Text File");
        } else {
            ExportTextFile();
        }

    }//GEN-LAST:event_jButtonExportActionPerformed

    private void jcbPRDLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPRDLineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPRDLineActionPerformed

    private void jcbEggTranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEggTranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEggTranActionPerformed

    private void jcbEggTranKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbEggTranKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEggTranKeyPressed

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
            java.util.logging.Logger.getLogger(BR01R009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BR01R009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BR01R009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BR01R009.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BR01R009().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonExport;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelFlockSTDate;
    private javax.swing.JLabel jLabelHouse;
    private javax.swing.JLabel jLabelHouse1;
    private javax.swing.JLabel jLabelHouse2;
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
    private javax.swing.JComboBox jcbEggTran;
    private javax.swing.JComboBox jcbEndHouse;
    private javax.swing.JComboBox jcbPRDLine;
    private javax.swing.JComboBox jcbStartHouse;
    // End of variables declaration//GEN-END:variables
}