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
       new Intervencion (49, ) // medir en minutos (reflejarlo en la tabla) preguntar por los ARRAYLIST
       
   };
        public static final int numIntervencion = INTERVENCIONES.length;
        
   public static final InformeGlobal INFORMES [] = {
        
       new InformeGlobal (3333,"patatín y patatán") //ArrayList
       
   };
}
