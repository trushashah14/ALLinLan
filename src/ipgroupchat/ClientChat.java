package ipgroupchat;

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JTextPane;
import javax.swing.UIManager;

public class ClientChat {

    PrintWriter out;
    String nm;

    String[] ip;
    String id1;
    JFrame frame;

    public PrintWriter startChat(String Ip, int Port, JTextPane taTextArea, String nm, JFrame frame) {
        this.nm = nm;
        this.frame = frame;
        try {
            Socket s1 = new Socket(Ip, Port);
            String msg1 = "[ " + nm + " has joined the Group]:" + " ";
            String msg2 = "&* " + nm + ":" + Ip;
            id1 = Ip;
            //new SQLiteDBConnect_Client().addNameIp(nm, id1);
            //new SQLiteDBConnect_Server().addNameIp(nm, id1);
            out = new ConnectClient().Chat(s1, Port, taTextArea,id1);
            out.println(msg1);
            out.println(msg2);

        } catch (ConnectException e) {
            frame.dispose();
            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "Please ask someone to start Chat.");
            j.setEnabled(false);
            //System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex);

        } finally {
            return out;
        }
    }
}
