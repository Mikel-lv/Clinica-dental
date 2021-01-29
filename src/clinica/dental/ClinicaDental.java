/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dental;

import Entidades.*;
import java.util.ArrayList;
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
        
         ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        int opcion = -1, opcion2 = -1;
        Scanner in = new Scanner(System.in);

        do {
            mostrarMenuPrincipal();
            in = new Scanner(System.in, "ISO-8859-1");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > 3) {
                System.out.println("\n Opcion incorrecta \n");
                continue;
            }

            switch (opcion) {
                case 0:
                    continue;
                case 1:
                    mostrarMenuGestionPaciente();
                    break;
                case 2:
                    mostrarMenuGestionEmpleados();
                    in = new Scanner(System.in, "ISO-8859-1");
                    opcion2 = in.nextInt();
                    if (opcion2 < 0 || opcion2 > 3) {
                            System.out.println("Opción incorrecta");
                            continue;
                        }
                    gestionEmpleados (opcion2, empleados);
                    break;
                case 3:
                    break;

            }

        } while (opcion < 0 || opcion > 3);

    }

    private static void mostrarMenuPrincipal() {
        System.out.println("Pulsa 1 para la Gestion de pacientes.");
        System.out.println("Pulsa 2 para la Gestion de empleados.");
        System.out.println("Pulsa 3 para la Gestion de citas.");
        System.out.println("Pulsa 0 para salir del menu.");
    }

    private static void mostrarMenuGestionPaciente() {
        System.out.println("Pulsa 1 para ver pacientes.");
        System.out.println("Pulsa 2 para crear nuevo paciente.");
        System.out.println("Pulsa 3 para buscar pacientes.");
        System.out.println("Pulsa 4 para acceder al historial de un paciente.");
        System.out.println("Pulsa 0 para salir del menu.");

        int opcion = -1;
        Scanner in = new Scanner(System.in);

        do {

            opcion = in.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("\n Opcion incorrecta \n");
                continue;
            }

            switch (opcion) {
                case 0:
                    continue;
                case 1:
                    //  Paciente.verPacientes();
                    System.out.println("Ha pulsado ver pacientes.");
                    for (int x=0; x<Utilidades.numPacientes; x++) {
                    System.out.println(Utilidades.PACIENTES[x]);
                    }
                    
                    
                    break;
                case 2:
                    Paciente.nuevoPaciente();
                    break;
                case 3:
                    //  Paciente.buscarPaciente();
                   
                     System.out.println("Ha pulsado buscar paciente.");
     //                Paciente.buscarPacientes(pacientes);
                    
                    break;
                case 4:
                    //  Paciente.verHistorial();
                    System.out.println("Ha pulsado buscar historial de paciente.");
      //              Paciente.historialPacientes(pacientes);
                    
                    break;

            }

        } while (opcion < 0 || opcion > 4);

    }

    private static void mostrarMenuGestionEmpleados() {
        System.out.println("Pulsa 1 para ver empleados.");
        System.out.println("Pulsa 2 para buscar empleado.");
        System.out.println("Pulsa 3 para crear nuevo empleado.");
        System.out.println("Pulsa 0 para salir del menu.");
        
       /** int opcion = -1;
        Scanner in = new Scanner(System.in);
        do {

            opcion = in.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("\n Opcion incorrecta \n");
                continue;
            }

            switch (opcion) {
                case 0:
                    continue;
                case 1:
                    //  Paciente.verPacientes();
                    break;
                case 2:
                    Paciente.nuevoPaciente();
                    break;
                case 3:
                    //  Paciente.buscarPaciente();
                    break;
                case 4:
                    //  Paciente.verHistorial();
                    break;

            }

        } while (opcion < 0 || opcion > 4);*/

    }



private static void gestionEmpleados(int opcion, ArrayList<Empleado> empleados) {
        Scanner in;
        int idEmpleado;
        Empleado e;
        switch (opcion) {
            case 0: 
                mostrarMenuPrincipal();                
                break;
            case 1:
                System.out.println("Ha pulsado ver datos de empleados.");
                Empleado.verEmpleado();
                break;
            case 2:
                System.out.println("Ha pulsado buscar empleados.");
                Empleado.buscarEmpleados(empleados);
                break;
            case 3:
                System.out.println("Ha pulsado crear un nuevo empleado.");
                int opcion2 = -1;
                in = new Scanner(System.in, "ISO-8859-1");
                do {
                    System.out.println("Pulse 1 para nuevo secretario/a.");
                    System.out.println("Pulse 2 para nuevo enfermero/a.");
                    System.out.println("Pulse 3 para nuevo cirujano/a.");
                    System.out.println("Pulse 0 para VOLVER.");
                    opcion2 = in.nextInt();
                    if (opcion2 < 0 || opcion2 > 3) {
                        System.out.println("Opción incorrecta.");
                        continue;
                    }
                    switch (opcion2) {
                        case 0:
                            break;
                        case 1:
                            Secretariado nuevoSecretariado = Secretariado.nuevoSecretariado();
                            empleados.add(nuevoSecretariado);
                            System.out.println("Secretario/a creado correctamente con id=" + nuevoSecretariado.getId());
                            break;
                        case 2:
                            Enfermeria nuevoEnfermeria = Enfermeria.nuevoEnfermeria();
                            empleados.add(nuevoEnfermeria);
                            System.out.println("Enfermero/a creado correctamente con id=" + nuevoEnfermeria.getId());
                            break;
                        case 3:
                            Cirujano nuevoCirujano = Cirujano.nuevoCirujano();
                            empleados.add(nuevoCirujano);
                            System.out.println("Cirujano/a creado correctamente con id=" + nuevoCirujano.getId());
                            break;
                        
                    }
                } while (opcion2 != 0);
                break;
           
                        }
    }

    private static void mostrarMenuGestionCitas() {

    }
}
