package tema3;

import java.util.Scanner;

public class EjercicioRepaso4 {

	public static void main(String[] args) {
		/*Haz un programa que pregunte al usuario qué nota está buscando. Luego, tiene que buscar en 
		la lista de notas todas las que sean mayores a la indicada y contarlas.*/

		Integer[] listaNotas  = new Integer[] {7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10}; 
		Scanner sc = new Scanner (System.in);
		int suma = 0;
		Boolean encontrada = false;
		do {
		System.out.println("¿Que nota buscas?: ");
		int nota = sc.nextInt();
		
		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] == nota) {
				suma += 1;
				encontrada = true;
			}
		}
		if (encontrada == true) {
		System.out.println("Hay "+ suma + " notas como la que buscas." );}
		else {
			System.out.println("No existe tal nota.");
			encontrada = false;
		}
		} while (encontrada == true );
	sc.close();
	}

}
