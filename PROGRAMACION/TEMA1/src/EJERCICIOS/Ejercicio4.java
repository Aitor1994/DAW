package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Pedimos la edad usuario con un mensaje.
		System.out.println("¿En que año nacistes?");

		// Iniciamos Scanner.
		Scanner sc = new Scanner(System.in);

		// Usamos el scanner para que el usuario pueda respondernos y registrarla en una
		// variable a la que le demos un nombre logico.
		int fecha = sc.nextInt();

		// Calculamos la edad restando al año actual la respuesta del usuario.
		System.out.println("Aitor tiene " + (2024 - fecha) + " años");

		// Cerramos Scanner.
		sc.close();
		

	}

}
