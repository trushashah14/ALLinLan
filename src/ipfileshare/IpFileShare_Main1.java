
package ipfileshare;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.net.SocketException;
import java.net.URISyntaxException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class IpFileShare_Main1 extends JFrame {

    public IpFileShare_Main1(String ipaddress,int portnumb) throws IOException, SocketException, URISyntaxException {
        setLocationRelativeTo(null);
        this.pack();
        Object[] options = {"Send File", "Receive File"};
        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
        int select = JOptionPane.showOptionDialog(this, "What would you like to do?", "Select Option", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (select == JOptionPane.YES_OPTION) {
             new IpFileShare_Send(ipaddress,portnumb).setVisible(true);
        } else if (select == JOptionPane.NO_OPTION) {
             new IpFileShare_Receive().setVisible(true);
        } 
        else {
        }

    }

    

}
