package ipgroupchat;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class ConnectClient extends Thread {

    BufferedReader br;
    PrintWriter pw;
    JTextPane ta;
    int count = 0;
    String ip;

    public PrintWriter Chat(Socket connectedSocket, int portNo, JTextPane taTextArea, String ip) throws IOException {
        ta = taTextArea;
        this.ip = ip;
        br = new BufferedReader(new InputStreamReader(connectedSocket.getInputStream()));
        pw = new PrintWriter(connectedSocket.getOutputStream(), true);
        start();
        return pw;
    }

    public void run() {
        String s1 = "";
        try {

            while (true) {
                try {
                    if ((s1 = br.readLine()) != null) {

                        Font font = new Font("Times New Roman", Font.PLAIN, 22);
                        ta.setFont(font);
                        String[] msg = s1.split(":");
                        String msg1 = msg[0];
                        String msg2 = msg[1];
                        char firstchar = 0;
                        char secondchar = 0;
                        if (msg1.length() > 1) {
                            firstchar = msg1.charAt(0);
                            secondchar = msg1.charAt(1);
                        }
                        char fchar = msg2.charAt(0);
                        if (firstchar == '&' && secondchar == '*' && fchar == '1') {

                            String[] msgg = msg1.split(" ");

                            try {
                                new SQLiteDBConnect_Server().addNameIp(msgg[1], ip);
                                new SQLiteDBConnect_Client().addNameIp(msgg[1], ip);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (SQLException ex) {
                                Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        } else if (firstchar == '*' && secondchar == '&' && fchar == '1') {
                            String[] msgg = msg1.split(" ");

                            try {
                                new SQLiteDBConnect_Client().deleteUser(msgg[1], ip);
                                new SQLiteDBConnect_Server().deleteUser(msgg[1], ip);
                            } catch (SQLException ex) {
                                Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (ClassNotFoundException ex) {
                                Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                              char c = msg1.charAt(0);
                               if (!(c == '[')) {
                         
                                try {
                                    new SQLiteDBConnect_Server().addNameIp(msg1, ip);
                                    new SQLiteDBConnect_Client().addNameIp(msg1, ip);
                                } catch (ClassNotFoundException ex) {
                                    Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (SQLException ex) {
                                    Logger.getLogger(ConnectClient.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                            msg1 = msg1 + "  ";
                            Document doc1 = ta.getStyledDocument();
                            SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                            StyleConstants.setBold(attributeSet, true);
                            ta.setCharacterAttributes(attributeSet, true);
                            try {
                                doc1.insertString(doc1.getLength(), msg1, attributeSet);
                            } catch (BadLocationException ex1) {
                                ex1.printStackTrace();
                            }

                            Font font1 = new Font("Times New Roman", Font.PLAIN, 20);
                            ta.setFont(font1);
                            attributeSet = new SimpleAttributeSet();
                            StyleConstants.setForeground(attributeSet, Color.gray);
                            ta.setCharacterAttributes(attributeSet, true);
                            DateFormat df = new SimpleDateFormat("hh:mm a");
                            Date dateobj = new Date();

                            try {
                                doc1.insertString(doc1.getLength(), (df.format(dateobj)), attributeSet);
                            } catch (BadLocationException ex1) {
                                ex1.printStackTrace();
                            }
                            Font font2 = new Font("Times New Roman", Font.PLAIN, 26);
                            ta.setFont(font2);
                            attributeSet = new SimpleAttributeSet();
                            Document doc = ta.getStyledDocument();
                            ta.setCharacterAttributes(attributeSet, true);
                            msg2 = "\n" + msg2 + "\n\n";
                            try {
                                doc1.insertString(doc1.getLength(), msg2, attributeSet);
                            } catch (BadLocationException ex1) {
                                ex1.printStackTrace();
                            }
                            ta.setCaretPosition(ta.getDocument().getLength());//scrollbar automatic downwards
                        }
                    } else {
                    }
                } catch (SocketException s) {
                    s.printStackTrace();

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
