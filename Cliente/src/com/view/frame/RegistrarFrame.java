package com.view.frame;

import com.cx.control.ControleCadastro;
import com.view.app.Cliente;
import javax.swing.JOptionPane;

public class RegistrarFrame extends javax.swing.JFrame {

    ControleCadastro controle = new ControleCadastro();

    public RegistrarFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGrupoSexo.add(btnFeminino);
        btnGrupoSexo.add(btnMasculino);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSexo = new javax.swing.ButtonGroup();
        painelConectar = new javax.swing.JDesktopPane();
        pnlRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        imgHomen = new javax.swing.JLabel();
        imgMulher = new javax.swing.JLabel();
        btnFeminino = new javax.swing.JRadioButton();
        btnMasculino = new javax.swing.JRadioButton();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConectar.setPreferredSize(new java.awt.Dimension(530, 500));

        pnlRegistrar.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        pnlRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnlRegistrar.setEnabled(false);
        pnlRegistrar.setPreferredSize(new java.awt.Dimension(360, 320));

        btnRegistrar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(51, 51, 51));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setText("Usuário:");

        lblSexo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");

        imgHomen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconM.png"))); // NOI18N

        imgMulher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconF.png"))); // NOI18N

        btnFeminino.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        btnFeminino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFeminino.setText("Feminino");

        btnMasculino.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        btnMasculino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMasculino.setText("Masculino");

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setToolTipText("");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/setaEsquerda.png"))); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSenha)
                            .addComponent(lblSexo)))
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFeminino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMasculino))
                            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(imgMulher)
                                .addGap(60, 60, 60)
                                .addComponent(imgHomen)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addGap(21, 21, 21)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFeminino)
                    .addComponent(btnMasculino)
                    .addComponent(lblSexo))
                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                        .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgMulher)
                            .addComponent(imgHomen))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))))
        );

        painelConectar.setLayer(pnlRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelConectarLayout = new javax.swing.GroupLayout(painelConectar);
        painelConectar.setLayout(painelConectarLayout);
        painelConectarLayout.setHorizontalGroup(
            painelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConectarLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        painelConectarLayout.setVerticalGroup(
            painelConectarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConectarLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validaDados()) {
            String login = txtName.getText();
            String senha = String.valueOf(txtSenha.getPassword());
            String sexo = selecionaSexo();
            controle.cadastrarUsuario(login, senha, sexo);
            this.dispose();
            Cliente c = new Cliente();
            c.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro de Login", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
        Cliente c = new Cliente();
        c.setVisible(true);
        //Cliente().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
    }//GEN-LAST:event_txtNameFocusLost
    public boolean validaDados() {

        boolean preenchidos = false;
        String sexo = selecionaSexo();
        if (String.valueOf(txtSenha.getPassword()).equals("") || txtName.getText().equals("") || sexo.equals("")) {
            preenchidos = false;
        } else {
            preenchidos = true;
        }

        return preenchidos;
    }

    public String selecionaSexo() {
        String sex = "";
        if (btnMasculino.isSelected()) {
            sex = "M";
        } else if (btnFeminino.isSelected()) {
            sex = "F";
        } else {
            sex = "";
        }

        return (sex);
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
            java.util.logging.Logger.getLogger(RegistrarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new RegistrarFrame().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFeminino;
    private javax.swing.ButtonGroup btnGrupoSexo;
    private javax.swing.JRadioButton btnMasculino;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgHomen;
    private javax.swing.JLabel imgMulher;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JDesktopPane painelConectar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
