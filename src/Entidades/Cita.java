/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.sql.Date;
import java.sql.Time;
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
//        System.out.println("Introduce el ID");
//        nuevaCita.setId(in.nextInt());
//        System.out.println("Introduce la fecha");
//        nuevaCita.setFecha(in.nextLine());
//        System.out.println("Introduce el rango horario");
//        nuevaCita.setRango_horario(in.nextLine().charAt(0));
//        System.out.println("Introduce la hora");
//        nuevaCita.setHora(in.nextTime());
        return nuevaCita;
    }
    
    
}
