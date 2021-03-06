/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.Normalizer;
import java.time.LocalTime;
import java.util.InputMismatchException;

/**
 *
 * @author punib
 */
public class Utilidades {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");

    public static final Empleado EMPLEADOS[] = {
        new Empleado(1, "Sara", "Garcia", "649678821", "72598327C", "C/Menendez Pelayo"),
        new Empleado(2, "Carlos", "Martinez", "649673821", "72598327N", "C/Venancio Bosco"),
        new Empleado(3, "David", "Lopez", "659678821", "73598327E", "C/Bajada el Chorrillo"),
        new Empleado(4, "Hector", "Setien", "67789451", "7465372J", "C/vargas, 13"),
        new Empleado(5, "Sofia", "Santisteban", "649673821", "78566327R", "Barrio Llatazos"),
        new Empleado(6, "Nerea", "Gonzalez", "666777888", "72598327N", "C/Ignacio estus"),
        new Empleado(7, "Jose", "Rodriguez", "607598547", "722567415E", "C/Venancio Bosco"),
        new Empleado(8, "Bella", "Rodriguez", "607598453", "72958632T", "C/belen"),
        new Empleado(9, "Mónica", "Perez", "690783036", "85632014F", "C/San ignacio"),
        new Empleado(10, "Pedro", "Setien", "664589674", "01257895G", "C/Javier Echevarría"),};
    public static final int numEmpleados = EMPLEADOS.length;

    public static final Enfermeria ENFERMEROS[] = {
        new Enfermeria(EMPLEADOS[1], 'A'),
        new Enfermeria(EMPLEADOS[2], 'B'),
        new Enfermeria(EMPLEADOS[5], 'C'),
        new Enfermeria(EMPLEADOS[9], 'C')
    };
    public static final int numEnfermerias = ENFERMEROS.length;

    public static final Secretariado[] SECRETARIOS = {
        //int experiencia, Empleado e, ArrayList<InformeGlobal> informes        
        new Secretariado(2, EMPLEADOS[3], new ArrayList<InformeGlobal>()),
        new Secretariado(3, EMPLEADOS[4], new ArrayList<InformeGlobal>()),
        new Secretariado(6, EMPLEADOS[6], new ArrayList<InformeGlobal>())
    };
    public static final int numSecretarios = SECRETARIOS.length;

    public static final Especialidad ESPECIALIDADES[] = {
        new Especialidad(1, "Odontopediatra", new ArrayList<Cirujano>()),
        new Especialidad(2, "Endodoncista", new ArrayList<Cirujano>()),
        new Especialidad(3, "Ortodoncistas", new ArrayList<Cirujano>()),
        new Especialidad(4, "Cirujano maxilofacial", new ArrayList<Cirujano>()),
        new Especialidad(5, "Periodoncista", new ArrayList<Cirujano>())
    };
    public static final int numEspecialidades = ESPECIALIDADES.length;

