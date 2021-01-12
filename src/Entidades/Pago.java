/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static java.lang.System.in;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Pago {
    private long id; // VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir.
    private Date fechaPago; //
    private double importe; // VALIDOS: >0 INVÁLIDOS <0 en €
    private String metodoPago; // VALIDOS: "metálico", "tarjeta" y "transferencia"
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
        System.out.println("Introduce fecha:");
        System.out.println("DD:");
        String DD = in.nextLine();
        System.out.println("MM:");
        String MM = in.nextLine();
        System.out.println("AAAA:");
        String AAAA = in.nextLine();
        // Date fecha = Date.valueOf(LocalDate.parse(DD +"/" + MM + "/" + AAAA, dateFormatter))
        System.out.println("Introduce el importe:");
        nuevoPago.setImporte(in.nextDouble());
        System.out.println("Introduce el método de pago:");
        
                     
                return nuevoPago;         
    }
    
    
    }
    
    
    
    
    
          

