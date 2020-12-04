/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import db.SQLServer;
import db.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sadra
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setSize(800, 800);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        email_textField = new javax.swing.JTextField();
        entrar_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        senha_textField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        email_textField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        email_textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_textField.setToolTipText("");
        email_textField.setMinimumSize(new java.awt.Dimension(6, 29));
        email_textField.setPreferredSize(new java.awt.Dimension(6, 29));
        email_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(email_textField);
        email_textField.setBounds(250, 346, 300, 30);

        entrar_button.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        entrar_button.setText("ENTRAR");
        entrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrar_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(entrar_button);
        entrar_button.setBounds(250, 470, 300, 29);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("InspectGas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 140, 300, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hard Protection");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 180, 300, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Entre para acessar o dashboard");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 290, 300, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Esqueci minha senha");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 520, 300, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Criiar conta");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 540, 300, 17);

        senha_textField.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        senha_textField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senha_textField.setToolTipText("");
        senha_textField.setPreferredSize(new java.awt.Dimension(6, 29));
        senha_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senha_textField);
        senha_textField.setBounds(250, 402, 300, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(190, 350, 39, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Senha");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 410, 43, 20);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\sadra\\Documents\\NetBeansProjects\\dashboard_glp\\src\\main\\java\\assets\\img\\background.jpeg")); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(800, 800));
        jLabel9.setMinimumSize(new java.awt.Dimension(800, 800));
        jLabel9.setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 800, 800);

        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(370, 100, 41, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_textFieldActionPerformed

    private void entrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrar_buttonActionPerformed

        String email = email_textField.getText();
        String senha = senha_textField.getText();
        
        System.out.println(UsuarioDAO.login(email, senha));
        
        
    }//GEN-LAST:event_entrar_buttonActionPerformed

    private void senha_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha_textFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_textField;
    private javax.swing.JButton entrar_button;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField senha_textField;
    // End of variables declaration//GEN-END:variables
}