package EJERCICIOS;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Iniciamos scanner (RECORDAD IMPORTARLO O NO FUNCIONARA¡).
		Scanner sc =new Scanner(System.in);
		
		//Preguntamos al usuario en consola cuanto le gustaria ganar al año.
		System.out.println("¿Cual seria tu sueldo ideal anual en euros?");
		
		//Usamos el scanner para preguntarle al usuario y registrar el valor que escriba con scanner.
		Float sueldoAnual = sc.nextFloat();
		
		//Calculamos su sueldo mensual con la respuesta.Podemos usar una constante(meses del año =12)
		Float sueldoMensual = sueldoAnual / 12 ;
		
		//Mostramos en un mensaje al usuario cual seria su sueldo mensual con sysout
		System.out.println("Tu sueldo mensual seria de " + sueldoMensual + " Euros");
		
		//Cerramos scanner
		sc.close();

	}

}
