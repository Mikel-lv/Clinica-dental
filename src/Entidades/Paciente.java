/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mikel
 */
public class Paciente {
    private long id; //Validos >0, Invalidos <0, Valor unico irrepetible
    private String nombre; //Valido <= 15 caracteres alfanumericos, invalido " "
    private String apellidos;//Valido <= 20 caracteres alfanumericos, invalido " "
    private String direccion; //Valido <= 40 caracteres alfanumericos, invalido " "
    private String DNI; // 8 caracteristicas y 1 letra
    private ArrayList<Tratamiento> tratamientos = new ArrayList<Tratamiento>();
    private ArrayList<Cita> citas = new ArrayList<Cita>();
    private Historial historial; // Objeto de tipo historial
    
    
    
    
    public Paciente() {
    }

    
    
    public Paciente(Paciente p){
    this.id = p.id;
    this.nombre = p.nombre;
    this.apellidos = p.apellidos;
    this.direccion = p.direccion;
    this.DNI = p.DNI;
    this.tratamientos = p.tratamientos;
    this.citas = p.citas;
    this.historial = p.historial;
    }

    public Paciente(long id, String nombre, String apellidos, String direccion, String DNI, Historial historial, ArrayList<Cita> citas, ArrayList<Tratamiento> tratamiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.DNI = DNI;
        this.historial = historial;
        this.citas = citas;
        this.tratamientos = tratamientos;
    }
   
    public Paciente(long id, String nombre, String apellido, String DNI,  String direccion, ArrayList<Tratamiento> tratamientos, ArrayList<Cita> citas, Historial historial){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.DNI = DNI;
        this.direccion = direccion;
        this.tratamientos = tratamientos;
        this.citas = citas;
        this.historial = historial;
    }
    
    
    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    
    
    public ArrayList<Tratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(ArrayList<Tratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

       
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", DNI=" + DNI + ", tratamientos=" + tratamientos + ", citas=" + citas + ", historial=" + historial + '}';
    }
    
    public static final ArrayList<Paciente> convertir(Paciente[] array) {
        ArrayList<Paciente> ret = new ArrayList<Paciente>();
        for (Paciente i : array) {
            ret.add((Paciente) i);
        }
        return ret;
    }
    
    
    public static Paciente nuevoPaciente(){
        Paciente nuevoPaciente = new Paciente();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el ID");
        nuevoPaciente.setId(in.nextInt());
        System.out.println("Introduce el nombre");
        nuevoPaciente.setNombre(in.nextLine());
        System.out.println("Introduce el apellido");
        nuevoPaciente.setApellidos(in.nextLine());
        System.out.println("Introduce la direccion");
        nuevoPaciente.setDireccion(in.nextLine());
        System.out.println("Introduce el DNI");
        nuevoPaciente.setDNI(in.nextLine());
//        System.out.println("Introduce el historial");     Nose que ni que poner
//        nuevoPaciente.setHistorial(in.nextLine());
        return nuevoPaciente;
    }
    
    
    
    
    
    //Lo he intentado atm: Sebastián :_(
//    
//        public static void historialPacientes(ArrayList<Paciente> pacientes) {
//        Paciente buscado;
//        ArrayList<Paciente> encontrados;
//        Scanner in;
//        int opcion = -1;
//        do {
//            buscado = null;
//            encontrados = new ArrayList<Paciente>();
//            in = new Scanner(System.in, "ISO-8859-1");
//            System.out.println("Pulse 1 para buscar por Id:");
//            System.out.println("Pulse 2 para buscar por nombre:");
//            System.out.println("Pulse 3 para buscar por apellidos:");
//            System.out.println("Pulse 4 para buscar por DNI:");
//            System.out.println("Pulse 0 para VOLVER.");
//            opcion = in.nextInt();
//            if (opcion < 0 || opcion > 4) {
//                System.out.println("Opción incorrecta.");
//                continue;
//            }
//            in = new Scanner(System.in, "ISO-8859-1");
//            switch (opcion) {
//                case 0:
//                    break;
//                case 1:
//                    System.out.println("Introduzca el Id del paciente:");
//                    int idPac = in.nextInt();
//                    buscado = Paciente.buscarPacientePorId(idPac, pacientes);
//                    if (buscado != null) {
//                        System.out.print("Paciente encontrado: ");
//                        System.out.println(buscado.getHistorial());
//                    } else {
//                        System.out.println("Paciente con id=" + idPac + " NO ENCONTRADO.");
//                    }
//                    break;
//                case 2:
//                    System.out.println("Introduzca el nombre del paciente:");
//                    String nomPac = in.nextLine();
//                    encontrados = Paciente.buscarPacientePorNombre(nomPac, pacientes);
//                    if (encontrados.size() > 0) {
//                        System.out.println("Hay coincidencias: ");
//                        for (Paciente e : encontrados) {
//                            System.out.println(e.getHistorial());
//                        }
//                    } else {
//                        System.out.println("Paciente con nombre=" + nomPac + " NO ENCONTRADO.");
//                    }
//                    System.out.println("");
//                    break;
//
//                case 3:
//                    System.out.println("Introduzca el apellido del paciente:");
//                    String apellPac = in.nextLine();
//                    encontrados = Paciente.buscarPacientePorApellido(apellPac, pacientes);
//                    if (encontrados.size() > 0) {
//                        System.out.println("Hay coincidencias: ");
//                        for (Paciente e : encontrados) {
//                            System.out.println(e.getHistorial());
//                        }
//                    } else {
//                        System.out.println("Paciente con apellido=" + apellPac + " NO ENCONTRADO.");
//                    }
//                    System.out.println("");
//                    break;
//
//                case 4:
//                    System.out.println("Introduzca el DNI del paciente:");
//                    String dniPac = in.nextLine();
//                    encontrados = Paciente.buscarPacientePorDNI(dniPac, pacientes);
//                    if (encontrados.size() > 0) {
//                        System.out.println("Hay coincidencias: ");
//                        for (Paciente e : encontrados) {
//                            System.out.println(e.getHistorial());
//                        }
//                    } else {
//                        System.out.println("Paciente con DNI=" + dniPac + " NO ENCONTRADO.");
//                    }
//                    System.out.println("");
//                    break;
//
//                default:
//                    break;
//            }
//        } while (opcion != 0);
//
//    }

