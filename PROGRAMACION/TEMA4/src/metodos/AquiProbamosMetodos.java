package metodos;

import java.util.Scanner;

public class AquiProbamosMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Aqui probamos metodos usando la importacion por codigo

		String[] array = { "Hola","Adios", "Que tal" };
		
		
		
		//Probamos buscarPalabra
		System.out.println(ArrayUtils.buscarPalabra(array, "Adios"));
		
		//Probamos sumarNumero de la clase Numeros.
		System.out.println("¿Hasa que numero quieres sumar?");
		Integer num = sc.nextInt();
		Numeros.sumarNumero(num);
		
		//Probamos el metodo FACTORIAL.
		System.out.println("Ha que numero quieres realizarle el metodo? :");
		int num1 = sc.nextInt();
		Numeros.factorial(num1);
		
		
sc.close();}

	
}
