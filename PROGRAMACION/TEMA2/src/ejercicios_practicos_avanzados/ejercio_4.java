package ejercicios_practicos_avanzados;

import java.util.Scanner;

public class ejercio_4 {

	public static void main(String[] args) {
		// Realizar un programa que solicite al usuario un número e indique si es o no
		// es capicúa:
		Scanner sc = new Scanner(System.in);
		boolean cap = true;
		System.out.println("Indique un numero para comprobar si es o no capicua: ");
		String numero = sc.nextLine();
sc.close();
		String[] array = numero.split("");

		for (int i = 0, j = array.length - 1; i < j; j--, i++) {
			if (array[i].equals(array[j])) {
			cap = true;
			} 
			else {
				cap = false;
				break;
			}
			
		}
		if (cap == true) {
			System.out.println("El numero es capicua.");
		}
		else if ( cap == false) {System.out.println("El numero no es capicua.");
			
		}	
		
	}

}
