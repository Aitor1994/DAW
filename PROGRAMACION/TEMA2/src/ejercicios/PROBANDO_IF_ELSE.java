package ejercicios;

import java.util.Scanner;

public class PROBANDO_IF_ELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 10 numeros para sumarlos y ver el resultado: ");
		int contador = 1;
		int acomulado = 0;

		while (contador <= 10) {
			contador = contador + 1;
			System.out.println("Introduce un numero: ");
			int numero = sc.nextInt();
			acomulado = acomulado + numero;
		}
		System.out.println("El resultado seria: " + acomulado);
		sc.close();
	}

}
