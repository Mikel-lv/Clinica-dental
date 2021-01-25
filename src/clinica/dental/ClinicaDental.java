/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dental;

import Entidades.*;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class ClinicaDental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          

        int opcion = -1;
        Scanner in = new Scanner(System.in);
        
        do {
            mostrarMenuPrincipal();
            opcion = in.nextInt();
        if (opcion <0 || opcion >3) {
            System.out.println("\n Opcion incorrecta \n");
            continue;
        }
        
        switch(opcion){
             case 0: 
                continue; 
             case 1: mostrarMenuGestionPaciente ();
                break;
            case 2:
                break;
            case 3: 
                break;
            
        }
        
        }
        
        while (opcion <0 || opcion >3);
      
                
    }
     private static void mostrarMenuPrincipal() {
            System.out.println("Pulsa 1 para la Gestion de pacientes.");
            System.out.println("Pulsa 2 para la Gestion de empleados.");
            System.out.println("Pulsa 3 para la Gestion de citas.");
            System.out.println("Pulsa 0 para salir del menu.");
        }
     
     private static void mostrarMenuGestionPaciente(){
            System.out.println("Pulsa 1 para ver pacientes.");
            System.out.println("Pulsa 2 para crear nuevo paciente.");
            System.out.println("Pulsa 3 para buscar pacientes.");
            System.out.println("Pulsa 4 para acceder al historial de un paciente.");
            System.out.println("Pulsa 0 para salir del menu.");
             
            int opcion = -1;
        Scanner in = new Scanner(System.in);
        
        do {
            
            opcion = in.nextInt();
        if (opcion <0 || opcion >4) {
            System.out.println("\n Opcion incorrecta \n");
            continue;
        }
        
        switch(opcion){
             case 0: 
                continue; 
             case 1: Paciente.verPacientes ();
                break;
             case 2: Paciente.nuevoPaciente();
                break;
             case 3: Paciente.buscarPaciente ();
                break;
             case 4: Paciente.verHistorial ();
                break;
            
        }
        
        }
        
        while (opcion <0 || opcion >4);
        
        }
     
     
     
     private static void mostrarMenuGestionEmpleados (){
            
        }
     
     
     private static void mostrarMenuGestionCitas (){
            
        }
}
