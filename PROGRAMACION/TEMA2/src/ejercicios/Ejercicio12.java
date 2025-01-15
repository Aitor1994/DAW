package ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login ;
		Boolean espacios;
		Integer longitud;
		do {
			System.out.println("Introduzca su login:");
			login = sc.nextLine();
			//Quitamos los espacios al incio y al final:
			//SIEMPRE ANALIZAR LO QUE NECESITEMOS DE LA CADENA ANTES DE PONER LAS CONDICIONES.
			login = login.trim();
			login = login.toUpperCase();
			longitud = login.length();
			espacios = login.contains(" ");
			//UNA VEZ ANALIZADOS LO QUE QUEREMOS DE LO QUE HA DICHOS EL USUARIO PODEMOS INSTAURAR LAS CONDICIONES:
			if (longitud < 10) {System.out.println("error, el login debe tener al menos diez caracteres¡");}
			if (espacios) {System.out.println("Error el login no puede contener espacios¡");}
			
			} while (longitud < 10 || espacios);
sc.close();
	}

}
