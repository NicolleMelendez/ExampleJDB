/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.views;

import co.edu.sena.examplejdbc.controllers.IKeyController;
import co.edu.sena.examplejdbc.controllers.KeyController;
import co.edu.sena.examplejdbc.model.Key;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolle
 */
public class JFrameKey extends javax.swing.JFrame {

    private IKeyController keyController = new KeyController();
    
    /**
     * Creates new form JFrameKey
     */
    public JFrameKey() {
        initComponents();
        fillTable();
    }
    
        public void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableKey.setModel(model);
            model.addColumn("Id");
            model.addColumn("Nombre");
            model.addColumn("Aula");
            
            String[] rows = new String[3];
            List<Key> types = keyController.findAll();
            for (Key e : types) {
                rows[0] = String.valueOf(e.getId());
                rows[1] = e.getName();
                rows[2] = e.getRoom();
                model.addRow(rows);
            }
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelKey = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelRoom = new javax.swing.JLabel();
        jLabelCount = new javax.swing.JLabel();
        jLabelObservation = new javax.swing.JLabel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableKey = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservation = new javax.swing.JTextArea();
        jTextFieldId = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldRoom = new javax.swing.JTextField();
        jTextFieldCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Key");

        jPanelKey.setBackground(new java.awt.Color(65, 105, 225));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Llaves");

        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("Id: ");

        jLabelName.setForeground(new java.awt.Color(255, 255, 255));
        jLabelName.setText("Nombre: ");

        jLabelRoom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRoom.setText("Aula: ");

        jLabelCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCount.setText("Cantidad: ");

        jLabelObservation.setForeground(new java.awt.Color(255, 255, 255));
        jLabelObservation.setText("Observación: ");

        jButtonInsert.setBackground(new java.awt.Color(0, 153, 0));
        jButtonInsert.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Crear");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(51, 153, 255));
        jButtonUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Modificar");
        jButtonUpdate.setEnabled(false);
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setBackground(new java.awt.Color(204, 0, 0));
        jButtonDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Eliminar");
        jButtonDelete.setEnabled(false);
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(153, 153, 153));
        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Limpiar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jTableKey.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableKeyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableKey);

        jTextAreaObservation.setColumns(20);
        jTextAreaObservation.setLineWrap(true);
        jTextAreaObservation.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservation);

        jTextFieldRoom.setText(" ");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Repos\\ExampleJDB\\ExampleJDBC\\src\\main\\resources\\co\\edu\\sena\\examplejdbc\\view\\home.png")); // NOI18N
        jLabel2.setText("Volver");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelKeyLayout = new javax.swing.GroupLayout(jPanelKey);
        jPanelKey.setLayout(jPanelKeyLayout);
        jPanelKeyLayout.setHorizontalGroup(
            jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyLayout.createSequentialGroup()
                .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelKeyLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelKeyLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jButtonInsert)
                                    .addGap(49, 49, 49)
                                    .addComponent(jButtonUpdate))
                                .addGroup(jPanelKeyLayout.createSequentialGroup()
                                    .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelRoom)
                                        .addComponent(jLabelId))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77)
                                    .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelKeyLayout.createSequentialGroup()
                                            .addComponent(jLabelName)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelKeyLayout.createSequentialGroup()
                                            .addComponent(jLabelCount)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldCount))))
                                .addComponent(jLabelObservation)
                                .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelKeyLayout.createSequentialGroup()
                                        .addComponent(jButtonDelete)
                                        .addGap(56, 56, 56)
                                        .addComponent(jButtonClear))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanelKeyLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)))
                .addGap(19, 35, Short.MAX_VALUE))
        );
        jPanelKeyLayout.setVerticalGroup(
            jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelKeyLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelId)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRoom)
                    .addComponent(jLabelCount)
                    .addComponent(jTextFieldCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabelObservation)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanelKeyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonUpdate))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKey, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelKey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        try {
            Key key = new Key();
            key.setName(jTextFieldName.getText().toUpperCase());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextAreaObservation.getText());
            keyController.insert(key);
            clear();
            fillTable();
            MessageUtils.showInfoMessage("Llave creada exitosamente");
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Key key = new Key();
            key.setId(Integer.parseInt(jTextFieldId.getText()));
            key.setName(jTextFieldName.getText().toUpperCase());
            key.setRoom(jTextFieldRoom.getText());
            key.setCount(Integer.parseInt(jTextFieldCount.getText()));
            key.setObservation(jTextAreaObservation.getText());
            keyController.update(key);
            MessageUtils.showInfoMessage("Llave actuallizado exitosamente");
            clear();
            fillTable();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el registro?", "confirmación", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                keyController.delete(Integer.parseInt(jTextFieldId.getText()));
                MessageUtils.showInfoMessage("Llave eliminada existosamente");
                fillTable();
            }
            
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableKeyMouseClicked
        int rowSelected = jTableKey.getSelectedRow();
        if(rowSelected != -1)
        {
            
            jButtonInsert.setEnabled(false);
            jButtonUpdate.setEnabled(true);
            jButtonDelete.setEnabled(true);
            int idSelect = Integer.parseInt(jTableKey.getValueAt(rowSelected, 0).toString());
            
            try {
                Key key = keyController.findById(idSelect);
                jTextFieldId.setText(String.valueOf(idSelect));
                jTextFieldName.setText(key.getName());
                jTextFieldRoom.setText(key.getRoom());
                jTextFieldCount.setText(String.valueOf(key.getCount()));
                jTextAreaObservation.setText(key.getObservation());
            } catch (Exception e) {
                MessageUtils.showErrorMessage(e.getMessage());
            }
  
        }
    }//GEN-LAST:event_jTableKeyMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JFrameHome view = new JFrameHome();
        view.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    
    
    public void clear()
    {
        jTextFieldId.setText("");
        jTextFieldName.setText("");
        jTextFieldRoom.setText("");
        jTextFieldCount.setText("");
        jTextAreaObservation.setText("");
        jTableKey.clearSelection();
        jButtonInsert.setEnabled(true);
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
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
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCount;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelObservation;
    private javax.swing.JLabel jLabelRoom;
    private javax.swing.JPanel jPanelKey;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableKey;
    private javax.swing.JTextArea jTextAreaObservation;
    private javax.swing.JTextField jTextFieldCount;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldRoom;
    // End of variables declaration//GEN-END:variables
}
