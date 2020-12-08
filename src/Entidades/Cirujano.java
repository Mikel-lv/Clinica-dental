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

    
    //Getters y Setters
    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    
    //Constructor por defecto con llamada a la superclase
    public Cirujano(){
        super();
    }
    
    // Constructor con todos los atributos 

    public Cirujano(ArrayList<Especialidad> especialidades, long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion) {
        super(id, nombre, apellidos, tlfcontacto, NIF, direccion);
        this.especialidades = especialidades;
    }
    
    //Constructor de copia

    public Cirujano(Cirujano c){
        this.especialidades = c.especialidades;
        this.NIF = c.NIF;
        this.apellidos = c.apellidos;
        this.direccion = c.direccion;
        this.id = c.id;
        this.nombre = c.nombre;
        this.tlfcontacto = c.tlfcontacto;
    }
    
}
