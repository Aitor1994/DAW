package Ejercicios_Practicos;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		//Realizar un programa que solicite un número al usuario. Después, guardar en un array el 
		//cuadrado de ese número y de los 5 siguientes. 
		//Al terminar, en otro bucle distinto, mostrar el contenido del array por consola. 
		Scanner sc = new Scanner (System.in);
	    int[] array=new int [6]; //TAMAÑO DEL ARRAY
	    
	    //PEDIMOS EL NUMERO
		System.out.println("Introduzca un numero para calcular su cuadrado y el de los 5 numeros siguientes: ");
		Integer numero = sc.nextInt();
		//LLENAR EL ARRAY CON LOS CUADRADOS DE X Y LOS 5 SUCESIVOS:
		for (int i = 0; i < array.length; i++) {
			array[i] = numero * numero ;
			numero = numero + 1;
		}
		
		//Imprimir contenido del array:
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			
		}
	   sc.close();
	}

}
