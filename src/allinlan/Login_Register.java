package allinlan;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class Login_Register extends javax.swing.JFrame {

    Connection conn = null;
    Statement smt = null;
    ResultSet rs = null;
    PreparedStatement psmt = null;
    int xmouse;
    int ymouse;
    static volatile boolean exit = false;
    AnimationClass AC = new AnimationClass();

    Border default_border = BorderFactory.createMatteBorder(2, 0, 0, 0, new Color(204, 204, 204));
    Border top_border = BorderFactory.createMatteBorder(5, 0, 0, 0, new Color(0, 153, 153));
    Border textfield_border = BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 102, 102));

    public Login_Register() {
        initComponents();
        SlideShow();
        this.setLocationRelativeTo(null);
        jPanel_forgotpass.setVisible(false);

        jLabel_Login.setBorder(default_border);
        jLabel_register.setBorder(default_border);
        jTextField_login_userid.setBorder(textfield_border);
        jTextField_login_username.setBorder(textfield_border);
        jPasswordField_login_password.setBorder(textfield_border);
        jTextField_register_userid.setBorder(textfield_border);
        jTextField_register_username.setBorder(textfield_border);
        jPasswordField_register_password.setBorder(textfield_border);
        jPasswordField_register_password2.setBorder(textfield_border);
        jTextField_forgotpass_userid.setBorder(textfield_border);
        jPasswordField_forgotpass_password.setBorder(textfield_border);
        jPasswordField_forgotpass_password2.setBorder(textfield_border);

        jLabel_close.setIcon(new ImageIcon(getClass().getResource("images/close.png")));
        jLabel_mini.setIcon(new ImageIcon(getClass().getResource("images/minimize.png")));
        jLabel3.setIcon(new ImageIcon(getClass().getResource("images/key-24.png")));
        jLabel_file.setIcon(new ImageIcon(getClass().getResource("images/File.png")));
        jLabel_chat.setIcon(new ImageIcon(getClass().getResource("images/AllinLAN.png")));

        jLabel_LoginMouseClicked(null);

    }

    public void SlideShow() {

        new Thread() {
            int count;

            @Override
            public void run() {
                while (!exit) {
                    try {

                        switch (count) {
                            case 0:
                                Thread.sleep(1500);
                                jLabel_file.setIcon(new ImageIcon(getClass().getResource("images/File.png")));
                                Thread.sleep(3000);
                                AC.jLabelXLeft(0, -975, 10, 13, jLabel_chat);
                                Thread.sleep(1500);
                                count = 1;
                                break;

                            case 1:
                                Thread.sleep(1500);
                                jLabel_chat.setIcon(new ImageIcon(getClass().getResource("images/Chat.png")));
                                Thread.sleep(2500);
                                AC.jLabelXRight(-975, 0, 10, 13, jLabel_chat);
                                Thread.sleep(1800);
                                count = 2;
                                break;

                            case 2:
                                Thread.sleep(1100);
                                jLabel_file.setIcon(new ImageIcon(getClass().getResource("images/Screen.png")));
                                Thread.sleep(2500);
                                AC.jLabelXLeft(0, -975, 10, 13, jLabel_chat);
                                Thread.sleep(1800);
                                count = 3;
                                break;

                            case 3:
                                Thread.sleep(1000);
                                jLabel_chat.setIcon(new ImageIcon(getClass().getResource("images/AllinLAN.png")));
                                Thread.sleep(2000);
                                AC.jLabelXRight(-975, 0, 10, 13, jLabel_chat);
                                Thread.sleep(1800);
                                count = 0;
                                break;
                        }

                    } catch (Exception e) {
                    }
                }
            }
        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Container = new javax.swing.JPanel();
        jPanel_main = new javax.swing.JPanel();
        jLabel_Login = new javax.swing.JLabel();
        jLabel_register = new javax.swing.JLabel();
        jPanel_login = new javax.swing.JPanel();
        jTextField_login_username = new javax.swing.JTextField();
        jPasswordField_login_password = new javax.swing.JPasswordField();
        jTextField_login_userid = new javax.swing.JTextField();
        jButton_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_forgotpass = new javax.swing.JLabel();
        jLabel_confirm = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel_register = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_register_userid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField_register_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField_register_password = new javax.swing.JPasswordField();
        jPasswordField_register_password2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton_register = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel_forgotpass = new javax.swing.JPanel();
        jLabel_userid = new javax.swing.JLabel();
        jTextField_forgotpass_userid = new javax.swing.JTextField();
        jLabel_pass = new javax.swing.JLabel();
        jPasswordField_forgotpass_password = new javax.swing.JPasswordField();
        jLabel_pass2 = new javax.swing.JLabel();
        jPasswordField_forgotpass_password2 = new javax.swing.JPasswordField();
        jLabel_edit = new javax.swing.JLabel();
        jButtonChangePassword = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_mini = new javax.swing.JLabel();
        jPanel_images = new javax.swing.JPanel();
        jLabel_chat = new javax.swing.JLabel();
        jLabel_file = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AllinLAN");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(400, 400));
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

        jPanel_Container.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Container.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        jPanel_Container.setPreferredSize(new java.awt.Dimension(1500, 653));

        jPanel_main.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_main.setLayout(null);

        jLabel_Login.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_Login.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_Login.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Login.setText("Login");
        jLabel_Login.setOpaque(true);
        jLabel_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_LoginMouseClicked(evt);
            }
        });
        jPanel_main.add(jLabel_Login);
        jLabel_Login.setBounds(0, 0, 249, 79);

        jLabel_register.setBackground(new java.awt.Color(0, 153, 153));
        jLabel_register.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel_register.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_register.setText("Register");
        jLabel_register.setOpaque(true);
        jLabel_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registerMouseClicked(evt);
            }
        });
        jPanel_main.add(jLabel_register);
        jLabel_register.setBounds(267, 0, 258, 79);

        jPanel_login.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_login_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_login_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_login_username.setText("username");
        jTextField_login_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_login_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_login_usernameFocusLost(evt);
            }
        });

        jPasswordField_login_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_login_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_login_password.setText("password");
        jPasswordField_login_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_login_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_login_passwordFocusLost(evt);
            }
        });

        jTextField_login_userid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_login_userid.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_login_userid.setText("userId");
        jTextField_login_userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_login_useridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_login_useridFocusLost(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(0, 102, 102));
        jButton_login.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("UserId:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/guest-24.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/key-24.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/administrator-128.png"))); // NOI18N

        jLabel_forgotpass.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel_forgotpass.setText("Forgot Password?");
        jLabel_forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_forgotpassMouseClicked(evt);
            }
        });

        jLabel_confirm.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_confirm.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel_confirm.setForeground(new java.awt.Color(0, 204, 0));
        jLabel_confirm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_confirm.setText(" ");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_loginLayout = new javax.swing.GroupLayout(jPanel_login);
        jPanel_login.setLayout(jPanel_loginLayout);
        jPanel_loginLayout.setHorizontalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_login_username, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_login_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                            .addComponent(jTextField_login_userid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel_loginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_loginLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_forgotpass))))
                    .addGroup(jPanel_loginLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 54, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_loginLayout.setVerticalGroup(
            jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_login_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_login_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField_login_password)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_forgotpass)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel_main.add(jPanel_login);
        jPanel_login.setBounds(12, 90, 509, 525);

        jPanel_register.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("UserId:");

        jTextField_register_userid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_register_userid.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_register_userid.setText("userId");
        jTextField_register_userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_register_useridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_register_useridFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("UserName:");

        jTextField_register_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_register_username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_register_username.setText("username");
        jTextField_register_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_register_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_register_usernameFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Password:");

        jPasswordField_register_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_register_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_register_password.setText("password");
        jPasswordField_register_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_register_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_register_passwordFocusLost(evt);
            }
        });

        jPasswordField_register_password2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField_register_password2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_register_password2.setText("password");
        jPasswordField_register_password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_register_password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_register_password2FocusLost(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/add-user-128.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password:");

        jButton_register.setBackground(new java.awt.Color(0, 102, 102));
        jButton_register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_register.setForeground(new java.awt.Color(255, 255, 255));
        jButton_register.setText("Register");
        jButton_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registerActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registerLayout = new javax.swing.GroupLayout(jPanel_register);
        jPanel_register.setLayout(jPanel_registerLayout);
        jPanel_registerLayout.setHorizontalGroup(
            jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_register, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_registerLayout.createSequentialGroup()
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_registerLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel_registerLayout.createSequentialGroup()
                                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField_register_password, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(jTextField_register_userid)
                                    .addComponent(jTextField_register_username)
                                    .addComponent(jPasswordField_register_password2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel_registerLayout.setVerticalGroup(
            jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_registerLayout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_register_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_register_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel_registerLayout.createSequentialGroup()
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jPasswordField_register_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel_registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_register_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel15))
                .addGap(40, 40, 40)
                .addComponent(jButton_register, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel_main.add(jPanel_register);
        jPanel_register.setBounds(12, 90, 486, 490);

        jPanel_forgotpass.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_userid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_userid.setText("UserId:");

        jTextField_forgotpass_userid.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jTextField_forgotpass_userid.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_forgotpass_userid.setText("userId");
        jTextField_forgotpass_userid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_forgotpass_useridFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_forgotpass_useridFocusLost(evt);
            }
        });

        jLabel_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_pass.setText("Password:");

        jPasswordField_forgotpass_password.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPasswordField_forgotpass_password.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_forgotpass_password.setText("password");
        jPasswordField_forgotpass_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_forgotpass_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_forgotpass_passwordFocusLost(evt);
            }
        });

        jLabel_pass2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_pass2.setText("Confirm Password:");

        jPasswordField_forgotpass_password2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jPasswordField_forgotpass_password2.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField_forgotpass_password2.setText("password");
        jPasswordField_forgotpass_password2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField_forgotpass_password2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField_forgotpass_password2FocusLost(evt);
            }
        });

        jLabel_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/edit-user-128.png"))); // NOI18N

        jButtonChangePassword.setBackground(new java.awt.Color(0, 102, 102));
        jButtonChangePassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChangePassword.setText("Change Password");
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePasswordActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_forgotpassLayout = new javax.swing.GroupLayout(jPanel_forgotpass);
        jPanel_forgotpass.setLayout(jPanel_forgotpassLayout);
        jPanel_forgotpassLayout.setHorizontalGroup(
            jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_forgotpassLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_forgotpassLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_forgotpassLayout.createSequentialGroup()
                        .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_forgotpassLayout.createSequentialGroup()
                                .addComponent(jLabel_pass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPasswordField_forgotpass_password, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_forgotpassLayout.createSequentialGroup()
                                .addComponent(jLabel_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_edit)
                                    .addComponent(jTextField_forgotpass_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_forgotpassLayout.createSequentialGroup()
                        .addComponent(jLabel_pass2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField_forgotpass_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap())
        );
        jPanel_forgotpassLayout.setVerticalGroup(
            jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_forgotpassLayout.createSequentialGroup()
                .addComponent(jLabel_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_forgotpass_userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_userid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_forgotpassLayout.createSequentialGroup()
                        .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_forgotpass_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel_forgotpassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPasswordField_forgotpass_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jButtonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel_main.add(jPanel_forgotpass);
        jPanel_forgotpass.setBounds(12, 90, 505, 490);

        jLabel_close.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/close.png"))); // NOI18N
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/cable.png"))); // NOI18N
        jLabel10.setText("AllinLAN");
        jLabel10.setFocusable(false);
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel10.setIconTextGap(3);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel_mini.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/allinlan/images/minimize.png"))); // NOI18N
        jLabel_mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_miniMouseClicked(evt);
            }
        });

        jPanel_images.setPreferredSize(new java.awt.Dimension(428, 611));

        jLabel_chat.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel_imagesLayout = new javax.swing.GroupLayout(jPanel_images);
        jPanel_images.setLayout(jPanel_imagesLayout);
        jPanel_imagesLayout.setHorizontalGroup(
            jPanel_imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
            .addGroup(jPanel_imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_imagesLayout.createSequentialGroup()
                    .addComponent(jLabel_file, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel_imagesLayout.setVerticalGroup(
            jPanel_imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_imagesLayout.createSequentialGroup()
                .addComponent(jLabel_chat)
                .addGap(0, 603, Short.MAX_VALUE))
            .addGroup(jPanel_imagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel_imagesLayout.createSequentialGroup()
                    .addComponent(jLabel_file)
                    .addGap(0, 611, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel_ContainerLayout = new javax.swing.GroupLayout(jPanel_Container);
        jPanel_Container.setLayout(jPanel_ContainerLayout);
        jPanel_ContainerLayout.setHorizontalGroup(
            jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_main, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_mini)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_close))
                    .addComponent(jPanel_images, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel_ContainerLayout.setVerticalGroup(
            jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ContainerLayout.createSequentialGroup()
                .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel_mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ContainerLayout.createSequentialGroup()
                        .addComponent(jPanel_images, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Container, javax.swing.GroupLayout.PREFERRED_SIZE, 975, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_Container, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_LoginMouseClicked
        jPanel_login.setVisible(true);
        jPanel_register.setVisible(false);
        jPanel_forgotpass.setVisible(false);

        jLabel_Login.setBorder(top_border);
        jLabel_Login.setBackground(Color.white);
        jLabel_Login.setForeground(Color.black);

        jLabel_register.setBorder(default_border);
        jLabel_register.setBackground(new Color(0, 153, 153));
        jLabel_register.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_LoginMouseClicked

    private void jLabel_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registerMouseClicked
        jPanel_register.setVisible(true);
        jPanel_login.setVisible(false);
        jPanel_forgotpass.setVisible(false);

        jLabel_confirm.setText("");
        jLabel_register.setBorder(top_border);
        jLabel_register.setBackground(Color.white);
        jLabel_register.setForeground(Color.black);

        jLabel_Login.setBorder(default_border);
        jLabel_Login.setBackground(new Color(0, 153, 153));
        jLabel_Login.setForeground(Color.white);


    }//GEN-LAST:event_jLabel_registerMouseClicked

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        exit = true;
        //System.exit(0);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_miniMouseClicked
        setState(this.ICONIFIED);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_miniMouseClicked

    private void jTextField_login_useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_login_useridFocusGained
        String userid = jTextField_login_userid.getText().trim().toLowerCase();
        if (userid.equals("userid")) {
            jTextField_login_userid.setText("");
            jTextField_login_userid.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_login_useridFocusGained

    private void jTextField_login_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_login_usernameFocusGained

        String username = jTextField_login_username.getText().trim().toLowerCase();
        if (username.equals("username")) {
            jTextField_login_username.setText("");
            jTextField_login_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_login_usernameFocusGained

    private void jPasswordField_login_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_login_passwordFocusGained
        String password = String.valueOf(jPasswordField_login_password.getPassword()).trim().toLowerCase();
        if (password.equals("password")) {
            jPasswordField_login_password.setText("");
            jPasswordField_login_password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_login_passwordFocusGained

    private void jTextField_login_useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_login_useridFocusLost

        String userid = jTextField_login_userid.getText().trim().toLowerCase();
        if (userid.equals("userId") || userid.equals("")) {
            jTextField_login_userid.setText("userId");
            jTextField_login_userid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_login_useridFocusLost

    private void jTextField_login_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_login_usernameFocusLost

        String username = jTextField_login_username.getText().trim().toLowerCase();
        if (username.equals("username") || username.equals("")) {
            jTextField_login_username.setText("username");
            jTextField_login_username.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_login_usernameFocusLost

    private void jPasswordField_login_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_login_passwordFocusLost
        String password = String.valueOf(jPasswordField_login_password.getPassword()).trim().toLowerCase();
        if (password.equals("password") || password.equals("")) {
            jPasswordField_login_password.setText("password");
            jPasswordField_login_password.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordField_login_passwordFocusLost

    private void jTextField_register_useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_register_useridFocusGained
        String userid = jTextField_register_userid.getText().trim().toLowerCase();
        if (userid.equals("userid")) {
            jTextField_register_userid.setText("");
            jTextField_register_userid.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_register_useridFocusGained

    private void jTextField_register_useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_register_useridFocusLost
        String userid = jTextField_register_userid.getText().trim().toLowerCase();
        if (userid.equals("userId") || userid.equals("")) {
            jTextField_register_userid.setText("userId");
            jTextField_register_userid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_register_useridFocusLost

    private void jTextField_register_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_register_usernameFocusGained
        String username = jTextField_register_username.getText().trim().toLowerCase();
        if (username.equals("username")) {
            jTextField_register_username.setText("");
            jTextField_register_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_register_usernameFocusGained

    private void jTextField_register_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_register_usernameFocusLost
        String username = jTextField_register_username.getText().trim().toLowerCase();
        if (username.equals("username") || username.equals("")) {
            jTextField_register_username.setText("username");
            jTextField_register_username.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_register_usernameFocusLost

    private void jPasswordField_register_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_register_passwordFocusGained
        String password = String.valueOf(jPasswordField_register_password.getPassword()).trim().toLowerCase();
        if (password.equals("password")) {
            jPasswordField_register_password.setText("");
            jPasswordField_register_password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_register_passwordFocusGained

    private void jPasswordField_register_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_register_passwordFocusLost
        String password = String.valueOf(jPasswordField_register_password.getPassword()).trim().toLowerCase();
        if (password.equals("password") || password.equals("")) {
            jPasswordField_register_password.setText("password");
            jPasswordField_register_password.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordField_register_passwordFocusLost

    private void jPasswordField_register_password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_register_password2FocusGained
        String password = String.valueOf(jPasswordField_register_password2.getPassword()).trim().toLowerCase();
        if (password.equals("password")) {
            jPasswordField_register_password2.setText("");
            jPasswordField_register_password2.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_register_password2FocusGained

    private void jPasswordField_register_password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_register_password2FocusLost
        String password = String.valueOf(jPasswordField_register_password2.getPassword()).trim().toLowerCase();
        if (password.equals("password") || password.equals("")) {
            jPasswordField_register_password2.setText("password");
            jPasswordField_register_password2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordField_register_password2FocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed

        boolean status = false;

        String userid = jTextField_login_userid.getText().trim();
        String usernm = jTextField_login_username.getText().trim();
        String password = String.valueOf(jPasswordField_login_password.getPassword()).trim();
        try {
            status = new SQLiteDBConnect().loginUsers(userid, usernm, password);
            if (status == true) {
                this.dispose();
                new Dashboard(usernm).setVisible(true);
            } else {

                UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                JOptionPane j = new JOptionPane();
                j.showMessageDialog(this, "UserId,UserName and Password doesnot match.Please try again.");
                j.setEnabled(false);

            }
            //jTextField_login_userid.setText("");
            //jTextField_login_username.setText("");
            //jPasswordField_login_password.setText("");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jLabel_forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_forgotpassMouseClicked
        jPanel_login.setVisible(false);
        jPanel_forgotpass.setVisible(true);


    }//GEN-LAST:event_jLabel_forgotpassMouseClicked

    private void jTextField_forgotpass_useridFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_forgotpass_useridFocusGained
        String userid = jTextField_forgotpass_userid.getText().trim().toLowerCase();
        if (userid.equals("userid")) {
            jTextField_forgotpass_userid.setText("");
            jTextField_forgotpass_userid.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_forgotpass_useridFocusGained

    private void jTextField_forgotpass_useridFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_forgotpass_useridFocusLost
        String userid = jTextField_forgotpass_userid.getText().trim().toLowerCase();
        if (userid.equals("userId") || userid.equals("")) {
            jTextField_forgotpass_userid.setText("userId");
            jTextField_forgotpass_userid.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jTextField_forgotpass_useridFocusLost

    private void jPasswordField_forgotpass_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_forgotpass_passwordFocusGained
        String password = String.valueOf(jPasswordField_forgotpass_password.getPassword()).trim().toLowerCase();
        if (password.equals("password")) {
            jPasswordField_forgotpass_password.setText("");
            jPasswordField_forgotpass_password.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_forgotpass_passwordFocusGained

    private void jPasswordField_forgotpass_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_forgotpass_passwordFocusLost
        String password = String.valueOf(jPasswordField_forgotpass_password.getPassword()).trim().toLowerCase();
        if (password.equals("password") || password.equals("")) {
            jPasswordField_forgotpass_password.setText("password");
            jPasswordField_forgotpass_password.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordField_forgotpass_passwordFocusLost

    private void jPasswordField_forgotpass_password2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_forgotpass_password2FocusGained
        String password = String.valueOf(jPasswordField_forgotpass_password2.getPassword()).trim().toLowerCase();
        if (password.equals("password")) {
            jPasswordField_forgotpass_password2.setText("");
            jPasswordField_forgotpass_password2.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordField_forgotpass_password2FocusGained

    private void jPasswordField_forgotpass_password2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField_forgotpass_password2FocusLost
        String password = String.valueOf(jPasswordField_forgotpass_password2.getPassword()).trim().toLowerCase();
        if (password.equals("password") || password.equals("")) {
            jPasswordField_forgotpass_password2.setText("password");
            jPasswordField_forgotpass_password2.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_jPasswordField_forgotpass_password2FocusLost

    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePasswordActionPerformed
        String uid = jTextField_forgotpass_userid.getText().trim();
        String password1 = String.valueOf(jPasswordField_forgotpass_password.getPassword()).trim();
        String password2 = String.valueOf(jPasswordField_forgotpass_password2.getPassword()).trim();
        try {
            boolean status = new SQLiteDBConnect().passwordChange(uid, password1, password2);
            if (status == true) {
                jPanel_forgotpass.setVisible(false);
                jPasswordField_forgotpass_password.setText("");
                jTextField_forgotpass_userid.setText("");
                jPasswordField_forgotpass_password2.setText("");

                jPanel_login.setVisible(true);
                jLabel_confirm.setText("Password Changed Successfuly");

            } else {

            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButtonChangePasswordActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
 //      this.setLocation(x - xmouse, y - ymouse);
        this.setLocation(x, y);
// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xmouse = evt.getX();
        ymouse = evt.getY();
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void jButton_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registerActionPerformed
        String userid = jTextField_register_userid.getText().trim();
        String username = jTextField_register_username.getText().trim();
        String password1 = String.valueOf(jPasswordField_register_password.getPassword()).trim();
        String password2 = String.valueOf(jPasswordField_register_password2.getPassword()).trim();
       
        boolean status;
        try {
            status = new SQLiteDBConnect().registerUsers(userid, username, password1, password2);
            if (status == true) {
                jPanel_register.setVisible(false);
                jPanel_login.setVisible(true);
                jLabel_Login.setBorder(top_border);
                jLabel_Login.setBackground(Color.white);
                jLabel_Login.setForeground(Color.black);

                jLabel_register.setBorder(default_border);
                jLabel_register.setBackground(new Color(0, 153, 153));
                jLabel_register.setForeground(Color.white);

                jTextField_register_userid.setText("");
                jTextField_register_username.setText("");
                jPasswordField_register_password.setText("");
                jPasswordField_register_password2.setText("");
            }

        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

      
    }//GEN-LAST:event_jButton_registerActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Icon icon = jLabel12.getIcon();
        String image = GetName.reverse(icon.toString());
        //  System.out.print(image);
        if (image.equals("notvisible-24.png")) {
            jPasswordField_login_password.setEchoChar((char) 0);
            jLabel12.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/visible-24.png")));
        } else if (image.equals("visible-24.png")) {
            jPasswordField_login_password.setEchoChar('*');
            jLabel12.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png")));
        }

    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        Icon icon = jLabel11.getIcon();
        String image = GetName.reverse(icon.toString());
        //  System.out.print(image);
        if (image.equals("notvisible-24.png")) {
            jPasswordField_register_password.setEchoChar((char) 0);
            jLabel11.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/visible-24.png")));
        } else if (image.equals("visible-24.png")) {
            jPasswordField_register_password.setEchoChar('*');
            jLabel11.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png")));
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Icon icon = jLabel15.getIcon();
        String image = GetName.reverse(icon.toString());
        //  System.out.print(image);
        if (image.equals("notvisible-24.png")) {
            jPasswordField_register_password2.setEchoChar((char) 0);
            jLabel15.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/visible-24.png")));
        } else if (image.equals("visible-24.png")) {
            jPasswordField_register_password2.setEchoChar('*');
            jLabel15.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png")));
        }
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Icon icon = jLabel13.getIcon();
        String image = GetName.reverse(icon.toString());
        //  System.out.print(image);
        if (image.equals("notvisible-24.png")) {
            jPasswordField_forgotpass_password2.setEchoChar((char) 0);
            jLabel13.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/visible-24.png")));
        } else if (image.equals("visible-24.png")) {
            jPasswordField_forgotpass_password2.setEchoChar('*');
            jLabel13.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png")));
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        Icon icon = jLabel14.getIcon();
        String image = GetName.reverse(icon.toString());
        //  System.out.print(image);
        if (image.equals("notvisible-24.png")) {
            jPasswordField_forgotpass_password.setEchoChar((char) 0);
            jLabel14.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/visible-24.png")));
        } else if (image.equals("visible-24.png")) {
            jPasswordField_forgotpass_password.setEchoChar('*');
            jLabel14.setIcon(new ImageIcon(getClass().getResource("/allinlan/images/notvisible-24.png")));
        }
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_register;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Login;
    private javax.swing.JLabel jLabel_chat;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_confirm;
    private javax.swing.JLabel jLabel_edit;
    private javax.swing.JLabel jLabel_file;
    private javax.swing.JLabel jLabel_forgotpass;
    private javax.swing.JLabel jLabel_mini;
    private javax.swing.JLabel jLabel_pass;
    private javax.swing.JLabel jLabel_pass2;
    private javax.swing.JLabel jLabel_register;
    private javax.swing.JLabel jLabel_userid;
    private javax.swing.JPanel jPanel_Container;
    private javax.swing.JPanel jPanel_forgotpass;
    private javax.swing.JPanel jPanel_images;
    private javax.swing.JPanel jPanel_login;
    private javax.swing.JPanel jPanel_main;
    private javax.swing.JPanel jPanel_register;
    public static javax.swing.JPasswordField jPasswordField_forgotpass_password;
    public static javax.swing.JPasswordField jPasswordField_forgotpass_password2;
    private javax.swing.JPasswordField jPasswordField_login_password;
    public static javax.swing.JPasswordField jPasswordField_register_password;
    public static javax.swing.JPasswordField jPasswordField_register_password2;
    public static javax.swing.JTextField jTextField_forgotpass_userid;
    private javax.swing.JTextField jTextField_login_userid;
    private javax.swing.JTextField jTextField_login_username;
    public static javax.swing.JTextField jTextField_register_userid;
    public static javax.swing.JTextField jTextField_register_username;
    // End of variables declaration//GEN-END:variables
}
