package ejercicios;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int multiplicador = 0;
		int numero;
		int total;

		System.out.println("Introduce un numero para realizar su respectiva tabla de multiplicar: ");
		numero = sc.nextInt();

		while (multiplicador <= 10) {
			total = numero * multiplicador;
			System.out.println(numero + ("x") + multiplicador + ("=") + total);
			multiplicador = multiplicador + 1;
		}
		sc.close();
	}

}
