/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Mikel
 */
public class Revision extends Cita {
    private String anotacion;
    private Cirujano cirujano;
    
    
    
    
    
    public Revision() {
        super();
    }

    public Cirujano getCirujano() {
        return cirujano;
    }

    public void setCirujano(Cirujano cirujano) {
        this.cirujano = cirujano;
    }
   
    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }
    
    
    
}
