package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*Realizar un programa que solicite dos números al usuario. Si los números son iguales, terminar 
          el programa con un saludo. Si no son iguales, volver a pedirlos hasta que lo sean.*/
		
		Scanner sc = new Scanner(System.in);
		
		//Hemos de crear las variables que vamos a usar antes de usarlas dentro de DO o WHILE:
		int numero1;
		int numero2;
		
		//Usamos el if o qhile segun necesitamos e indicamos las condiciones y el bucle que repetira hasta que deje de cumplirse:
	    do {
	    System.out.println("Introduzca el primer numero: ");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		numero2 = sc.nextInt();
		
		//Si no le pusiesemos condicion, nos leeria el syso aunque los numeros fuesen iguales:
		if (numero1 != numero2) 
		System.out.println("los numeros son distintos");} 
	    
	    while (numero1 != numero2);  {
			System.out.println("Gracias, un saludo.");
			
		}
		 sc.close();
		
		

		
	}

}
