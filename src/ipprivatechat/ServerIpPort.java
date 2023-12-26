package ipprivatechat;
import allinlan.ValidatePortGetIP;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ServerIpPort extends javax.swing.JFrame {

    int PortNo;
    PrintWriter send;
    String IPAddress;
    String nm;
    int xmouse;
    int ymouse;

    public ServerIpPort(String nm) throws SocketException {
        this.nm = nm;
        initComponents();
        jLabel_Receive.setText(nm);
        setLocationRelativeTo(null);
        ValidatePortGetIP.addIp(cbmIP_PrivateServer);

        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_server = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbmIP_PrivateServer = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        portNumSpn_PrivateServer = new javax.swing.JSpinner();
        btOK1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_Receive = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PrivateChat");
        setMinimumSize(new java.awt.Dimension(396, 305));
        setUndecorated(true);
        setSize(new java.awt.Dimension(396, 305));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel_server.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_server.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        jPanel_server.setMinimumSize(new java.awt.Dimension(508, 340));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setText("IP : ");

        cbmIP_PrivateServer.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbmIP_PrivateServer.setOpaque(false);
        cbmIP_PrivateServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmIP_PrivateServerActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Port : ");

        portNumSpn_PrivateServer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn_PrivateServer.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        btOK1.setBackground(new java.awt.Color(0, 102, 102));
        btOK1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btOK1.setForeground(new java.awt.Color(255, 255, 255));
        btOK1.setText("START");
        btOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOK1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/cable.png"))); // NOI18N
        jLabel16.setText("AllinLAN");
        jLabel16.setFocusable(false);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIconTextGap(3);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/minimize.png"))); // NOI18N
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
        });

        jLabel_Receive.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Receive.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Receive.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Receive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Receive.setOpaque(true);
        jLabel_Receive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ReceiveMouseClicked(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_serverLayout = new javax.swing.GroupLayout(jPanel_server);
        jPanel_server.setLayout(jPanel_serverLayout);
        jPanel_serverLayout.setHorizontalGroup(
            jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_serverLayout.createSequentialGroup()
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_serverLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portNumSpn_PrivateServer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmIP_PrivateServer, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_serverLayout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_mini)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel_close)
                            .addGap(6, 6, 6))
                        .addComponent(jLabel_Receive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_serverLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_serverLayout.setVerticalGroup(
            jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_serverLayout.createSequentialGroup()
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbmIP_PrivateServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(portNumSpn_PrivateServer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_server, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_server, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbmIP_PrivateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmIP_PrivateServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmIP_PrivateServerActionPerformed

    private void btOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOK1ActionPerformed
        String s = evt.getActionCommand();
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));

        int port = (int) portNumSpn_PrivateServer.getValue();
        IPAddress = (String) cbmIP_PrivateServer.getSelectedItem();
        IPAddress = IPAddress.split(" # ")[0];
        if (port > 65535) {
            JOptionPane.showMessageDialog(null, "Port Number should be between 1024 and 65535.");

        } //   boolean status = false;
        else {
            if (s.equals("START")) {

                this.dispose();

                startChatServer scs = new startChatServer(nm);
                scs.start(port, IPAddress);
            } else {
                this.dispose();
                try {
                    new ServerIpPort(nm);
                } catch (SocketException ex) {
                    Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }


    }//GEN-LAST:event_btOK1ActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        setVisible(false);
        try {
            PrivateChatMain g = new PrivateChatMain(nm);
        } catch (SocketException ex) {
            Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(ServerIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new ServerIpPort("");
                } catch (SocketException ex) {
                    Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK1;
    private javax.swing.JComboBox<String> cbmIP_PrivateServer;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_server;
    private javax.swing.JSpinner portNumSpn_PrivateServer;
    // End of variables declaration//GEN-END:variables
}
