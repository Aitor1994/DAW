package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		//Realizar un programa que solicite una palabra al usuario y luego la escriba invertida. Por 
		//ejemplo, si la palabra indicada es “indonesia”, el resultado debería ser “aisenodni” 
		//Cuando te funcione, prueba con un palíndromo ;)
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una palabra: ");
		String palabra = sc.nextLine();
		
		String [] letras = palabra.split(""); //ESTE SPLIT NOS COGE CADA LETRA DE LA PALABRA Y LAS VA METIENDO EN UN ARRAY.
		
		for (int i = letras.length -1; i >= 0; i--) {
			System.out.print(letras[i]);
		}sc.close();
	
		
		

	}

}
