package ipgroupchat;

import java.awt.Dimension;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;

public class GroupServer {

    static JTextPane textarea;
    JFrame frame;
    String nm;

    static Vector Clients = new Vector();

    public void createServer(final JTextPane chatTextArea, final int portNumber, String nm, JFrame frame) throws SocketException {
        this.frame = frame;
        this.nm = nm;
        this.textarea = chatTextArea;

        try {
            final ServerSocket serverSocket = new ServerSocket(portNumber);

            new Thread() {
                public void run() {
                    while (true) {
                        try {
                            Socket clientSocket = serverSocket.accept();
                            GroupServer.Clients.addElement(clientSocket);

                            HandleClient handleClientThread = new HandleClient(portNumber, clientSocket, nm);

                            Thread newThread = new Thread(handleClientThread);

                            newThread.start();

                        } catch (Exception e) {
                            e.printStackTrace();
                            break;
                        }
                    }
                }
            }.start();
        } catch (BindException e) {
            frame.dispose();
            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            
            JOptionPane.showMessageDialog(null, "Port Number is already in Use.Please use some other Port Number");
            new ServerIpPort(nm);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class HandleClient implements Runnable {

    int portNumber;
    Socket clientSocket;
    String nm;

    public HandleClient(int portNumber, Socket clientSocket, String nm) {

        this.portNumber = portNumber;
        this.clientSocket = clientSocket;
        this.nm = nm;
    }

    public void run() {

        try {

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null) {

                new BroadcastMsg(inputLine).send();

            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}

class BroadcastMsg {

    String message;

    BroadcastMsg(String message) {

        this.message = message;
    }

    void send() {

        Socket clientSocket = null;
        PrintWriter out = null;
        String messageToBeSent = null;
        for (int i = 0; i < GroupServer.Clients.size(); i++) {
            clientSocket = (Socket) GroupServer.Clients.get(i);
            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);

                messageToBeSent = message;
                out.println(messageToBeSent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
