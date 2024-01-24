/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art_gallery;

import dao.CategoryDao;
import java.util.ArrayList;
import java.util.Iterator;
import model.Category;
import model.Employee;
import dao.EmployeeDao;

/**
 *
 * @author Admin
 */
public class AddNewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddNewEmployee
     */
    public AddNewEmployee() {
        initComponents();
        jButton_save.setEnabled(false);
    }

    public void validateFields() {
        String employee_name = jText_name.getText();
        String nid = jText_nid.getText();
        if (!employee_name.equals("") && !nid.equals("")) {
            jButton_save.setEnabled(true);
        } else {
            jButton_save.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        jButton_cross = new javax.swing.JButton();
        j_nid = new javax.swing.JLabel();
        j_salary = new javax.swing.JLabel();
        jText_name = new javax.swing.JTextField();
        jText_nid = new javax.swing.JTextField();
        j_employeename = new javax.swing.JLabel();
        jButton_save = new javax.swing.JButton();
        jButton_clear = new javax.swing.JButton();
        jComboBox_salary = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 134));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        jLabel1.setText("New Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 399, 43));

        jButton_cross.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton_cross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_crossActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_cross, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 0, 31, -1));

        j_nid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        j_nid.setForeground(new java.awt.Color(255, 255, 255));
        j_nid.setText("Nid:");
        getContentPane().add(j_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        j_salary.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        j_salary.setForeground(new java.awt.Color(255, 255, 255));
        j_salary.setText("Salary:");
        getContentPane().add(j_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 261, -1, -1));

        jText_name.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jText_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_nameActionPerformed(evt);
            }
        });
        jText_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_nameKeyReleased(evt);
            }
        });
        getContentPane().add(jText_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 314, -1));

        jText_nid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jText_nid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_nidKeyReleased(evt);
            }
        });
        getContentPane().add(jText_nid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 314, -1));

        j_employeename.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        j_employeename.setForeground(new java.awt.Color(255, 255, 255));
        j_employeename.setText("Employee Name:");
        getContentPane().add(j_employeename, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 152, -1, -1));

        jButton_save.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton_save.setText("Save");
        jButton_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_saveActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 332, -1, -1));

        jButton_clear.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 332, -1, -1));

        jComboBox_salary.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jComboBox_salary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10000", "15000", "20000", " " }));
        getContentPane().add(jComboBox_salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 310, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1040, -720, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_crossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_crossActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton_crossActionPerformed

    private void jText_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jText_nameActionPerformed

    private void jText_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_nameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jText_nameKeyReleased

    private void jText_nidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_nidKeyReleased
        // TODO add your handling code here:
        validateFields();
    }//GEN-LAST:event_jText_nidKeyReleased

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ArrayList<Category> list = CategoryDao.getAllRecords();
        Iterator<Category> itr = list.iterator();
        while (itr.hasNext()) {
            Category categoryobj = itr.next();
            jComboBox_salary.addItem(categoryobj.getName());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_saveActionPerformed
        // TODO add your handling code here:
        Employee employee = new Employee();
        employee.setEmployee_name(jText_name.getText());
        employee.setSalary((String) jComboBox_salary.getSelectedItem());
        employee.setNid(jText_nid.getText());
        EmployeeDao.save(employee);
        setVisible(true);
        System.out.println(jText_name.getText());
        new AddNewEmployee().setVisible(true);
    }//GEN-LAST:event_jButton_saveActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AddNewEmployee().setVisible(true);
    }//GEN-LAST:event_jButton_clearActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_cross;
    private javax.swing.JButton jButton_save;
    private javax.swing.JComboBox<String> jComboBox_salary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jText_name;
    private javax.swing.JTextField jText_nid;
    private javax.swing.JLabel j_employeename;
    private javax.swing.JLabel j_nid;
    private javax.swing.JLabel j_salary;
    // End of variables declaration//GEN-END:variables
}