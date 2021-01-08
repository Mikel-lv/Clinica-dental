/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

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
        this.NIF = e.NIF;
        this.apellidos = e.apellidos;
        this.direccion = e.direccion;
        this.id = e.id;
        this.nombre = e.nombre;
        this.tlfcontacto = e.tlfcontacto;
        this.categoria = e.categoria;
    }
    public static Enfermeria nuevoEnfermeria(){
        Enfermeria nuevoEnfermeria = new Enfermeria();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la categoria");
        //nuevoEnfermeria.setCategoria(in.next());   "¿Qué metodo hay que poner para que recoga un char?"
        
        return nuevoEnfermeria;
    }
}
