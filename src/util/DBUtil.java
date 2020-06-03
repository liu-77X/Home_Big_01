package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getConn() {

        String url = "jdbc:mysql://localhost:3306/bookinternet";
        String user = "root";
        String pwd = "root";
        Connection conn = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection conn, PreparedStatement ps,
                                 ResultSet rs) {

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

}