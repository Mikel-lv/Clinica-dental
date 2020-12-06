/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author punib
 */
public class InformeGlobal {
    private long id;
    private String descripcion;
    private ArrayList<Secretariado> secretariados = new ArrayList<Secretariado>();

    public long getId() {
        return id;
    }

    public void setSecretariados(ArrayList<Secretariado> secretariados) {
        this.secretariados = secretariados;
    }

    public ArrayList<Secretariado> getSecretariados() {
        return secretariados;
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
    
    
    
}
