package ejercicios_básicos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Crea un método llamado getMayMin que reciba una cadena por parámetro: • Un
		 * número que podrá ser 1 o 2 • Una cadena Tendrá que devolver la cadena
		 * recibida, quitando espacios en blanco del principio y del final. Luego, si el
		 * número recibido es 1, devolverá esa cadena en mayúsculas. Si el número
		 * recibido es 2, devolverá esa cadena en minúsculas.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame una frase");

		String frase = sc.nextLine();

		System.out.println("Dame un numero que sea 1 o 2 :");
		Integer num = sc.nextInt();
		sc.close();

		String fraseFinal = cadena(frase, num);
		System.out.println(fraseFinal);
	}

	public static String cadena(String frase, Integer num) {
		frase = frase.trim();

		if (num == 1) {
			frase = frase.toUpperCase();
		} else if (num == 2) {
			frase = frase.toLowerCase();
		}
		return frase;

	}
}
