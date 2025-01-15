package tema2;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		/*Realiza un programa que muestre por consola los números del 1 al 10. Pero lo hará a medida 
		que el usuario lo vaya solicitando. Es decir, se mostrará el 1 y parará. Cuando el usuario pulse 
		ENTER, se mostrará 2 y parará. Cuando el usuario pulse ENTER, se mostrará 3 y parará. Y así 
		continuamente hasta el 10.*/
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {

			System.out.println("Pulsa ENTER para continuar");
			scanner.nextLine();

			System.out.println(i);
		}

		System.out.println("Fin del programa!");
		scanner.close();
	}

}


	
