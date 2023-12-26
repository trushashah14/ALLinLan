package ipgroupchat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ClientIpPort extends javax.swing.JFrame {

    PrintWriter send;
    String nm;
    int xmouse;
    int ymouse;
    public static String ipAddress;
    String selected;
    public static int port;

    public ClientIpPort(String nm) throws SocketException {
        initComponents();
        this.nm = nm;
        tfIp.grabFocus();
        jLabel_Receive.setText(nm);
        setLocationRelativeTo(null);
        cbchoose.setSelectedItem("Port Number");
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
        jLabel1 = new javax.swing.JLabel();
        cbchoose = new javax.swing.JComboBox<>();
        lbgrpnm = new javax.swing.JLabel();
        tfgrpnm = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        tfIp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GroupChat");
        setMinimumSize(new java.awt.Dimension(566, 433));
        setUndecorated(true);
        setSize(new java.awt.Dimension(524, 447));
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

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupchat/images/close.png"))); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Join Chat Using:");

        cbchoose.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        cbchoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Port Number", "Group Name" }));
        cbchoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbchooseActionPerformed(evt);
            }
        });

        lbgrpnm.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbgrpnm.setText("Group Name:");
        lbgrpnm.setEnabled(false);

        tfgrpnm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tfgrpnm.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        tfgrpnm.setEnabled(false);

        btOK.setBackground(new java.awt.Color(0, 102, 102));
        btOK.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btOK.setForeground(new java.awt.Color(255, 255, 255));
        btOK.setText("START");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
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
                .addGap(34, 34, 34)
                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(portNumSpn_GroupClient, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfIp, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbchoose, javax.swing.GroupLayout.Alignment.LEADING, 0, 230, Short.MAX_VALUE)))))
                .addContainerGap(23, Short.MAX_VALUE))
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
                        .addComponent(jLabel14)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbchoose))
                                .addGap(70, 70, 70))
                            .addGroup(jPanel_ClientLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(portNumSpn_GroupClient, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel_ClientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbgrpnm, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(btOK)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel_ClientLayout.createSequentialGroup()
                        .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Client, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        ipAddress = tfIp.getText().trim();
        port = (int) portNumSpn_GroupClient.getValue();

        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        if (ipAddress.isEmpty()) {
         
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(this, "Please enter IP Address.");
            j.setEnabled(false);
            
        }
        else{
           
        if (selected.equals("Port Number")) {
            this.dispose();
            String gnm = null;
            try {

                gnm = new SQLiteDBConnect().getGroupName(port);

                startChatClient scc = new startChatClient(nm, gnm);

                scc.start(ipAddress, port);

            } catch (SQLException ex1) {
                ex1.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (selected.equals("Group Name")) {
            String grpnm = tfgrpnm.getText().trim();
            
            if (grpnm.isEmpty()) {

                JOptionPane j = new JOptionPane();
                j.showMessageDialog(this, "Please enter Group Name.");
                j.setEnabled(false);
               
            } else {
                 this.dispose();
                try {
                    int PortNumber = 0;
                    PortNumber = new SQLiteDBConnect().getPortNo(grpnm);
                    startChatClient scc = new startChatClient(nm, grpnm);

                    scc.start(ipAddress, PortNumber);

                } catch (SQLException ex1) {
                    ex1.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        } else {
        }
    }


    }//GEN-LAST:event_btOKActionPerformed

    private void cbchooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbchooseActionPerformed

        selected = cbchoose.getItemAt(cbchoose.getSelectedIndex());

        if (selected.equals("Port Number")) {
            tfgrpnm.setEnabled(false);
            lbgrpnm.setEnabled(false);
            portNumSpn_GroupClient.setEnabled(true);
            jLabel15.setEnabled(true);

        } else if (selected.equals("Group Name")) {
            portNumSpn_GroupClient.setEnabled(false);
            jLabel15.setEnabled(false);
            tfgrpnm.setEnabled(true);
            lbgrpnm.setEnabled(true);
        } else {
        }
    }//GEN-LAST:event_cbchooseActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        setVisible(false);
        try {
            GroupChatMain g = new GroupChatMain(nm);
        } catch (SocketException ex) {
            Logger.getLogger(ServerIpPort.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClientIpPort("");
                } catch (SocketException ex) {
                    Logger.getLogger(ClientIpPort.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOK;
    private javax.swing.JComboBox<String> cbchoose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_Client;
    private javax.swing.JLabel lbgrpnm;
    private javax.swing.JSpinner portNumSpn_GroupClient;
    private javax.swing.JTextField tfIp;
    private javax.swing.JTextField tfgrpnm;
    // End of variables declaration//GEN-END:variables
}
