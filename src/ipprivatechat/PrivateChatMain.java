package ipprivatechat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.PrintWriter;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class PrivateChatMain extends JFrame {

    PrintWriter send;
    int PortNo;

    String name;

    public PrivateChatMain(String name) throws SocketException {
        setLocationRelativeTo(null);
        this.pack();
        this.name = name;
        Object[] options = {"Start PrivateChat", "Join PrivateChat"};
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        int select = JOptionPane.showOptionDialog(this, "What would you like to do?", "Select Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (select == JOptionPane.YES_OPTION) {
          
            new ServerIpPort(name);
        } else if (select == JOptionPane.NO_OPTION) {

            new ClientIpPort(name);
        } else {
        }
    }

}
