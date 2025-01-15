package tema3;

import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		/*Haz un programa que pregunte al usuario qué nota está buscando. Luego, tiene que buscar en 
          la lista de notas si existe alguna igual a la que el usuario ha indicado. Tendremos que imprimir si 
          se ha encontrado y en qué posición.*/
		Integer[] listaNotas  = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		Scanner sc = new Scanner(System.in);
		int nota;
		int posicion = 0;
		Boolean encontrada = false;
		
		System.out.println("Indica la nota a buscar:");
		nota = sc.nextInt();
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == nota) {
				posicion = i;
				encontrada = true;
				break;
			}
		}
		if (encontrada == true) {
			System.out.println("La nota existe en la posicion " + posicion);
		}
		else {System.out.println("No existe la nota.");
			sc.close();
		}

	}

}
