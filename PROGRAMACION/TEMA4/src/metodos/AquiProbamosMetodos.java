package metodos;

import java.util.Scanner;

public class AquiProbamosMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Aqui probamos metodos usando la importacion por codigo

		String[] array = new String[] { "Hola","Adios", "Que tal" };
		ArrayUtils.imprimirArray(array);
		
		System.out.println();
		
		//Probamos obtenerPalabra
		
		
		//Probamos buscarPalabra
		System.out.println("Introduce la palabra a buscar: ");
		String palabra = sc.nextLine();
		ArrayUtils.buscarPalabra(array, palabra);
sc.close();}

}
