package com.view.frame;

import com.cx.control.ControleCadastroDAO;
import com.view.app.Cliente;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.JOptionPane;

public class RegistrarFrame extends javax.swing.JFrame {

    ControleCadastroDAO controle;

    public RegistrarFrame() {
        this.controle = retornaControle(controle);
        initComponents();
        txtName.requestFocus();
        this.setLocationRelativeTo(null);
        btnGrupoSexo.add(btnFeminino);
        btnGrupoSexo.add(btnMasculino);
        //URL url = this.getClass().getResource("../../app/images/logo.png");
        //Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        //this.setIconImage(imagemTitulo);
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
        lblM = new javax.swing.JLabel();
        lblF = new javax.swing.JLabel();
        lblAroba = new javax.swing.JLabel();
        lblLogoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painelConectar.setPreferredSize(new java.awt.Dimension(530, 500));
        painelConectar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistrar.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        pnlRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnlRegistrar.setEnabled(false);
        pnlRegistrar.setPreferredSize(new java.awt.Dimension(360, 320));
        pnlRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlRegistrarKeyPressed(evt);
            }
        });

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
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
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
        btnFeminino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnFemininoKeyPressed(evt);
            }
        });

        btnMasculino.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.resizeIconHighlight"));
        btnMasculino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMasculino.setText("Masculino");
        btnMasculino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnMasculinoKeyPressed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setToolTipText("");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

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
                                .addGroup(pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlRegistrarLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(imgMulher)
                                        .addGap(60, 60, 60)
                                        .addComponent(imgHomen)))
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

        painelConectar.add(pnlRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 340, -1));

        lblM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconMG.png"))); // NOI18N
        painelConectar.add(lblM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 100, 110));

        lblF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconFG.png"))); // NOI18N
        painelConectar.add(lblF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        lblAroba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/email.png"))); // NOI18N
        painelConectar.add(lblAroba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblLogoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/LogoPequeno.png"))); // NOI18N
        painelConectar.add(lblLogoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -30, -1, -1));

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
        registrando();
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

    private void pnlRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlRegistrarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            registrando();
        }
    }//GEN-LAST:event_pnlRegistrarKeyPressed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            registrando();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            registrando();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void btnMasculinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnMasculinoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            registrando();
        }
    }//GEN-LAST:event_btnMasculinoKeyPressed

    private void btnFemininoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnFemininoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            registrando();
        }
    }//GEN-LAST:event_btnFemininoKeyPressed
    private void registrando(){
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
    }
    
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

    public ControleCadastroDAO retornaControle(ControleCadastroDAO control){
        
        if(control == null){
            control  = new ControleCadastroDAO();
        }else{
        }
        return control;
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
    private javax.swing.JLabel lblAroba;
    private javax.swing.JLabel lblF;
    private javax.swing.JLabel lblLogoP;
    private javax.swing.JLabel lblM;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JDesktopPane painelConectar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
