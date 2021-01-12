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
    
    private long id;
    private String nombre;
    private Medicamento medicamento;
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
        System.out.println("Introduce el id");
        nuevoAlergia.setId(in.nextInt());
        System.out.println("Introduce el nombre");
        nuevoAlergia.setNombre(in.nextLine());
        return nuevoAlergia;
    }

    @Override
    public String toString() {
        return "Alergia{" + "id=" + id + ", nombre=" + nombre + ", medicamento=" + medicamento + ", historiales=" + historiales + '}';
    }
    
    
    
    
}