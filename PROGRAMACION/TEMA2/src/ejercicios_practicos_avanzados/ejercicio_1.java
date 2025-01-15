package ejercicios_practicos_avanzados;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// Realizar un programa que transforme un texto escrito por el usuario en
		// nomenclatura
		// camelCase. Por ejemplo, si el usuario escribe:
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Escriba el texto: ");
		String texto = sc.nextLine();
//Sacamos el split, dividimos la frase separada por espacios
		String[] palabra = texto.split(" ");
// La primera palabra va entera en minusculas:
		System.out.print(palabra[0].toLowerCase());
//El primer for para recogrrer el array y que nos vaya leyendo palabra a palabra:
		for (int i = 1; i < palabra.length; i++) {
//Con el substring decimos que la primera letra de la primera palabra del array la pase a mayusc. y la guardamos en primera.
//y le decimo que de le primera letra en adelante lo ponga en minusculay lo guarde en resto.			
			String primera = palabra[i].substring(0, 1).toUpperCase();
			String resto = palabra[i].substring(1).toLowerCase();
//Le decimos que guarde en el array las operaciones que hemos echo:
			palabra[i] = primera + resto; //ESTO ES OPCIONAL O PONERLO DIRECTAMENTE EN EL SYSO.
			System.out.print(primera+resto);
//Le pedimos que nos muestre el array:
			//System.out.print(palabra[i]);

		}sc.close();

	}

}
