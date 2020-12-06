/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author sebas
 */
public class Medicamento {
    
    
    private long id;
    private String nombre;
    private String principioactivo;
    private int sosismaxima;

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

    public int getSosismaxima() {
        return sosismaxima;
    }

    public void setSosismaxima(int sosismaxima) {
        this.sosismaxima = sosismaxima;
    }
    
    
    public Medicamento (){
    
    }

    public Medicamento(long id, String nombre, String principioactivo, int sosismaxima) {
        this.id = id;
        this.nombre = nombre;
        this.principioactivo = principioactivo;
        this.sosismaxima = sosismaxima;
    }
    
    
}
