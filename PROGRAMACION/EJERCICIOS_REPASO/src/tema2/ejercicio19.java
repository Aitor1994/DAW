package tema2;

import java.util.Scanner;

public class ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que sea un conversor de euros a peseta y viceversa. El
		 * programa funcionará del siguiente modo: 1. Mostrará este menú: 1 - Pasar de
		 * Pesetas a Euros 2 - Pasar de Euros a Pesetas 3 - Salir 2. Si selecciona la
		 * opción 1 o 2, se solicitará la cantidad, se hará la conversión, se mostrará
		 * el resultado y después se volverá a mostrar el menú del punto 1. Así
		 * continuamente 3. Cuando se selecciona la opción 3, el programa termina.
		 */
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out
					.println("1 - Pasar de Pesetas a Euros \r\n" + "2 - Pasar de Euros a Pesetas \r\n" + "3 - Salir ");

			System.out.println("Eliga la opcion a llevar a cabo: ");
			opcion = sc.nextInt();
			if (opcion == 1) {
				System.out.println("Indique la cantidad en Pesetas: ");
				Double euros = sc.nextDouble() / 166.38;
				System.out.println(euros + " €.");
			} else if (opcion == 2) {
				System.out.println("Indique la cantidad en €: ");
				Double pesetas = sc.nextDouble() * 166.38;
				System.out.println(pesetas + " Pesetas.");
			} else if (opcion == 3) {
				System.out.println("Finalizando programa.");
			}
		} while (opcion != 3);

		sc.close();
	}

}
