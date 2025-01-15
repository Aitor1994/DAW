package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		do {
			System.out.println("***MENU***");
			System.out.println("\t1. Abrir.");
			System.out.println("\t2. Guardar");
			System.out.println("\t3. Modificar");
			System.out.println("\t4. Salir");
			// LA BARRA T ES PARA TABULAR , METER EL TEXTO UN POCO HACIA DENTRTO.
			System.out.println("Introduzca el numero segun la opcion deseada.");
			numero = sc.nextInt(); // Variable declaradad fuera del DO:

			if (numero == 1) {
				System.out.println("Ha elegido la opcion Abrir.");
			} else if (numero == 2) {
				System.out.println("Ha elegido la opcion Guardar.");
			} else if (numero == 3) {
				System.out.println("Ha elegido la opcion Modificar.");
			} else if (numero == 4) {
				System.out.println("Ha elegido la opcion Salir, Hasta pronto.");
			} else {
				System.out.println("Ha elegido un numero distinto a la lista, ERROR¡");
			}

		} while (numero != 4);

		sc.close();

	}
}
