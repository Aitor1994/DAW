package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		//Realizar un programa que solicite una palabra al usuario y luego la escriba invertida. Por 
		//ejemplo, si la palabra indicada es “indonesia”, el resultado debería ser “aisenodni”
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe la palabra: ");
		
		String palabra = sc.nextLine();
		int tamaño = palabra.length();
		
		
		
		for (int i = tamaño - 1 ; i >= 0; i--) {
			System.out.println(palabra.charAt(i));
		}sc.close();
		
		
		
	}

}
