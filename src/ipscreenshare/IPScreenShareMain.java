/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipscreenshare;

import com.sun.net.httpserver.*;
import allinlan.ValidatePortGetIP;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.util.logging.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class IPScreenShareMain extends javax.swing.JFrame {

    HttpServer serv;
    boolean isWorking = false;
    int xmouse;
    int ymouse;


    public IPScreenShareMain() throws SocketException, IOException, URISyntaxException {
        setTitle("IPScreenShare");
     

        initComponents();

        ValidatePortGetIP.addIp(cbmIP);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbmIP = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        portNumSpn = new javax.swing.JSpinner();
        everySpn = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chkMousePointer = new javax.swing.JCheckBox();
        btnStartServer = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jLabel_Receive = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 725, 610));
        setName("IPScreenShareMain"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(765, 589));
        setSize(new java.awt.Dimension(765, 589));
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        jPanel1.setMaximumSize(new java.awt.Dimension(720, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 510));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Take Screenshot Every :");
        jLabel7.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("IP : ");

        cbmIP.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        cbmIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmIPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Port : ");

        portNumSpn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        everySpn.setModel(new javax.swing.SpinnerNumberModel(500, 1, null, 1));
        everySpn.setValue(900);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 13)); // NOI18N
        jLabel3.setText("Millisecond");

        txtURL.setEditable(false);
        txtURL.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtURL.setText("After starting the server the URL will displayed.");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("URL :");

        chkMousePointer.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chkMousePointer.setText("Show Mouse Pointer");
        chkMousePointer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMousePointerActionPerformed(evt);
            }
        });

        btnStartServer.setBackground(new java.awt.Color(0, 102, 102));
        btnStartServer.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        btnStartServer.setForeground(new java.awt.Color(255, 255, 255));
        btnStartServer.setText("Start Server");
        btnStartServer.setName(""); // NOI18N
        btnStartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartServerActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipscreenshare/images/PrevImg.jpg"))); // NOI18N
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lblImage.setMaximumSize(new java.awt.Dimension(210, 140));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("(PortNo range: 1024 to 65535)");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Preview");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtLog.setEditable(false);
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        jLabel_Receive.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Receive.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        jLabel_Receive.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Receive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Receive.setText("IpScreenShare");
        jLabel_Receive.setOpaque(true);
        jLabel_Receive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ReceiveMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipscreenshare/images/cable.png"))); // NOI18N
        jLabel16.setText("AllinLAN");
        jLabel16.setFocusable(false);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIconTextGap(3);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipscreenshare/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipscreenshare/images/minimize.png"))); // NOI18N
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close)
                .addGap(3, 3, 3))
            .addComponent(jLabel_Receive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkMousePointer)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(portNumSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(everySpn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbmIP, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(btnStartServer, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbmIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(portNumSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtURL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(everySpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(chkMousePointer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStartServer)
                        .addGap(12, 12, 12)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   ServerSide serverSide = new ServerSide();
    ScreenThread screenThread;

    private void btnStartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartServerActionPerformed
        // TODO add your handling code here:

        if (btnStartServer.getName().equals("")) {
            btnStartServer.setName("start");
            btnStartServer.setText("Start Server");
        }

        try {
         
            int port = (int) portNumSpn.getValue();
            int every = (int) everySpn.getValue();

            if (btnStartServer.getName().equals("start")) {

                InputDate.Log(txtLog, "Starting Server, Please Wait...");
                String ipAddress = (String) cbmIP.getSelectedItem();
                ipAddress = ipAddress.split(" # ")[0];

                btnStartServer.setEnabled(false);

                isWorking = serverSide.StartServer(txtLog, ipAddress, port);

                if (isWorking) {
                    screenThread = new ScreenThread(every, chkMousePointer.isSelected());

                    screenThread.start();

                    String url = "http://" + ipAddress + ":" + port;
                    txtURL.setText(url);

                    btnStartServer.setEnabled(true);
                    InputDate.Log(txtLog, "Server Started Successfuly!");
                    InputDate.Log(txtLog, "Private Network URL : " + url);
                    InputDate.Log(txtLog, "Localhost URL : " + "http://localhost:" + port + "/");

                    btnStartServer.setName("stop");
                    btnStartServer.setText("Stop Server");
                    portNumSpn.setEnabled(false);

                } else {
                    btnStartServer.setEnabled(true);
                    InputDate.Log(txtLog, "An error while starting the server");
                }

            } else if (btnStartServer.getName().equals("stop")) {
                if (isWorking) {
                    btnStartServer.setEnabled(false);
                    InputDate.Log(txtLog, "Stopping Server, Please Wait...");

                    serverSide.StopServer(screenThread);

                    InputDate.Log(txtLog, "Server Stopped.");

                    btnStartServer.setEnabled(true);
                    btnStartServer.setName("start");
                    btnStartServer.setText("Start Server");
                    portNumSpn.setEnabled(true);

                }
            }
        } catch (Exception ex) {

            InputDate.Log(txtLog, "Error! : " + ex.getMessage());
        }
    }//GEN-LAST:event_btnStartServerActionPerformed


    private void chkMousePointerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMousePointerActionPerformed
        // TODO add your handling code here:
        if (isWorking) {
            screenThread.mousePointer(chkMousePointer.isSelected());
        }
    }//GEN-LAST:event_chkMousePointerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isWorking) {
            new javax.swing.Timer(900, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        ScreenShot.PreviewImage(lblImage);

                    } catch (URISyntaxException ex) {

                    } catch (MalformedURLException ex) {

                    }
                }

            }).start();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbmIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmIPActionPerformed

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();
        try {
            serverSide.StopServer(screenThread);
        } catch (IOException ex) {
            Logger.getLogger(IPScreenShareMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    JFrame frame = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SocketException {
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
            java.util.logging.Logger.getLogger(IPScreenShareMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IPScreenShareMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IPScreenShareMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IPScreenShareMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                    IPScreenShareMain f = new IPScreenShareMain();
                    f.setLocationRelativeTo(null);
                  
                    f.setVisible(true);
                      f.setSize(730, 610);
                } catch (IOException ex) {
                    Logger.getLogger(IPScreenShareMain.class.getName()).log(Level.SEVERE, null, ex);
                } catch (URISyntaxException ex) {
                    Logger.getLogger(IPScreenShareMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartServer;
    private javax.swing.JComboBox<String> cbmIP;
    private javax.swing.JCheckBox chkMousePointer;
    private javax.swing.JSpinner everySpn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JSpinner portNumSpn;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
}
