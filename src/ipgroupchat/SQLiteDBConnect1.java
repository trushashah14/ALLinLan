package ipgroupchat;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SQLiteDBConnect1 {

    private static Connection con;
    private static boolean hasData = false;

    public void getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("org.sqlite.JDBC");

        con = DriverManager.getConnection("jdbc:sqlite:AllinLAN2.db");
        initialise();
    }

    public void initialise() throws SQLException {
        if (!hasData) {
            hasData = true;

            Statement state = con.createStatement();

            ResultSet rs = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='GroupChat2'");

            if (!rs.next()) {
                System.out.println("Create table name=GroupChat2.");
                
                Statement statement = con.createStatement();
                statement.executeUpdate("create table GroupChat2(Name varchar(30),"
                        + "Id varchar(50));");

                System.out.println("created");

            }

        }
    }

    public void viewUsers() throws SQLException, ClassNotFoundException {
       
        getConnection();
        String name;
        String ip;
        Statement smt;
        ResultSet rs;
        String query1 = "select * from GroupChat2 ";
        smt = con.createStatement();
        rs = smt.executeQuery(query1);
        while (rs.next()) {
            name = rs.getString("Name");
            ip = rs.getString("Id");
            startChatServer.jTextArea_list.append(name + "  --  " + ip);
startChatClient.jTextArea_list.append(name + "  --  " + ip);
        }
        rs.close();
        smt.close();
        con.close();

    }

    public void deleteUser(String name, String id) throws SQLException, ClassNotFoundException {
       
        getConnection();
        PreparedStatement psmt;

        String query1 = "Delete from GroupChat2 where Name = ? and Id = ? ";
        psmt = con.prepareStatement(query1);
        psmt.setString(1, name);
        psmt.setString(2, id);
        int exe = psmt.executeUpdate();
        if (exe > 0) {
            System.out.println("Deleted---" + name);
        }
        psmt.close();
        con.close();

    }

    public void addNameIp(String name, String Ip) throws ClassNotFoundException, SQLException {
        if (con == null) {
          
            getConnection();
        }
        
        PreparedStatement psmt;
        String query1 = "insert into GroupChat2 values(?,?)";
        psmt = con.prepareStatement(query1);
        psmt.setString(1, name);
        psmt.setString(2, Ip);
        psmt.executeUpdate();
        System.out.println("----inserted----"+name+"--"+Ip);
        psmt.close();
        con.close();

    }
}
