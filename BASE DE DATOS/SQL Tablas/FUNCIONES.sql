--Ejercicio 11
select nombre,salario,salario*1.5 || ' €' "salario bruto" from futbolistas;
--CONCAT()Sirve para concatenar caracteres estando separados.
concat(concat(concat(concat(concat('1','.'),' '),'soy'),' '),'groot') from dual;

selectnombre,salario,salario*1.5 || ' euros' "Salario bruto"fromfutbolistas;
select upper(substr('hola',1,1))||'ola' from dual;
select initcap('hola') from dual;

--CONCAT() ||
select concat(concat(concat(concat(concat('1','.'),' '),'soy'),' '),'groot') from dual;
--1. Soy groot

select ceil(11) from dual;
select ceil(11.9) from dual;
select ceil(11.1) from dual;
select floor(11) from dual;
select floor(11.9) from dual;
select floor(11.1) from dual;
select mod(10,6) from dual; 
--10 / 6 = 1 _ 4
select power(10,2) from dual;
select round(17.5)from dual;
select round (17.4)from dual;
select round (17.4356,2)from dual; --Al poner la coma le decimos que nos redondee a los 2 primeros decimales, usamos , para separar y . para poner (,)
select round(17.4346,-1)from dual;--Al ser negativo hace lo mismo pero coge los numeros a la izquierda de la coma
select sign(-5) from dual;

--Ejercicio 12
select abs (-10) from dual;
select exp (4) from dual;
select ceil (15.3) from dual;
select floor (15.3) from dual;
select mod (15,3) from dual;
select power (15,2) from dual;