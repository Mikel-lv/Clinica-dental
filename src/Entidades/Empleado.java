/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AGuadix
 */
public class Empleado {
    protected long id;
    protected String nombre;
    protected String apellidos;
    protected String tlfcontacto;
    protected String NIF;
    protected String direccion;

    //Getters y Setters
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTlfcontacto() {
        return tlfcontacto;
    }

    public void setTlfcontacto(String tlfcontacto) {
        this.tlfcontacto = tlfcontacto;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //Constructor por defecto
    public Empleado() {
    }
    
    //Constructor de copia
    public Empleado(Empleado e){
        this.id = e.getId();
        this.nombre = e.getNombre();
        this.apellidos = e.getApellidos();
        this.tlfcontacto = e.getTlfcontacto();
        this.NIF = e.getNIF();
        this.direccion = e.getDireccion();
    }
}
