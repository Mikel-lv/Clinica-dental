/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dental;

import DAO.EmpleadoDAO;
import Entidades.*;
import ConexionBD.ConexionBD;
import java.sql.Connection;
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
                    mostrarMenuGestionCitas();
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
                     Paciente.buscarPacientes();
                    
                    break;
                case 4:
                    //  Paciente.verHistorial();
                    System.out.println("Ha pulsado buscar historial de paciente.");
                    //Paciente.historialPacientes();
                    
                    break;

            }

        } while (opcion < 0 || opcion > 4);

    }

    private static void mostrarMenuGestionEmpleados() {
        System.out.println("Pulsa 1 para ver empleados.");
        System.out.println("Pulsa 2 para buscar empleado.");
        System.out.println("Pulsa 3 para eliminar un empleado.");
        System.out.println("Pulsa 4 para crear nuevo empleado.");
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
        EmpleadoDAO EmpleadoDAO = new EmpleadoDAO();
        switch (opcion) {
            case 0: 
                System.out.println("Ha salido del menú");
                break;
            case 1:
                System.out.println("Ha pulsado ver datos de empleados.");
                System.out.println(EmpleadoDAO.verEmpleados());    
                break;
            case 2:
                System.out.println("Ha pulsado buscar empleados.");
                Empleado.buscarEmpleados(empleados);
                break;
            case 3:
                System.out.println("Ha pulsado eliminar un empleado.");
                in = new Scanner(System.in, "ISO-8859-1");
                idEmpleado = in.nextInt();
                EmpleadoDAO.eliminarEmpleado(idEmpleado);
                break;
            case 4:
                System.out.println("Ha pulsado crear un nuevo empleado.");
                int opcion2 = -1;
                in = new Scanner(System.in, "ISO-8859-1");
                do {
                    System.out.println("Pulse 1 para nuevo secretario/a.");
                    System.out.println("Pulse 2 para nuevo enfermero/a.");
                    System.out.println("Pulse 3 para nuevo cirujano/a.");
                    System.out.println("Pulse 0 para salir del menu.");
                    opcion2 = in.nextInt();
                    if (opcion2 < 0 || opcion2 > 3) {
                        System.out.println("Opción incorrecta.");
                        continue;
                    }
                    switch (opcion2) {
                        case 0:
                            System.out.println("Ha salido del menú");
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
        System.out.println("Pulsa 1 para ver citas.");
        System.out.println("Pulsa 2 para crear una nueva cita.");
        System.out.println("Pulsa 3 para buscar cita.");
        System.out.println("Pulsa 0 para salir del menu.");
        
        int num = -1;
        Scanner in = new Scanner (System.in);
        do {

            num = in.nextInt();
            if (num < 0 || num > 3) {
                System.out.println("\n Opcion incorrecta \n");
                continue;
            }
            switch (num) {
                case 0:
                    continue;
                case 1:
                    //  Cita.verCita();
                    System.out.println("Mostrando citas.");
                    for (int x=0; x<Utilidades.numCitas; x++) {
                    System.out.println(Utilidades.CITAS[x]);
                    }
                    
                    
                    break;
                case 2:
                    Cita.nuevaCita();
                    break;
                case 3:
                    //  Cita.buscarCita();
                   
                     System.out.println("Ha pulsado buscar cita.");
                    
                     Cita.buscarCita(Cita.convertir(Utilidades.CITAS));
                    
                    break;
            }

        } while (num < 0 || num > 3);
   }
}
