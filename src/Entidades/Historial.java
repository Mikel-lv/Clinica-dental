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
public class Historial {
    private long nºhistorial;
    private String descripción;
    private ArrayList<Alergia> alergias = new ArrayList<Alergia>();
    
    //Getters y Setters

    public ArrayList<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<Alergia> alergias) {
        this.alergias = alergias;
    }
    
    public long getNºhistorial() {
        return nºhistorial;
    }

    public void setNºhistorial(long nºhistorial) {
        this.nºhistorial = nºhistorial;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    //Constructor por defecto
    public Historial () {
    }
    
    //Constructres
    public Historial(long nºhistorial, String descripción) {
        this.nºhistorial = nºhistorial;
        this.descripción = descripción;
    }
    

    
}
