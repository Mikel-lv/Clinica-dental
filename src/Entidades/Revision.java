/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Revision extends Cita {
    private String anotacion;  //<=40 caracteres alfanumericos
    private Cirujano cirujano; // Objeto de tipo cobro
    
    
    
    
    
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
        return "Revision{" + "anotacion=" + anotacion + ", cirujano=" + cirujano + '}';
    }
    
    
       
    
        public static Revision nuevaRevision(){
        Revision nuevaRevision = new Revision();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce una anotacion");
        nuevaRevision.setAnotacion(in.nextLine());
        return nuevaRevision;
    }
    
    
}
