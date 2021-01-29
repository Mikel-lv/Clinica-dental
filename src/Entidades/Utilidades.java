/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.sql.Date;
import java.text.Normalizer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author punib
 */
public class Utilidades {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static final Cobro COBROS[] = {
        new Cobro(001, 110, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter))),
        new Cobro(015, 300, Date.valueOf(LocalDate.parse("04/01/2021", dateFormatter))),
        new Cobro(033, 250.500, Date.valueOf(LocalDate.parse("10/01/2021", dateFormatter))),
        new Cobro(037, 170, Date.valueOf(LocalDate.parse("15/01/2021", dateFormatter))),};

    public static final int numCobros = COBROS.length;

    public static final Pago PAGOS[] = {
        new Pago(002, Date.valueOf(LocalDate.parse("23/12/2020", dateFormatter)), 160, "tarjeta", COBROS[0]),
        new Pago(022, Date.valueOf(LocalDate.parse("27/12/2020", dateFormatter)), 70, "metálico", COBROS[0]),
        new Pago(030, Date.valueOf(LocalDate.parse("31/12/2020", dateFormatter)), 57.99, "transferencia", COBROS[0]),};

    public static final int numPagos = PAGOS.length;

    public static final Empleado EMPLEADOS[] = {
        new Empleado(01, "Manolo", "Garcia", "649678821", "72598327C", "C/Menendez Pelayo"),
        new Empleado(02, "Carlos", "Martinez", "649673821", "72598327N", "C/Venancio Bosco"),
        new Empleado(03, "David", "Lopez", "659678821", "73598327C", "C/Bajada el Chorrillo")

    };
    public static final int numEmpleados = EMPLEADOS.length;

    public static final Enfermeria ENFERMEROS[] = {
        new Enfermeria('A', 01, "Laura", "Martinez", "640798854", "72208764J", "C/Menendez Pelayo"),
        new Enfermeria('B', 02, "Martin", "Morales", "640758854", "722087321A", "C/Bajada el Chorrillo"),
        new Enfermeria('C', 03, "Maria", "Lopez", "620798854", "62208764N", "C/Menendez Pelayo"),};
    public static final int numEnfermerias = ENFERMEROS.length;

    public static final Especialidad ESPECIALIDADES[] = {
        new Especialidad(1, "Odontopediatra", new ArrayList<Cirujano>()),
        new Especialidad(2, "Endodoncista", new ArrayList<Cirujano>()),
        new Especialidad(3, "Ortodoncistas", new ArrayList<Cirujano>()),
        new Especialidad(4, "Cirujano maxilofacial", new ArrayList<Cirujano>()),
        new Especialidad(5, "Periodoncista", new ArrayList<Cirujano>())};

    public static final Cirujano CIRUJANOS[] = {
        new Cirujano(Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{1, 3,}), 01, "Elsa", "Pataco", "678943567", "72208724T", "C/Menendez Pelayo"),
        new Cirujano(Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{2, 5}), 02, "Marcos", "Rosa", "640412854", "725227321A", "C/San Ignacio"),
        new Cirujano(Especialidad.arrayde(Especialidad.convertir(ESPECIALIDADES), new int[]{1, 3, 4}), 01, "Ana", "Rosa", "640218854", "725687321A", "C/San Ignacio"),};
    public static final int numCirujanos = CIRUJANOS.length;

    public static final Secretariado[] SECRETARIADOS = {
        new Secretariado(01, "Alicia", "Millán", "640758214", "72205524J", "C/Menendez Pelayo", 2, new ArrayList<InformeGlobal>()),
        new Secretariado(02, "Marcos", "Del Rey", "640412854", "725227321A", "C/San Ignacio", 6, new ArrayList<InformeGlobal>())};
    public static final int numSecretarios = SECRETARIADOS.length;

    public static final InformeGlobal INFORMES[] = {
        new InformeGlobal(1, "Extracción muela 37", Secretariado.convertir(new Secretariado[]{SECRETARIADOS[0]})),
        new InformeGlobal(7, "Revisión rutania + limpieza buscal", Secretariado.convertir(new Secretariado[]{SECRETARIADOS[0]})),
        new InformeGlobal(13, "Cirugía de elevación de seno maxilar ", Secretariado.convertir(new Secretariado[]{SECRETARIADOS[0]})),
        new InformeGlobal(21, "Revisión y ajuste ortodoncia", Secretariado.convertir(new Secretariado[]{SECRETARIADOS[0]}))

    };
    public static final int numInformeGlobal = INFORMES.length;

    public static final Tratamiento TRATAMIENTOS[] = { //          new Tratamiento (3, "dolor de muela", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), Y, COBROS [0], INFORMES [0], Arraylist cita)
    //          new Tratamiento (8, "empaste", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), Y, COBROS [0], INFORMES [0], Arraylist cita)
    //          new Tratamiento (1, "extraccion", Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), N, COBROS [0], INFORMES [0], Arraylist cita)
    };
    public static final int numTratmamiento = TRATAMIENTOS.length;

    public static final Cita CITAS[] = { //          new Cita (3, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'T', HORA, SECRETARIADOS [0], Arraylist medicamento)
    //          new Cita (2, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADOS [0], Arraylist medicamento)
    //          new Cita (7, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADOS [0], Arraylist medicamento)
    };
    public static final int numCitas = CITAS.length;

    public static final Revision REVISIONES[] = { //          new Revision ("todo correcto", CIRUJANOS [0], 5, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADOS [0]),   NO SABEMOS PONER LA HORA
    //          new Revision ("muerto", CIRUJANOS [0], 4, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'T', HORA, SECRETARIADOS [0]),
    //          new Revision ("reparar aparato", CIRUJANOS [0], 1, Date.valueOf(LocalDate.parse("22/12/2020", dateFormatter)), 'M', HORA, SECRETARIADOS [0])
    };
    public static final int numRevisiones = REVISIONES.length;

    public static final Intervencion INTERVENCIONES[] = { 
        //int duracion, long id, Date fecha, char rango_horario, Time hora, Secretariado secretariado, ArrayList<Enfermeria> enfermeros, ArrayList<Cirujano> cirujanos)
        //Cita c, int duracion, ArrayList<Enfermeria> enfermeros, ArrayList<Cirujano> cirujanos
    //   new Intervencion(1, Enfermeria.convertir(new Enfermeria[]{SECRETARIADOS[0]})),
        new Intervencion(CITAS[0], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 3}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1})),
        new Intervencion(CITAS[1], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 2}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1})),
        new Intervencion(CITAS[2], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 2}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1})),
        new Intervencion(CITAS[3], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{2, 4}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1})),
        new Intervencion(CITAS[4], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{2, 3}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1})),
        new Intervencion(CITAS[5], 50, Enfermeria.arrayde(Enfermeria.convertir(ENFERMEROS), new int[]{1, 4}), Cirujano.arrayde(Cirujano.convertir(CIRUJANOS), new int[]{1}))
    };

    public static final int numIntervenciones = INTERVENCIONES.length;

    public static final Paciente PACIENTES[] = { //          new Paciente (3, "Juan", "Gonzalez", "Calle santander 23 1ºB", "75926351K", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
    //          new Paciente (6, "Paula", "Univaso", "Calle la rona 2 5ºC", "47523767P", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
    //          new Paciente (2, "Pedro", "Martin", "Calle santander 23 1ºB", "24572357D", HISTORIAL [0], Arraylist Cita, Arraylist Tratamiento)
    };
    public static final int numPacientes = PACIENTES.length;

    public static final Historial HISTORIALES[] = { //          new Historial (2, "AAAAAAA", Arraylist Alergia),
    //     new Historial (66, "BBBBBBB", Alergia.convertir(new Alergia[]{ALERGIAS[0]})),
    //          new Historial (22458, "CCCCCC", Alergia.convertir(new Alergia[]{ALERGIAS[0]})),
    };
    public static final int numHistoriales = HISTORIALES.length;

    public static final Alergia ALERGIAS[] = { //          new Historial (77, "AAAAAAA","Medicamento", Arraylist Historial),
    //          new Historial (69, "BBBBBBB","Medicamento", Historial.convertir(new Historial[]{HISTORIALES[0]})),
    //          new Historial (885857, "CCCCCC","Medicamento", Historial.convertir(new Historial[]{HISTORIALES[0]})),
    };
    public static final int numAlergias = ALERGIAS.length;

    public static final Medicamento MEDICAMENTOS[] = { //new Historial (611, "AAAAAAA","Principioactivo",1, Arraylist Cita),
    //          new Historial (888, "BBBBBBB","Principioactivo",3, Cita.convertir(new Cita[]{CITAS[0]})),
    //          new Historial (8857, "CCCCCC","Principioactivo",2, Cita.convertir(new Cita[]{CITAS[0]})),
    };
    public static final int numMedicamentos = MEDICAMENTOS.length;

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
            int m = 0;
            do {
                System.out.println("Mes: ");
                d = in.nextInt();
            } while (m <= 0 || m > 12);

            int y = 0;
            do {
                System.out.println("Año: ");
                d = in.nextInt();
            } while (d <= 2000);

            return ret;

        }
    }

    public static String removeDiacriticalMarks(String string) {
        //Form.NFC acepta ñ y distingue las tildes en español
        return Normalizer.normalize(string, Normalizer.Form.NFC)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
