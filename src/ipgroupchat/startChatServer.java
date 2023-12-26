package ipgroupchat;

import java.awt.Font;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import ipgroupchat.ServerIpPort;
import java.awt.Color;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class startChatServer extends javax.swing.JFrame {

    PrintWriter send;
    String nm;
    int xmouse;
    int ymouse;
    String id1;

    public startChatServer(String nm, String grpnm) {
        initComponents();
        //id1 = ServerIpPort.ipAddress;
        setLocationRelativeTo(null);
        lbUser.setText(grpnm);
        this.nm = nm;
        jTextArea_list.setEditable(false);
        taTextArea.setEditable(false);
        tfChatText.grabFocus();
        setVisible(true);

    }

    public void start(int PortNo, String ip) throws SocketException {
        id1 = ip;
        lblIp2.setText(ip);
        String p = String.valueOf(PortNo);
        lblport2.setText(p);
        taTextArea.setEditable(false);
        this.setVisible(true);
        tfChatText.grabFocus();

        new GroupServer().createServer(taTextArea, PortNo, nm, this);
        send = new ClientChat().startChat(ip, PortNo, taTextArea, nm, this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_list = new javax.swing.JTextArea();
        tfChatText = new javax.swing.JTextField();
        btSend = new javax.swing.JButton();
        lblIp1 = new javax.swing.JLabel();
        lblPort1 = new javax.swing.JLabel();
        lblIp2 = new javax.swing.JLabel();
        lblport2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taTextArea = new javax.swing.JTextPane();
        btView = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_leave = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("GroupChat");
        setMinimumSize(new java.awt.Dimension(587, 525));
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea_list.setBackground(new java.awt.Color(0, 102, 102));
        jTextArea_list.setColumns(20);
        jTextArea_list.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextArea_list.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea_list.setRows(5);
        jTextArea_list.setText("       \n\n\n\n\n\n\n          Connected User's \n              list will be \n           displayed here");
        jTextArea_list.setDisabledTextColor(new java.awt.Color(0, 102, 102));
        jScrollPane1.setViewportView(jTextArea_list);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE))
        );

        tfChatText.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
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

        lblIp1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblIp1.setText("Your IP Address :");

        lblPort1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblPort1.setText("Your Port Number :");

        lblIp2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

        lblport2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 719, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(lblPort1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblport2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(lblIp1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIp2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tfChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSend, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(319, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblIp1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIp2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPort1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblport2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfChatText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSendActionPerformed
        String s = evt.getActionCommand();
        if (s.equals("Send")) {

            String msg = tfChatText.getText();
            msg = nm + ":" + msg;
            tfChatText.setText("");

            if (send != null) {

                send.println(msg);
            } else {

                Font font = new Font("Serif", Font.PLAIN, 26);
                jTextPane1.setFont(font);

                Document doc1 = jTextPane1.getStyledDocument();
                SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                StyleConstants.setBold(attributeSet, true);
                jTextPane1.setCharacterAttributes(attributeSet, true);
                try {
                    doc1.insertString(doc1.getLength(), "Not Connected", attributeSet);
                } catch (BadLocationException ex1) {
                    ex1.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_btSendActionPerformed

    private void btViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewActionPerformed
        jTextArea_list.setText("");

        jPanel2.setEnabled(true);
        jTextArea_list.setEnabled(true);
        jScrollPane1.setEnabled(true);
        jTextArea_list.setBackground(Color.WHITE);
        jTextArea_list.setForeground(Color.BLACK);

        try {
            new SQLiteDBConnect_Server().viewUsers();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btViewActionPerformed

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_leaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_leaveMouseClicked

        try {
            new SQLiteDBConnect_Server().deleteUser(nm, id1);
            String msg1 = "[ " + nm + " has left the Group]:" + " ";
            String msg2 = "*& " + nm + ":" + id1;

            if (send != null) {
                send.println(msg1);
                send.println(msg2);
            }
            this.dispose();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jLabel_leaveMouseClicked

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
            java.util.logging.Logger.getLogger(startChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startChatServer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startChatServer("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSend;
    private javax.swing.JButton btView;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel_leave;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTextArea jTextArea_list;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lblIp1;
    private javax.swing.JLabel lblIp2;
    private javax.swing.JLabel lblPort1;
    private javax.swing.JLabel lblport2;
    private javax.swing.JTextPane taTextArea;
    private javax.swing.JTextField tfChatText;
    // End of variables declaration//GEN-END:variables
}

class SQLiteDBConnect_Server {

    private static Connection con;
    private static boolean hasData = false;

    public void getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");

        con = DriverManager.getConnection("jdbc:sqlite:AllinLAN2.db");
        initialise();
    }

    public void initialise() throws SQLException {
        if (!hasData) {
            hasData = true;

            Statement state = con.createStatement();

            ResultSet rs = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='GroupChat2'");

            if (!rs.next()) {
                System.out.println("Create table name=GroupChat2.");

                Statement statement = con.createStatement();
                statement.executeUpdate("create table GroupChat2(Name varchar(30),"
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
        String query1 = "select * from GroupChat2 ";
        smt = con.createStatement();
        rs = smt.executeQuery(query1);
        while (rs.next()) {
            name = rs.getString("Name");
            ip = rs.getString("Id");

            startChatServer.jTextArea_list.append(name + "  --  " + ip + "\n");
        }
        rs.close();
        smt.close();
        con.close();

    }

    public void deleteUser(String name, String id) throws SQLException, ClassNotFoundException {

        getConnection();
        PreparedStatement psmt;

        String query1 = "Delete from GroupChat2 where Name = ? and Id = ? ";
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
        //if (con == null) {

        getConnection();
        //}
        boolean status = true;
        String query = "select * from GroupChat2";
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
            String query1 = "insert into GroupChat2 values(?,?)";
            psmt = con.prepareStatement(query1);
            psmt.setString(1, name);
            psmt.setString(2, Ip);
            psmt.executeUpdate();
            System.out.println("----inserted----" + name + "--" + Ip);
            psmt.close();
        }
        smt.close();
        rs.close();
        con.close();

    }
}
