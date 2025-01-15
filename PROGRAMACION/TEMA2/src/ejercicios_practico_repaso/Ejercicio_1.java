package ejercicios_practico_repaso;

import java.util.Scanner;

public class Ejercicio_1 {
	public static final Integer FECHA_ACTUAL = 2030;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.print("Indique su nombre aqui:");
		String nombre = sc.nextLine();
		
		System.out.print("Indique su año de nacimiento: ");
		int año = sc.nextInt();
		
		
		
		System.out.println("Hola" + nombre + " en el año 2030 tendras " + (FECHA_ACTUAL - año));
		
		sc.close();

	}

}
