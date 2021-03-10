/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static Entidades.InformeGlobal.nextIdInforme;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Cobro {

    private long id; //  VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir
    private double importe; // VALIDOS: >0 INVÁLIDOS <0 En €
    private Date fechaFin;// VALIDOS: Del 01/01/2000 hasta el 31/12/2100

    public long getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cobro() {
    }

    @Override
    public String toString() {
        return "Identificador: " + id + "Importe= " + importe + "€" + "Fecha de Fin de cobro: " + fechaFin;
    }

    public Cobro(long id, double importe, Date fechaFin) {
        this.id = id;
        this.importe = importe;
        this.fechaFin = fechaFin;
    }

    public Cobro(Cobro e) {
        this.id = e.id;
        this.importe = e.importe;
        this.fechaFin = e.fechaFin;
    }

    public static Cobro nuevoCobro() {
        Cobro ret = new Cobro();
        Scanner in = new Scanner(System.in);
        long id = nextIdCobro();
        ret.setId(id);
        System.out.println("Introduce la fecha fin del cobro:");
        Date fecha = Utilidades.Fecha.nuevaFecha().conversorFecha();
        ret.setFechaFin(fecha);
        System.out.println("Introduce el importe:");
        do {
            System.out.println("Introduce el importe del cobro: ");
            double importe = in.nextDouble();
            if (!Utilidades.validarImporte(importe)) {
                System.out.println("Cobro introducido inválido");
            }
        }
            while(!Utilidades.validarImporte(importe));
            ret.setImporte(importe);

            return ret;                   
             }
        
        
   

    public static long nextIdCobro() {
        long ret = 0;
        for (int i = 0; i < Utilidades.COBROS.length; i++) {
            if (Utilidades.COBROS[i].id > ret);
            ret = Utilidades.COBROS[i].id;
        }
        return ret + 1;
    }

    /**
     * Función que se le pasa una lista ArrayList<code>Cobro</code> y un array
     * de identificadores, y devuelve una sublista con los Cobros cuyos ids
     * coinciden con los identificadores del array en la lista
     *
     * @param lista de Cobros en las que buscar
     * @param ids array de ids de Cobros
     * @return ArrayList<code>Cobros</code>
     */
    public static ArrayList<Cobro> arrayde(ArrayList<Cobro> lista, int[] ids) {
        ArrayList<Cobro> ret = new ArrayList<Cobro>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Cobro) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }

    /**
     * *
     * Función que convierte un array de objetos Cobro en un ArrayList de
     * objetos Cobro con los mismos elementos que el array.
     *
     * @param array de Cobro
     * @return ArrayList de Cobro
     */
    public static final ArrayList<Cobro> convertir(Cobro[] array) {
        ArrayList<Cobro> ret = new ArrayList<Cobro>();
        for (Cobro i : array) {
            ret.add((Cobro) i);
        }
        return ret;
    }
}
