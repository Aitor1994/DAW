package ejercicios_básicos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Repite el ejercicio anterior, pero reutilizando (llamando a) los métodos
		 * creados en el Ejercicio 1 y 2.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indica una cadena:");
		String frase = sc.nextLine();

		
		String fraseMayusc = Ejercicio1.getMayusculas(frase);
		String fraseMinusc = Ejercicio1.getMinusculas(frase);
		System.out.println(fraseMinusc + " " + fraseMayusc);
sc.close();
	}

}
