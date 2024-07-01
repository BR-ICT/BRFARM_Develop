/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BRFARM;

import static BRFARM.BRLogin.vFarm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wattana
 */
public class ConnectSQLite {

    Connection conn = null;

    public static Connection ConnectionSQLite() throws SQLException {
        String jdbcClassName = ("org.sqlite.JDBC");
        Connection conn = null;

        try {
            Class.forName(jdbcClassName);
            String PathFile = System.getProperty("user.dir") + "\\db\\";
            String db = PathFile + "dbfarm.db";
//            String db = PathFile + "dbfarm_" + vFarm.toLowerCase() + ".db";

            conn = DriverManager.getConnection("jdbc:sqlite:" + db + "");
            return conn;

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.toString());
        }
        return null;

    }

    public static String LoginSQLite(String jTextFarm, String jTextUser, String jTextPassword) {

        Connection conn = null;
        try {
            conn = ConnectSQLite.ConnectionSQLite();
            Statement sta = conn.createStatement();
            String Sql = "SELECT USE_AUTH \n"
                    + "FROM FAR_USER \n"
                    + "WHERE USE_FARM = '" + jTextFarm + "' \n"
                    + "AND USE_USER = '" + jTextUser + "' \n"
                    + "AND USE_PASSWORD = '" + jTextPassword + "'";
            ResultSet rs = sta.executeQuery(Sql);
            String auth = "";
            while (rs.next()) {
                auth = rs.getString("USE_AUTH").trim();
            }
            return auth;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        }
        return null;

    }

}
