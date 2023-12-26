package ipgroupchat;

import java.awt.Dimension;
import java.awt.Font;
import java.io.PrintWriter;
import java.net.SocketException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class GroupChatMain extends JFrame {

    PrintWriter send;
    int PortNo;
    String nm;

    public static void main(String[] args) throws SocketException {
        new GroupChatMain("");
    }

    public GroupChatMain(String nm) throws SocketException {
        this.nm = nm;
        setLocationRelativeTo(null);
        this.pack();
        Object[] options = {"Start GroupChat", "Join GroupChat"};
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        int select = JOptionPane.showOptionDialog(this, "What would you like to do?", "Select Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (select == JOptionPane.YES_OPTION) {

            new ServerIpPort(nm);
        } else if (select == JOptionPane.NO_OPTION) {
            new ClientIpPort(nm);
            System.out.println(nm);
        } else {
        }
    }

}
