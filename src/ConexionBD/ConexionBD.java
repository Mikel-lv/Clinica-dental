/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DAM108
 */
public class ConexionBD {

    //DATOS BD
    static final String DB_URL = "jdbc:mysql://localhost:3306/clinicaDental";
    static final String USER = "clinicadental";
    static final String PASS = "123456";

    static Connection conn = null;
    Statement stmt = null;
    PreparedStatement psmtp = null;

    public static Connection conectarseBD() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException ex) {
            System.out.println("Se ha producido una SQLException:" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Se ha producido una ClassNotFoundException:" + ex.getMessage());
        } finally {
            return conn;
        }

    }

    public static void cerrarBD() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Se ha producido una SQLException:" + ex.getMessage());
            }
        }
    }

}
