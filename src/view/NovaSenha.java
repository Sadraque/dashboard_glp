/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import db.SQLServer;
import db.CRUD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author sadra
 */
public class NovaSenha extends javax.swing.JFrame {

    
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Creates new form Login
     */
    public NovaSenha() {
        initComponents();
        setSize(800, 800);
        setResizable(false);
        this.setLocationRelativeTo(null);
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
        redefinir_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        senha_textField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

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

        redefinir_button.setBackground(new java.awt.Color(0, 153, 255));
        redefinir_button.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        redefinir_button.setForeground(new java.awt.Color(255, 255, 255));
        redefinir_button.setText("REDEFINIR");
        redefinir_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redefinir_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(redefinir_button);
        redefinir_button.setBounds(250, 420, 300, 33);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Redefinição de senha");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 240, 300, 25);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 350, 60, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Digite a nova senha");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(160, 300, 490, 22);

        senha_textField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        senha_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(senha_textField);
        senha_textField.setBounds(250, 350, 300, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sadra\\Documents\\NetBeansProjects\\dashboard-glp\\src\\img\\background.jpeg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-8, 0, 1180, 810);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redefinir_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redefinir_buttonActionPerformed
        String senha = senha_textField.getText();
        
        if(validarCampos(senha)) {
        CRUD.alterarSenha(email, senha);
        
        JOptionPane.showMessageDialog(rootPane, "Senha alterada com sucesso!");
        setVisible(false);
        Login login = new Login();
        login.setVisible(true);
        }
    }//GEN-LAST:event_redefinir_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(NovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new NovaSenha().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton redefinir_button;
    private javax.swing.JPasswordField senha_textField;
    // End of variables declaration//GEN-END:variables

        private boolean validarCampos(String senha) {
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "O campo SENHA deve ser preenchido!", "Inválido", 2);

            return false;
        }

        return true;
    }
}
