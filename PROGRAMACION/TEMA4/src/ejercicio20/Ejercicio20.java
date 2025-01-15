package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		/*Cambia el constructor de la clase para que reciba un parámetro String que sea el dni del
		alumno. Es decir, cuando queramos crear un objeto Alumno, habrá que indicar
		obligatoriamente su DNI. Modifica el programa que has creado para probar para que funcione
		con este nuevo constructor. */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("dame un dni");
		String dni  = sc.nextLine();
		sc.close();
		//Creamos el objeto al cual le podremos dar los valores que queramos, entonces ira a la clase , al 
		//constructor que creamos para meterle ese valor, de manera que cuando llamemos al objeto alumno.getDATO
		Alumnos alumno = new Alumnos(dni);
		System.out.println(alumno.getDni());
	}

}
