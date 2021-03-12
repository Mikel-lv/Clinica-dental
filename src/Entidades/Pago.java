/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import static Entidades.InformeGlobal.nextIdInforme;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Pago {

    private long id; // VALIDOS: >0 INVÁLIDOS <0. Valor unico, no se puede repetir.
    private Date fechaPago = Date.valueOf(LocalDate.now());
    ; // VALIDOS: Del 01/01/2000 hasta el 31/12/2100
    private double importe; // VALIDOS: >0 INVÁLIDOS <0 en €
    private String metodoPago = "tarjeta"; // VALIDOS: "metálico", "tarjeta" y "transferencia"
    private Cobro cobro;

    public long getId() {
        return id;
    }

    public Cobro getCobro() {
        return cobro;
    }

    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public double getImporte() {
        return importe;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Pago(Pago e) {
        this.importe = e.importe;
        this.fechaPago = e.fechaPago;
        this.id = e.id;
        this.metodoPago = e.metodoPago;

    }

    public Pago() {
    }

    public Pago(long id, Date fechaPago, double importe, String metodoPago, Cobro cobro) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.metodoPago = metodoPago;
        this.cobro = cobro;
    }

    public Pago(long id, Date fechaPago, double importe) {
        this.id = id;
        this.fechaPago = fechaPago;
        this.importe = importe;

    }

    @Override
    public String toString() {

        return "Identificador: " + id + " Importe= " + importe + "€" + " Fecha del pago: " + fechaPago + " Método de pago " + metodoPago + ". Corresponde al cobro " + cobro;
    }

    public static Pago nuevoPago() {
        Pago ret = new Pago();
        Scanner in = new Scanner(System.in);
        long id = nextIdPago();
        ret.setId(id);

        System.out.println("Introduce la fecha del pago: ");
        Date fecha = Utilidades.Fecha.nuevaFecha().conversorFecha();
        ret.setFechaPago(fecha);

        double importe = -1;
        do {
            System.out.println("Introduce el importe: ");
            importe = in.nextDouble();
            if (!Utilidades.leerDouble(importe)) {
                System.out.println("Importe introducido inválido: ");
            }
        } while (!Utilidades.leerDouble(importe));
        ret.setImporte(importe);

        String metodoPago = "mal";
        do {
            System.out.println("Introduce el método de pago: ");
            metodoPago = in.nextLine();
            if (!Utilidades.validarMetodoPago(metodoPago)) {
                System.out.println("Método de pago inválido");
            }
        } while (!Utilidades.validarMetodoPago(metodoPago));
        ret.setMetodoPago(metodoPago);

        return ret;
    }

    public static long nextIdPago() {
        long ret = 0;
        for (int i = 0; i < Utilidades.PAGOS.length; i++) {
            if (Utilidades.PAGOS[i].id > ret);
            ret = Utilidades.PAGOS[i].id;
        }
        return ret + 1;

    }

    /**
     * Función que se le pasa una lista ArrayList<code>Pago</code> y un array de
     * identificadores, y devuelve una sublista con los Pagos cuyos ids
     * coinciden con los identificadores del array en la lista
     *
     * @param lista de Pago en las que buscar
     * @param ids array de ids de Pago
     * @return ArrayList<code>Pago</code>
     */
    public static ArrayList<Pago> arrayde(ArrayList<Pago> lista, int[] ids) {
        ArrayList<Pago> ret = new ArrayList<Pago>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Pago) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }

    /**
     * *
     * Función que convierte un array de objetos Pago en un ArrayList de objetos
     * Pago con los mismos elementos que el array.
     *
     * @param array de Pago
     * @return ArrayList de Pago
     */
    public static final ArrayList<Pago> convertir(Pago[] array) {
        ArrayList<Pago> ret = new ArrayList<Pago>();
        for (Pago i : array) {
            ret.add((Pago) i);
        }
        return ret;
    }

}
