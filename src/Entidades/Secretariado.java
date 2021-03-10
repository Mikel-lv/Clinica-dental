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
 * @author AGuadix
 */
public class Secretariado extends Empleado {

    private int experiencia; // Ha de ser >=0
    private ArrayList<InformeGlobal> informesglobales = new ArrayList<InformeGlobal>(); // Acepta objetos de clase InformeGlobal

    //Getters & Setters
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<InformeGlobal> getInformesglobales() {
        return informesglobales;
    }

    public void setInformesglobales(ArrayList<InformeGlobal> informesglobales) {
        this.informesglobales = informesglobales;
    }

    //Constructor por defecto (Haciendo llamada a la superclase al ser una subclase)
    public Secretariado() {
        super();
    }
    
    public Secretariado(int experiencia,Empleado e, ArrayList<InformeGlobal> informe){
        super(e);
        this.informesglobales = informesglobales;
        this.experiencia = experiencia;
    }
    //Constructor con todos los atributos

    public Secretariado(long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion, int experiencia, ArrayList<InformeGlobal> informesglobales) {
        super(id, nombre, apellidos, tlfcontacto, NIF, direccion);
        this.experiencia = experiencia;
        this.informesglobales = informesglobales;
    }

    //Constructor de copia
    public Secretariado(Secretariado s) {
        this.NIF = s.NIF;
        this.apellidos = s.apellidos;
        this.direccion = s.direccion;
        this.id = s.id;
        this.informesglobales = s.informesglobales;
        this.nombre = s.nombre;
        this.tlfcontacto = s.tlfcontacto;
        this.experiencia = s.experiencia;
    }

    public Secretariado(Empleado empleado){
        super(empleado);
    }
    @Override
    public String toString() {
        return "Secretariado{" + "experiencia=" + experiencia + ", informesglobales=" + informesglobales + '}';
    }

    //Metodo para crear un nuevoSecreatiado 
    public static Secretariado nuevoSecretariado() {
        Empleado nuevoSecretariado =  Empleado.nuevoEmpleado();
        Secretariado ret = new Secretariado(nuevoSecretariado);
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la experiencia");
        ret.setExperiencia(in.nextInt());

        return ret;
    }

    public InformeGlobal nuevoInformeGlobal() {
        InformeGlobal ret = new InformeGlobal();
        Scanner in = new Scanner(System.in);
        System.out.println("Intrudce el Id del informe:");
        int id = in.nextInt();
        ret.setId(in.nextInt());
        System.out.println("Descripción:");
        String descripcion = in.nextLine();
        ret.setDescripcion(descripcion);
        ret.getSecretarios().add(this);
        return ret;
    }

    
    /**
     * Función que se le pasa una lista ArrayList<code>Secretariado</code> y un
     * array de identificadores, y devuelve una sublista con los Secretarios cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Secretariado en las que buscar
     * @param ids array de ids de Secretariado
     * @return ArrayList<code>Secretariado</code>
     */
    public static ArrayList<Secretariado> arrayde(ArrayList<Secretariado> lista, int[] ids) {
        ArrayList<Secretariado> ret = new ArrayList<Secretariado>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Secretariado) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }
    /**
     * *
     * Función que convierte un array de objetos Secretariado en un ArrayList de
     * objetos Secretariado con los mismos elementos que el array.
     *
     * @param array de Secretariados
     * @return ArrayList de Secretariados
     */
    public static final ArrayList<Secretariado> convertir(Secretariado[] array) {
        ArrayList<Secretariado> ret = new ArrayList<Secretariado>();
        for (Secretariado s : array) {
            ret.add((Secretariado) s);
        }
        return ret;
    }

}
