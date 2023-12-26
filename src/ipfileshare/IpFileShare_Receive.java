package ipfileshare;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class IpFileShare_Receive extends javax.swing.JFrame {

    public String location;
    String ipAddress;
    String tempAddress = "";
    String serverAddress = "";
    int port;
    int xmouse;
    int ymouse;

    //  JProgressBar jpb;
    Border default_border = BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(204, 204, 204));
    Border top_border = BorderFactory.createMatteBorder(5, 0, 0, 0, new Color(0, 153, 153));
    Border textfield_border = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 102, 102));

    public IpFileShare_Receive() throws SocketException {
        System.out.println("11111");
        initComponents();
        this.setLocationRelativeTo(null);
       // ValidatePortGetIP.LoadIps(cbmIP1);
     //  tfIp.grabFocus();
        defLoc.setText((location = defLoc()));
        defLoc.setBorder(textfield_border);
        jProgressBar1.setVisible(false);
    }

    private String defLoc() {
        System.out.println("2222");
        String ret = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir")+"\\log.bin"));
            String s = br.readLine();
            ret = s;
            System.out.println("333(def path)---"+ret);
            File f = new File(s);
            if (!f.isDirectory()) {
                new FileReader(s);
            }
        } catch (Exception e) {
            if (e instanceof FileNotFoundException || e instanceof NullPointerException) {
                try {
                    FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\log.bin");
                    ret = System.getProperty("user.dir");
                    System.out.print(ret);
                    fw.write(ret);
                    fw.close();
                } catch (Exception ee) {
                    JOptionPane.showMessageDialog(null, "Critical Error, The application will now exit", "Critical Error", 0);
                    ee.printStackTrace();
                }
            }
        }
        return ret;
    }

    private void recieveFile() {
        jButton_receive.setEnabled(false);
        ipAddress = tfIp.getText().trim();
        System.out.println("6666");
//(String) cbmIP1.getSelectedItem();
        //ipAddress = ipAddress.split(" # ")[0];
        port = (int) portNumSpn1.getValue();

        SwingUtilities.invokeLater(() -> {
            status.setText("Searching for server...Please wait");
        });
        
        if (ipAddress.isEmpty()) {
         
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(this, "Please enter IP Address.");
            j.setEnabled(false);
            
        }
        
        byte b[] = new byte[100000];
       

        String sizeName[] = new String[2];
        

        double done = 0, length;
       

        int read = 0, i = 0;
       
        BufferedReader br = null;
    

        PrintWriter pw = null;
     

        BufferedInputStream bis = null;
     

        BufferedOutputStream bos = null;
     

        FileOutputStream fos = null;
 
        Socket s = null;
    

       
        try {
            System.out.println("7777(port,ip)--"+port+" == "+ipAddress);
            s = new Socket(ipAddress, port);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream());
            StringTokenizer st = new StringTokenizer(br.readLine(), "/");

            while (st.hasMoreTokens()) {
                sizeName[i++] = st.nextToken();
            }

            pw.println("Recieved");
            pw.flush();
            length = new Double(sizeName[1]);
            bis = new BufferedInputStream(s.getInputStream());
            bos = new BufferedOutputStream(s.getOutputStream());
            fos = new FileOutputStream(location + "\\" + sizeName[0]);

            //  add(jpb,"SOUTH");
            revalidate();
            System.out.println("888--start reading");
            while (true) {
                done += read;
                if (done >= length) {
                    break;
                }
                read = bis.read(b);
                status.setText("Connection Established");
                ClientSwingWorker csw = new ClientSwingWorker(done, length, read, b, fos, jProgressBar1);
                csw.execute();
                while (!(csw.isDone())) {
                }
               
            }
             System.out.println("9999--completed reading");
            fos.flush();
            jProgressBar1.setVisible(false);
            status.setText("Recieved 100%");
            jButton_receive.setEnabled(true);
            revalidate();

           // double time = new Double(br.readLine());
            String speedString = br.readLine();

            bis.close();
            bos.close();
            fos.close();
            pw.close();
            br.close();
            s.close();

            //   JOptionPane.showMessageDialog(null, "Time taken is " + time + "\nSpeed is " + speedString + " MBPS", "\nFile Sent (Client)", 3);
            status.setText("Select IP,PORT,path to SAVETO and then click RECEIVE");
        } catch (Exception e) {
            if (e instanceof ConnectException) {

                status.setText("Select IP,PORT,path to SAVETO and then click RECEIVE");

                JOptionPane.showMessageDialog(null, "No Running Server found on specified address [ " + ipAddress + " ]", "Server Not Found", 0);

                return;
            } else if (e instanceof FileNotFoundException) {
                JOptionPane.showMessageDialog(null, "Failed in saving file,\nLocation : " + location + " required administrative rights to save or it was an invalid path\nSelect some other location for downloaded files\nThe Program will now Exit and default location would be reset", "Error [" + location + "]", 0);
                try {
                    FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\log.bin");
                    fw.close();
                } catch (IOException ee) {
                }
                System.exit(1);
            }
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Receive = new javax.swing.JPanel();
        jLabel_Receive = new javax.swing.JLabel();
        jButton_receive = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        portNumSpn1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jButton_saveto = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel16 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        defLoc = new javax.swing.JTextField();
        tfIp = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jPanel_Receive.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Receive.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));
        jPanel_Receive.setMinimumSize(new java.awt.Dimension(496, 470));
        jPanel_Receive.setPreferredSize(new java.awt.Dimension(496, 470));

        jLabel_Receive.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Receive.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Receive.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Receive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Receive.setText("Receive");
        jLabel_Receive.setOpaque(true);
        jLabel_Receive.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_ReceiveMouseClicked(evt);
            }
        });

        jButton_receive.setBackground(new java.awt.Color(0, 102, 102));
        jButton_receive.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton_receive.setForeground(new java.awt.Color(255, 255, 255));
        jButton_receive.setText("Receive");
        jButton_receive.setBorder(null);
        jButton_receive.setSelected(true);
        jButton_receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_receiveActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setText("IP : ");

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Port : ");

        portNumSpn1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn1.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Save to:");

        jButton_saveto.setBackground(new java.awt.Color(0, 102, 102));
        jButton_saveto.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jButton_saveto.setForeground(new java.awt.Color(255, 255, 255));
        jButton_saveto.setText("Browse");
        jButton_saveto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_savetoActionPerformed(evt);
            }
        });

        status.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Select IP,PORT,path to SAVETO and then Click RECEIVE");

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 102, 102));
        jProgressBar1.setMaximum(101);
        jProgressBar1.setStringPainted(true);

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 51, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/cable.png"))); // NOI18N
        jLabel16.setText("AllinLAN");
        jLabel16.setFocusable(false);
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel16.setIconTextGap(3);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/minimize.png"))); // NOI18N
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
        });

        defLoc.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        defLoc.setText("C:/");

        tfIp.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel_ReceiveLayout = new javax.swing.GroupLayout(jPanel_Receive);
        jPanel_Receive.setLayout(jPanel_ReceiveLayout);
        jPanel_ReceiveLayout.setHorizontalGroup(
            jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Receive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close))
            .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_receive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ReceiveLayout.createSequentialGroup()
                        .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(16, 16, 16))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(tfIp))
                                    .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(portNumSpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(defLoc)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_saveto)))
                .addGap(27, 27, 27))
        );
        jPanel_ReceiveLayout.setVerticalGroup(
            jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ReceiveLayout.createSequentialGroup()
                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(tfIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(portNumSpn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(15, 15, 15)
                .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ReceiveLayout.createSequentialGroup()
                        .addGroup(jPanel_ReceiveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(defLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(8, 8, 8))
                    .addComponent(jButton_saveto))
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(status)
                .addGap(18, 18, 18)
                .addComponent(jButton_receive, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Receive, javax.swing.GroupLayout.PREFERRED_SIZE, 421, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_savetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_savetoActionPerformed
        JFileChooser jfc = new JFileChooser();
        System.out.println("44444(browse)");
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        jfc.setCurrentDirectory(new File(location));
        int ret = jfc.showSaveDialog(null);
        if (ret == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fw = new FileWriter(System.getProperty("user.dir")+"\\log.bin");
                fw.write(jfc.getSelectedFile().toString());
                fw.close();
                System.out.println("555---(browse2)");
                defLoc.setText((location = jfc.getSelectedFile().toString()));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error in changing path, The application will now exit", "Fatal Error", 0);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_savetoActionPerformed

    private void jButton_receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_receiveActionPerformed
        jProgressBar1.setVisible(true);

        new Thread(new Runnable() {
            public void run() {
                recieveFile();
            }
        }).start();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_receiveActionPerformed

    private void jLabel_ReceiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_ReceiveMouseClicked

    }//GEN-LAST:event_jLabel_ReceiveMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xmouse, y - ymouse);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(IpFileShare_Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Receive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new IpFileShare_Receive().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(IpFileShare_Receive.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField defLoc;
    private javax.swing.JButton jButton_receive;
    private javax.swing.JButton jButton_saveto;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_Receive;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_Receive;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSpinner portNumSpn1;
    private javax.swing.JLabel status;
    private javax.swing.JTextField tfIp;
    // End of variables declaration//GEN-END:variables
}

class ClientSwingWorker extends SwingWorker {

    javax.swing.JProgressBar jpb;
    final double done, size;
    byte b[] = new byte[100000];
    final int read;
    FileOutputStream fos;

    ClientSwingWorker(double done, double size, int read, byte b[], FileOutputStream fos, javax.swing.JProgressBar jpb) {
        this.done = done;
        this.size = size;
        this.read = read;
        this.b = b;
        this.jpb = jpb;
        this.fos = fos;
    }

    protected Void doInBackground() throws Exception {
        fos.write(b, 0, read);
        return null;
    }

    protected void done() {
        jpb.setValue(0);
        final double temp = (done / size) * 100;
        SwingUtilities.invokeLater(() -> {
            String tS = new Double(temp).toString();
            int index = tS.indexOf(".");
            int breakPoint = (index + 3) > tS.length() ? tS.length() : (index + 3);
            tS = tS.substring(0, breakPoint);
            jpb.setString(tS);
            jpb.setValue((int) temp);

        });
    }
}
