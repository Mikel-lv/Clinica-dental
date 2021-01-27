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
    
    private ArrayList<Especialidad> especialidades = new ArrayList<Especialidad>(); // Acepta objetos de clase Especialidad

    
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
    
    public Cirujano(Empleado empleado){
        super(empleado);
    }

    @Override
    public String toString() {
        return "Cirujano{" + "especialidades=" + especialidades + '}';
    }
    
   public static Cirujano nuevoCirujano(){
       Empleado nuevoCirujano = Empleado.nuevoEmpleado();
       Cirujano ret = new Cirujano(nuevoCirujano);
       return ret;
       
   }
    
    public static final ArrayList<Cirujano> convertir(Cirujano[] array) {
        ArrayList<Cirujano> ret = new ArrayList<Cirujano>();
        for (Cirujano i : array) {
            ret.add((Cirujano) i);
        }
        return ret;
    }
}
