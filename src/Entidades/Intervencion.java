/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author punib
 */
public class Intervencion extends Cita {
    private int duracion;
    private ArrayList<Enfermeria> enfermarias = new ArrayList<Enfermeria>();
    private ArrayList<Cirujano> cirujanos = new ArrayList<Cirujano>();

    public void setEnfermarias(ArrayList<Enfermeria> enfermarias) {
        this.enfermarias = enfermarias;
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
        return enfermarias;
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

    public Intervencion() {
    super();
    }
    
    
}