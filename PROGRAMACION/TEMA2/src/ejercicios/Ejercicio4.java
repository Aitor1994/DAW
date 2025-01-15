package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/*Realizar un programa que solicite números por consola y los vaya sumando en una cuenta 
acumulativa. Pedirá números hasta que el usuario introduzca el número 0. Cuando lo haga, 
dejará de pedir números, mostrará el total de la suma, y terminará el programa.*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numeros para sumarlos consecutivamente, ingrese un 0 cuando quiera finalizar: ");
		
		//Debemos darle un TIPO a las variables que queremos usar dentro del DO , WHILE.
		Integer suma = 0;
		int numero;
		
		// Procedemos a usar el DO.
		do { System.out.println("Ingrese un numero: ");
		numero = sc.nextInt();
		suma = suma + numero;
		} while (numero != 0);
		
		//Le decimos que nos muestre todos los numeros guardados en esa variable durante el Bucle:
		System.out.println(suma);

		sc.close();
	}

}
