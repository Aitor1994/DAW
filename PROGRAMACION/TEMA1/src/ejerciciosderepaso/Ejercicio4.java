package ejerciciosderepaso;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Solicita al usuario su numero favorito, a continuacion solicita su ciudad
		// favorita y soluciona el problema.
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cual es tu numero favorito?");

		int numerofav = sc.nextInt();

		System.out.println("¿Y tu ciudad favorita?");

		sc.nextLine();

		String ciudadfav = sc.nextLine();

		// Mostramos al usuario:
		System.out.println("Tu numero favorito es el " + numerofav + " Y tu ciudad favorita es " + ciudadfav);

		// Cerrar el scanner es importante para la calificacion ¡¡
		sc.close();

		/*
		 * Hasta que lo solucionamos no nos dejama escribir porque no podemos usar 2
		 * scaner seguidos siendo un numero(Int y despues un String ya que se guarda el
		 * espacio al darle al Enter para registrar la respuesta y el siguiente scanner
		 * empieza con este espacio y no nos deja escirbir , Total; debemnos depurar el
		 * Scanner usando otro Scanner Vacio.
		 */

	}

}
