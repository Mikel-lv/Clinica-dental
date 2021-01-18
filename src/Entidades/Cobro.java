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
    private long id; //  VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir
    private double importe; // VALIDOS: >0 INVÁLIDOS <0 En €
    private Date fechaFin;// VALIDOS: Del 01/01/2000 hasta el 31/12/2100

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

    @Override
    public String toString() {
        return "Cobro{" + "id=" + id + ", importe=" + importe + ", fechaFin=" + fechaFin + '}';
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
        Cobro ret = new Cobro(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Intrudce el Id del cobro:");
        int identificador = in.nextInt();
        ret.setId (in.nextInt()); 
        System.out.println("Introduce la fecha fin del cobro:");
        Date fecha = Utilidades.Fecha.nuevaFecha().conversorFecha();
        ret.setFechaFin(fecha);
        System.out.println("Introduce el importe:");
        double importe = in.nextDouble();
        ret.setImporte(in.nextDouble());
        
        
             return ret;         
    }
            
    
}
