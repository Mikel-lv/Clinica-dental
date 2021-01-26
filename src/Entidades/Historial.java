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
public class Historial {
    private long nºhistorial; // <0 y ha de ser único
    private String descripción; // Máximo 40 caracteres alfanuméricos
    private ArrayList<Alergia> alergias = new ArrayList<Alergia>();
    
    //Getters y Setters
    
     public Historial () {
      super ();
  }
    
     public Historial (Historial f){
     this.alergias = f.alergias;
     this.descripción = f.descripción;
     this.nºhistorial = f.nºhistorial;     
     }
     
     
     
    public ArrayList<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<Alergia> alergias) {
        this.alergias = alergias;
    }
    
    public long getNºhistorial() {
        return nºhistorial;
    }

    public void setNºhistorial(long nºhistorial) {
        this.nºhistorial = nºhistorial;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    

    public Historial(long nºhistorial, String descripción, ArrayList<Alergia> alergias) {
        this.nºhistorial = nºhistorial;
        this.descripción = descripción;
        this.alergias = alergias;
    }
    
        public static Historial nuevoHistorial(){
        Historial nuevoHistorial = new Historial();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el nºhistorial");
        nuevoHistorial.setNºhistorial(in.nextLong());
        System.out.println("Introduce la descripción");
        nuevoHistorial.setDescripción(in.nextLine());
        return nuevoHistorial;
    
     
}
        
   public static final ArrayList<Historial> convertir(Historial[] array) {
        ArrayList<Historial> ret = new ArrayList<Historial>();
        for (Historial i : array) {
            ret.add((Historial) i);
        }
        return ret;
    }     

    @Override
    public String toString() {
        return "Historial{" + "n\u00bahistorial=" + nºhistorial + ", descripci\u00f3n=" + descripción + ", alergias=" + alergias + '}';
    }
        
        
}