package tema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Mejorar el programa anterior para que, además de mostrar la lista de números,
		 * calcule y muestre cuál es el máximo y el mínimo (y en qué posición están) y
		 * calcule la media de todos los números. Todo esto se debe hacer recorriendo el
		 * array.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuantos numeros quieres guardar? ");
		int numeros = sc.nextInt();
		int[] array = new int[numeros];
		int maximo = array[0];
		int minimo = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Indica un numero: ");
			array[i] = sc.nextInt();
		}
		// Recorremos el array desde la ultima posicion -1 , de esta forma da igual de
		// que tamaño sea el array.
		// Y le decimos desde la ultima posicion hasta que la i sea = a posicion 0 :
		for (int i = 0; i >= array.length; i++) {
			System.out.print(array[i] + " ");
			if (array[i] > maximo) {
				maximo = array[i];
			} else if (array[i] < minimo) {
				minimo = array[i];
			}

		}
		System.out.println("El numero minimo seria: " + minimo + " y el maximo seria: " + maximo);
		sc.close();
	}

}
