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
public class Enfermeria extends Empleado{
    private char categoria;

    //Getters & Setters
    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    //Contructor por defecto con llamada la superclase
    public Enfermeria(){
        super();
    }
    
    //Constructor con todos los atributos
    public Enfermeria(char categoria, long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion){    
        super(id, nombre, apellidos, tlfcontacto, NIF, direccion);
        this.categoria = categoria;
    }

    //Constructor de copia
    public Enfermeria(Enfermeria e) {
        this.categoria = e.categoria;
    }
}
