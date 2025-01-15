package ejerciciosderepaso;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// Solicitamos dos numeros ENTEROS y los multiplicamos.Como sabemos que vamos a
		// interactuar con el usuario usamos scanner.
		Scanner sc = new Scanner(System.in);

		System.out.println("Indiquenos sus dos numeros para realizar la multiplicación");

		int numero1 = sc.nextInt();

		int numero2 = sc.nextInt();

		System.out.println("El resultado es " + (numero1 * numero2));

		System.out.println("Dame dos numeros grandes:");

		Long numero3 = sc.nextLong();

		Long numero4 = sc.nextLong();

		Long total2 = numero3 * numero4;

		System.out.println("El resultado seria " + total2);

		sc.close();

		/*
		 * Podemos hacer el resultado de 2 Formas, creando una variable (en este caso
		 * total2) o directamente en el sysout. pero si creamos una variable con total 2
		 * podremos llamarla mas adelante para usar ese valor directamente y no tener
		 * que hacer la operacion cada vez aparte de ahorrar 1 linea.
		 */
	}

}
