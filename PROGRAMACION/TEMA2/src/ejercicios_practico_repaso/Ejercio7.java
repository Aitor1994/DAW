package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int total;

		while (numero >= 1 || numero <= 10) {
			System.out.println(" Ingrese un numero entre 1 y 10 para ir sumandolos: ");
			numero = sc.nextInt();
			if (numero >= 1 || numero <= 10) {
				total = numero + numero;
				System.out.println("La suma total es " + total);
			}
			else {
				System.out.println("Numero no valido , vuelva a intentarlo:");
			}

		}sc.close();

	}

}
