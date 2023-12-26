package ipgroupchat;

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

    private void getConnection() throws ClassNotFoundException, SQLException {

//String currdir=System.getProperty("user.dir");
// sqlite driver
        Class.forName("org.sqlite.JDBC");

        con = DriverManager.getConnection("jdbc:sqlite:AllinLAN1.db");
        initialise();
    }

    private void initialise() throws SQLException {
        if (!hasData) {
            hasData = true;

            Statement state = con.createStatement();

            ResultSet rs = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='GroupChat1'");

            if (!rs.next()) {
                System.out.println("Create table name=GroupChat1.");

                Statement statement = con.createStatement();
                statement.executeUpdate("create table GroupChat1(PortNo integer,"
                        + "GroupName varchar(50)," + "primary key (GroupName) );");

                System.out.println("created");

            }

        }
    }

    public int getPortNo(String Groupnm) throws SQLException, ClassNotFoundException {
        //if (con == null) {

        getConnection();
        //}
        int PortNo = 0;
        PreparedStatement psmt;
        ResultSet rs;
        String query1 = "select * from GroupChat1 where GroupName = ?";
        psmt = con.prepareStatement(query1);
        psmt.setString(1, Groupnm);
        rs = psmt.executeQuery();
        while (rs.next()) {
            PortNo = rs.getInt("PortNo");

        }
        rs.close();
        psmt.close();
        con.close();
        return PortNo;
    }

    public String getGroupName(int PortNo) throws SQLException, ClassNotFoundException {
        //if (con == null) {

        getConnection();
        //}
        String GroupName = null;
        PreparedStatement psmt;
        ResultSet rs;

        String query1 = "select * from GroupChat1 where PortNo = ?";
        psmt = con.prepareStatement(query1);
        psmt.setInt(1, PortNo);
        rs = psmt.executeQuery();
        while (rs.next()) {
            GroupName = rs.getString("GroupName");

        }
        rs.close();
        psmt.close();
        con.close();
        return GroupName;

    }

    public boolean addDetails(int PortNo, String Groupnm) throws ClassNotFoundException, SQLException {

        getConnection();

        Statement smt;
        PreparedStatement psmt = null;
        ResultSet rs;

        boolean status = true;

        String query = "select * from GroupChat1";
        smt = con.createStatement();
        rs = smt.executeQuery(query);
        while (rs.next()) {
            String grpnm = rs.getString(2);
            if (grpnm.equals(Groupnm)) {
                status = false;
            }
        }

        if (status == true) {

            String query1 = "insert into GroupChat1 values(?,?)";

            psmt = con.prepareStatement(query1);
            psmt.setInt(1, PortNo);
            psmt.setString(2, Groupnm);

            psmt.executeUpdate();
            psmt.close();
            System.out.println("----inserted,PortNo,Grpnm----");
        } else {
            UIManager.put("OptionPane.minimumSize", new Dimension(350, 130));
            UIManager.put("OptionPane.buttonFont", new Font("Comic sans ms", Font.PLAIN, 15));
            UIManager.put("OptionPane.messageFont", new Font("Comic sans ms", Font.BOLD, 20));
            JOptionPane j = new JOptionPane();
            j.showMessageDialog(null, "Please use some other GroupName.");
            j.setEnabled(false);
        }
        rs.close();
        smt.close();
        con.close();

        return status;
    }
}
