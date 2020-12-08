/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author AGuadix
 */
public class Secretariado extends Empleado {
    private int experiencia;
    private ArrayList<InformeGlobal> informesglobales = new ArrayList<InformeGlobal>();

    //Getters & Setters
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<InformeGlobal> getInformesglobales() {
        return informesglobales;
    }

    public void setInformesglobales(ArrayList<InformeGlobal> informesglobales) {
        this.informesglobales = informesglobales;
    }
    
    
    //Constructor por defecto (Haciendo llamada a la superclase al ser una subclase)
    public Secretariado(){
        super();
    }
    //Constructor con todos los atributos

    public Secretariado(int experiencia, long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion) {
        super(id, nombre, apellidos, tlfcontacto, NIF, direccion);
        this.experiencia = experiencia;
    }
    
    //Constructor de copia
    
    public Secretariado(Secretariado s){
        this.experiencia = s.experiencia;
    }
}
