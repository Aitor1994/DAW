package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		/*Repetir el ejercicio anterior, pero con cadenas. Además, cuando comparemos si son iguales, no 
		  tendremos en cuenta ni los espacios que pueda haber al inicio o al final de cada cadena, ni 
          tampoco las mayúsculas o minúsculas.*/
		
	//Iniciamos scanner e importamos:
		Scanner sc = new Scanner(System.in);
		
		//Creamos los TIPOS de las variables en este caso queremos 2 cadenas , es decir STRING:
		String palabra1;
		String palabra2;
		
		do {
	    System.out.println("Introduzca la 1ª palabra: ");
        palabra1 = sc.next();
        //Este codigo sirve para quitarle los espacios en blanco alante y atras: .trim
        palabra1.trim();
        System.out.println("Introduzca la 2ª palabra: ");
		palabra2 = sc.next();
		//Este codigo sirve para quitarle los espacios en blanco alante y atras: .trim
		palabra2.trim();
		//Usamos .equals para igualar Cadenas (string):
		if (!palabra1.equals(palabra2)) //Importante  no poner ; o repetira el mensaje aun incumpliendo la condicion¡¡ :
		System.out.println("Las palabras son distintas, vuelve a intentarlo: ");
		
	    }while (!palabra1.equals(palabra2));{
		System.out.println("Las palabras son iguales, gracias , hasta pronto.");
		}	
		sc.close();


		}

}
