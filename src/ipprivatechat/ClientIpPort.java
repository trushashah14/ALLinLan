package ipprivatechat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ClientIpPort extends javax.swing.JFrame {

    PrintWriter send;
    String nm;
    int xmouse;
    int ymouse;

    public ClientIpPort(String nm) {
        initComponents();
        this.nm = nm;
        jLabel_Receive.setText(nm);
        setLocationRelativeTo(null);
        tfIp.grabFocus();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Client = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_Receive = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        portNumSpn_GroupClient = new javax.swing.JSpinner();
        btOK1 = new javax.swing.JButton();
        tfIp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PrivateChat");
        setMinimumSize(new java.awt.Dimension(395, 308));
        setUndecorated(true);
        setSize(new java.awt.Dimension(395, 308));
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

        jPanel_Client.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Client.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

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

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
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

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setText("IP : ");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Port : ");

        portNumSpn_GroupClient.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn_GroupClient.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        btOK1.setBackground(new java.awt.Color(0, 102, 102));
        btOK1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btOK1.setForeground(new java.awt.Color(255, 255, 255));
        btOK1.setText("START");
        btOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOK1ActionPerformed(evt);
            }
        });

        tfIp.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel_ClientLayout = new javax.swing.GroupLayout(jPanel_Client);
        jPanel_Client.setLayout(jPanel_ClientLayout);
        jPanel_ClientLayout.setHorizontalGroup(
            jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ClientLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close))
            .addComponent(jLabel_Receive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(portNumSpn_GroupClient, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ClientLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel_ClientLayout.setVerticalGroup(
            jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(portNumSpn_GroupClient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addComponent(btOK1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Client, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        setVisible(false);
        try {
            PrivateChatMain g = new PrivateChatMain(nm);// TODO add your handling code here:
        } catch (SocketException ex) {
            Logger.getLogger(ClientIpPort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

    private void btOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOK1ActionPerformed
      
      int  port = (int) portNumSpn_GroupClient.getValue();

         String Ip = tfIp.getText().trim();
      //  String Port = tfPort.getText().trim();
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        if (Ip.equals("")) {
            //this.dispose();
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(this, "Enter IP Address");
            j.setEnabled(false);
           // new ClientIpPort(nm);
        } else {

            this.dispose();

            startChatClient scc = new startChatClient(nm);
            scc.start(Ip, port);
        }

    }//GEN-LAST:event_btOK1ActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
    xmouse=evt.getX();
    ymouse=evt.getY();
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
            java.util.logging.Logger.getLogger(ClientIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientIpPort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ClientIpPort("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_Client;
    private javax.swing.JSpinner portNumSpn_GroupClient;
    private javax.swing.JTextField tfIp;
    // End of variables declaration//GEN-END:variables
}
