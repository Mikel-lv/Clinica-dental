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
    
    //Constructor con todos los atributos
    public Empleado(long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion){    
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlfcontacto = tlfcontacto;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    //Constructor de copia
    public Empleado(Empleado e) {
        this.id = e.id;
        this.nombre = e.nombre;
        this.apellidos = e.apellidos;
        this.tlfcontacto = e.tlfcontacto;
        this.NIF = e.NIF;
        this.direccion = e.direccion;
    }
}
