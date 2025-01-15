package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba el nombre de tu primera ciudad:");
		String ciudad1 = sc.nextLine().trim();
	    
		System.out.println("Introduzca el nombre de su 2ª ciudad: ");
		String ciudad2 = sc.nextLine().trim();
		
		System.out.println("Introduzca el nombre de la 3ª ciudad; ");
		String ciudad3 = sc.nextLine().trim();
	//Con el .trim quitamos los espacios al incio y al final.
	
		Integer longitud1 = ciudad1.length();
		Integer longitud2 = ciudad2.length();
		Integer longitud3 = ciudad3.length();
		if (longitud1 >= longitud2 && longitud2>=longitud3) {
			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad2);
		 
			//Y asi con todas las posibilidades que serian 6 ¡
			sc.close();
		}
		
			
			
		}
		
		
		
		

	}


