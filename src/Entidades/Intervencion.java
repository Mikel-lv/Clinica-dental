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
 * @author punib
 */
public class Intervencion extends Cita {
    private int duracion;
    private ArrayList<Enfermeria> enfermeros = new ArrayList<Enfermeria>();
    private ArrayList<Cirujano> cirujanos = new ArrayList<Cirujano>();

    public void setEnfermarias(ArrayList<Enfermeria> enfermarias) {
        this.enfermeros = enfermeros;
    }

    public void setCirujanos(ArrayList<Cirujano> cirujanos) {
        this.cirujanos = cirujanos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setRango_horario(char rango_horario) {
        this.rango_horario = rango_horario;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public ArrayList<Enfermeria> getEnfermarias() {
        return enfermeros;
    }

    public ArrayList<Cirujano> getCirujanos() {
        return cirujanos;
    }

    public long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public char getRango_horario() {
        return rango_horario;
    }

    public Time getHora() {
        return hora;
    }

    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

  

    

    public Secretariado getSecretariado() {
        return secretariado;
    }

    

    

    public void setSecretariado(Secretariado secretariado) {
        this.secretariado = secretariado;
    }

    
    
    public Intervencion() {
    super();
    }

    public Intervencion(int duracion, ArrayList<Enfermeria> enfermeros ,ArrayList<Cirujano> cirujanos ) {
    super();   
        this.duracion = duracion;
        this.enfermeros = enfermeros;
        this.cirujanos = cirujanos;
        
    
    }

    public Intervencion(int duracion) {
        this.duracion = duracion;
    }

    public Intervencion(int duracion, long id, Date fecha, char rango_horario, Time hora, Secretariado secretariado, ArrayList<Enfermeria> enfermeros ,ArrayList<Cirujano> cirujanos) {
        super(id, fecha, rango_horario, hora, secretariado);
        this.duracion = duracion;
        this.cirujanos = cirujanos;
        this.enfermeros = enfermeros;
    }

    public Intervencion(Intervencion e) {
        this.duracion = e.duracion;
        this.cirujanos = e.cirujanos;
        this.enfermeros = e.enfermeros;
        this.id = e.id;
        this.fecha = e.fecha;
        this.rango_horario = e.rango_horario;
        this.hora = e.hora;
        this.secretariado = e.secretariado;
               
    }

    @Override
    public String toString() {
        return "Intervencion{" + "duracion=" + duracion + ", enfermeros=" + enfermeros + ", cirujanos=" + cirujanos + '}';
    }
    
    
     public static Intervencion nuevoIntervencion(){
        Intervencion ret = new Intervencion(); 
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce (en minutos) la duración de la intervención: ");
        int duracion = in.nextInt();
        ret.setId (in.nextInt());         
        return ret;
                 
       
    }
        
        
        public static final ArrayList<Intervencion> convertir(Intervencion[] array) {
        ArrayList<Intervencion> ret = new ArrayList<Intervencion>();
        for (Intervencion e : array) {
            ret.add((Intervencion) e);
        }
        return ret;
    }
}

//