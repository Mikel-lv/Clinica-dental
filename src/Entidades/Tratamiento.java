/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Mikel
 */
public class Tratamiento {
    private long id;
    private String nombre_descriptivo;
    private Date fecha_inicio;
    private boolean consentimiento;
    private Cobro cobro;
    private InformeGlobal informeGlobal;
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    
    
    public Tratamiento() {
    }

    
    public Tratamiento(Tratamiento t){
    this.id = t.id;
    this.nombre_descriptivo = t.nombre_descriptivo;
    this.fecha_inicio = t.fecha_inicio;
    this.consentimiento = t.consentimiento;
    this.cobro = t.cobro;
    this.informeGlobal = t.informeGlobal;
    this.citas = t.citas;
    }

    public Tratamiento(long id, String nombre_descriptivo, Date fecha_inicio, boolean consentimiento, Cobro cobro, InformeGlobal informeGlobal) {
        this.id = id;
        this.nombre_descriptivo = nombre_descriptivo;
        this.fecha_inicio = fecha_inicio;
        this.consentimiento = consentimiento;
        this.cobro = cobro;
        this.informeGlobal = informeGlobal;
    }
   
    
    
    public Cobro getCobro() {
        return cobro;
    }

    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }

    public InformeGlobal getInformeGlobal() {
        return informeGlobal;
    }

    public void setInformeGlobal(InformeGlobal informeGlobal) {
        this.informeGlobal = informeGlobal;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre_descriptivo() {
        return nombre_descriptivo;
    }

    public void setNombre_descriptivo(String nombre_descriptivo) {
        this.nombre_descriptivo = nombre_descriptivo;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public boolean isConsentimiento() {
        return consentimiento;
    }

    public void setConsentimiento(boolean consentimiento) {
        this.consentimiento = consentimiento;
    }
    
    
}

