/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Cobro {
    private long id;
    private double importe;
    private Date fechaFin;

    public long getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cobro() {
    }

    public Cobro(long id, double importe, Date fechaFin) {
        this.id = id;
        this.importe = importe;
        this.fechaFin = fechaFin;
    }
   public Cobro(Cobro e) {
        this.id = e.id;
        this.importe = e.importe;
        this.fechaFin = e.fechaFin;
    }
    
     public static Cobro nuevoCobro(){
        Cobro nuevoCobro = new Cobro(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Intrudce el Id del cobro:");
        nuevoCobro.setId (in.nextInt());
        System.out.println("Introduce la fecha fin del cobro:");
        // fecha = next?
        System.out.println("Introduce el importe:");
        nuevoCobro.setImporte(in.nextDouble());
    
        return nuevoCobro;
         
    }
            
    
}
