package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		//Realizar un programa que solicite 3 palabras al usuario y las guarde cada una en un array. 
		//Después, recorrer en otro bucle distinto el array y concatenar todas las palabras para 
		//mostrarlas por consola. 
		Scanner sc = new Scanner(System.in);
		String[]palabras = new String[3];
		
		for (int i = 0; i <palabras.length; i++) {
			System.out.println("Escribe las 3 palabras: ");		
			String palabra = sc.nextLine();	
			
			palabras[i] = palabra;
			
	}
		for (int j = 0; j < palabras.length; j++) {
			System.out.println(palabras[j]);
			
		}
		sc.close();
		

	}

}

