package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//iniciamos scanner e importamos:
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique su IMC para ver si su peso es correcto: ");
		Double IMC = sc.nextDouble();
		
		if (IMC<=18.5) {System.out.println("Tiene un peso inferior al normal");}
		else if (IMC<=24.9) {System.out.println("Esta usted en su peso.");}
		else if (IMC<=29.9) {System.out.println("Tiene algo mas de peso.");}
		else if (IMC>30) {System.out.println("Tiene usted sobrepeso");}
			
		sc.close();

		
		
		
	}

}
