package tema3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solicite un número al usuario. Después, guardar en
		 * un array el cuadrado de ese número y de los 5 siguientes. Al terminar, en
		 * otro bucle distinto, mostrar el contenido del array por consola.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Indique aqui el numero para realizar las operaciones: ");
		int numero = sc.nextInt();
		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = numero * numero;
			numero += 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
