/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.sena.examplejdbc.views;

import co.edu.sena.examplejdbc.controllers.EmployeeController;
import co.edu.sena.examplejdbc.controllers.EmployeeTypeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeController;
import co.edu.sena.examplejdbc.controllers.IEmployeeTypeController;
import co.edu.sena.examplejdbc.model.Employee;
import co.edu.sena.examplejdbc.model.EmployeeType;
import co.edu.sena.examplejdbc.utils.MessageUtils;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aprendiz
 */
public class JFrameEmployee extends javax.swing.JFrame {

    private IEmployeeController employeeController = new EmployeeController();
    private IEmployeeTypeController employeeTypeController = new EmployeeTypeController();
    
    /**
     * Creates new form JFrameEmployee
     */
    public JFrameEmployee() {
        initComponents();
        fillComboTypes();
        fillTable();

    }
    
    
    
    public void fillComboTypes()
    {
        try {
            List<EmployeeType> types = employeeTypeController.findAll();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            jComboBoxType.setModel(model);
            model.addAll(types);
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }
    
    
        public void fillTable()
    {
        try {
            DefaultTableModel model = new DefaultTableModel();
            jTableEmployees.setModel(model);
            model.addColumn("Documento");
            model.addColumn("Nombre Completo");
            model.addColumn("Tipo de empleado");
            
            String[] rows = new String[3];
            List<Employee> types = employeeController.findAll();
            for (Employee e : types) {
                rows[0] = String.valueOf(e.getDocument());
                rows[1] = e.getFullname();
                rows[2] = e.getEmployeeType().getDescript();

                model.addRow(rows);
            }
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        } 
    }


        
        public void clear()
        {
            
            jTextFieldDocument.setText("");
            jTextFieldAddres.setText("");
            jTextFieldFullname.setText("");
            jTextFieldPhone.setText("");
            jTableEmployees.clearSelection();
            jComboBoxType.setSelectedIndex(0);
            jButtonInsert.setEnabled(true);
            jButtonUpdate.setEnabled(false);
            jButtonDelete.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelEmployeee = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDocument = new javax.swing.JLabel();
        jLabelFullname = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelAddres = new javax.swing.JLabel();
        jTextFieldDocument = new javax.swing.JTextField();
        jTextFieldFullname = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldAddres = new javax.swing.JTextField();
        jLabelType = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmployees = new javax.swing.JTable();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");

        jPanelEmployeee.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Empleado");

        jLabelDocument.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDocument.setText("Documento:");

        jLabelFullname.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFullname.setText("Nombre completo:");

        jLabelPhone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPhone.setText("Teléfono:");

        jLabelAddres.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAddres.setText("Dirección:");

        jLabelType.setForeground(new java.awt.Color(255, 255, 255));
        jLabelType.setText("Tipo: ");

        jTableEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmployees);

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Repos\\ExampleJDB\\ExampleJDBC\\src\\main\\resources\\co\\edu\\sena\\examplejdbc\\view\\home.png")); // NOI18N
        jLabel2.setText("Volver");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelEmployeeeLayout = new javax.swing.GroupLayout(jPanelEmployeee);
        jPanelEmployeee.setLayout(jPanelEmployeeeLayout);
        jPanelEmployeeeLayout.setHorizontalGroup(
            jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelAddres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDocument, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDocument))
                    .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTextFieldAddres))
                    .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFullname)
                    .addComponent(jLabelPhone))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldFullname, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jTextFieldPhone))
                .addGap(60, 60, 60))
            .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonInsert)
                .addGap(79, 79, 79)
                .addComponent(jButtonUpdate)
                .addGap(64, 64, 64)
                .addComponent(jButtonDelete)
                .addGap(75, 75, 75)
                .addComponent(jButtonClear)
                .addGap(88, 88, 88))
            .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel1))
                    .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEmployeeeLayout.setVerticalGroup(
            jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeeeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDocument)
                    .addComponent(jLabelFullname)
                    .addComponent(jTextFieldDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPhone)
                    .addComponent(jLabelAddres)
                    .addComponent(jTextFieldAddres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelType)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanelEmployeeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete)
                    .addComponent(jButtonClear))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelEmployeee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelEmployeee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        try {
            Employee employee = new Employee();
            employee.setDocument(Long.parseLong(jTextFieldDocument.getText()));
            employee.setFullname(jTextFieldFullname.getText());
            employee.setAddress(jTextFieldAddres.getText());
            employee.setPhone(jTextFieldPhone.getText());
            //FK
            EmployeeType type = (EmployeeType) jComboBoxType.getSelectedItem();
            employee.setEmployeeType(type);
            
            employeeController.insert(employee);
            clear();
            fillTable();
            MessageUtils.showInfoMessage("Tipo de empleado creado exitosamente");
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        try {
            Employee employee = new Employee();
            employee.setDocument(Long.parseLong(jTextFieldDocument.getText()));
            employee.setFullname(jTextFieldFullname.getText());
            employee.setAddress(jTextFieldAddres.getText());
            employee.setPhone(jTextFieldPhone.getText());
            //FK
            EmployeeType type = (EmployeeType) jComboBoxType.getSelectedItem();
            employee.setEmployeeType(type);
            
            employeeController.update(employee);

            MessageUtils.showInfoMessage("Tipo de empleado actualizado exitosamente");
            clear();
            fillTable();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmployeesMouseClicked
        
        int rowSelected = jTableEmployees.getSelectedRow();
        if(rowSelected != -1)
        {
            
            jButtonInsert.setEnabled(false);
            jButtonUpdate.setEnabled(true);
            jButtonDelete.setEnabled(true);
            long documentSelect = Long.parseLong(jTableEmployees.getValueAt(rowSelected, 0).toString());
            
            try {
                Employee employee = employeeController.findById(documentSelect);
                jTextFieldDocument.setText(String.valueOf(documentSelect));
                jTextFieldFullname.setText(employee.getFullname());
                jTextFieldAddres.setText(employee.getAddress());
                jTextFieldPhone.setText(employee.getPhone());
                jComboBoxType.getModel().setSelectedItem(employee.getEmployeeType());
            } catch (Exception e) {
                MessageUtils.showErrorMessage(e.getMessage());
            }
  
        }
    }//GEN-LAST:event_jTableEmployeesMouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        try {
            int option = JOptionPane.showConfirmDialog(rootPane, "Esta seguro de eliminar el registro?", "confirmación", JOptionPane.YES_NO_OPTION);
            if(option == JOptionPane.YES_OPTION)
            {
                employeeController.delete(Integer.parseInt(jTextFieldDocument.getText()));
                MessageUtils.showInfoMessage("Empleado eliminado existosamente");
                fillTable();
            }
            
            clear();
        } catch (Exception e) {
            MessageUtils.showErrorMessage(e.getMessage());
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        JFrameHome view = new JFrameHome();
        view.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked


    
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
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAddres;
    private javax.swing.JLabel jLabelDocument;
    private javax.swing.JLabel jLabelFullname;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JPanel jPanelEmployeee;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmployees;
    private javax.swing.JTextField jTextFieldAddres;
    private javax.swing.JTextField jTextFieldDocument;
    private javax.swing.JTextField jTextFieldFullname;
    private javax.swing.JTextField jTextFieldPhone;
    // End of variables declaration//GEN-END:variables
}
