/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AGuadix
 */
public class Enfermeria extends Empleado{
    private char categoria; // Puede ser de 3 categorias, 'A', 'B' o 'C'

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
    public Enfermeria(Empleado e, char c){
     super(e);
     this.categoria = categoria;
    }

    //Constructor de copia
    public Enfermeria(Enfermeria enfermero) {
        super(enfermero);
        this.categoria = enfermero.categoria;
    }
    
    public Enfermeria(Empleado empleado) {
        super(empleado);
    }

    @Override
    public String toString() {
        return "Enfermeria{" + super.toString() + "categoria=" + categoria + '}';
    }
    
    
    public static Enfermeria nuevoEnfermeria(){
        Empleado nuevoEnfermeria =  Empleado.nuevoEmpleado();
        Enfermeria ret = new Enfermeria(nuevoEnfermeria);
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la categoria");
        ret.setCategoria(in.nextLine().charAt(0));  
        return ret;
    }
    
    
    public static ArrayList<Enfermeria> arrayde(ArrayList<Enfermeria> lista, int[] ids) {
        ArrayList<Enfermeria> ret = new ArrayList<Enfermeria>();
         for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Enfermeria) lista.get(j));
                    break;
                }
            }
        }
        return ret;
        
        }
        
        
       
    
    public static final ArrayList<Enfermeria> convertir(Enfermeria[] array) {
        ArrayList<Enfermeria> ret = new ArrayList<Enfermeria>();
        for (Enfermeria i : array) {
            ret.add((Enfermeria) i);
        }
        return ret;
    }
}
