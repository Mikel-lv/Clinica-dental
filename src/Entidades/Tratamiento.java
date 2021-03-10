/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Tratamiento {
    private long id; //Validos >0, Invalidos <0, Valor unico irrepetible
    private String nombre_descriptivo; //<=40 caracteres alfanumericos
    private Date fecha_inicio;
    private boolean consentimiento; //Validos : S,s, N,n, Invalidos Cualquier otro carácter !=S, s, N, s 
    private Cobro cobro; // Objeto de tipo cobro
    private InformeGlobal informeGlobal; // Objeto de tipo informeglobal
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

    public Tratamiento(long id, String nombre_descriptivo, Date fecha_inicio, boolean consentimiento, Cobro cobro, InformeGlobal informeGlobal, ArrayList<Cita> citas) {
        this.id = id;
        this.nombre_descriptivo = nombre_descriptivo;
        this.fecha_inicio = fecha_inicio;
        this.consentimiento = consentimiento;
        this.cobro = cobro;
        this.informeGlobal = informeGlobal;
        this.citas = citas;
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

    @Override
    public String toString() {
        return "Tratamiento{" + "id=" + id + ", nombre_descriptivo=" + nombre_descriptivo + ", fecha_inicio=" + fecha_inicio + ", consentimiento=" + consentimiento + ", cobro=" + cobro + ", informeGlobal=" + informeGlobal + ", citas=" + citas + '}';
    }
    
      public static final ArrayList<Tratamiento> convertir(Tratamiento[] array) {
        ArrayList<Tratamiento> ret = new ArrayList<Tratamiento>();
        for (Tratamiento i : array) {
            ret.add((Tratamiento) i);
        }
        return ret;
    }
     
    
     /**
     * Función que se le pasa una lista ArrayList<code>Tratamiento</code> y un
     * array de identificadores, y devuelve una sublista con los Tratamientos cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Tratamientos en las que buscar
     * @param ids array de ids de alergias
     * @return ArrayList<code>Tratamiento</code>
     */
    public static ArrayList<Tratamiento> arrayde(ArrayList<Tratamiento> lista, int[] ids) {
        ArrayList<Tratamiento> ret = new ArrayList<Tratamiento>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Tratamiento) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }
    
    
    
    
        public static Tratamiento nuevoTratamiento(){
        Tratamiento nuevoTratamiento = new Tratamiento();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el ID");
        nuevoTratamiento.setId(in.nextInt());
        System.out.println("Introduce el nombre descriptivo");
        nuevoTratamiento.setNombre_descriptivo(in.nextLine());
//        System.out.println("Introduce la fecha");   
//        nuevoTratamiento.setFecha_inicio(in.ne));
        System.out.println("¿Da su consentimiento?");
        nuevoTratamiento.setConsentimiento(in.nextBoolean());
        return nuevoTratamiento;
        
        }
}