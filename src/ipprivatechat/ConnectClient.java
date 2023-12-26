package ipprivatechat;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextArea;
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
    String name;
    public PrintWriter Chat(Socket connectedSocket, int portNo, JTextPane taTextArea) throws IOException {
        ta = taTextArea;
        br = new BufferedReader(new InputStreamReader(connectedSocket.getInputStream()));
        pw = new PrintWriter(connectedSocket.getOutputStream(), true);
        start();
        return pw;
    }

    public void run() {
        String s1 = "";
        try {

         
                try {
                    while (true) {
                    if ((s1 = br.readLine()) != null) {
                       
                        Font font = new Font("Times New Roman", Font.PLAIN, 22);
                        ta.setFont(font);
                        String[] msg = s1.split(":");
                        String msg1 = msg[0];
                        name=msg1;
                        String msg2 = msg[1];
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

                        ta.setCaretPosition(ta.getDocument().getLength());
                        ta.setCaretPosition(ta.getDocument().getLength());

                    } else {
                    }
                }
                } catch (SocketException s) {
                   /* ++count;
                    if (count == 1) {
                        Document doc1 = ta.getStyledDocument();
                        SimpleAttributeSet attributeSet = new SimpleAttributeSet();
                        StyleConstants.setBold(attributeSet, true);
                        ta.setCharacterAttributes(attributeSet, true);
                        try {
                            doc1.insertString(doc1.getLength(), "["+name+" has left the Chat.]\n", attributeSet);
                        } catch (BadLocationException ex1) {
                            ex1.printStackTrace();
                        }
                    }*/

                }
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
