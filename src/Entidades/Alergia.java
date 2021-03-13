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
public class Alergia {

    private long id; // <0 y ha de ser único
    private String nombre; // Máximo 20 caracteres alfanuméricos
    private Medicamento medicamento; // Objeto de tipo medicamento
    private ArrayList<Historial> historiales = new ArrayList<Historial>();
    
  public Alergia () {
      super ();
  }
    
    public Alergia (Alergia t){
    this.historiales = t.historiales;
    this.id = t.id;
    this.nombre = t.nombre;
    this.medicamento = t.medicamento;
    }

    public Alergia(long id, String nombre, Medicamento medicamento, ArrayList<Historial> historiales) {
        this.id = id;
        this.nombre = nombre;
        this.medicamento = medicamento;
        this.historiales = historiales;  
    }
    public Alergia(long id, String nombre, ArrayList<Historial> historiales){
        this.id = id;
        this.nombre = nombre;
        this.historiales = historiales;
    }
    
    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
    
    public ArrayList<Historial> getHistoriales() {
        return historiales;
    }

    public void setHistoriales(ArrayList<Historial> historiales) {
        this.historiales = historiales;
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
    
    public Alergia(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
   
    public static Alergia nuevoAlergia(){
        Alergia nuevoAlergia = new Alergia();
        Scanner in = new Scanner(System.in);      
        nuevoAlergia.setId(nextIdAlergia());    
        String nombre = null;
       do{
        System.out.println("Introduce el nombre: ");
        nombre = in.nextLine();
        if(!Utilidades.validarNombre(nombre)){
            System.out.println("Nombre inválido: ");}        
       } while(!Utilidades.validarNombre(nombre));    
             
        return nuevoAlergia;
    }
    
    
    
    
     public static final ArrayList<Alergia> convertir(Alergia[] array) {
        ArrayList<Alergia> ret = new ArrayList<Alergia>();
        for (Alergia i : array) {
            ret.add((Alergia) i);
        }
        return ret;
    }
     
     public static long nextIdAlergia() {
        long ret = 0;
        for (int i = 0; i < Utilidades.ALERGIAS.length; i++) {
            if (Utilidades.ALERGIAS[i].id > ret);
            ret = Utilidades.ALERGIAS[i].id;
        }
        return ret + 1;
    }
     
    
     /**
     * Función que se le pasa una lista ArrayList<code>Alergia</code> y un
     * array de identificadores, y devuelve una sublista con las alergias cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Alergias en las que buscar
     * @param ids array de ids de alergias
     * @return ArrayList<code>Alergias</code>
     */
    public static ArrayList<Alergia> arrayde(ArrayList<Alergia> lista, int[] ids) {
        ArrayList<Alergia> ret = new ArrayList<Alergia>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Alergia) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Alergia{" + "id=" + id + ", nombre=" + nombre + ", medicamento=" + medicamento + ", historiales=" + historiales + '}';
    
    
    
}
    }