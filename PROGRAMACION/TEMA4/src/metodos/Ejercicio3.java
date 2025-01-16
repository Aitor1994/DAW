package metodos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Crea un método llamado getMayMin que reciba una cadena por parámetro:  Un
		 * número que podrá ser 1 o 2  Una cadena Tendrá que devolver la cadena
		 * recibida, quitando espacios en blanco del principio y del final. Luego, si el
		 * número recibido es 1, devolverá esa cadena en mayúsculas. Si el número
		 * recibido es 2, devolverá esa cadena en minúsculas.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Indique aqui su frase: ");
		String frase = sc.nextLine();
		System.out.println("Indique 1 o 2 para Mayusc o Minusc.");
		Integer num = sc.nextInt();
		String fraseFinal = getMayMin(num, frase);
		System.out.println(fraseFinal);
		sc.close();

	}

	public static String getMayMin(int num, String cad) {
		
		if (num == 1) {
			cad = cad.toUpperCase().trim();
		} else if (num == 2) {
			cad = cad.toLowerCase().trim();
		} else if (num != 1 || num != 2) {
			System.out.println("Numero no valido.");
		}
		return cad;
	}

}
