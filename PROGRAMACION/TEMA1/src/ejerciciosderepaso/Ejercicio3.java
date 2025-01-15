package ejerciciosderepaso;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {

		// Vamos interactuar con el usuario asi que inciamos e importamos scanner;
		Scanner sc = new Scanner(System.in);
		System.out.println("Indiquenos sus 2 numeros grandes para realizar su operacion :");

		// Usamos scanner y realizamos la operacion una vez echo mostramos el resultado
		// con sysout:
		String numero1 = sc.nextLine();

		System.out.println("y");

		String numero2 = sc.nextLine();

		Double numero3 = Double.parseDouble(numero1);

		Double numero4 = Double.parseDouble(numero2);
		
		System.out.println("El resultado es " + (numero3 * numero4));

		sc.close();
		
		
		
		

	}
}
