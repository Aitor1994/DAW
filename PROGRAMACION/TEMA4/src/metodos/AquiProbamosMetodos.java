package metodos;

import java.util.Scanner;

public class AquiProbamosMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Aqui probamos metodos usando la importacion por codigo

		String[] array = new String[] { "Hola","Adios", "Que tal" };
		
		//Probamos el metodo imprimirArray.
		ArrayUtils.imprimirArray(array);
		
	System.out.println();
		
		//Probamos obtenerPalabra
		
		
		//Probamos buscarPalabra
		
		
		//Probamos sumarNumero de la clase Numeros.
		System.out.println("¿De que tamaño es tu array?");
		Integer tamaño = sc.nextInt();
		Integer [] array2 = new Integer[tamaño];
		System.out.println("¿Porque numero quieres empezar la suma?");
		Integer comienzo = sc.nextInt();
		Numeros.sumarNumero(array2, comienzo);
sc.close();}

}
