CREATE DATABASE IF NOT EXISTS ClinicaDental;
USE ClinicaDental;

CREATE TABLE IF NOT EXISTS Empleado(
id int primary key not null auto_increment,
nombre varchar(20) not null,
apellidos varchar(20) not null,
tlfcontacto char(9) not null,
NIF char(9) not null,
direccion varchar(30) not null);

CREATE TABLE IF NOT EXISTS Secretariado(
id int primary key not null,
experiencia int not null,
FOREIGN KEY (id) REFERENCES Empleado(id) ON UPDATE CASCADE ON DELETE CASCADE );

CREATE TABLE IF NOT EXISTS Cirujano(
id int primary key not null,
FOREIGN KEY (id) REFERENCES Empleado(id) ON UPDATE CASCADE ON DELETE CASCADE);

CREATE TABLE IF NOT EXISTS Enfermeria(
id int primary key not null,
categoria char(1) not null,
FOREIGN KEY (id) REFERENCES Empleado(id) ON UPDATE CASCADE ON DELETE CASCADE);





create table IF NOT EXISTS Paciente(
id int PRIMARY KEY not null AUTO_INCREMENT,
nombre varchar(20) not null,
apellido varchar(30) not null,
DNI char(9),
telefono char(9),
direccion varchar (40)
);

create table IF NOT EXISTS Tratamiento(
id int PRIMARY KEY not null AUTO_INCREMENT,
nombre varchar(30) not null,
fecha_inicio date,
consentimiento boolean
);


create table IF NOT EXISTS Cita(
id int PRIMARY KEY not null AUTO_INCREMENT,
fecha date,
rango_horario char (1),
hora date

);

create table IF NOT EXISTS Revision(
id int primary key not null,
anotacion varchar(150),
FOREIGN KEY (id) REFERENCES Cita(id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table IF NOT EXISTS Intervencion(
id int primary key not null,
anotacion varchar(25),
FOREIGN KEY (id) REFERENCES Cita(id) ON UPDATE CASCADE ON DELETE CASCADE


);

create table IF NOT EXISTS Historial(
nHistorial int PRIMARY KEY not null AUTO_INCREMENT,
descripcion varchar (150) not null
);

create table IF NOT EXISTS Medicamento(
id int PRIMARY KEY not null AUTO_INCREMENT,
nombre varchar(30),
principioActivo varchar(35),
dosisMaxima varchar(10)
);

create table IF NOT EXISTS Alergia(
id int PRIMARY KEY not null AUTO_INCREMENT,
nombre varchar(20),
idMedicamento int,
FOREIGN KEY (idMedicamento) REFERENCES Medicamento(id) ON UPDATE CASCADE ON DELETE CASCADE
);



create table IF NOT EXISTS Especialidad(
id int PRIMARY KEY not null AUTO_INCREMENT,
nombre varchar (25)
);

create table IF NOT EXISTS InformeGlobal(
id int primary key not null AUTO_INCREMENT,
descripcion varchar(50) not null

);

create table IF NOT EXISTS Cobro(
id int primary key not null auto_increment,
importe double not null,
fechaFin date

);

create table IF NOT EXISTS Pago(
id int primary key not null auto_increment,
fechaPago date,
importe double,
metodoPago varchar(20)
);



create table IF NOT EXISTS HistorialAlergia(
nHistorial int  not null ,
idAlergia int  not null,
constraint PK_id primary key (nHistorial, idAlergia),
FOREIGN KEY (nHistorial) REFERENCES Historial(nHistorial) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idAlergia) REFERENCES Alergia(id) ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Cirujano_Especialidades(
idCirujano int not null,
idEspecialidad int  not null,
constraint PK_id primary key (idCirujano, idEspecialidad),
FOREIGN KEY (idCirujano) REFERENCES Cirujano(id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idEspecialidad) REFERENCES Especialidad(id) ON  UPDATE CASCADE ON DELETE CASCADE);

CREATE TABLE IF NOT EXISTS Secretariado_InformeGlobal(
idSecretariado int  not null,
idInformeGlobal int  not null,
constraint PK_id primary key (idSecretariado,idInformeGlobal),
FOREIGN KEY (idSecretariado) REFERENCES Secretariado(id) ON UPDATE RESTRICT ON DELETE RESTRICT,
FOREIGN KEY (idInformeGlobal) REFERENCES InformeGlobal(id) ON UPDATE RESTRICT ON DELETE RESTRICT);

create table IF NOT EXISTS Paciente_Tratamiento(
idpaciente int  not null,
idtratamiento int  not null,
constraint PK_id primary key (idpaciente, idtratamiento),
FOREIGN KEY (idpaciente) REFERENCES Paciente(id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idtratamiento) REFERENCES Tratamiento(id) ON UPDATE CASCADE ON DELETE CASCADE
);


create table IF NOT EXISTS Paciente_Cita(
idpaciente int not null,
idcita int  not null,
constraint PK_id primary key (idpaciente, idcita),
FOREIGN KEY (idpaciente) REFERENCES Paciente(id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idcita) REFERENCES Cita(id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table IF NOT EXISTS Tratamiento_Cita(
idtratamiento int not null,
idcita int  not null,
constraint PK_id primary key (idtratamiento, idcita),
FOREIGN KEY (idtratamiento) REFERENCES Tratamiento(id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idcita) REFERENCES Cita(id) ON UPDATE CASCADE ON DELETE CASCADE
);

create table IF NOT EXISTS Cita_Medicamento(
idMedicamento int  not null,
idCita int  not null,
constraint PK_id primary key (idMedicamento, idCita),
FOREIGN KEY (idMedicamento) REFERENCES Medicamento(id) ON UPDATE CASCADE ON DELETE CASCADE,
FOREIGN KEY (idCita) REFERENCES Cita(id) ON UPDATE CASCADE ON DELETE CASCADE
);





INSERT INTO Empleado VALUES (DEFAULT,"Sara", "Garcia", "649678821", "72598327C", "C/Menendez Pelayo"),(DEFAULT,"Carlos", "Martinez", "649673821", "72598327N", "C/Venancio Bosco"),(DEFAULT,"David", "Lopez", "659678821", "73598327E", "C/Bajada el Chorrillo")
,(DEFAULT,"Hector", "Setien", "67789451", "7465372J", "C/vargas, 13"),(DEFAULT,"Sofia", "Santisteban", "649673821", "78566327R", "Barrio Llatazos"),(DEFAULT,"Nerea", "Gonzalez", "666777888", "72598327N", "C/Ignacio estus"),(DEFAULT,"Jose", "Rodriguez", "607598547", "722567415E", "C/Venancio Bosco")
,(DEFAULT,"Bella", "Rodriguez", "607598453", "72958632T", "C/belen"),(DEFAULT,"Mónica", "Perez", "690783036", "85632014F", "C/San ignacio"),(DEFAULT,"Pedro", "Setien", "664589674", "01257895G", "C/Javier Echevarría");

INSERT INTO Enfermeria VALUES (1,'A'),(2,'B'),(5,'C'),(9,'C');

INSERT INTO Secretariado (experiencia,id) VALUES (2,3),(3,4),(6,6);