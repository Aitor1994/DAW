--Actividad 2
drop table personas cascade constraints;


--Problemas tipo 3 (entregarlos).
create table productos(
    id int,
    nombre varchar(100),
    tipo varchar2(50)
    );
create table clientes(
    codigo int,
    nombre varchar2 (50),
    fecha_nacimiento date
);
drop table pedidos;
create table pedidos(
    id_producto int,
    id_cliente int,
    fecha_compra date
    );
alter table productos add primary key (id);
alter table clientes add primary key (codigo);
alter table pedidos add primary key (id_producto,id_cliente);
alter table pedidos1 add primary key (id_producto,id_cliente);
