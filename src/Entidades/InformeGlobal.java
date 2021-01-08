/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class InformeGlobal {
    private long id;
    private String descripcion;
    private ArrayList<Secretariado> secretarios = new ArrayList<Secretariado>();

    public long getId() {
        return id;
    }

    public ArrayList<Secretariado> getSecretarios() {
        return secretarios;
    }

    public void setSecretarios(ArrayList<Secretariado> secretarios) {
        this.secretarios = secretarios;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public InformeGlobal() {
    }

    public InformeGlobal(long id, String descripcion, ArrayList<Secretariado> secretarios) {
        this.id = id;
        this.descripcion = descripcion;
        this.secretarios = secretarios;
    }
    public InformeGlobal(InformeGlobal e) {
        this.id = e.id;
        this.descripcion = e.descripcion;
        this.secretarios = e.secretarios;
    }
    
     public static InformeGlobal InformeGlobal(){
        InformeGlobal nuevoInformeGlobal = new InformeGlobal(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el Id:");
        nuevoInformeGlobal.setId(in.nextInt()); 
        System.out.println("Introduce una descripción:");
        nuevoInformeGlobal.setDescripcion (in.nextLine ());
        return nuevoInformeGlobal;
       
         
    }
    
    
}
