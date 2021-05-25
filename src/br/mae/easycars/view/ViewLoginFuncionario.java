/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mae.easycars.view;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Isac Paz
 */
public class ViewLoginFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form ViewLoginFuncionario
     */
    public ViewLoginFuncionario() {
        initComponents();
    }

    public JButton getBtnEntrar() {
        return btnEntrar;
    }

    public JTextField getTxtLogin() {
        return txtLogin;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public JButton getBtnVoltar() {
        return btnVoltar;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Funcionário - EasyCars");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 630));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/mae/easycars/view/images/logo-sm.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 140, 90));

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/mae/easycars/view/images/do-utilizador-124.png"))); // NOI18N
        jLabel2.setText("Funcionário");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Senha:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel4.setText("Faça login para acessar aos serviços");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        btnVoltar.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(null);
        btnVoltar.setBorderPainted(false);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setFocusPainted(false);
        jPanel2.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 300, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 300, 20));

        txtLogin.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtLogin.setBorder(null);
        jPanel2.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 300, -1));

        txtSenha.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtSenha.setBorder(null);
        jPanel2.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 300, 30));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Login:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        btnEntrar.setBackground(new java.awt.Color(255, 102, 0));
        btnEntrar.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        jPanel2.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 300, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ViewLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoginFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoginFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
