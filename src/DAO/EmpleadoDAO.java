/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import Entidades.Empleado;
import java.sql.Connection;

/**
 *
 * @author DAM108
 */
public class EmpleadoDAO {
    private Connection c;
    private Empleado e;

    public Connection getC() {
        return c;
    }

    public void setC(Connection c) {
        this.c = c;
    }

    public Empleado getE() {
        return e;
    }

    public void setE(Empleado e) {
        this.e = e;
    }

    public EmpleadoDAO() {
        c = ConexionBD.conectarseBD();
    }
    
    public EmpleadoDAO(Empleado e){
        this.e = e;
        c = ConexionBD.conectarseBD();
    }
    
    
}
