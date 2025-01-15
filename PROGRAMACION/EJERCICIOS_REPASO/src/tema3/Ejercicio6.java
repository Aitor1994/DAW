package tema3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*Realizar un programa que solicite 3 palabras al usuario y las guarde cada una en un array. 
          Después, recorrer en otro bucle distinto el array y concatenar todas las palabras para 
          mostrarlas por consola. */
		Scanner sc = new Scanner(System.in);
		//Creamos el array pero no lo inicializamos , lo haremos despues: 
		String [] listaPalabras = new String [3] ;
		String [] listaPalabras2 = new String [3];
		
		System.out.println("Indique 3 palabras para guardarlas: ");
		for (int i = 0; i < listaPalabras.length; i++) {
			System.out.println("pulse intro para guardar su palabra:  ");
			listaPalabras[i] = sc.nextLine();
		}
		for (int i = 0; i < listaPalabras.length; i++) {
			System.out.print(listaPalabras[i]);
		}
		sc.close();
		
		for (int i = listaPalabras.length-1; i < 0; i--) {
			listaPalabras2[i] = listaPalabras[i];
		}
		for (int i = 0; i < listaPalabras2.length; i++) {
			System.out.println(listaPalabras2[i]);
		}sc.close();
	}

}
