package Ejercicios_Repaso;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		// Haz un programa que pregunte al usuario qué nota está buscando. Luego, tiene
		// que buscar en
		// la lista de notas si existe alguna igual a la que el usuario ha indicado.
		// Tendremos que imprimir si
		// se ha encontrado y en qué posición. Dos ejemplos de resultado:

		// Tenemos nuestro scanner y nuestro array que es lo que necesitamos primero.
		Scanner sc = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		

		// Le pedimos al usuario que meta un numero para compararlo:
		System.out.println("Escribe tu nota del examen: ");
		Integer nota = sc.nextInt();
sc.close();
		for (int i = 0; i < listaNotas.length;) {
			if (nota == listaNotas[i]) {
				System.out.println("El numero esta en la posicion " + i);
				break;
		}
			else {
				System.out.println("Este numero no existe");
				break;
			}

	}

	}}
