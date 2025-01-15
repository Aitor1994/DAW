package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio_17 {

	public static void main(String[] args) {
		//Solicita una palabra al usuario y a continuación deletréala (imprime cada letra por separado). 
		//Utiliza para ello un Split y un bucle foreach.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe tu oracion: ");
		String oracion = sc.nextLine();
		
		String [] frase = oracion.split("");
	    for (String letras : frase) {
	    	System.out.print(letras + " ");
			
		}sc.close();
		


	}

}
