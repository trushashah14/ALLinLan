package ipgroupchat;
import allinlan.ValidatePortGetIP;
import java.awt.Dimension;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ServerIpPort extends javax.swing.JFrame {

    public static int port;
    PrintWriter send;
    public static String ipAddress;
    String nm;
    double id;
    int xmouse;
    int ymouse;

    public ServerIpPort(String nm) throws SocketException {

        this.nm = nm;
        initComponents();
        setLocationRelativeTo(null);
        tfgrpnm.grabFocus();
        ValidatePortGetIP.addIp(cbmIP_GroupServer);
        jLabel_Receive.setText(nm);

        //  lblIp1.setText(IPAddress[0]);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_server = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cbmIP_GroupServer = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        portNumSpn_GroupServer = new javax.swing.JSpinner();
        tfgrpnm = new javax.swing.JTextField();
        lbgrpnm = new javax.swing.JLabel();
        btOK = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_Receive = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GroupChat");
        setMinimumSize(new java.awt.Dimension(477, 326));
        setUndecorated(true);
        setSize(new java.awt.Dimension(477, 326));
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

        cbmIP_GroupServer.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbmIP_GroupServer.setOpaque(false);
        cbmIP_GroupServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmIP_GroupServerActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Port : ");

        portNumSpn_GroupServer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn_GroupServer.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        tfgrpnm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        lbgrpnm.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbgrpnm.setText("Enter Group Name:");

        btOK.setBackground(new java.awt.Color(0, 102, 102));
        btOK.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btOK.setForeground(new java.awt.Color(255, 255, 255));
        btOK.setText("START");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupchat/images/cable.png"))); // NOI18N
        jLabel16.setText("AllinLAN");
        jLabel16.setFocusable(false);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIconTextGap(3);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupchat/images/minimize.png"))); // NOI18N
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
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupchat/images/close.png"))); // NOI18N
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
                .addGap(34, 34, 34)
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_serverLayout.createSequentialGroup()
                        .addComponent(lbgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_serverLayout.createSequentialGroup()
                        .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portNumSpn_GroupServer, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmIP_GroupServer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(220, 220, 220))
            .addGroup(jPanel_serverLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_serverLayout.createSequentialGroup()
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Receive, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_serverLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_mini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_close)))
                .addGap(189, 189, 189))
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
                    .addComponent(cbmIP_GroupServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(portNumSpn_GroupServer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_serverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_server, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String s = evt.getActionCommand();

        port = (int) portNumSpn_GroupServer.getValue();
        ipAddress = (String) cbmIP_GroupServer.getSelectedItem();
        ipAddress = ipAddress.split(" # ")[0];
        String grpnm = tfgrpnm.getText().trim();
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        if (port > 65535) {
            JOptionPane.showMessageDialog(null, "Port Number should be between 1024 and 65535.");

        }
        else{
        boolean status = false;
        if (s.equals("START")) {

            if (grpnm.isEmpty()) {
                // this.dispose();
                JOptionPane j = new JOptionPane();
                j.showMessageDialog(this, "Please enter Group Name");
                j.setEnabled(false);
                /*try {
                    new ServerIpPort(nm);
                } catch (SocketException ex) {
                    Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
                }*/
            } else {

                try {

                    status = new SQLiteDBConnect().addDetails(port, grpnm);

                    if (status == true) {
                        this.dispose();

                        startChatServer scs = new startChatServer(nm, grpnm);
                        //  System.out.println(ipAddress);
                        scs.start(port, ipAddress);
                    } else {

                        //this.dispose();
                        //new ServerIpPort(nm);
                    }
                } catch (ClassNotFoundException ex) {
                    ex.printStackTrace();
                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                } catch (SocketException ex) {
                    Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {

        }
    }


    }//GEN-LAST:event_btOKActionPerformed

    private void cbmIP_GroupServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmIP_GroupServerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmIP_GroupServerActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        setVisible(false);
        try {
            GroupChatMain g = new GroupChatMain(nm);
        } catch (SocketException ex) {
            Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

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
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox<String> cbmIP_GroupServer;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_server;
    private javax.swing.JLabel lbgrpnm;
    private javax.swing.JSpinner portNumSpn_GroupServer;
    private javax.swing.JTextField tfgrpnm;
    // End of variables declaration//GEN-END:variables
}
