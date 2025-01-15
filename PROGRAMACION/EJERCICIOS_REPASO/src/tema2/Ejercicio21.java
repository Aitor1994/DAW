package tema2;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		/*Realizar un programa que muestre por pantalla un cuadrado de 5x5 con su diagonal. De este 
        modo: */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el tamaño que desee la cuadricula: ");
	    int tamaño = sc.nextInt();
	    
		for (int i = 0; i < tamaño; i++) {
			for (int j = 0; j < tamaño; j++) {
				if (i == j) {
					System.out.print("* ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
sc.close();
	}

}
