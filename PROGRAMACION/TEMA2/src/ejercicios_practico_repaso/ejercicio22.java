package ejercicios_practico_repaso;

import java.util.Scanner;

public class ejercicio22 {

	public static void main(String[] args) {
		// Realiza un programa que muestre por consola los números del 1 al 10. Pero lo
		// hará a medida
		// que el usuario lo vaya solicitando. Es decir, se mostrará el 1 y parará.
		// Cuando el usuario pulse
		// ENTER, se mostrará 2 y parará. Cuando el usuario pulse ENTER, se mostrará 3 y
		// parará. Y así
		// continuamente hasta el 10.

		Scanner sc = new Scanner(System.in);
		for (int numero = 1; numero <= 10; numero++) {
			System.out.println("Pulsa Enter para ir introduciendo numeros: " + numero);
			sc.nextLine();
		}
		System.out.println("Fin de programa.");
		sc.close();

	}

}
