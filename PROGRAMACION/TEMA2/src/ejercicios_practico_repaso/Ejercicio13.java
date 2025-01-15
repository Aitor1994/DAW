package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Realizar un programa que de manera continua vaya pidiendo frases al usuario.
		// El programa
		// deberá ir guardando todas las frases en una variable. Cuando el usuario
		// escriba la frase “FIN”,
		// el programa terminará y mostrará por consola todo el texto que ha ido
		// almacenando.
		// La palabra “FIN” se podrá escribir de cualquier forma. Por ejemplo “Fin” o
		// “fin”, etc.
		
		Scanner sc = new Scanner(System.in);
		String frase;
		String oracion="";

		do {
			System.out.println(
					"Introduce oraciones para ir guardandolas hasta que el usuario escriba FIN para finalizar el programa: ");
			frase = sc.nextLine();
			//frase.toUpperCase();
			oracion = oracion+" " + frase;

		} while (!frase.equalsIgnoreCase("FIN"));
		System.out.println("La oracion completa introducida seria: " + oracion);
sc.close();
	}

}
