package com.frame;

import com.bean.ChatMessage;
import com.bean.ChatMessage.Action;
import com.service.ClienteService;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ClienteFrame extends javax.swing.JFrame {

    private Socket socket;
    private ChatMessage message;
    private ClienteService service;
    private ObjectOutputStream outputStream;
    
    public ClienteFrame() {
        initComponents();
        lblNomeM2.setVisible(false);
        lblNomeF2.setVisible(false);
        
        painelChat.setVisible(true);
       // painelChat.setVisible(false);
        
       // btnGrupoSexo.add(btnFeminino);
        //btnGrupoSexo.add(btnMasculino);
    }
    public void run()
    {
        this.setVisible(true);
    }

    private class ListenerSocket implements Runnable {

        private ObjectInputStream input;
        
        public ListenerSocket(Socket socket) {
            try {
                this.input = new ObjectInputStream(socket.getInputStream());
            } catch (IOException ex) {
                Logger.getLogger(ClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        @Override
        public void run() {
            ChatMessage message = null;
            try {
                while ((message = (ChatMessage) input.readObject()) != null) {
                    Action action = message.getAction();

                    if (action.equals(Action.CONNECT)) {
                        connected(message);
                    } else if (action.equals(Action.DISCONNECT)) {
                        refreshOnlines(message);
                        disconnected();
                        socket.close();
                    } else if (action.equals(Action.SEND_ONE)) {
                        receive(message);
                    } else if (action.equals(Action.USERS_ONLINE)) {
                        refreshOnlines(message);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        private void connect(ChatMessage message1) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private void connected(ChatMessage message) {
        if (message.getText().equals("NO")) {
            JOptionPane.showMessageDialog(this, "Conexão não realizada!\nTente novamente com um novo nome.");
            this.txtAreaReceive.setText("");
            lblNomeM2.setVisible(false);
            lblNomeF2.setVisible(false);
            message.setName(this.message.getName());
            message.setAction(Action.DISCONNECT);
            this.service.send(message);
            disconnected();
            return;
        }

        JOptionPane.showMessageDialog(this, "Você está conectado no chat!");
    }
    private void disconnected() {
       // painelConectar.setVisible(true);
        painelChat.setVisible(false);
        //txtName.setText("");
        btnGrupoSexo.clearSelection();
        
        JOptionPane.showMessageDialog(this, "Você saiu do Chat!");

    }

    private void receive(ChatMessage message) {
        this.txtAreaReceive.append(message.getName() + " : " + message.getText() + "\n");
    }

    private void refreshOnlines(ChatMessage message) {
        System.out.println(message.getSetOnlines().toString());
        
        Set<String> names = message.getSetOnlines();
        
        names.remove(message.getName());
        
        String[] array = (String[]) names.toArray(new String[names.size()]);
        
        this.listOnlines2.setListData(array);
        this.listOnlines2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.listOnlines2.setLayoutOrientation(JList.VERTICAL);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupoSexo = new javax.swing.ButtonGroup();
        painelChat = new javax.swing.JDesktopPane();
        pnlConectar3 = new javax.swing.JPanel();
        btnSair2 = new javax.swing.JButton();
        lblNomeM2 = new javax.swing.JLabel();
        lblNomeF2 = new javax.swing.JLabel();
        pnlOnlines2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listOnlines2 = new javax.swing.JList<>();
        pnlMessages = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReceive = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSend = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.activeCaption);
        setForeground(java.awt.SystemColor.activeCaption);
        setResizable(false);

        painelChat.setPreferredSize(new java.awt.Dimension(550, 450));

        pnlConectar3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnlConectar3.setMinimumSize(new java.awt.Dimension(360, 80));
        pnlConectar3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSair2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSair2.setText("Sair");
        btnSair2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlConectar3.add(btnSair2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, 30));

        lblNomeM2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconM.png"))); // NOI18N
        lblNomeM2.setText("Nome");
        pnlConectar3.add(lblNomeM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 134, -1));

        lblNomeF2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNomeF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/app/images/iconF.png"))); // NOI18N
        lblNomeF2.setText("Nome");
        pnlConectar3.add(lblNomeF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 120, 50));

        pnlOnlines2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Onlines", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        listOnlines2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane5.setViewportView(listOnlines2);

        javax.swing.GroupLayout pnlOnlines2Layout = new javax.swing.GroupLayout(pnlOnlines2);
        pnlOnlines2.setLayout(pnlOnlines2Layout);
        pnlOnlines2Layout.setHorizontalGroup(
            pnlOnlines2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOnlines2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pnlOnlines2Layout.setVerticalGroup(
            pnlOnlines2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );

        pnlMessages.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        pnlMessages.setPreferredSize(new java.awt.Dimension(360, 340));

        jScrollPane1.setAutoscrolls(true);

        txtAreaReceive.setEditable(false);
        txtAreaReceive.setColumns(20);
        txtAreaReceive.setLineWrap(true);
        txtAreaReceive.setRows(5);
        txtAreaReceive.setWrapStyleWord(true);
        txtAreaReceive.setDragEnabled(true);
        jScrollPane1.setViewportView(txtAreaReceive);

        jScrollPane2.setAutoscrolls(true);

        txtAreaSend.setColumns(20);
        txtAreaSend.setLineWrap(true);
        txtAreaSend.setRows(5);
        txtAreaSend.setDragEnabled(true);
        jScrollPane2.setViewportView(txtAreaSend);

        btnEnviar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnLimpar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpar1.setText("Limpar Conversa");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMessagesLayout = new javax.swing.GroupLayout(pnlMessages);
        pnlMessages.setLayout(pnlMessagesLayout);
        pnlMessagesLayout.setHorizontalGroup(
            pnlMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMessagesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMessagesLayout.createSequentialGroup()
                        .addComponent(btnLimpar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        pnlMessagesLayout.setVerticalGroup(
            pnlMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMessagesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMessagesLayout.createSequentialGroup()
                        .addGroup(pnlMessagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );

        painelChat.setLayer(pnlConectar3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelChat.setLayer(pnlOnlines2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        painelChat.setLayer(pnlMessages, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout painelChatLayout = new javax.swing.GroupLayout(painelChat);
        painelChat.setLayout(painelChatLayout);
        painelChatLayout.setHorizontalGroup(
            painelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelChatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlOnlines2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(pnlConectar3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        painelChatLayout.setVerticalGroup(
            painelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelChatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelChatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlOnlines2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelChatLayout.createSequentialGroup()
                        .addComponent(pnlConectar3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelChat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelChat, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.txtAreaSend.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String text = this.txtAreaSend.getText();
        String name = this.message.getName();

        this.message = new ChatMessage();

        if(this.listOnlines2.getSelectedIndex() > -1 ){
            this.message.setNameReserved((String)this.listOnlines2.getSelectedValue());
            this.message.setAction(Action.SEND_ONE);
            this.listOnlines2.clearSelection();
        }else{
            this.message.setAction(Action.SEND_ALL);
        }

        if (!text.isEmpty()) {
            this.message.setName(name);
            this.message.setText(text);

            this.txtAreaReceive.append("Você : " + text +"\n");
            this.service.send(this.message);
        }

        this.txtAreaSend.setText("");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.txtAreaReceive.setText("");
        lblNomeM2.setVisible(false);
        lblNomeF2.setVisible(false);
        ChatMessage message = new ChatMessage();
        message.setName(this.message.getName());
        message.setAction(Action.DISCONNECT);
        this.service.send(message);
        disconnected();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        // TODO add your handling code here:
        this.txtAreaReceive.setText("");
    }//GEN-LAST:event_btnLimpar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup btnGrupoSexo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnSair2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblNomeF2;
    private javax.swing.JLabel lblNomeM2;
    private javax.swing.JList<String> listOnlines2;
    private javax.swing.JDesktopPane painelChat;
    private javax.swing.JPanel pnlConectar3;
    private javax.swing.JPanel pnlMessages;
    private javax.swing.JPanel pnlOnlines2;
    private javax.swing.JTextArea txtAreaReceive;
    private javax.swing.JTextArea txtAreaSend;
    // End of variables declaration//GEN-END:variables
}
