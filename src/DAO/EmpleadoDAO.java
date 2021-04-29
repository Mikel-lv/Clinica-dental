/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import Entidades.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DAM108
 */
public class EmpleadoDAO {
    private Connection conn;
    private Empleado e;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public Empleado getE() {
        return e;
    }

    public void setE(Empleado e) {
        this.e = e;
    }

    public EmpleadoDAO() {
        conn = ConexionBD.conectarseBD();
    }
    
    public EmpleadoDAO(Empleado e){
        this.e = e;
        conn = ConexionBD.conectarseBD();
    }
    
    public ArrayList<Empleado> verEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
       
        try {
            if (conn == null || conn.isClosed()) {
                conn = ConexionBD.conectarseBD();
             }
            try{
                PreparedStatement pstmt = null;
                pstmt = conn.prepareStatement("SELECT * FROM empleado");
                ResultSet prs = pstmt.executeQuery();
                while(prs.next()){
                    long id = prs.getInt("id");
                    String nombre = prs.getString("nombre");
                    String apellidos = prs.getString("apellidos");
                    String tlfcontacto = prs.getString("tlfcontacto");
                    String NIF = prs.getString("NIF");
                    String direccion = prs.getString("direccion");
                    Empleado actual = new Empleado(id, nombre, apellidos, tlfcontacto, NIF, direccion);
                    empleados.add(actual);
                }
            }   catch (SQLException ex) {
                    Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        
      
    }   catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
      finally{
              
               if (conn != null) {
                    ConexionBD.cerrarBD();
                }
        }
    return empleados;
}
    public void eliminarEmpleado(int idempleado) {
        try {
            if (conn == null || conn.isClosed()) {
                conn = ConexionBD.conectarseBD();
            }
            try {
                PreparedStatement pstmt = null;
                pstmt = conn.prepareStatement("DELETE FROM empleado WHERE id ='" + idempleado + "'" );
                pstmt.executeUpdate();
                System.out.println("Se ha eliminado el empleado de la BD.");
            } catch (SQLException ex) {
                System.out.println("Se ha producido una SQLException:" + ex.getMessage());
                Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("NO se ha eliminado el ejemplar de la BD.");
            } finally {
                if (conn != null) {
                    ConexionBD.cerrarBD();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}