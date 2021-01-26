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
 * @author punib
 */
public class InformeGlobal {

    private long id; // VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir.
    private String descripcion; // No ArrayList<Secretariado> secretariospuede estar vacío, y tiene un mínimo de 10 carcteres.
    private ArrayList<Secretariado> secretarios = new ArrayList<Secretariado>();

    public long getId() {
        return id;
    }

    public ArrayList<Secretariado> getSecretarios() {
        return secretarios;
    }

    public void setSecretarios(ArrayList<Secretariado> secretarios) {
        this.secretarios = secretarios;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public InformeGlobal() {
    }

    public InformeGlobal(long id, String descripcion, ArrayList<Secretariado> secretarios) {
        this.id = id;
        this.descripcion = descripcion;
        this.secretarios = secretarios;
    }

    public InformeGlobal(InformeGlobal e) {
        this.id = e.id;
        this.descripcion = e.descripcion;
        this.secretarios = e.secretarios;
    }

    @Override
    public String toString() {

        return "Informe con identificador " + id + ". Descripción: " + descripcion + ". Informe redactado por el/los secreatrio/os: " + secretarios;
    }

    /**
     *Función para crear un nuevo empleado
     * @param s
     * @return un nuevo empleado
     */
    public static InformeGlobal nuevoInformeGlobal(Secretariado s) {
        InformeGlobal ret = new InformeGlobal();
        Scanner in = new Scanner(System.in);
        long id = nextIdInforme();
        ret.setId(id);
        System.out.println("Descripción:");
        String descripcion = in.nextLine();
        ret.setDescripcion(descripcion);
        ret.secretarios.add(s);
        return ret;
    }

    /**
     *
     * @return El último Id +1
     */
    public static long nextIdInforme() {
        long ret = 0;
        for (int i = 0; i < Utilidades.INFORMES.length; i++) {
            if (Utilidades.INFORMES[i].id > ret);
            ret = Utilidades.INFORMES[i].id;
        }
        return ret + 1;
    }

    /**
     * Función que se le pasa una lista ArrayList<code>InformeGlobal</code> y un
     * array de identificadores, y devuelve una sublista con los Informes cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de InformeGlobal en las que buscar
     * @param ids array de ids de InformeGlobal
     * @return ArrayList<code>InformeGlobal</code>
     */
    public static ArrayList<InformeGlobal> arrayde(ArrayList<InformeGlobal> lista, int[] ids) {
        ArrayList<InformeGlobal> ret = new ArrayList<InformeGlobal>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((InformeGlobal) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }

    /**
     * *
     * Función que convierte un array de objetos InformeGlobal en un ArrayList
     * de objetos InformeGlobal con los mismos elementos que el array.
     *
     * @param array de InformesGlobales
     * @return ArrayList de InformesGlobales
     */
    public static final ArrayList<InformeGlobal> convertir(InformeGlobal[] array) {
        ArrayList<InformeGlobal> ret = new ArrayList<InformeGlobal>();
        for (InformeGlobal i : array) {
            ret.add((InformeGlobal) i);
        }
        return ret;
    }
}
