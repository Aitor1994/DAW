package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio16_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase: ");
		String frase = sc.nextLine();

		for (int posicion = 0; posicion < frase.length(); posicion++) {
			System.out.println(frase.substring(posicion, posicion + 1));
		}
		sc.close();

	}

}
