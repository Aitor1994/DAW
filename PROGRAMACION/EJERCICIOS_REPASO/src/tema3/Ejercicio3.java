package tema3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solicite números al usuario, los almacene y luego
		 * los muestre en el mismo orden en el que fueron indicados. Para ello, en
		 * primer lugar, preguntaremos al usuario cuántos números nos va a decir. Y
		 * luego se los iremos solicitando uno a uno. Los iremos guardando en un array.
		 * Al terminar, le mostraremos la lista completa de números.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numeros quieres guardar? ");
		int numeros = sc.nextInt();
		int[] array = new int[numeros];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Indica un numero: ");
			array[i] = sc.nextInt();
		}
		//Recorremos el array desde la ultima posicion -1 , de esta forma da igual de que tamaño sea el array.
		//Y le decimos desde la ultima posicion hasta que la i sea = a posicion 0 :
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}sc.close();
	}

}
