package tema2;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solicite un número mayor a 0 al usuario. Si no es
		 * así, volver a solicitarlo. A continuación, calcular la suma de todos los
		 * números impares que hay entre 1 y el número indicado. Mostrarlo por consola.
		 */
		// Primero iniciamos scanner
		Scanner sc = new Scanner(System.in);
		int numero;
		int suma = 0;
		do {
			System.out.println("Indique un numero mayor a 0, indique 0 cuando quiera finalizar al inserción: ");
			numero = sc.nextInt();
			//Esto significa los numeros en los que la division no de resto 0 , es decir los numeros impares.
			if (numero % 2 != 0) {
				suma += numero;
			}
		} while (numero != 0);
		System.out.println("La suma total de los numeros impares indicados es : " + suma);
sc.close();
	}

}
