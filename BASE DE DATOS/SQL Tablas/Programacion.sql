--PROGRAMACION EN  BBDD:
 --PLSQL
 --Estructura minima(El codigo va entre begin y end
 
 declare
 numero int := 7; --Declarar e inicializar variable
 numero2 int; --Declaramos sin valor 
 frase varchar2(10) := 'mensaje';
 
 
 begin
 --Mostrar informacion en consola, todo lo que devuelva en consola sera String.
  dbms_output.put_line(4*5);
  numero2 := 4; --Cambiamos el valor a la variable numero2.
  numero := 2;
  dbms_output.put_line(numero2 ||' '|| numero);
  dbms_output.put_line(numero2 - numero);
  dbms_output.put_line(frase);
 end;
 /
 --Ejercicio
 /*Calcula el area de un triángulo con Base =7 , altura = 4.  (B*A/2)
 /*Mostrar por pantalla ls sig.frase :'El area de un tirangulo de base XXX y altura XXX es = XXX'*/
 declare 
 base int := 7;
 altura int := 4;
 begin
 dbms_output.put_line('El area de un triangulo de base'||base||'y altura'||altura||'es'|| ((base*altura)/2));
 end;
 /