package ipgroupchat;

import java.awt.Color;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class startChatClient extends javax.swing.JFrame {

    PrintWriter send;
    String nm;
    int xmouse;
    int ymouse;
    String id1;

    public startChatClient(String nm, String grpnm) {
        initComponents();
        this.nm = nm;
        setLocationRelativeTo(null);
        id1 = ClientIpPort.ipAddress;
        jTextArea_list.setEditable(false);
        lbUser.setText(grpnm);
        tfChatText.grabFocus();
        setVisible(true);
    }

    public void start(String Ip, int Port) {
        lblIp.setText(Ip);
        String p = String.valueOf(Port);
        lblport.setText(p);
        taTextArea.setEditable(false);
        this.setVisible(true);
        tfChatText.grabFocus();
        send = new ClientChat().startChat(Ip, Port, taTextArea, nm, this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tfChatText = new javax.swing.JTextField();
        btSend1 = new javax.swing.JButton();
        lblIp1 = new javax.swing.JLabel();
        lblPort1 = new javax.swing.JLabel();
        lblIp = new javax.swing.JLabel();
        lblport = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taTextArea = new javax.swing.JTextPane();
        btView = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_leave = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_list = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GroupChat");
        setMinimumSize(new java.awt.Dimension(941, 712));
        setUndecorated(true);
        setSize(new java.awt.Dimension(941, 712));
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

        tfChatText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tfChatText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        tfChatText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfChatTextActionPerformed(evt);
            }
        });

        btSend1.setBackground(new java.awt.Color(0, 102, 102));
        btSend1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btSend1.setForeground(new java.awt.Color(255, 255, 255));
        btSend1.setText("Send");
        btSend1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSend1ActionPerformed(evt);
            }
        });

        lblIp1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblIp1.setText("You are connected to IP Address :");

        lblPort1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPort1.setText("Your Port Number :");

        lblIp.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        lblport.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        taTextArea.setEditable(false);
        taTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 2));
        taTextArea.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jScrollPane3.setViewportView(taTextArea);

        btView.setBackground(new java.awt.Color(0, 102, 102));
        btView.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btView.setForeground(new java.awt.Color(255, 255, 255));
        btView.setText("View");
        btView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewActionPerformed(evt);
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

        jLabel_leave.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_leave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupchat/images/close.png"))); // NOI18N
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
        lbUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbUserMouseClicked(evt);
            }
        });

        jTextArea_list.setBackground(new java.awt.Color(0, 102, 102));
        jTextArea_list.setColumns(20);
        jTextArea_list.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextArea_list.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea_list.setRows(5);
        jTextArea_list.setText("       \n\n\n\n\n\n\n          Connected User's \n              list will be \n           displayed here");
        jTextArea_list.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(jTextArea_list);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_leave))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(lblIp, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(lblPort1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblport, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(lblIp1))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(324, Short.MAX_VALUE)))
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
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblIp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSend1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(489, 489, 489))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(lblIp1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPort1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(541, 541, 541)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSend1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSend1ActionPerformed
        String s = evt.getActionCommand();
        if (s.equals("Send")) {

            String msg = tfChatText.getText();
            msg = nm + ":" + msg;
            tfChatText.setText("");

            if (send != null) {

                send.println(msg);
            } else {
                // System.out.println("Not connected");    //when server is not connected
                // taTextArea.append("Server is not connected,Wait for Connection\n");

            }

        }
    }//GEN-LAST:event_btSend1ActionPerformed

    private void btViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewActionPerformed
        jTextArea_list.setText("");

        jTextArea_list.setEnabled(true);
        jScrollPane1.setEnabled(true);
        jTextArea_list.setBackground(Color.WHITE);
        jTextArea_list.setForeground(Color.BLACK);
        try {
            new SQLiteDBConnect_Client().viewUsers();
        } catch (SQLException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btViewActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_leaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_leaveMouseClicked

        try {
            new SQLiteDBConnect_Client().deleteUser(nm, id1);
        } catch (SQLException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(startChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        String msg1 = "[ " + nm + " has left the Group]:" + " ";
        String msg2 = "*& " + nm + ":" + id1;
        if (send != null) {
            send.println(msg1);
            send.println(msg2);
        }
        this.dispose();
    }//GEN-LAST:event_jLabel_leaveMouseClicked

    private void lbUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbUserMouseClicked

    }//GEN-LAST:event_lbUserMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

    private void tfChatTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfChatTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfChatTextActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startChatClient("", "");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSend1;
    private javax.swing.JButton btView;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_leave;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTextArea_list;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lblIp;
    private javax.swing.JLabel lblIp1;
    private javax.swing.JLabel lblPort1;
    private javax.swing.JLabel lblport;
    private javax.swing.JTextPane taTextArea;
    private javax.swing.JTextField tfChatText;
    // End of variables declaration//GEN-END:variables
}

class SQLiteDBConnect_Client {

    private static Connection con;
    private static boolean hasData = false;

    public void getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");

        con = DriverManager.getConnection("jdbc:sqlite:AllinLAN3.db");
        initialise();
    }

    public void initialise() throws SQLException {
        if (!hasData) {
            hasData = true;

            Statement state = con.createStatement();

            ResultSet rs = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='GroupChat3'");

            if (!rs.next()) {
                System.out.println("Create table name=GroupChat3.");

                Statement statement = con.createStatement();
                statement.executeUpdate("create table GroupChat3(Name varchar(30),"
                        + "Id varchar(50));");

                System.out.println("created");

            }

        }
    }

    public void viewUsers() throws SQLException, ClassNotFoundException {

        getConnection();
        String name;
        String ip;
        Statement smt;
        ResultSet rs;
        String query1 = "select * from GroupChat3";
        smt = con.createStatement();
        rs = smt.executeQuery(query1);
        while (rs.next()) {
            name = rs.getString("Name");
            ip = rs.getString("Id");

            startChatClient.jTextArea_list.append(name + "  --  " + ip + "\n");
        }
        rs.close();
        smt.close();
        con.close();

    }

    public void deleteUser(String name, String id) throws SQLException, ClassNotFoundException {

        getConnection();
        PreparedStatement psmt;

        String query1 = "Delete from GroupChat3 where Name = ? and Id = ? ";
        psmt = con.prepareStatement(query1);
        psmt.setString(1, name);
        psmt.setString(2, id);
        int exe = psmt.executeUpdate();
        if (exe > 0) {
            System.out.println("Deleted---" + name);
        }
        psmt.close();
        con.close();

    }

    public void addNameIp(String name, String Ip) throws ClassNotFoundException, SQLException {
        // if (con == null) {

        getConnection();
        //}
        boolean status = true;
        String query = "select * from GroupChat3";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            String name1 = rs.getString(1);
            String ip = rs.getString(2);
            System.out.println(name1 + " : " + name);
            System.out.println(ip + " : " + Ip);
            if (name.equals(name1) && ip.equals(Ip)) {
                System.out.println("ccc");
                status = false;
                break;
            }
        }
        if (status == true) {
            PreparedStatement psmt;
            String query1 = "insert into GroupChat3 values(?,?)";
            psmt = con.prepareStatement(query1);
            psmt.setString(1, name);
            psmt.setString(2, Ip);
            psmt.executeUpdate();
            System.out.println("----inserted----" + name + "--" + Ip);
            psmt.close();
        }
        rs.close();
        smt.close();
        con.close();

    }
}