    public static final Cirujano CIRUJANOS[] = {
        //Empleado e, ArrayList<Especialidad> especialidades
        new Cirujano(EMPLEADOS[0], Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{2, 5})),
        new Cirujano(EMPLEADOS[7], Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{1, 3, 5})),
        new Cirujano(EMPLEADOS[8], Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{2, 4, 1}))
    };
    public static final int numCirujanos = CIRUJANOS.length;

    public static final Cobro COBROS[] = {
        new Cobro(1, 110, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter))),
        new Cobro(2, 300, Date.valueOf(LocalDate.parse("04/01/2021", dateFormatter))),
        new Cobro(3, 250.50, Date.valueOf(LocalDate.parse("10/01/2021", dateFormatter))),
        new Cobro(4, 300, Date.valueOf(LocalDate.parse("10/01/2021", dateFormatter))),
        new Cobro(5, 250.50, Date.valueOf(LocalDate.parse("13/01/2021", dateFormatter))),
        new Cobro(6, 180.5, Date.valueOf(LocalDate.parse("15/01/2021", dateFormatter))),
        new Cobro(7, 70, Date.valueOf(LocalDate.parse("23/01/2021", dateFormatter))),
        new Cobro(8, 60, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter))),
        new Cobro(9, 50, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)))
    };

    public static final int numCobros = COBROS.length;

    public static final Pago PAGOS[] = {
        new Pago(100, Date.valueOf(LocalDate.parse("23/12/2020", dateFormatter)), 160, "tarjeta", COBROS[0]),
        new Pago(101, Date.valueOf(LocalDate.parse("27/12/2020", dateFormatter)), 70, "metálico", COBROS[1]),
        new Pago(102, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 55, "tarjeta", COBROS[2]),
        new Pago(103, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 55, "tarjeta", COBROS[0]),
        new Pago(104, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 66, "transferencia", COBROS[3])
    };

    public static final int numPagos = PAGOS.length;

    public static final InformeGlobal INFORMES[] = {
        //long id, String descripcion, ArrayList<Secretariado> Secretarios

        new InformeGlobal(1, "Extracción muela 37", Secretariado.arrayde(Secretariado.convertir(SECRETARIOS), new int[]{2})),
        new InformeGlobal(7, "Revisión rutania + limpieza buscal", Secretariado.arrayde(Secretariado.convertir(SECRETARIOS), new int[]{2, 3})),
        new InformeGlobal(13, "Cirugía de elevación de seno maxilar ", Secretariado.arrayde(Secretariado.convertir(SECRETARIOS), new int[]{1, 2})),
        new InformeGlobal(21, "Revisión y ajuste ortodoncia", Secretariado.arrayde(Secretariado.convertir(SECRETARIOS), new int[]{3})),
        new InformeGlobal(23, "Extracciones muelas juicio ", Secretariado.arrayde(Secretariado.convertir(SECRETARIOS), new int[]{1, 3})),};
    public static final int numInformeGlobal = INFORMES.length;

    public static final Alergia ALERGIAS[] = {
        //long id, String nombre, ArrayList<Historial> historiales
        new Alergia(1, "amoxicilina", new ArrayList<Historial>()),
        new Alergia(2, "latex", new ArrayList<Historial>()),
        new Alergia(3, "metronidazol", new ArrayList<Historial>()),
        new Alergia(4, "espiramicina", new ArrayList<Historial>()),
        new Alergia(5, "ibuprofeno", new ArrayList<Historial>())};

    public static final int numAlergias = ALERGIAS.length;

    public static final Historial HISTORIALES[] = {
        //long historial, String descripcion, ArrayList<Alergia> alergias
        new Historial(1, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{0})),
        new Historial(2, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{1})),
        new Historial(3, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{0})),
        new Historial(5, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{0})),
        new Historial(6, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{0})),
        new Historial(7, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{2, 4})),
        new Historial(8, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{3})),
        new Historial(9, " ", Alergia.arrayde(Alergia.convertir(ALERGIAS), new int[]{5}))};

    public static final int numHistoriales = HISTORIALES.length;

    public static Medicamento MEDICAMENTOS[] = {
        //  long id, String nombre, String principioActivo, int dosismax, ArrayList<Cita> citas
        new Medicamento(1, "Paracetamol", "Paracetamol", 1000, new ArrayList<Cita>()),
        new Medicamento(2, "Spidifen", "Ibuprofeno", 1000, new ArrayList<Cita>()),
        new Medicamento(3, "Paracetamol", "Paracetamol", 1000, new ArrayList<Cita>()),
        new Medicamento(4, "Paracetamol", "Paracetamol", 1000, new ArrayList<Cita>()),
        new Medicamento(5, "Paracetamol", "Paracetamol", 1000, new ArrayList<Cita>())};
    public static final int numMedicamentos = MEDICAMENTOS.length;

    public static final Cita CITAS[] = {
        //long id, Date fecha, char rangoHorario, Time hora, Secretariado secretario
        new Cita(1, Date.valueOf(LocalDate.parse("22/09/2020", dateFormatter)), 'M', Time.valueOf(LocalTime.parse("08:35:00", timeFormatter)), SECRETARIOS[0], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{1})),
        new Cita(2, Date.valueOf(LocalDate.parse("29/09/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("16:15:00", timeFormatter)), SECRETARIOS[0], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{0})),
        new Cita(3, Date.valueOf(LocalDate.parse("4/10/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("16:15:00", timeFormatter)), SECRETARIOS[1], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{0})),
        new Cita(4, Date.valueOf(LocalDate.parse("01/10/2020", dateFormatter)), 'M', Time.valueOf(LocalTime.parse("09:30:00", timeFormatter)), SECRETARIOS[0], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{1})),
        new Cita(5, Date.valueOf(LocalDate.parse("13/10/2020", dateFormatter)), 'M', Time.valueOf(LocalTime.parse("11:30:00", timeFormatter)), SECRETARIOS[3], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(6, Date.valueOf(LocalDate.parse("20/10/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(7, Date.valueOf(LocalDate.parse("30/10/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(8, Date.valueOf(LocalDate.parse("25/11/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(9, Date.valueOf(LocalDate.parse("01/12/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(10, Date.valueOf(LocalDate.parse("06/12/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(11, Date.valueOf(LocalDate.parse("30/11/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(12, Date.valueOf(LocalDate.parse("30/12/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),
        new Cita(13, Date.valueOf(LocalDate.parse("30/12/2020", dateFormatter)), 'T', Time.valueOf(LocalTime.parse("18:45:00", timeFormatter)), SECRETARIOS[2], Medicamento.arrayde(Medicamento.convertir(MEDICAMENTOS), new int[]{2})),};

    public static final int numCitas = CITAS.length;

    public static final Tratamiento TRATAMIENTOS[] = {
        new Tratamiento(1, "Revisión + empaste", Date.valueOf(LocalDate.parse("22/09/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{1})),
        new Tratamiento(2, "Limpieza + blanqueamiento", Date.valueOf(LocalDate.parse("29/09/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{2, 3})),
        new Tratamiento(3, "Limpieza + empaste", Date.valueOf(LocalDate.parse("1/10/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{4})),
        new Tratamiento(4, "Endodoncia", Date.valueOf(LocalDate.parse("13/10/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{5})),
        new Tratamiento(5, "Extracción", Date.valueOf(LocalDate.parse("20/10/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{6})),
        new Tratamiento(6, "Revision periódica", Date.valueOf(LocalDate.parse("30/10/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{7})),
        new Tratamiento(7, "Implante", Date.valueOf(LocalDate.parse("25/11/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{8, 9, 10})),
        new Tratamiento(8, "Ortodoncia", Date.valueOf(LocalDate.parse("30/11/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{11, 12})),
        new Tratamiento(9, "Ortodoncia", Date.valueOf(LocalDate.parse("12/12/2020", dateFormatter)), true, COBROS[1], INFORMES[1], Cita.arrayde(Cita.convertir(CITAS), new int[]{13}))};

    public static final int numTratmamiento = TRATAMIENTOS.length;

    public static final Intervencion INTERVENCIONES[] = { /*Cita c, int duracion, ArrayList<Enfermeria> enfermeros, ArrayList<Cirugia> cirujanos
        new Intervencion(CITAS[0], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[1], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[2], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[3], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[4], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[5], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[8], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[11], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
        new Intervencion(CITAS[13], Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}, Cirugia.arrayde(Cirugia.convertir(CIRUJANOS), new int[]{1, 3})),
     */};
    public static final int numIntervencion = INTERVENCIONES.length;

    public static final Revision REVISIONES[] = {
        //String anotacion, Cirugia cirugia, Cita c
        new Revision("Nada a resaltar", CIRUJANOS[0], CITAS[6]),
        new Revision("Nada a resaltar", CIRUJANOS[2], CITAS[9]),
        new Revision("Nada a resaltar", CIRUJANOS[1], CITAS[10]),
        new Revision("Nada a resaltar", CIRUJANOS[3], CITAS[12]),};

    public static final Paciente PACIENTES[] = {
        //long id, String nombre, String apellido, String DNI,  String direccion, ArrayList<Tratamiento> tratamientos, ArrayList<Cita> citas, Historial historial
        new Paciente(1, "Susana", "Menendez", "22740599S", "Barrio Llatazos, 13", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{1}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(2, "Jorge", "Lorenzo", "57896354T", "B/ Lavapies, 79", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{2}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(3, "Elsa", "Oslé", "22475599F", "C/ Julio Urquijo,33", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{3}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(4, "Eder", "Aurrere", "72698534S", "C/ Dr. Areilza, 3", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{4}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(5, "Miguel", "Sainz", "75698532T", "Avda. Sabino Arana, 9", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{5}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(6, "Pablo", "Diez", "12365479E", "C/ julio mendoza, 66", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{6}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(7, "Ana", "Vazquez", "632598741S", "C/ Santander, 1", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{7}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(8, "Hugo", "De Miguel", "423698741F", "C/ republica de perú, 12", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{8}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),
        new Paciente(9, "Daniel", "Garcia", "365987456I", "C/ Diego Lopez de Haro, 12", Tratamiento.arrayde(Tratamiento.convertir(TRATAMIENTOS), new int[]{9}), Cita.arrayde(Cita.convertir(CITAS), new int[]{1, 3}), HISTORIALES[1]),};
    public static final int numPacientes = PACIENTES.length;

    //fecha
    //fecha
    public static class Fecha {

        private int anio;
        private int mes;
        private int dia;

        public Fecha() {
            Date hoy = Date.valueOf(LocalDate.now());
        }

        public Fecha(int y, int m, int d) {
            this.anio = y;
            this.mes = m;
            this.dia = d;
        }

        public int getAnio() {
            return anio;
        }

        public void setAnio(int anio) {
            this.anio = anio;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public Date conversorFecha() {
            java.sql.Date ret = new Date(this.anio, this.mes, this.dia);
            return ret;
        }

        public static Fecha nuevaFecha() {
            Fecha ret = new Fecha();
            Scanner in = new Scanner(System.in);
            int d = 0;
            do {
                System.out.println("Día: ");
                d = in.nextInt();
            } while (d <= 0 || d > 31);
            ret.setDia(d);
            int m = 0;
            do {
                System.out.println("Mes: ");
                m = in.nextInt();
            } while (m <= 0 || m > 12);
            ret.setMes(m);
            int y = 0;
            do {
                System.out.println("Año: ");
                y = in.nextInt();
            } while (y <= 2000);
            ret.setAnio(y);
            return ret;

        }
    }

    //hora
    public static class Hora {

        private int hora;
        private int minuto;
        private int segundo;

        public int getHora() {
            return hora;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

        public int getMinuto() {
            return minuto;
        }

        public void setMinuto(int minuto) {
            this.minuto = minuto;
        }

        public int getSegundo() {
            return segundo;
        }

        public void setSegundo(int segundo) {
            this.segundo = segundo;
        }

        public Hora() {
            Time hoy = Time.valueOf(LocalTime.now());
        }

        public Hora(int h, int m, int s) {
            this.hora = h;
            this.minuto = m;
            this.segundo = s;
        }

        public Time conversorHora() {
            java.sql.Time ret = new Time(this.hora, this.minuto, this.segundo);
            return ret;
        }

        public static Hora nuevaHora() {
            Hora ret = new Hora();
            Scanner in = new Scanner(System.in);
            int h = 0;
            do {
                System.out.println("Hora: ");
                h = in.nextInt();
            } while (h <= 0 || h > 23);
            ret.setHora(h);
            int m = 0;
            do {
                System.out.println("Minutos: ");
                m = in.nextInt();
            } while (m <= 0 || m > 59);
            ret.setHora(m);
            int s = 0;
            do {
                System.out.println("Segundos: ");
                s = in.nextInt();
            } while (s <= 59);
            ret.setHora(s);
            return ret;

        }
    }

    //METODOS PARA HACER VALIDACIONES
    public static boolean validarNombre(String nombre) {
        boolean ret = true;
        if (nombre.isEmpty()) {
            ret = false;
        }
        if (nombre.length() < 1 || nombre.length() > 20) {
            ret = false;
        }
        for (char c : nombre.toCharArray()) {
            if (Character.isDigit(c) || (!Character.isLetter(c) && c != ' '));
            ret = false;
            break;
        }
        return ret;
    }

    public static boolean validarApellido(String apellido) {
        boolean ret = true;
        if (apellido.isEmpty()) {
            ret = false;
        }
        if (apellido.length() < 1 || apellido.length() > 20) {
            ret = false;
        }
        for (char c : apellido.toCharArray()) {
            if (Character.isDigit(c) || (!Character.isLetter(c) && c != ' '));
            ret = false;
            break;
        }
        return ret;
    }

    public static boolean validaTlfn(String tlfn) {
        boolean ret = true;
        if (tlfn.isEmpty()) {
            ret = false;
        }
        if (tlfn.length() != 9) {
            ret = false;
        }
        if (!tlfn.matches("[0-9]+")) {
            ret = false;
        }
        return ret;
    }
    
    public static boolean validarId(long id){
        boolean ret = true;
        
        if (id <= 0) ret = false;
        return ret;
    }

   

    public static boolean validarMetodoPago(String metodo) {
        boolean ret = true;
        
        if (!(metodo.contentEquals("Tarjeta") && metodo.contentEquals("Metálico") && metodo.contentEquals("Transferencia"))) {
            ret = false;
        }
        return ret;
    }
    
        
    /**
     * Función que pide al usuario que introduzca un valor decimal por la
     * entrada estándar. Si el formato introducido no es correcto, avisa al
     * usuario y le vuelve a pedir que lo introduzca de nuevo.
     *
     * @return el valor double introducido por el usuario
     */
    public static boolean leerDouble(double importe) {
        importe = 0.0;
        boolean correcto = false;
        Scanner in;
        do {
            System.out.println("Introduzca un valor decimal (xx.xx)");
            in = new Scanner(System.in, "ISO-8859-1");
            try {
                if (importe <= 0) {
                correcto = false;
                }
                importe = in.nextDouble();
                correcto = true;
            } catch (InputMismatchException ime) {
                System.out.println("Formato introducido incorrecto.");
                correcto = false;
            }
        } while (!correcto);
        return correcto;
    }
    
    public static String removeDiacriticalMarks(String string) {
        //Form.NFC acepta ñ y distingue las tildes en español
        return Normalizer.normalize(string, Normalizer.Form.NFC)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");}

}
