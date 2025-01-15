package EJERCICIOS;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Preguntamos la edad al usuario
		System.out.println("¿Que edad tienes?");
		
		//Iniciamos Scanner
		Scanner sc = new Scanner(System.in);
		
		//Lo usamos
		int edad = sc.nextInt();
		
		//Mostramos los datos obtenidos por el scanner
		System.out.println("Aitor tiene " + edad + " años");
		
		//CERRAMOS SCANNER
		sc.close();
	
		

	}

}
