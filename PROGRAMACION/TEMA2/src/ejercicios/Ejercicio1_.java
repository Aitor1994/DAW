package ejercicios;

import java.util.Scanner;

public class Ejercicio1_ {

	public static void main(String[] args) {
		//Iniciamos scanner ya que vamos a necesitar interactuar con la consola.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indiquenos su fecha de nacimiento para saber a que generacion pertenece: ");
		int fecha= sc.nextInt();
		
		//Añadimos la variable a la que adderimos el mensaje si el booleano es T
		
		
		if (fecha<=1990) {System.out.println("Pertenece a la generacion perdida");} 
		else if (fecha<=1927) {System.out.println("Pertnece a la generacion grandiosa");}
		else if (fecha<=1945) {System.out.println("Pertence a la genracion silenciosa");}
		else if (fecha<=1964) {System.out.println("Pertenece a la generacion boomer");}
		else if (fecha<=1996) {System.out.println("pertenece a la genracion Y");}
		else if (fecha<=2012) {System.out.println("pertenece a la generacion Z");}
		
		 sc.close();
		}

	    
	    
	    
	}

	
