/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Revision extends Cita {
    private String anotacion;  //<=40 caracteres alfanumericos
    private Cirujano cirujano; // Objeto de tipo cirujano
    
    
    
    
    
    public Revision() {
        super();
    }

    
    public Revision(Revision r){
    this.anotacion = r.anotacion;
    this.cirujano = r.cirujano;
    this.id = r.id;
    this.fecha = r.fecha;
    this.rango_horario = r.rango_horario;
    this.hora = r.hora;
    this.secretariado = r.secretariado;
    this.medicamentos = r.medicamentos;
    }

    public Revision(String anotacion, Cirujano cirujano, long id, Date fecha, char rango_horario, Time hora, Secretariado secretariado) {
        super(id, fecha, rango_horario, hora, secretariado);
        this.anotacion = anotacion;
        this.cirujano = cirujano;
    }
    
    public Revision(String anotacion, Cirujano cirujano, Cita c){
        super(c);
        this.anotacion = anotacion;
        this.cirujano = cirujano;
        
    }
    
    
       
    
    public Cirujano getCirujano() {
        return cirujano;
    }

    public void setCirujano(Cirujano cirujano) {
        this.cirujano = cirujano;
    }
   
    public String getAnotacion() {
        return anotacion;
    }

    public void setAnotacion(String anotacion) {
        this.anotacion = anotacion;
    }

    @Override
    public String toString() {
        return "Revision{" + "anotacion:" + anotacion + ", realizada por el cirujano " + cirujano + '}';
    }
    
    public static final ArrayList<Revision> convertir(Revision[] array) {
        ArrayList<Revision> ret = new ArrayList<Revision>();
        for (Revision i : array) {
            ret.add((Revision) i);
        }
        return ret;
    }
     
    
     /**
     * Función que se le pasa una lista ArrayList<code>Revision</code> y un
     * array de identificadores, y devuelve una sublista con las revisiones cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Revisiones en las que buscar
     * @param ids array de ids de alergias
     * @return ArrayList<code>Revision</code>
     */
//    public static ArrayList<Revision> arrayde(ArrayList<Revision> lista, int[] ids) {
//        ArrayList<Revision> ret = new ArrayList<Revision>();
//        for (int i = 0; i < ids.length; i++) {
//            for (int j = 0; j < lista.size(); j++) {
//                if (lista.get(j).getId() == ids[i]) {
//                    ret.add((Revision) lista.get(j));
//                    break;
//                }
//            }
//        }
//        return ret;
//    }
       
    
        public static Revision nuevaRevision(){
        Revision nuevaRevision = new Revision();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una anotacion");
        nuevaRevision.setAnotacion(in.nextLine());
        return nuevaRevision;
    }
    
    
}
