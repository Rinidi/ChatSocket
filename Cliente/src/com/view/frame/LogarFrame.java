
package com.view.frame;

import com.cx.control.ControleCadastro;
import com.model.cxl.usuario.Usuario;
import com.view.app.Cliente;
import javax.swing.JOptionPane;

public class LogarFrame extends javax.swing.JFrame {

    private ClienteFrame cf = null; 
    ControleCadastro controle = new ControleCadastro();
    
    public LogarFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConectar = new javax.swing.JDesktopPane();
        pnlLogin = new javax.swing.JPanel();
        btnLogar = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblUsuario1 = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConectar.setPreferredSize(new java.awt.Dimension(530, 500));

        pnlLogin.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        pnlLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnlLogin.setEnabled(false);
        pnlLogin.setPreferredSize(new java.awt.Dimension(360, 320));

        btnLogar.setBackground(new java.awt.Color(204, 204, 204));
        btnLogar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(51, 51, 51));
        btnLogar.setText("Login");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblUsuario1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario1.setText("Usuário:");

        lblSenha1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha1.setText("Senha:");

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/setaEsquerda.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setToolTipText("");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario1)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSenha1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSenha1)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginLayout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        painelConectar.setLayer(pnlLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelConectarLayout = new javax.swing.GroupLayout(painelConectar);
        painelConectar.setLayout(painelConectarLayout);
        painelConectarLayout.setHorizontalGroup(
            painelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConectarLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        painelConectarLayout.setVerticalGroup(
            painelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConectarLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelConectar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(painelConectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
         if(validaCampos()){
             String name = txtName.getText();
             String pass = String.valueOf(txtSenha.getPassword());
             Usuario usuario = controle.buscaUsuario(name, pass);
             if(usuario != null){
                 this.dispose();
                 cf = new ClienteFrame(usuario);
                 cf.setVisible(true);
                 JOptionPane.showMessageDialog(null, "Logado com sucesso!", "Login", JOptionPane.WARNING_MESSAGE);
             }else{
                 JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
             }
         }else{
             JOptionPane.showMessageDialog(null,"Preencha Todos os Campos!","Erro de Login", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        Cliente c = new Cliente();
        c.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    public boolean validaCampos(){
        boolean contem = false;
        if(txtName.getText().equals("") || String.valueOf(txtSenha.getPassword()).equals("")){
            contem = false;
        }else{
            contem = true;
        }
        return contem;
    }
    public static void run() {
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
            java.util.logging.Logger.getLogger(LogarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new LogarFrame().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JDesktopPane painelConectar;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
