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
 * @author sebas
 */
public class Especialidad {
    
    private long id; // <0 y ha de ser único
    private String nombre; // Máximo 20 caracteres alfanuméricos
     private ArrayList<Cirujano> cirujanos = new ArrayList<Cirujano>();

    public Especialidad () {
    super ();
  }  
     
   public Especialidad (Especialidad g){
   this.cirujanos = g.cirujanos;
   this.id = g.id;
   this.nombre = g.nombre;
   }  
    
   
     
    public ArrayList<Cirujano> getCirujanos() {
        return cirujanos;
    }

    public void setCirujanos(ArrayList<Cirujano> cirujanos) {
        this.cirujanos = cirujanos;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public Especialidad(long id, String nombre,ArrayList<Cirujano> cirujanos) {
        this.id = id;
        this.nombre = nombre;
        this.cirujanos = cirujanos;
    }
    
    
    public static Especialidad nuevoEspecialidad(){
        Especialidad nuevoEspecialidad = new Especialidad();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el id");
        nuevoEspecialidad.setId(in.nextInt());
        System.out.println("Introduce el nombre");
        nuevoEspecialidad.setNombre(in.nextLine());
        return nuevoEspecialidad;
    }

    
    /**
     * Función que se le pasa una lista ArrayList<code>Especialidad</code> y un
     * array de identificadores, y devuelve una sublista con las especialidades cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Especialidad en las que buscar
     * @param ids array de ids de Especialidad
     * @return ArrayList<code>Especialidad</code>
     */
    public static ArrayList<Especialidad> arrayde(ArrayList<Especialidad> lista, int[] ids) {
        ArrayList<Especialidad> ret = new ArrayList<Especialidad>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Especialidad) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }
    
      public static final ArrayList<Especialidad> convertir(Especialidad[] array) {
        ArrayList<Especialidad> ret = new ArrayList<Especialidad>();
        for (Especialidad i : array) {
            ret.add((Especialidad) i);
        }
        return ret;
    }
    
    @Override
    public String toString() {
        return "Especialidad{" + "id=" + id + ", nombre=" + nombre + ", cirujanos=" + cirujanos + '}';
    }
    
    
    
    
}
