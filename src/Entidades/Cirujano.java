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
public class Cirujano extends Empleado{
    
    private ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>();
    
    
    //Constructor por defecto con llamada a la superclase
    public Cirujano(){
        super();
    }
}
