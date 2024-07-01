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
public class BRItem01 extends javax.swing.JFrame {

    public static String vStkctl = "", vStock = "", vMulti = "";
    DefaultTableModel model;
    ClassReturnData crd = new ClassReturnData();
    ClassInsertData cid = new ClassInsertData();
    ClassListData cld = new ClassListData();

    /**
     * Creates new form FarmJFrame
     */
    public BRItem01() {
        initComponents();
        this.setTitle("FAR_MITEM : " + BRLogin.vDuckBreed + " " + BRLogin.vDuckBreedDesc + " : " + BRLogin.vFarm + " " + BRLogin.vFarmDesc);

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
        jTextName = new javax.swing.JTextField();
        jLabelCode = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jButtonCreate = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabelGroup = new javax.swing.JLabel();
        jLabeUnit = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelEffitem = new javax.swing.JLabel();
        jLabelStkctl = new javax.swing.JLabel();
        jLabelFloc = new javax.swing.JLabel();
        jcbStkNo = new javax.swing.JCheckBox();
        jcbStkYes = new javax.swing.JCheckBox();
        jcbStoNo = new javax.swing.JCheckBox();
        jcbStoYes = new javax.swing.JCheckBox();
        jcbItemUnit = new javax.swing.JComboBox();
        jcbItemGroup = new javax.swing.JComboBox();
        jcbHouse = new javax.swing.JComboBox();
        jcbItem = new javax.swing.JComboBox();
        jcbMultiYes = new javax.swing.JCheckBox();
        jLabelStock1 = new javax.swing.JLabel();
        jcbMultiNo = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FAR_MITEM. CREATE");
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
        jLabelCode.setText("Item Code : *");

        jLabelName.setText("Item Name :");

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

        jLabelGroup.setText("Item Group :");

        jLabeUnit.setText("Item Unit :");

        jLabelStock.setText("Item Stock :");

        jLabelEffitem.setText("Item Effitem :");

        jLabelStkctl.setText("Item Stkctl :");

        jLabelFloc.setText("Item Floc :");

        jcbStkNo.setText("No");
        jcbStkNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStkNoActionPerformed(evt);
            }
        });

        jcbStkYes.setText("Yes");
        jcbStkYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStkYesActionPerformed(evt);
            }
        });

        jcbStoNo.setText("No");
        jcbStoNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStoNoActionPerformed(evt);
            }
        });

        jcbStoYes.setText("Yes");
        jcbStoYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbStoYesActionPerformed(evt);
            }
        });

        jcbItemUnit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Farm" }));
        jcbItemUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbItemUnitActionPerformed(evt);
            }
        });
        jcbItemUnit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbItemUnitKeyPressed(evt);
            }
        });

        jcbItemGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Farm" }));
        jcbItemGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbItemGroupActionPerformed(evt);
            }
        });
        jcbItemGroup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbItemGroupKeyPressed(evt);
            }
        });

        jcbHouse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Farm" }));
        jcbHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHouseActionPerformed(evt);
            }
        });
        jcbHouse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jcbHouseKeyPressed(evt);
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

        jcbMultiYes.setText("Yes");
        jcbMultiYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMultiYesActionPerformed(evt);
            }
        });

        jLabelStock1.setText("Item Multi :");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelName)
                            .addComponent(jLabelCode))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextName)
                            .addComponent(jTextCode)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 389, Short.MAX_VALUE)
                        .addComponent(jButtonCreate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelGroup)
                            .addComponent(jLabeUnit)
                            .addComponent(jLabelFloc)
                            .addComponent(jLabelStkctl)
                            .addComponent(jLabelStock)
                            .addComponent(jLabelEffitem)
                            .addComponent(jLabelStock1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcbStkYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jcbStkNo))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jcbStoYes)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jcbStoNo)))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jcbItemUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbItemGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbHouse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbMultiYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbMultiNo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jcbItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
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
                    .addComponent(jLabeUnit)
                    .addComponent(jcbItemUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGroup)
                    .addComponent(jcbItemGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFloc)
                    .addComponent(jcbHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStkYes)
                    .addComponent(jcbStkNo)
                    .addComponent(jLabelStkctl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbStoYes)
                    .addComponent(jcbStoNo)
                    .addComponent(jLabelStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEffitem)
                    .addComponent(jcbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMultiYes)
                    .addComponent(jcbMultiNo)
                    .addComponent(jLabelStock1))
                .addGap(11, 11, 11)
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

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        // TODO add your handling code here: 
        try {

            String[] getItemUnit = jcbItemUnit.getSelectedItem().toString().split(":");
            String[] getItemGroup = jcbItemGroup.getSelectedItem().toString().split(":");
            String[] getHouse = jcbHouse.getSelectedItem().toString().split(":");
            String[] getEffItem = jcbItem.getSelectedItem().toString().split(":");
            String vItemUnit = getItemUnit[0].trim();
            String vItemGroup = getItemGroup[0].trim();
            String vHouse = getHouse[0].trim();
            String vEffItem = getEffItem[0].trim();

            if (jTextCode.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Insert Item Code");
                jTextCode.requestFocusInWindow();
            } else if (jcbStkYes.isSelected() == false && jcbStkNo.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Select Status");
                jcbStkYes.requestFocusInWindow();
            } else if (jcbStoYes.isSelected() == false && jcbStoNo.isSelected() == false) {
                JOptionPane.showMessageDialog(null, "Select Status");
                jcbStoYes.requestFocusInWindow();
            } else {

                if ("Please Select".equals(vItemUnit)) {
                    vItemUnit = "";
                }
                if ("Please Select".equals(vItemGroup)) {
                    vItemGroup = "";
                }
                if ("Please Select".equals(vHouse)) {
                    vHouse = "";
                }
                if ("Please Select".equals(vEffItem)) {
                    vEffItem = "";
                }

                String count = crd.CheckItemDuplicate(BRLogin.vFarm, jTextCode.getText());
                String breed;
                if ("1".equals(vMulti)) {
                    breed = "AL";
                } else {
                    breed = BRLogin.vDuckBreed;
                }

                if (Integer.valueOf(count) > 0) {
                    JOptionPane.showMessageDialog(null, jTextCode.getText() + " Data Already");
                } else {
                    cid.InsertItem(BRLogin.vFarm, jTextCode.getText().trim(), jTextName.getText(), vItemUnit, vItemGroup, vHouse.trim(), vStkctl.trim(), vStock.trim(), vEffItem.trim(), vMulti.trim(), breed);
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
        String[] getItemUnit = jcbItemUnit.getSelectedItem().toString().split(":");
        String[] getItemGroup = jcbItemGroup.getSelectedItem().toString().split(":");
        String[] getHouse = jcbHouse.getSelectedItem().toString().split(":");
        String[] getEffItem = jcbItem.getSelectedItem().toString().split(":");
        String vItemUnit = getItemUnit[0].trim();
        String vItemGroup = getItemGroup[0].trim();
        String vHouse = getHouse[0].trim();
        String vEffItem = getEffItem[0].trim();
        String breed;
        if (jcbStkYes.isSelected() == false && jcbStkNo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select Status");
            jcbStkYes.requestFocusInWindow();
        } else if (jcbStoYes.isSelected() == false && jcbStoNo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select Status");
            jcbStoYes.requestFocusInWindow();
        }

        if (jcbMultiYes.isSelected() == false && jcbMultiNo.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select House Multi");
            jcbMultiYes.requestFocusInWindow();
        }

        if ("Please Select".equals(vItemUnit)) {
            vItemUnit = "";
        }
        if ("Please Select".equals(vItemGroup)) {
            vItemGroup = "";
        }
        if ("Please Select".equals(vHouse)) {
            vHouse = "";
        }
        if ("Please Select".equals(vEffItem)) {
            vEffItem = "";
        }

        if ("1".equals(vMulti)) {
            breed = "AL";
        } else {
            breed = BRLogin.vDuckBreed;
        }

        cid.UpdateItem(BRLogin.vFarm, jTextCode.getText().trim(), jTextName.getText().trim(), vItemUnit.trim(), vItemGroup.trim(), vHouse.trim(), vStkctl.trim(), vStock.trim(), vEffItem.trim(), vMulti.trim(), breed);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:        
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:   

        jcbItemUnit.setModel(new DefaultComboBoxModel(cld.GetResultItemUnit(BRLogin.vFarm).toArray()));
        jcbItemGroup.setModel(new DefaultComboBoxModel(cld.GetResultItemGroup(BRLogin.vFarm).toArray()));
        jcbHouse.setModel(new DefaultComboBoxModel(cld.GetResultHouse(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));
        jcbItem.setModel(new DefaultComboBoxModel(cld.GetResultItem(BRLogin.vFarm, BRLogin.vDuckBreed, BRLogin.vDuckBreedAll).toArray()));

        if ("Yes".equals(BRData01.OnChange)) {
            jTextCode.setText(BRData01.vITEM_CODE);
            jTextName.setText(BRData01.vITEM_NAME);
            jcbItemUnit.setSelectedItem(BRData01.vITEM_UNIT);
            jcbItemGroup.setSelectedItem(BRData01.vITEM_GROUP);
            jcbHouse.setSelectedItem(BRData01.vITEM_FLOCATON);

            vStkctl = BRData01.vITEM_STKCTL;
            if ("No".equals(vStkctl) || "".equals(vStkctl)) {
                jcbStkNo.setSelected(true);
            } else {
                jcbStkYes.setSelected(true);
            }

            if (jcbStkYes.isSelected() == true) {
                vStkctl = "1";
            } else {
                vStkctl = "0";
            }

            vStock = BRData01.vITEM_STOCK;
            if ("No".equals(vStock) || "".equals(vStock)) {
                jcbStoNo.setSelected(true);
            } else {
                jcbStoYes.setSelected(true);
            }

            if (jcbStoYes.isSelected() == true) {
                vStock = "1";
            } else {
                vStock = "0";
            }

            jcbItem.setSelectedItem(BRData01.vITEM_EFFITEM);

            vMulti = BRData01.vITEM_MULTI;
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

    private void jcbStkNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStkNoActionPerformed
        // TODO add your handling code here:
        if (jcbStkNo.isSelected() == true) {
            vStkctl = "0";
            jcbStkYes.setSelected(false);
        } else {
            vStkctl = "";
        }
    }//GEN-LAST:event_jcbStkNoActionPerformed

    private void jcbStkYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStkYesActionPerformed
        // TODO add your handling code here:
        if (jcbStkYes.isSelected() == true) {
            vStkctl = "1";
            jcbStkNo.setSelected(false);
        } else {
            vStkctl = "";
        }
    }//GEN-LAST:event_jcbStkYesActionPerformed

    private void jcbStoNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStoNoActionPerformed
        // TODO add your handling code here:
        if (jcbStoNo.isSelected() == true) {
            vStock = "0";
            jcbStoYes.setSelected(false);
        } else {
            vStock = "";
        }
    }//GEN-LAST:event_jcbStoNoActionPerformed

    private void jcbStoYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbStoYesActionPerformed
        // TODO add your handling code here:
        if (jcbStoYes.isSelected() == true) {
            vStock = "1";
            jcbStoNo.setSelected(false);
        } else {
            vStock = "";
        }
    }//GEN-LAST:event_jcbStoYesActionPerformed

    private void jcbItemUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItemUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemUnitActionPerformed

    private void jcbItemUnitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbItemUnitKeyPressed
        // TODO add your handling code here:
        //eFARM_CODE = jComboFarm.getSelectedItem().toString();
        //query();
    }//GEN-LAST:event_jcbItemUnitKeyPressed

    private void jcbItemGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItemGroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemGroupActionPerformed

    private void jcbItemGroupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbItemGroupKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemGroupKeyPressed

    private void jcbHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHouseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHouseActionPerformed

    private void jcbHouseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbHouseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHouseKeyPressed

    private void jcbItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemActionPerformed

    private void jcbItemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbItemKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbItemKeyPressed

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
            java.util.logging.Logger.getLogger(BRItem01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BRItem01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BRItem01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BRItem01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BRItem01().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabeUnit;
    private javax.swing.JLabel jLabelCode;
    private javax.swing.JLabel jLabelEffitem;
    private javax.swing.JLabel jLabelFloc;
    private javax.swing.JLabel jLabelGroup;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelStkctl;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelStock1;
    private javax.swing.JTextField jTextCode;
    private javax.swing.JTextField jTextName;
    private javax.swing.JComboBox jcbHouse;
    private javax.swing.JComboBox jcbItem;
    private javax.swing.JComboBox jcbItemGroup;
    private javax.swing.JComboBox jcbItemUnit;
    private javax.swing.JCheckBox jcbMultiNo;
    private javax.swing.JCheckBox jcbMultiYes;
    private javax.swing.JCheckBox jcbStkNo;
    private javax.swing.JCheckBox jcbStkYes;
    private javax.swing.JCheckBox jcbStoNo;
    private javax.swing.JCheckBox jcbStoYes;
    // End of variables declaration//GEN-END:variables

}
