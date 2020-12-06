/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;

/**
 *
 * @author Mikel
 */
public class Tratamiento {
    private long id;
    private String nombre_descriptivo;
    private Date fecha_inicio;
    private boolean consentimiento;

    public Tratamiento() {
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

