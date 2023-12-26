/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipfileshare;
import allinlan.ValidatePortGetIP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;

/**
 *
 * @author Admin
 */
public class IpFileShare_Send extends javax.swing.JFrame {

    String tempAddress = "";
    String serverAddress = "";
    JFileChooser jfc;
    String ip;
    double fileSize;
    final String sizeArray[] = {"B", "KB", "MB", "GB", "TB"};
    boolean startFlag = false;
    int port;
    int xmouse;
    int ymouse;

    void retrieveServerIP(boolean flag) // flag is false when it is executed for first time, else label is updated
    {
        try {
            tempAddress = (String) cbmIP.getSelectedItem();
            tempAddress = tempAddress.split(" # ")[0];
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Unable to Retrieve System IP, Restart the Application and Retry", "Runtime Error !", 0); // EIWQ
            System.exit(0);
        }
        if (!(tempAddress.equals(serverAddress))) {
            serverAddress = tempAddress;
            if (flag) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                        address.setText("Select this in client app : " + serverAddress + " ");
                    }
                });
            }
        }
    }

    IpFileShare_Send(String path) throws SocketException {
        this();
        openFile(new File(path));
    }
    public IpFileShare_Send(String ip, int port) {
       
        initComponents();
        cbmIP.setEnabled(false);
        //portNumSpn.setEnabled(false);
        this.ip = ip;
        this.port = port;
        tempAddress = ip;
        jfc = new JFileChooser();
        this.setLocationRelativeTo(null);
        jProgressBar1.setVisible(false);

    }

    public IpFileShare_Send() throws SocketException {
        initComponents();
        this.setLocationRelativeTo(null);
        jProgressBar1.setVisible(false);
        ValidatePortGetIP.addIp(cbmIP);
        jfc = new JFileChooser();

        new Thread(new Runnable() {
            public void run() {
                while (true) {
                    retrieveServerIP(true);
                }
            }
        }).start();
    }

    private void openFile(File path) {
        File f = path;
       
        int counter = 0;
        fileSize = f.length();
        if (fileSize == 0L) {
            JOptionPane.showMessageDialog(null, "No Valid file found on specified location", "File not found", 0);
            return;
        }
        String extension = f.toString().substring(f.toString().lastIndexOf(".") + 1, f.toString().length()).toUpperCase();
        long tempSize = (long) fileSize;
        while (tempSize > 1000) {
            counter++;
            tempSize /= 1024;
        }
        if (extension.equals("JAVA") || extension.equals("C") || extension.equals("CPP") || extension.equals("CS") || extension.equals("CSS") || extension.equals("HTML") || extension.equals("JS") || extension.equals("PHP") || extension.equals("XML") || extension.equals("VB")) {
            extension += " Source File";
        } else if (extension.equals("JPG") || extension.equals("BMP") || extension.equals("PNG") || extension.equals("GIF") || extension.equals("TIFF") || extension.equals("ICO")) {
            extension += " File (Image/Icon)";
        } else if (extension.equals("MPG") || extension.equals("MPEG") || extension.equals("MP4") || extension.equals("AVI") || extension.equals("3GP") || extension.equals("RMVB") || extension.equals("WMV") || extension.equals("MKV") || extension.equals("VOB") || extension.equals("MOV") || extension.equals("FLV")) {
            extension += " File (Video)";
        } else if (extension.equals("MP3") || extension.equals("WMA") || extension.equals("FLAC") || extension.equals("AAC") || extension.equals("AMF") || extension.equals("AMR") || extension.equals("M4A") || extension.equals("M4R") || extension.equals("OGG") || extension.equals("MP2") || extension.equals("WAV")) {
            extension += " File (Audio)";
        } else if (extension.equals("EXE") || extension.equals("CMD") || extension.equals("BAT") || extension.equals("DMG") || extension.equals("MSI")) {
            extension += " File (Executable File/Script)";
        } else {
            extension += " Document/File";
        }
        Filename.setText(f.toString());
        Filesize.setText(tempSize + " " + sizeArray[counter]);
        Filetype.setText(extension);
        startFlag = true;
    }

    private void startServer() {
        jButton_send.setEnabled(false);
     
        browse.setEnabled(false);
        status.setText("Waiting for Client to Connect");

        double startTime, endTime;
      

        byte b[] = new byte[100000];
       

        double done = 0;
      

        int read = 0;
     

        String data, fileName = Filename.getText().substring(Filename.getText().lastIndexOf("\\") + 1);
      
        BufferedReader br = null;
   

        PrintWriter pw = null;
      

        BufferedInputStream bis = null;
       

        BufferedOutputStream bos = null;
       

        FileInputStream fis = null;
     

        ServerSocket ss = null;
       

        Socket s = null;
        

    
        data = fileName + "/" + new Double(fileSize);
        port = (int) portNumSpn.getValue();
        try {
            System.out.println("44444(port)--"+port);
            ss = new ServerSocket(port);
            s = ss.accept();
            System.out.println("5555--accepted request");
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            pw = new PrintWriter(s.getOutputStream());
        }  catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Port Number is already in Use.Please use some other Port Number","Error",0);
            setEnabled(false);
            this.dispose();
            try {
                new IpFileShare_Send().setVisible(true);
            } catch (SocketException ex) {
                Logger.getLogger(IpFileShare_Send.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        pw.println(data);
        pw.flush();
        try {
            status.setText("Ongoing File Transfer");
            if (!(br.readLine().equals("Recieved"))) {
                JOptionPane.showMessageDialog(null, "Client not Ready or connection was closed", "Retry", 2);
                status.setText("Faliure");
                System.exit(0);
            }
            bis = new BufferedInputStream(s.getInputStream());
            bos = new BufferedOutputStream(s.getOutputStream());
            fis = new FileInputStream(Filename.getText());

            revalidate();

            startTime = System.currentTimeMillis();
            while ((read = fis.read(b)) != -1) {
           
                done += read;
                ServerSwingWorker ssw = new ServerSwingWorker(done, fileSize, read, b, bos, jProgressBar1);
                ssw.execute();
                while (!(ssw.isDone())) {
                }
            }
            System.out.println("writing ");
            bos.flush();
            jProgressBar1.setVisible(false);
            endTime = System.currentTimeMillis();
            browse.setEnabled(true);
            jButton_send.setEnabled(true);
            Filename.setText("");
            Filesize.setText("");
            Filetype.setText("");

            startFlag = false;

            revalidate();
            status.setText("Sent 100 %");

            double time = (endTime - startTime) / 1000;
            double speed = (fileSize / time) / 1048576;
            String speedString = String.valueOf(speed);
            speedString = ((speedString.indexOf(".") + 3) < speedString.length() ? speedString.substring(0, speedString.indexOf(".") + 3) : speedString.substring(0));
            pw.println(time);
            pw.flush();
            pw.println(speedString);
            pw.flush();
            //    JOptionPane.showMessageDialog(null, "Time taken is " + time + "\nSpeed is " + speedString + " MBPS", "File Sent (Server)", 3);
            status.setText("Select IP,PORT,FILE and then click SEND");

           
            bis.close();
            bos.close();
            fis.close();
            br.close();
            pw.close();
            ss.close();
            s.close();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, ioe.toString(), "Error", 0);
            System.exit(0);
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

        jPanel_Send = new javax.swing.JPanel();
        jButton_send = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbmIP = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        portNumSpn = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        Filename = new javax.swing.JTextField();
        browse = new javax.swing.JButton();
        Filesize = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Filetype = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_Send = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel_Send.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Send.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102), 3));

        jButton_send.setBackground(new java.awt.Color(0, 102, 102));
        jButton_send.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jButton_send.setForeground(new java.awt.Color(255, 255, 255));
        jButton_send.setText("Send");
        jButton_send.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_sendActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("IP : ");

        cbmIP.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbmIP.setOpaque(false);
        cbmIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmIPActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setText("Port : ");

        portNumSpn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        portNumSpn.setModel(new javax.swing.SpinnerNumberModel(1024, 1024, 65563, 1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("File Name:");

        Filename.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Filename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilenameActionPerformed(evt);
            }
        });

        browse.setBackground(new java.awt.Color(0, 102, 102));
        browse.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        browse.setForeground(new java.awt.Color(255, 255, 255));
        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        Filesize.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Filesize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilesizeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setText("File Size:");

        Filetype.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Filetype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiletypeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setText("File Type:");

        address.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        status.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        status.setText("Select IP,PORT,FILE and then click SEND");

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 51, 102));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/cable.png"))); // NOI18N
        jLabel14.setText("AllinLAN");
        jLabel14.setFocusable(false);
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel14.setIconTextGap(3);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_Send.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Send.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Send.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Send.setText("Send");
        jLabel_Send.setOpaque(true);
        jLabel_Send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_SendMouseClicked(evt);
            }
        });

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/minimize.png"))); // NOI18N
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ipfileshare/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(0, 102, 102));
        jProgressBar1.setMaximum(101);
        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel_SendLayout = new javax.swing.GroupLayout(jPanel_Send);
        jPanel_Send.setLayout(jPanel_SendLayout);
        jPanel_SendLayout.setHorizontalGroup(
            jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SendLayout.createSequentialGroup()
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SendLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbmIP, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_SendLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(portNumSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel_SendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SendLayout.createSequentialGroup()
                        .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel_SendLayout.createSequentialGroup()
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Filetype))
                                .addGroup(jPanel_SendLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Filesize, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel_SendLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filename, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browse)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel_SendLayout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close))
            .addComponent(jLabel_Send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_SendLayout.setVerticalGroup(
            jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_SendLayout.createSequentialGroup()
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_SendLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel_Send, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbmIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(portNumSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Filename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Filesize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_SendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(Filetype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_send, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel_Send, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Send, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        this.dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jLabel_SendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_SendMouseClicked

    }//GEN-LAST:event_jLabel_SendMouseClicked

    private void FiletypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiletypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FiletypeActionPerformed

    private void FilesizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilesizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilesizeActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed

        int ret = jfc.showOpenDialog(null);
        if (ret == JFileChooser.APPROVE_OPTION) {
            openFile(jfc.getSelectedFile());
        }
        jButton_send.requestFocusInWindow();

        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void FilenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FilenameActionPerformed

    private void cbmIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmIPActionPerformed

    private void jButton_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_sendActionPerformed
        jProgressBar1.setVisible(true);
        if (startFlag) {
            new Thread(new Runnable() {
                public void run() {
                    startServer();
                }
            }).start();
        } else {
            JOptionPane.showMessageDialog(null, "Select a Valid file first ( size > 0B )", "Error", 0);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_sendActionPerformed

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
    public static void main(final String... args) {
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
            java.util.logging.Logger.getLogger(IpFileShare_Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IpFileShare_Send.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (args.length == 1 && !(args[0].equals("%1"))) {
                    try {
                        new IpFileShare_Send(args[0]);
                    } catch (SocketException ex) {
                        Logger.getLogger(IpFileShare_Send.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        new IpFileShare_Send().setVisible(true);
                    } catch (SocketException ex) {
                        Logger.getLogger(IpFileShare_Send.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Filename;
    public javax.swing.JTextField Filesize;
    public javax.swing.JTextField Filetype;
    private javax.swing.JLabel address;
    private javax.swing.JButton browse;
    private javax.swing.JComboBox<String> cbmIP;
    private javax.swing.JButton jButton_send;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Send;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JPanel jPanel_Send;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSpinner portNumSpn;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}

class ServerSwingWorker extends SwingWorker {

    javax.swing.JProgressBar jpb;
    final double done, size;
    byte b[] = new byte[100000];
    final int read;
    BufferedOutputStream bos;

    ServerSwingWorker(double done, double size, int read, byte b[], BufferedOutputStream bos, javax.swing.JProgressBar jpb) {
        this.done = done;
        this.size = size;
        this.read = read;
        this.b = b;
        this.jpb = jpb;
        this.bos = bos;
    }

    protected Void doInBackground() throws Exception {
        bos.write(b, 0, read);
        return null;
    }

    protected void done() {
        jpb.setValue(0);
        final double temp = (done / size) * 100;
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                String tS = new Double(temp).toString();
                int index = tS.indexOf(".");
                int breakPoint = (index + 3) > tS.length() ? tS.length() : (index + 3);
                tS = new Double(temp).toString();
                tS = tS.substring(0, breakPoint);
                jpb.setString(tS);
                jpb.setValue((int) temp);
            }
        });
    }
}