    public static Paciente buscarPacientePorId(int idPaciente) {
        Paciente ret = null;
        for (Paciente e : Paciente.convertir(Utilidades.PACIENTES)) {
            if (e.getId() == idPaciente) {
                ret = e;
                break;
            }
        }
        return ret;
    }

    public static ArrayList<Paciente> buscarPacientePorNombre(String nomPaciente) {
        ArrayList<Paciente> ret = new ArrayList<Paciente>();
        for (Paciente e : Paciente.convertir(Utilidades.PACIENTES)) {
            if (Utilidades.removeDiacriticalMarks(e.getNombre().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(nomPaciente.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getNombre().toLowerCase().contains(nomPaciente.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }

    public static ArrayList<Paciente> buscarPacientePorApellido(String apellPaciente) {
        ArrayList<Paciente> ret = new ArrayList<Paciente>();
        for (Paciente e : Paciente.convertir(Utilidades.PACIENTES)) {
            if (Utilidades.removeDiacriticalMarks(e.getApellidos().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(apellPaciente.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getApellidos().toLowerCase().contains(apellPaciente.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }

    public static ArrayList<Paciente> buscarPacientePorDNI(String dniPaciente) {
        ArrayList<Paciente> ret = new ArrayList<Paciente>();
        for (Paciente e : Paciente.convertir(Utilidades.PACIENTES)) {
            if (Utilidades.removeDiacriticalMarks(e.getDNI().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(dniPaciente.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getDNI().toLowerCase().contains(dniPaciente.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }
    
    
    
    
    
    
    
    
     public static void buscarPacientes() {
        Paciente buscado;
        ArrayList<Paciente> encontrados;
        Scanner in;
        int opcion = -1;
        do {
            buscado = null;
            encontrados = new ArrayList<Paciente>();
            in = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Pulse 1 para buscar por Id:");
            System.out.println("Pulse 2 para buscar por nombre:");
            System.out.println("Pulse 3 para buscar por apellidos:");
            System.out.println("Pulse 4 para buscar por DNI:");
            System.out.println("Pulse 0 para VOLVER.");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción incorrecta.");
                continue;
            }
            in = new Scanner(System.in, "ISO-8859-1");
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduzca el Id del paciente:");
                    int idPac = in.nextInt();
                    buscado = Paciente.buscarPacientePorId(idPac);
                    if (buscado != null) {
                        System.out.print("Paciente encontrado: ");
                        System.out.println(buscado.getId() + ". " + buscado.getNombre()+ " (" + buscado.getApellidos() + ")" + buscado.getDireccion() + buscado.getHistorial() + buscado.getClass().getSimpleName());
                    } else {
                        System.out.println("Paciente con id=" + idPac + " NO ENCONTRADO.");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del paciente:");
                    String nomPac = in.nextLine();
                    encontrados = Paciente.buscarPacientePorNombre(nomPac);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Paciente e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")" + e.getDireccion() + e.getHistorial() + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Paciente con nombre=" + nomPac + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Introduzca el apellido del paciente:");
                    String apellPac = in.nextLine();
                    encontrados = Paciente.buscarPacientePorApellido(apellPac);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Paciente e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")"  + e.getDireccion() + e.getHistorial() + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Paciente con apellido=" + apellPac + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Introduzca el DNI del paciente:");
                    String dniPac = in.nextLine();
                    encontrados = Paciente.buscarPacientePorDNI(dniPac);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Paciente e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")"  + e.getDireccion() + e.getHistorial() + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Paciente con DNI=" + dniPac + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);

    }

}

