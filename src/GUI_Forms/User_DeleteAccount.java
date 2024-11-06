/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_Forms;

import Functions.Log_in;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author John Lopez
 */
public class User_DeleteAccount extends javax.swing.JFrame {

    /**
     * Creates new form User_DeleteAccount
     */
    public User_DeleteAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        haha2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        deleter_Email = new javax.swing.JTextField();
        deleter_Pass = new javax.swing.JTextField();
        hehe6 = new javax.swing.JLabel();
        hehe7 = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DELETE");

        haha2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(2, 39, 60));

        deleter_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleter_EmailActionPerformed(evt);
            }
        });

        hehe6.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        hehe6.setForeground(new java.awt.Color(255, 255, 255));
        hehe6.setText("EMAIL:");

        hehe7.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        hehe7.setForeground(new java.awt.Color(255, 255, 255));
        hehe7.setText("PASSWORD:");

        del.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setText("Delete this Account,");
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DELETE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(del))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hehe6)
                            .addComponent(hehe7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleter_Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(deleter_Email))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleter_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hehe6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleter_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hehe7))
                .addGap(33, 33, 33)
                .addComponent(del)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout haha2Layout = new javax.swing.GroupLayout(haha2);
        haha2.setLayout(haha2Layout);
        haha2Layout.setHorizontalGroup(
            haha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        haha2Layout.setVerticalGroup(
            haha2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, haha2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleter_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleter_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleter_EmailActionPerformed

    private void delMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseClicked
    Log_in nLog = new Log_in();
    int choice = JOptionPane.showConfirmDialog(this, "You are about to delete this user.\n\n ARE YOU SURE?", "DELETE",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    nLog.setCc_name(deleter_Email.getText());
    nLog.setC_pass(deleter_Pass.getText());
    if(choice == JOptionPane.YES_OPTION)
    {
        if(deleter_Email.getText().isEmpty() && deleter_Pass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "INVALID ACTION", "ERROR",JOptionPane.ERROR_MESSAGE);
        } 
        else 
        {
            if (SQL_Conn.SQL_Conn.dbUpdChecker(nLog.getCc_name(), nLog.getC_pass())){
                SQL_Conn.SQL_Conn.dbDeleteOrDisable(nLog.getCc_name(), nLog.getC_pass());
            }
        }
    }else if (choice == JOptionPane.NO_OPTION){
        JOptionPane.showMessageDialog(null, "Alright then", "Okay", 0);
    }
     
    }//GEN-LAST:event_delMouseClicked

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        del.setForeground(Color.red);
    }//GEN-LAST:event_delMouseEntered

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        del.setForeground(Color.white);
    }//GEN-LAST:event_delMouseExited

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
            java.util.logging.Logger.getLogger(User_DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_DeleteAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_DeleteAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel del;
    private javax.swing.JTextField deleter_Email;
    private javax.swing.JTextField deleter_Pass;
    private javax.swing.JPanel haha2;
    private javax.swing.JLabel hehe6;
    private javax.swing.JLabel hehe7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
