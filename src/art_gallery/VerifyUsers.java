/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package art_gallery;

import dao.UserDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import model.User;

/**
 *
 * @author Ahad
 */
public class VerifyUsers extends javax.swing.JFrame {

    /**
     * Creates new form VerifyUsers
     */
    public VerifyUsers() {
        initComponents();
    }
    public void getAllRecords(String email){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        ArrayList<User> list = UserDao.getAllRecords(email);
        Iterator<User> itr = list.iterator();
        while(itr.hasNext()){
            User userObj = itr.next();
            if(!userObj.getEmail().equals("admin@gmail.com"))
            {
                dtm.addRow(new Object[]{userObj.getId(),userObj.getName(),userObj.getEmail(),userObj.getMobileNumber(),userObj.getAddress(),userObj.getSecurityQuestion(),userObj.getStatus()});
                
            }
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        verifytxtfield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        jLabel1.setText("Verify Users");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1327, 12, 29, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, 20));

        verifytxtfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                verifytxtfieldKeyReleased(evt);
            }
        });
        getContentPane().add(verifytxtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 209, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Email", "Mobile Number", "Address", "Security Question", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 1366, 500));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Click on row to change status");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, -20, 1620, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

       getAllRecords("");
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void verifytxtfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verifytxtfieldKeyReleased
  
        String email = verifytxtfield.getText();
        getAllRecords(email);

        
        // TODO add your handling code here:
    }//GEN-LAST:event_verifytxtfieldKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String email = model.getValueAt(index, 2).toString();
        String status = model.getValueAt(index, 6).toString();
        if(status.equals("true"))
            status = "false";
        else
            status = "true";
        int a = JOptionPane.showConfirmDialog(null,"Do you want to change status of"+email+"","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           UserDao.changeStatus(email, status);
           setVisible(false);
           new VerifyUsers().setVisible(true);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(VerifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifyUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifyUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField verifytxtfield;
    // End of variables declaration//GEN-END:variables
}