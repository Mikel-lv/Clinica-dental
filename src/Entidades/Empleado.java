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
 * @author AGuadix
 */
public class Empleado {

    

    protected long id; // <0 y ha de ser único
    protected String nombre; // Máximo 20 caracteres alfanuméricos
    protected String apellidos; // Máximo 20 caracteres alfanuméricos
    protected String tlfcontacto; // 9 caracteres numéricos
    protected String NIF; // 8 caracteres numéricos y 1 letra
    protected String direccion; // Máximo 30 caracteres alfanuméricos

    //Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(Utilidades.validarId(id)){
        this.id = id;}
        else{
            System.out.println("ID inválido!");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(Utilidades.validarNombre(nombre)){
        this.nombre = nombre;}
        else{
            System.out.println("Nombre inválido");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if(Utilidades.validarApellido(apellidos)){
        this.apellidos = apellidos;}
        else{
            System.out.println("Apellidos inválidos!");
        }
    }

    public String getTlfcontacto() {
        return tlfcontacto;
    }

    public void setTlfcontacto(String tlfcontacto) {
        if(Utilidades.validaTlfn(tlfcontacto)){
        this.tlfcontacto = tlfcontacto;}
        else{
            System.out.println("Teléfono inválido");
        }
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //Constructor por defecto
    public Empleado() {
    }

    //Constructor con todos los atributos
    public Empleado(long id, String nombre, String apellidos, String tlfcontacto, String NIF, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tlfcontacto = tlfcontacto;
        this.NIF = NIF;
        this.direccion = direccion;
    }

    //Constructor de copia
    public Empleado(Empleado e) {
        this.id = e.id;
        this.nombre = e.nombre;
        this.apellidos = e.apellidos;
        this.tlfcontacto = e.tlfcontacto;
        this.NIF = e.NIF;
        this.direccion = e.direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", tlfcontacto=" + tlfcontacto + ", NIF=" + NIF + ", direccion=" + direccion + '}' + "\n";
    }

    public static Empleado nuevoEmpleado() {
        Empleado nuevoEmpleado = new Empleado();
        Scanner in = new Scanner(System.in);
        long idEmpleado = 0;
        do{
        System.out.println("Introduce el ID");
        idEmpleado = in.nextInt();
        if(!Utilidades.validarId(idEmpleado)){
            System.out.println("Has introducido un id inválido");
        }
        nuevoEmpleado.setId(idEmpleado);}
        while(!Utilidades.validarId(idEmpleado));
        in.nextLine();
        String nombre = "";
        do{
        System.out.println("Introduce el nombre");
        nombre = in.nextLine();
        if(!Utilidades.validarNombre(nombre)){
            System.out.println("Has instroducido un nombre inválido");
        }
        nuevoEmpleado.setNombre(nombre);}
        while(!Utilidades.validarNombre(nombre));
        String apellido = "";
        do{
        System.out.println("Introduce el apellido");
        apellido = in.nextLine();
        if(!Utilidades.validarApellido(apellido)){
            System.out.println("Has introducido un apellido inválido");
        }
        nuevoEmpleado.setApellidos(apellido);
        }
        while(!Utilidades.validarApellido(apellido));
        
        String telefono = "";
        do{
         System.out.println("Introduce el telefono de contacto");
         telefono = in.nextLine();
         if(!Utilidades.validaTlfn(telefono)){
             System.out.println("Has introducido un telefono inválido");
         }
          nuevoEmpleado.setTlfcontacto(telefono);
        }
        while(!Utilidades.validaTlfn(telefono));
        System.out.println("Introduce el NIF");
        nuevoEmpleado.setNIF(in.nextLine());
        System.out.println("Introduce la direccion");
        nuevoEmpleado.setDireccion(in.nextLine());
        return nuevoEmpleado;
    }
    public static final ArrayList<Empleado> convertir(Empleado[] array) {
        ArrayList<Empleado> ret = new ArrayList<Empleado>();
        for (Empleado i : array) {
            ret.add((Empleado) i);
        }
        return ret;
    }

    public static void buscarEmpleados(ArrayList<Empleado> empleados) {
        Empleado buscado;
        ArrayList<Empleado> encontrados;
        Scanner in;
        int opcion = -1;
        do {
            buscado = null;
            encontrados = new ArrayList<Empleado>();
            in = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Pulse 1 para buscar por Id:");
            System.out.println("Pulse 2 para buscar por nombre:");
            System.out.println("Pulse 3 para buscar por apellidos:");
            System.out.println("Pulse 4 para buscar por NIF:");
            System.out.println("Pulse 0 para salir del menú.");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción incorrecta.");
                continue;
            }
            in = new Scanner(System.in, "ISO-8859-1");
            switch (opcion) {
                case 0:
                    System.out.println("Ha salido del menú");
                    break;
                case 1:
                    System.out.println("Introduzca el Id del empleado:");
                    int idEmp = in.nextInt();
                    buscado = Empleado.buscarEmpleadoPorId(idEmp, empleados);
                    if (buscado != null) {
                        System.out.print("Empleado encontrado: ");
                        System.out.println(buscado.getId() + ". " + buscado.getNombre() + " (" + buscado.getApellidos() + ")(" + buscado.getTlfcontacto() + ")-->" + buscado.getClass().getSimpleName());
                    } else {
                        System.out.println("Empleado con id=" + idEmp + " NO ENCONTRADO.");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el nombre del empleado:");
                    String nomEmp = in.nextLine();
                    encontrados = Empleado.buscarEmpleadoPorNombre(nomEmp, empleados);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Empleado e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")(" + e.getTlfcontacto() + ")-->" + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Empleado con nombre=" + nomEmp + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Introduzca el apellido del empleado:");
                    String apellEmp = in.nextLine();
                    encontrados = Empleado.buscarEmpleadoPorApellido(apellEmp, empleados);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Empleado e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")(" + e.getTlfcontacto() + ")-->" + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Empleado con apellido=" + apellEmp + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Introduzca el NIF del empleado:");
                    String nifEmp = in.nextLine();
                    encontrados = Empleado.buscarEmpleadoPorNIF(nifEmp, empleados);
                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Empleado e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getApellidos() + ")(" + e.getTlfcontacto() + ")-->" + e.getClass().getSimpleName());
                        }
                    } else {
                        System.out.println("Empleado con NIF=" + nifEmp + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;

                default:
                    break;
            }
        } while (opcion != 0);

    }

    public static Empleado buscarEmpleadoPorId(int idEmpleado, ArrayList<Empleado> empleados) {
        Empleado ret = null;
        for (Empleado e : Empleado.convertir(Utilidades.EMPLEADOS)) {
            if (e.getId() == idEmpleado) {
                ret = e;
                break;
            }
        }
        return ret;
    }

    public static ArrayList<Empleado> buscarEmpleadoPorNombre(String nomEmpleado, ArrayList<Empleado> empleados) {
        ArrayList<Empleado> ret = new ArrayList<Empleado>();
        for (Empleado e : Empleado.convertir(Utilidades.EMPLEADOS)) {
            if (Utilidades.removeDiacriticalMarks(e.getNombre().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(nomEmpleado.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getNombre().toLowerCase().contains(nomEmpleado.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }

    public static ArrayList<Empleado> buscarEmpleadoPorApellido(String apellEmpleado, ArrayList<Empleado> empleados) {
        ArrayList<Empleado> ret = new ArrayList<Empleado>();
        for (Empleado e : Empleado.convertir(Utilidades.EMPLEADOS)) {
            if (Utilidades.removeDiacriticalMarks(e.getApellidos().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(apellEmpleado.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getApellidos().toLowerCase().contains(apellEmpleado.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }

    public static ArrayList<Empleado> buscarEmpleadoPorNIF(String nifEmpleado, ArrayList<Empleado> empleados) {
        ArrayList<Empleado> ret = new ArrayList<Empleado>();
        for (Empleado e : Empleado.convertir(Utilidades.EMPLEADOS)) {
            if (Utilidades.removeDiacriticalMarks(e.getNIF().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(nifEmpleado.toLowerCase()))) {
                ret.add(e);
            }
            if (e.getNIF().toLowerCase().contains(nifEmpleado.toLowerCase())) {
                if (!ret.contains(e)) {
                    ret.add(e);
                }
            }
        }
        return ret;

    }
    
    /** public static void verEmpleado(ArrayList<Empleado> empleados) {
        System.out.println("Listado de empleados");
        for (Empleado e : empleados) {
            System.out.println(e.getId() + ". " + e.getNombre() + " (" + e.getClass().getSimpleName() + ")");
        }
        */
          
         public static void verEmpleado() {
         System.out.println("Listado de empleados");           
            for (int x = 0; x < Utilidades.numEmpleados;x++) {
            System.out.println(Utilidades.EMPLEADOS[x]);
        }
}

}

