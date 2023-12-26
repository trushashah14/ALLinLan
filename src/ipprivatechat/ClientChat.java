package ipprivatechat;

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class ClientChat {

    PrintWriter out;
    String name;

    public PrintWriter startChat(String Ip, int Port, JTextPane taTextArea,JFrame frame) {
        try {
            Socket s1 = new Socket(Ip, Port);
            out = new ConnectClient().Chat(s1, Port, taTextArea);

        } catch (ConnectException e) {
            frame.dispose();
            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "Please ask someone to start Chat.");
            j.setEnabled(false);
            
        } catch (IOException ex) {
            System.out.println(ex);

        } finally {
            return out;
        }
    }
}
