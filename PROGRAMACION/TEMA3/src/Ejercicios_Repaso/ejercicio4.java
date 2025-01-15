package Ejercicios_Repaso;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// Haz un programa que pregunte al usuario qué nota está buscando. Luego, tiene
		// que buscar en
		// la lista de notas todas las que sean mayores a la indicada y contarlas.
		Scanner sc = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Integer numerosIguales = 0;
		boolean igual=false;

		System.out.println("¿Que nota estas buscando?: ");
		int numero = sc.nextInt();
		for (int i = 0; i < listaNotas.length; i++) {
			if (numero < listaNotas[i]) {
				numerosIguales += 1;
				igual=true;
			} 
		}System.out.println("Hay " + numerosIguales + " mayores que tu nota.");
		
		
		
		if(!igual) { //igual==false
			System.out.println("No hay ninguno igual a " + numero);
		}sc.close();
		
		

}}
