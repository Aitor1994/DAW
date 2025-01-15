--Actividad 2
create table piezas( 
    id int primary key, 
    nombre varchar(50), 
    id_fabricante int 
);
create table fabricantes( 
    id int, 
    marca varchar (50) 
);
--Añadir una primary key despues de crear la tabla
alter table fabricantes add primary key (id);
--Añadir una foreign key despues de crear la tabla , en que tabal quieres rearla y en que tabla es primary key.
alter table piezas add foreign key (id)references fabricantes;
alter table piezas add primary key (id);
--Añadir precio number 4 numeros, con 2 decimales.
alter table piezas add precio number (4,2);
--Añadir una descripcion a uno de los campos en este caso el precio a de ser mayor a 0.
alter table piezas add check (precio>0);
create table personas(
    dni char(9) primary key check (regexp_like(dni,'[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][A-Z]')),
    --Esto se puede poner mas corto y no tener que poner la condicion 8 veces: alter table personas add check (regexp_like(dni,'[0-9]{8}[A-Z]'))
    nombre varchar (50)
);

--Actividad 3
alter table piezas add codigo char(5);
alter table piezas
add check(regexp_like (codigo,'P[0-9]{3}[a-z]'));
--Quiero añadir check que permita solo nombre de piezas igual a TORNILLO , ARANDELA, TUERCA.
alter table piezas 
 add check (nombre in ('Tornillo','arandela','tuerca'));
--Tambien se puede poner (nombre='tornillo' or nombre ='arandela' or nombre='tuerca');

--Actividad 4
alter table fabricantes
 add check (marca in ('FABRIC1', 'FABRIC2','FABRIC3'));
alter table fabricantes drop column FABRIC4;

--Ejercicio_1
create table LOTES(
    codigo int,
    num_kg number(8,2),
    precio_kg_salida number (8,2),
    precio_kg_vendido number (8,2),
    fecha date
);
alter table LOTES add primary key (codigo);
alter table LOTES add check (num_kg > 0);
alter table LOTES add check (precio_kg_salida > 0 and precio_kg_salida > precio_kg_vendido);
alter table LOTES add check (fecha is not null);

--Ejercicio 2

create table Personas(
    dni char(9) primary key check(regexp_like(dni,'[0-9]{8}[A-Z]')),
    nombre varchar(50)
    );

--Ejercicio 3
alter table Personas add talla varchar(2) check(talla in ('S','M','L','XL'));

