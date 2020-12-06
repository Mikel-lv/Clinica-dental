/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class Especialidad {
    
    private long id;
    private String nombre;
     private ArrayList<Cirujano> cirujanos = new ArrayList<Cirujano>();

    public ArrayList<Cirujano> getCirujanos() {
        return cirujanos;
    }

    public void setCirujanos(ArrayList<Cirujano> cirujanos) {
        this.cirujanos = cirujanos;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Especialidad () {
    
    }

    public Especialidad(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    
    
    
    
    
    
}
