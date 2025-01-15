package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		//Realizar un programa que solicite al usuario su nombre completo. A continuación, mostrarle 
		//por separado cuál es su nombre, su primer apellido y su segundo apellido. Lo haremos 
		//separando por espacios en blanco (basta con que funcione con nombres y apellidos simples, 
		//por ejemplo, Abel Morillo Sánchez. No funcionaría con nombres como María del Carmen Ruiz 
		//de los Mozos Santos)
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre completo: ");
		String nombrecompleto = sc.nextLine();
		
		//CON EL SPLIT PODEMOS GUARDAMOS LOS DATOS CONVIRTIENDOLO EN UN ARRAY Y SEPARA LAS POSICIONES SEGUN LOS QUE LE INDIQUEMOS, EN ESTE CASO
		// POR ESPACIOS.
		String [] nombre = nombrecompleto.split(" ");
		//USAMOS EL FOR TRADICIONAL PARA RECORRER EL ARRAY POR POSICION, DE AHI EL INDICE [i] :
		for (int i = 0; i < nombre.length; i++) {
			
			if (i == 0) {
				System.out.println("Tu nombre es: " + nombre[i]);
				}
			else if (i == 1) {
				System.out.println("Tu 1ª apellido es: "+ nombre[i]);
				}
			else if (i == 2) {
				System.out.println("Tu 2º apellido es: " + nombre[i]);
			}
			
			sc.close();
		}
		//ESTO ES UN FOR EACH , RECORRE EL ARRAY SIN TENER EN CUENTA LAS POSICIONES
		// for (String palabra : nombre);
			
		}
	    
		}


