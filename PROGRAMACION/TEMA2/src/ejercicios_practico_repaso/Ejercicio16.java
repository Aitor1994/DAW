package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		//Realizar un programa que solicite al usuario una palabra por consola. A continuación, mostrar 
		//por consola las diferentes letras de esa palabra en cada línea.
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una palabra para que el programa lo divida por letras: ");
		String palabra = sc.nextLine();
		Integer posicion = 0;
		for ( ; posicion < palabra.length(); posicion++) {
			System.out.println(palabra.charAt(posicion));
			sc.close();
			
		}
		
		
		

	}

}
