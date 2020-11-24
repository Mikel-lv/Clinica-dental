/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AGuadix
 */
public class Secretariado extends Empleado {
    private int experiencia;

    //Getters & Setters
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    //Constructor por defecto (Haciendo llamada a la superclase al ser una subclase)
    public Secretariado(){
        super();
    }
    
    //Constructor de copia
    
    public Secretariado(Secretariado s){
        this.experiencia = s.getExperiencia();
    }
}
