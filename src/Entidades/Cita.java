/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
/**
 *
 * @author Mikel
 */
public class Cita {
    protected long id;
    protected Date fecha;
    protected char rango_horario;
    protected Time hora;
    protected Secretariado secretariado;
    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    
    
    
    
    
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
    
    
    
}
