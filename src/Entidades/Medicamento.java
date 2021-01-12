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
public class Medicamento {
    
    
    private long id;
    private String nombre;
    private String principioactivo;
    private int dosismaxima;
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    
    public Medicamento () {
    super ();
  } 
    
     public Medicamento (Medicamento k){
     this.citas = k.citas;
     this.id = k.id;
     this.nombre = k.nombre;
     this.principioactivo = k.principioactivo;
     this.dosismaxima = k.dosismaxima;
     }

     
     
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
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

    public String getPrincipioactivo() {
        return principioactivo;
    }

    public void setPrincipioactivo(String principioactivo) {
        this.principioactivo = principioactivo;
    }

    public int getDosismaxima() {
        return dosismaxima;
    }

    public void setDosismaxima(int dosismaxima) {
        this.dosismaxima = dosismaxima;
    }
    
    public Medicamento(long id, String nombre, String principioactivo, int dosismaxima,ArrayList<Cita> citas) {
        this.id = id;
        this.nombre = nombre;
        this.principioactivo = principioactivo;
        this.dosismaxima = dosismaxima;
        this.citas = citas;
    }
    
    public static Medicamento nuevoMedicamento(){
        Medicamento nuevoMedicamento = new Medicamento();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el id");
        nuevoMedicamento.setId(in.nextLong());
        System.out.println("Introduce el nombre");
        nuevoMedicamento.setNombre(in.nextLine());
         System.out.println("Introduce el principioactivo");
        nuevoMedicamento.setPrincipioactivo(in.nextLine());
        System.out.println("Introduce la dosismaxima");
        nuevoMedicamento.setDosismaxima(in.nextInt());
        return nuevoMedicamento;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "id=" + id + ", nombre=" + nombre + ", principioactivo=" + principioactivo + ", dosismaxima=" + dosismaxima + ", citas=" + citas + '}';
    }
    
    
}
