/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import Entidades.Utilidades.Fecha;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Mikel
 */
public class Cita {
    protected long id; //Validos >0, Invalidos <0, Valor unico irrepetible
    protected Date fecha;
    protected char rango_horario; //Validos : M, m, T, t, Invalidos Cualquier otro carácter !=M, m, t, t.
    protected Time hora;
    protected Secretariado secretariado;
    protected ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    
    
    public Cita() {
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    
          
    
    public Secretariado getSecretariado() {
        return secretariado;
    }

    public void setSecretariado(Secretariado secretariado) {
        this.secretariado = secretariado;
    }

    
    
    
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getRango_horario() {
        return rango_horario;
    }

    public void setRango_horario(char rango_horario) {
        this.rango_horario = rango_horario;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    
    
    public Cita(Cita c){
    this.id = c.id;
    this.fecha = c.fecha;
    this.rango_horario = c.rango_horario;
    this.hora = c.hora;
    this.secretariado = c.secretariado;
    this.medicamentos = c.medicamentos;
    }
    
    public Cita(long id, Date fecha, char rango_horario, Time hora, Secretariado secretariado) {
        this.id = id;
        this.fecha = fecha;
        this.rango_horario = rango_horario;
        this.hora = hora;
        this.secretariado = secretariado;
    }
    
    public Cita(long id, Date fecha, char rango_horario, Time hora, Secretariado secretariado, ArrayList<Medicamento> Medicamentos) {
        this.id = id;
        this.fecha = fecha;
        this.rango_horario = rango_horario;
        this.hora = hora;
        this.secretariado = secretariado;
        this.medicamentos = medicamentos;
    }

    
    
    
    @Override
    public String toString() {
        return "Cita{" + "id=" + id + ", fecha=" + fecha + ", rango_horario=" + rango_horario + ", hora=" + hora + ", secretariado=" + secretariado + ", medicamentos=" + medicamentos + '}';
    }
    
    
    
    
    
        public static Cita nuevaCita(){
        Cita nuevaCita = new Cita();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el ID");
        nuevaCita.setId(in.nextInt());
//        System.out.println("Introduce la fecha");
//        nuevaCita.setFecha(in.nextLine());
        

        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        Fecha date = Utilidades.Fecha.nuevaFecha();
        nuevaCita.setFecha(date.conversorFecha());
              
        
        System.out.println("Introduce el rango horario");
        char rango = in.nextLine().charAt(0);
        //Validacion//        
        nuevaCita.setRango_horario(rango);
        
        
               
        System.out.println("Introduzca Hora y minutos en formato HH:mm"); 
        String HoraMinutos = in.next();

        String[] HoraMinArray = HoraMinutos.split(":");

        //Obtiene los valores enteros.
        int valorHora = Integer.parseInt(HoraMinArray[0]); //Hora
        int valorMinutos = Integer.parseInt(HoraMinArray[1]); // Minutos.

        System.out.println("Hora: " + valorHora);
        System.out.println("Minutos: " + valorMinutos);
        
        
        
        
        
        
//        System.out.println("Introduce la hora");
//        nuevaCita.setHora(in.nextTime());





        return nuevaCita;
    }
    
        //Funcion para ver citas//
        public static ArrayList<Cita> verCita(ArrayList<Cita> Citas){
        ArrayList<Cita> ret  = new ArrayList<Cita>();
        for (int x = 0;  x < Utilidades.numCitas; x++){
        Citas = cita.get(x);    
            System.out.println (ArrayList);
        }  
        return ret;
        }
        
        
        // funcion para buscar cita por fecha, saldran todas las citas con la fecha introducida//
        public static Cita buscarCita(Date fechacita, ArrayList<Cita> citas) {
        Cita ret = null;
        Scanner in = new Scanner (System.in);
        System.out.println("Introduce la fecha");
        Cita.setFecha(in.nextDate());
        for (Cita c : citas) {
            if (c.getFecha()== fechacita) {
                ret = c;
                break;
            }
        }
        return ret;
    }
        
           public static final ArrayList<Cita> convertir(Cita[] array) {
        ArrayList<Cita> ret = new ArrayList<Cita>();
        for (Cita i : array) {
            ret.add((Cita) i);
        }
        return ret;
    }
     
    
     /**
     * Función que se le pasa una lista ArrayList<code>Cita</code> y un
     * array de identificadores, y devuelve una sublista con las Citas cuyos
     * ids coinciden con los identificadores del array en la lista
     *
     * @param lista de Tratamientos en las que buscar
     * @param ids array de ids de Cita
     * @return ArrayList<code>Cita</code>
     */
    public static ArrayList<Cita> arrayde(ArrayList<Cita> lista, int[] ids) {
        ArrayList<Cita> ret = new ArrayList<Cita>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(j).getId() == ids[i]) {
                    ret.add((Cita) lista.get(j));
                    break;
                }
            }
        }
        return ret;
    }
    }
        
