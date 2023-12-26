package allinlan;

import static allinlan.Login_Register.*;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SQLiteDBConnect {

    /* String currdir=System.getProperty("user.dir");
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection("jdbc:derby:"+currdir+"\\Demo","Demo","Demo");*/
    private static Connection con;
    private static boolean hasData = false;
    //true=table already exist

    public boolean loginUsers(String userid, String usernm, String password) throws ClassNotFoundException, SQLException {
        boolean status = false;

        //if (con == null) {
        // get connection
        getConnection(); // if no connection then call
        //}

        String query = "select * from Register";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            String uid = rs.getString(1);
            String unm = rs.getString(2);
            String pass = rs.getString(3);
            if (uid.equals(userid) && unm.equals(usernm) && pass.equals(password)) {
                status = true;

            }
        }
        smt.close();
        rs.close();
        con.close();
        return status;
    }

    public boolean passwordChange(String userid, String password1, String password2) throws ClassNotFoundException, SQLException {
        boolean status = false;
        boolean status1 = false;

        getConnection();

        PreparedStatement psmt;
        String query = "select * from Register";
        Statement smt = con.createStatement();
        ResultSet rs = smt.executeQuery(query);
        while (rs.next()) {
            String uid = rs.getString(1);

            if (uid.equals(userid)) {
                status = true;

            }
        }

        if (status == true) {
            if (!(password1.equals("password") || password2.equals("password"))) {
                if (password1.length() >= 6) {
                    if (password1.equals(password2)) {
                        String query1 = "update Register set Password = ? where UserId = ?";

                        psmt = con.prepareStatement(query1);
                        psmt.setString(1, password1);
                        psmt.setString(2, userid);
                        psmt.executeUpdate();
                        psmt.close();
                        status1 = true;

                    } else {
                        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                        JOptionPane j = new JOptionPane();
                        j.showMessageDialog(null, "Passwords do not match.");
                        j.setEnabled(false);

                    }
                } else {

                    UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                    UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                    UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                    JOptionPane j = new JOptionPane();
                    j.showMessageDialog(null, "Password must be of atleast 6 characters.");
                    j.setEnabled(false);
                    jPasswordField_forgotpass_password.setText("");
                    jPasswordField_forgotpass_password2.setText("");
                }
            } else {
                UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                JOptionPane j = new JOptionPane();
                j.showMessageDialog(null, "Please enter password.");
                j.setEnabled(false);
            }
        } else {

            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "UserId does not exist.");
            j.setEnabled(false);
            jPasswordField_forgotpass_password.setText("");
            jPasswordField_forgotpass_password2.setText("");
            jTextField_forgotpass_userid.setText("");
        }
        rs.close();
        smt.close();
        con.close();
        return status1;
    }

    private void getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");

        con = DriverManager.getConnection("jdbc:sqlite:AllinLAN.db");

        initialise();
    }

    private void initialise() throws SQLException {
        if (!hasData) {   //creating table as it is does not exist and inserting data
            hasData = true;
            // check for database table
            Statement smt = con.createStatement();
            //If ‘hasData’ is false then an SQL statement is created to query the SQLite master table looking for the presence of a table called ‘user’.
            ResultSet rs = smt.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='Register'");
            //If the result set returned from the query is not empty then there is already a table in the database called ‘user’ so we need not create it.  If the result set is empty there is no user table in the database so we need to create it and populate it with data.  
            //A new statement is created and assigned the SQL statement to create the user table.
            if (!rs.next()) {
                System.out.println("Create table name=Register.");
                // need to build the table
                Statement statement = con.createStatement();
                statement.executeUpdate("create table Register(UserId varchar(30),"
                        + "UserName varchar(50)," + "Password varchar(50)," + "primary key (UserId) );");

                System.out.println("created");
                // inserting some  data
                PreparedStatement psmt = con.prepareStatement("insert into Register values(?,?,?);");
                psmt.setString(1, "User1");
                psmt.setString(2, "User1");
                psmt.setString(3, "User1User1");
                psmt.execute();

            }

        }
    }

    public boolean registerUsers(String userid, String username, String password1, String password2) throws ClassNotFoundException, SQLException {

        getConnection();

        Statement smt;
        PreparedStatement psmt;
        ResultSet rs;

        boolean status = false;
        boolean status1 = false;
        boolean status2 = false;
        boolean status3 = false;
        String query = "select * from Register";
        smt = con.createStatement();
        rs = smt.executeQuery(query);
        while (rs.next()) {
            String uid = rs.getString(1);
            if (uid.equals(userid)) {
                status = true;
            }
        }

        if (userid.equals("userId") || username.equals("username")) //|| password1.equals("password") || password2.equals("password"))
        {
            status2 = true;
        }
        if (password1.equals("password") || password2.equals("password")) {
            status1 = true;
        }
        if (status2 == false) {
            if (status == false) {
                if (status1 == false) {
                    if (password1.length() >= 6) {
                        if (password1.equals(password2)) {
                            String query1 = "insert into Register values(?,?,?)";

                            psmt = con.prepareStatement(query1);
                            psmt.setString(1, userid);
                            psmt.setString(2, username);
                            psmt.setString(3, password1);
                            psmt.executeUpdate();
                            status3 = true;

                            psmt.close();
                        } else {

                            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                            JOptionPane j = new JOptionPane();
                            j.showMessageDialog(null, "Password does not match.");
                            j.setEnabled(false);
                            //jPasswordField_register_password.setText("");
                            //jPasswordField_register_password2.setText("");

                        }
                    } else {

                        UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                        UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                        UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                        JOptionPane j = new JOptionPane();
                        j.showMessageDialog(null, "Password must be of  atleast 6 characters.");
                        j.setEnabled(false);

                        jPasswordField_register_password.setText("");
                        jPasswordField_register_password2.setText("");
                    }
                } else {
                    UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                    UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                    UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                    JOptionPane j = new JOptionPane();
                    j.showMessageDialog(null, "Please enter password.");
                    j.setEnabled(false);
                }
            } else {
                UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
                UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
                UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
                JOptionPane j = new JOptionPane();
                j.showMessageDialog(null, "Please use some other UserId.");
                j.setEnabled(false);
                jTextField_register_userid.setText("");
                jTextField_register_username.setText("");
                jPasswordField_register_password.setText("");
                jPasswordField_register_password2.setText("");
            }
        } else {
            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "Please enter Credentials.");
            j.setEnabled(false);
        }
        rs.close();
        smt.close();
        con.close();
        return status3;
    }
}
