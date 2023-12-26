package ipprivatechat;


import ipfileshare.IpFileShare_Main1;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;
import java.net.URISyntaxException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class startChatClient extends javax.swing.JFrame {

    PrintWriter send;
    String name;
     int xmouse;
    int ymouse;
    String Ip;
    int Port;
    public startChatClient(String name) {
        initComponents();
        this.name = name;
        lbUser.setText(name);
        taTextArea.setEditable(false);
        tfChatText.grabFocus();
        setLocationRelativeTo(null);
    }

    public void start(String Ip, int Port) {
        lblip.setText(Ip);
        this.Ip=Ip;
        this.Port=Port;
        String p = String.valueOf(Port);
        lblport.setText(p);
        taTextArea.setEditable(false);
        this.setVisible(true);
        tfChatText.grabFocus();

        send = new ClientChat().startChat(Ip, Port, taTextArea,this);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfChatText = new javax.swing.JTextField();
        btSend = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblip = new javax.swing.JLabel();
        lblport = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taTextArea = new javax.swing.JTextPane();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_leave = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        btFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PrivateChat");
        setMinimumSize(new java.awt.Dimension(586, 587));
        setUndecorated(true);
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

        tfChatText.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        tfChatText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));

        btSend.setBackground(new java.awt.Color(0, 102, 102));
        btSend.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btSend.setForeground(new java.awt.Color(255, 255, 255));
        btSend.setText("Send");
        btSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSendActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("You are connected to IP Address :");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Port Number :");

        lblip.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        lblport.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        taTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        taTextArea.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(taTextArea);

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

        jLabel_leave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/close.png"))); // NOI18N
        jLabel_leave.setToolTipText("Leave the Chat");
        jLabel_leave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_leaveMouseClicked(evt);
            }
        });

        lbUser.setBackground(new java.awt.Color(0, 153, 153));
        lbUser.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setOpaque(true);

        btFile.setBackground(new java.awt.Color(0, 102, 102));
        btFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipprivatechat/images/add-file-24.png"))); // NOI18N
        btFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_leave))
            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblport, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblip, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfChatText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSend, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btFile, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_leave, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblip, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSendActionPerformed
        String s = evt.getActionCommand();
        if (s.equals("Send")) {

            String msg = name + "  ";
            String msg2 = tfChatText.getText();
            String msg3 = msg + ":" + msg2;
            tfChatText.setText("");
            boolean status = msg2.isEmpty();
            if (send != null && (status == false)) {

                Document doc1 = taTextArea.getStyledDocument();
                SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                StyleConstants.setBold(attributeSet, true);
                taTextArea.setCharacterAttributes(attributeSet, true);
                try {
                    doc1.insertString(doc1.getLength(), msg, attributeSet);
                } catch (BadLocationException ex1) {
                    ex1.printStackTrace();
                }
                Font font1 = new Font("Times New Roman", Font.PLAIN, 20);
                taTextArea.setFont(font1);
                attributeSet = new SimpleAttributeSet();
                StyleConstants.setForeground(attributeSet, Color.gray);
                taTextArea.setCharacterAttributes(attributeSet, true);
                DateFormat df = new SimpleDateFormat("hh:mm a");
                Date dateobj = new Date();
                System.out.println(df.format(dateobj));
                try {
                    doc1.insertString(doc1.getLength(), (df.format(dateobj)), attributeSet);
                } catch (BadLocationException ex1) {
                    ex1.printStackTrace();

                }
                Font font2 = new Font("Times New Roman", Font.PLAIN, 26);
                taTextArea.setFont(font2);
                attributeSet = new SimpleAttributeSet();
                Document doc = taTextArea.getStyledDocument();
                taTextArea.setCharacterAttributes(attributeSet, true);
                msg2 = "\n" + msg2 + "\n\n";
                try {
                    doc1.insertString(doc1.getLength(), msg2, attributeSet);
                } catch (BadLocationException ex1) {
                    ex1.printStackTrace();

                }
                taTextArea.setCaretPosition(taTextArea.getDocument().getLength());
                send.println(msg3);
            } else {
                System.out.println("Not connected");    //when server is not connected
                if (status == true && send != null) {
                     Document doc1 = taTextArea.getStyledDocument();
                    SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                    StyleConstants.setBold(attributeSet, true);
                    taTextArea.setCharacterAttributes(attributeSet, true);
                    try {
                        doc1.insertString(doc1.getLength(), "Please enter some message.\n\n", attributeSet);
                    } catch (BadLocationException ex1) {
                        ex1.printStackTrace();
                    }
                } else {
                    Document doc1 = taTextArea.getStyledDocument();
                    SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                    StyleConstants.setBold(attributeSet, true);
                    taTextArea.setCharacterAttributes(attributeSet, true);
                    try {
                        doc1.insertString(doc1.getLength(), "Please Wait.Your Friend will Connect Soon.\n\n", attributeSet);
                    } catch (BadLocationException ex1) {
                        ex1.printStackTrace();
                    }
                }
            }

        }
    }//GEN-LAST:event_btSendActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_leaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_leaveMouseClicked
         String msg1 = "[ " + name + " has left the Group]:" + " ";
        send.println(msg1);
        this.dispose();
        this.dispose();
    }//GEN-LAST:event_jLabel_leaveMouseClicked

    private void btFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFileActionPerformed
       try {
            new IpFileShare_Main1(Ip,Port);//.setVisible(true);
        } catch (SocketException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btFileActionPerformed

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
            java.util.logging.Logger.getLogger(startChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startChatClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startChatClient("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFile;
    private javax.swing.JButton btSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_leave;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lblip;
    private javax.swing.JLabel lblport;
    private javax.swing.JTextPane taTextArea;
    private javax.swing.JTextField tfChatText;
    // End of variables declaration//GEN-END:variables
}
