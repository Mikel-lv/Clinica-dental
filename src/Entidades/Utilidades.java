/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author punib
 */
public class Utilidades {
   private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
       
       
    
    public static final Cobro COBROS [] = {
        new Cobro (001, 110, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter))),
        new Cobro (015, 300, Date.valueOf(LocalDate.parse("04/01/2021", dateFormatter))),
        new Cobro (033, 250.500, Date.valueOf(LocalDate.parse("10/01/2021", dateFormatter))),
    };
    
    
        public static final int numCobro = COBROS.length;
        
    
    public static final Pago PAGOS [] = {
        
        new Pago (002, Date.valueOf(LocalDate.parse("23/12/2020", dateFormatter)), 160, "tarjeta", COBROS[0]),
        new Pago (022, Date.valueOf(LocalDate.parse("27/12/2020", dateFormatter)), 70, "metálico", COBROS[0]),
        new Pago (030, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 57.99, "transferencia", COBROS[0]), // preguntar a Luis
        
    };
    
         public static final int numPago = PAGOS.length;
         
         
   public static final Intervencion INTERVENCIONES [] = {
       //new Intervencion (49, ) // medir en minutos (reflejarlo en la tabla) preguntar por los ARRAYLIST
       
   };
        public static final int numIntervencion = INTERVENCIONES.length;
        
   public static final InformeGlobal INFORMES [] = {
        
       //new InformeGlobal (3333,"patatín y patatán") //ArrayList
       
   };
   
   public static final Empleado EMPLEADOS [] = {
    
       new Empleado (01,"Manolo","Garcia","649678821","72598327C","C/Menendez Pelayo"),
       new Empleado (02,"Carlos","Martinez","649673821","72598327N","C/Venancio Bosco"),
       new Empleado (03,"David","Lopez","659678821","73598327C","C/Bajada el Chorrillo")
       
   };
        public static final int Empleado = EMPLEADOS.length;
    
    public static final Enfermeria ENFERMERIA [] = {
    
      new Enfermeria ('A',01,"Laura","Martinez","640798854","72208764J","C/Menendez Pelayo"),
      new Enfermeria ('B',02,"Martin","Morales","640758854","722087321A","C/Bajada el Chorrillo"),
      new Enfermeria ('C',03,"Maria","Lopez","620798854","62208764N","C/Menendez Pelayo"),
       
   };
        public static final int Enfermeria = ENFERMERIA.length;
        
    public static final Cirujano CIRUJANOS [] = {
    
      //new Cirujano (ArrayList,01,"Elsa","Patico","640758854","72208724J","C/Menendez Pelayo"),
      //new Cirujano (ArrayList,02,"Ana","Rosa","640218854","725687321A","C/San Ignacio"),
      //new Cirujano (ArrayList,03,"Aaron","Garcia","620928854","73208764N","Barrio Los Marineros"),
       
   };
     public static final int Cirujano = CIRUJANOS.length;
   
      public static final Secretariado SECRETARIADO [] = {
    
      //new Secretariado (2,ArrayList,01,"Elsa","Pataco","640758214","72205524J","C/Menendez Pelayo"),
      //new Secretariado (5,ArrayList,02,"Marcos","Rosa","640412854","725227321A","C/San Ignacio"),
      //new Secretariado (8,ArrayList,03,"Aaron","Lopez","620928854","73208764N","Barrio Los Marineros"),
       
   };
      public static final int Secretariado = SECRETARIADO.length;
      
      
      
      public static final Revision REVISIONES [] = {
//          new Revision ("todo correcto", CIRUJANOS [0], 5, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADO [0]),   NO SABEMOS PONER LA HORA
//          new Revision ("muerto", CIRUJANOS [0], 4, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'T', HORA, SECRETARIADO [0]),
//          new Revision ("reparar aparato", CIRUJANOS [0], 1, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADO [0])
      }; 
      public static final int Revision = REVISIONES.length;
      
      
      
      
      public static final Cita CITAS [] = {
//          new Cita (3, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'T', HORA, SECRETARIADO [0], Arraylist medicamento)
//          new Cita (2, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADO [0], Arraylist medicamento)
//          new Cita (7, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADO [0], Arraylist medicamento)
      };
      public static final int Cita = CITAS.length;
      
      
      
      public static final Tratamiento TRATAMIENTOS [] = {
//          new Tratamiento (3, "dolor de muela", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), Y, COBROS [0], INFORMES [0], Arraylist cita)
//          new Tratamiento (8, "empaste", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), Y, COBROS [0], INFORMES [0], Arraylist cita)
//          new Tratamiento (1, "extraccion", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), N, COBROS [0], INFORMES [0], Arraylist cita)
      };
      public static final int Tratmamiento = TRATAMIENTOS.length;
      
      
      
      
      public static final Paciente PACIENTES [] = {
//          new Paciente (3, "Juan", "Gonzalez", "Calle santander 23 1ºB", "75926351K", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
//          new Paciente (6, "Paula", "Univaso", "Calle la rona 2 5ºC", "47523767P", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
//          new Paciente (2, "Pedro", "Martin", "Calle santander 23 1ºB", "24572357D", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
      };
      public static final int Paciente = PACIENTES.length;
      
      
        public static final Historial HISTORIALES [] = {
//          new Historial (2, "AAAAAAA", Arraylist Alergia),
//          new Historial (66, "BBBBBBB", Arraylist Alergia),
//          new Historial (22458, "CCCCCC", Arraylist Alergia),
      };
      public static final int Historial = HISTORIALES.length;
      
        public static final Alergia ALERGIAS [] = {
//          new Historial (77, "AAAAAAA","Medicamento", Arraylist Historial),
//          new Historial (69, "BBBBBBB","Medicamento", Arraylist Historial),
//          new Historial (885857, "CCCCCC","Medicamento", Arraylist Historial),
      };
      public static final int Alergia = ALERGIAS.length;
      
          public static final Medicamento MEDICAMENTOS [] = {
//          new Historial (611, "AAAAAAA","Principioactivo",1, Arraylist Cita),
//          new Historial (888, "BBBBBBB","Principioactivo",3, Arraylist Cita),
//          new Historial (8857, "CCCCCC","Principioactivo",2, Arraylist Cita),
      };
      public static final int Medicamento = MEDICAMENTOS.length;
      
          public static final Especialidad ESPECIALIDADES [] = {
//          new Historial (11, "AAAAAAA", Arraylist Cirujano),
//          new Historial (8, "BBBBBBB", Arraylist Cirujano),
//          new Historial (57, "CCCCCC", Arraylist Cirujano),
      };
      public static final int Especialidad = ESPECIALIDADES.length;
      }