package tema2;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que simule el lanzamiento de un dado durante N veces. En
		 * primer lugar, solicitaremos al usuario cuántas veces quiere que lancemos el
		 * dado. A continuación, imprimiremos por consola el resultado de lanzar de
		 * manera aleatoria el dado cada una de las veces.
		 */

		// Iniciamos scanner.
		Scanner sc = new Scanner(System.in);
		// Iniciamos random, se hace como el scanner(Ya podremos usarlo en el futuro):
		Random random = new Random();
		// Inicializamos las variables que vamos ir usando:
		int lanzamientos;
		int aleatorio = 0;

		System.out.println("¿Cuantas veces quieres lanzar el dado?: ");
		lanzamientos = sc.nextInt();
		for (int i = 0; i < lanzamientos - 1; i++) {
			aleatorio = random.nextInt(1, 7);
			System.out.print(aleatorio + ",");
		}
		System.out.println(aleatorio = random.nextInt(1, 7));
sc.close();
	}

}
