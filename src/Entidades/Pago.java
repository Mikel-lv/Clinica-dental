/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static java.lang.System.in;
import java.sql.Date;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Pago {
    private long id;
    private Date fechaPago;
    private double importe;
    private String metodoPago; 
    private Cobro cobro;

    

    public long getId() {
        return id;
    }

    public Cobro getCobro() {
        return cobro;
    }

    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }
    

    public Date getFechaPago() {
        return fechaPago;
    }

    public double getImporte() {
        return importe;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Pago (Pago e) {
        this.importe=e.importe;
        this.fechaPago=e.fechaPago;
        this.id=e.id;
        this.metodoPago=e.metodoPago;
        
           
    }

    public Pago() {
    }

    public Pago(long id, Date fechaPago, double importe, String metodoPago, Cobro cobro) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.metodoPago = metodoPago;
        this.cobro = cobro;
    }
    
    

    public Pago(long id, Date fechaPago, double importe) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.importe = importe;
        
    }

    @Override
    public String toString() {
        return "Pago{" + "id=" + id + ", fechaPago=" + fechaPago + ", importe=" + importe + ", metodoPago=" + metodoPago + ", cobro=" + cobro + '}';
    }
    
    
    
        public static Pago nuevoPago(){
        Pago nuevoPago = new Pago(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Intrudce el Id del pago:");
        nuevoPago.setId (in.nextInt());   
        //PREGUNTAR PARA PONER LA FECHA
        System.out.println("Introduce el importe:");
        nuevoPago.setImporte(in.nextDouble());
        System.out.println("Introduce el método de pago:");
        char sector = in.nextLine().charAt(0);
                     
                return nuevoPago;         
    }
    
    
    }
    
    
    
    
    
          

